package net.masterquentus.hexcraftmod.item.custom;

import net.masterquentus.hexcraftmod.custom.projectile.VampiricStaffProjectileEntity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class VampiricStaffItem extends Item {
    public VampiricStaffItem(Properties pProperties) {
        super(pProperties);
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.FIRECHARGE_USE, SoundSource.NEUTRAL, 0.5F, 0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));
        if (!level.isClientSide) {
            itemStack.hurtAndBreak(1, player, player1 -> {
                player1.broadcastBreakEvent(hand);
            });

            VampiricStaffProjectileEntity staffProjectile = new VampiricStaffProjectileEntity(level, player);
            staffProjectile.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
            level.addFreshEntity(staffProjectile);
        }
        player.getCooldowns().addCooldown(itemStack.getItem(), 20);
        if (!player.getAbilities().instabuild) {}

        return InteractionResultHolder.sidedSuccess(itemStack, level.isClientSide());
    }
}