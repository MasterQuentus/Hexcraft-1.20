package net.masterquentus.hexcraftmod.item.custom;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.api.BedTaglockSavedData;
import net.masterquentus.hexcraftmod.api.IBedTaglock;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.block.custom.BloodyRoseBlock;
import net.masterquentus.hexcraftmod.block.entity.BloodyRoseBlockEntity;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.masterquentus.hexcraftmod.util.HexcraftTags;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.game.ClientboundSoundPacket;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.entity.BedBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BedPart;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

import java.util.UUID;

public class TagLockKitItem extends Item {

    public TagLockKitItem() {
        super(new Properties());
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity target, InteractionHand hand) {
        if (target instanceof Player) {
            int failChance = 2;
            if (!player.isCrouching()) {
                failChance += 2;
            }
            if(!facingAway(player, (Player) target)) {
                failChance += 4;
            }
            if (HexcraftMod.RANDOM.nextInt(10) >= failChance) {
                if(!player.level().isClientSide) {
                    player.displayClientMessage(Component.literal("Taglock attempt failed").withStyle(ChatFormatting.RED), false);
                    ((ServerPlayer) target).displayClientMessage(Component.literal(player.getDisplayName().getString() + " has tried to taglock you").withStyle(ChatFormatting.RED), false);
                }
                return InteractionResult.FAIL;
            }
        }
        if(!target.getType().is(HexcraftTags.EntityTypes.TAGLOCK_BLACKLIST))
            fillTaglockEntity(player, stack, target);

        return InteractionResult.SUCCESS;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockState state = level.getBlockState(context.getClickedPos());
        BlockPos clicked = context.getClickedPos();

        if(state.getBlock() instanceof BedBlock) {
            if(!level.isClientSide) {
                BlockEntity be = state.getValue(BedBlock.PART) == BedPart.HEAD ?
                        level.getBlockEntity(clicked) :
                        level.getBlockEntity(clicked.relative(BedBlock.getConnectedDirection(state)));

                if(be instanceof BedBlockEntity bed) {
                    BedTaglockSavedData data = BedTaglockSavedData.get(level);
                    IBedTaglock bedData = data.getEntry(bed);

                    if(bedData.getUUID() != null && bedData.getName() != null) {
                        fillTaglock(context.getPlayer(), context.getItemInHand(), bedData.getUUID(), bedData.getName());
                        bedData.setUUID(null);
                        bedData.setName(null);
                        data.setDirty();
                    }
                }
                return InteractionResult.CONSUME;
            }
            return InteractionResult.SUCCESS;
        }
        else if(state.getBlock() == HexcraftBlocks.BLOODY_ROSE.get()) {
            if(!level.isClientSide) {
                if (state.getValue(BloodyRoseBlock.FILLED)) {
                    BlockEntity be = level.getBlockEntity(clicked);
                    if (be instanceof BloodyRoseBlockEntity poppy) {
                        fillTaglock(context.getPlayer(), context.getItemInHand(), poppy.getUUID(), poppy.getName());
                        BloodyRoseBlock.reset(level, clicked);
                    }
                }
                return InteractionResult.CONSUME;
            }
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.FAIL;
    }

    public void fillTaglockEntity(Player player, ItemStack stack, LivingEntity entity) {
        fillTaglock(player, stack, entity.getUUID(), entity.getDisplayName().getString());
    }

    public void fillTaglock(Player pPlayer, ItemStack stack, UUID uuid, String name) {
        if(pPlayer instanceof ServerPlayer player) {
            ItemStack newStack = new ItemStack(HexcraftItems.TAGLOCK_KIT_FULL.get(), 1);

            CompoundTag nbt = new CompoundTag();
            nbt.putUUID("entity", uuid);
            nbt.putString("entityName", name);
            newStack.setTag(nbt);

            if (!player.getInventory().add(newStack)) {
                ItemEntity itemEntity = new ItemEntity(player.level(), player.getX(), player.getY(0.5), player.getZ(), newStack);
                itemEntity.setNoPickUpDelay();
                itemEntity.setThrower(player.getUUID());
                player.level().addFreshEntity(itemEntity);
            }

            // Send sound packet to player
            player.connection.send(new ClientboundSoundPacket(BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.EXPERIENCE_ORB_PICKUP), SoundSource.MASTER, player.getX(), player.getY(), player.getZ(), 1.0F, 1.0F, HexcraftMod.RANDOM.nextLong()));
            stack.shrink(1);
        }
    }

    private boolean facingAway(Player source, Player target){
        Vec3 sourceLook = source.getLookAngle().normalize();
        Vec3 targetLook = target.getLookAngle().normalize();

        Vec2 v1 = new Vec2((float)sourceLook.x, (float)sourceLook.z);
        Vec2 v2 = new Vec2((float)targetLook.x, (float)targetLook.z);

        return !(Math.acos((v1.x * v2.x + v1.y *v2.y) / (Math.sqrt(v1.x * v1.x + v1.y * v1.y) * Math.sqrt(v2.x * v2.x + v2.y * v2.y))) > Math.PI/2);
    }


}