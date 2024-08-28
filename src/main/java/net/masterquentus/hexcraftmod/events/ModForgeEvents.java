package net.masterquentus.hexcraftmod.events;

import java.util.Collection;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.TickEvent.PlayerTickEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = HexcraftMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModForgeEvents {

	@SubscribeEvent
	public static void onPlayerHurtInVoid(LivingHurtEvent event) {
		if (!(event.getEntity() instanceof ServerPlayer player))
			return;

		if (event.getSource().is(DamageTypes.FELL_OUT_OF_WORLD)) {
			BlockPos spawnPos = player.getRespawnPosition();
			BlockPos worldSpawn = player.level().getSharedSpawnPos();
			int inventorySize = player.getInventory().getContainerSize();

			for (int i = 0; i < inventorySize; i++) {
				ItemStack stack = player.getInventory().getItem(i);
				if (stack.getItem() == HexcraftItems.VOID_PROTECTION_POPPET.get()) {
					event.setCanceled(true);
					if (player.level().dimension() != Level.OVERWORLD) {
						if (player.server.getLevel(Level.OVERWORLD) == null)
							return;
						player.changeDimension(player.server.getLevel(Level.OVERWORLD));
					}

					if (spawnPos != null) {
						player.resetFallDistance();
						player.teleportTo(spawnPos.getX(), spawnPos.getY(), spawnPos.getZ());
					} else if (worldSpawn != null) {
						player.resetFallDistance();
						player.teleportTo(worldSpawn.getX(), worldSpawn.getY(), worldSpawn.getZ());
					} else {
						player.sendSystemMessage(Component.literal("Could not find valid respawn location"));
						// Should probably handle this as well, if intent is for it to be a guarantee
						// save
					}

					stack.shrink(1);
					break;
				}
			}
		}

		if (event.getSource().is(DamageTypes.FALL)) {
			float damage = event.getAmount();
			int blocksFromDamage = Math.round(damage / 2.0f);
			int inventorySize = player.getInventory().getContainerSize();
			for (int i = 0; i < inventorySize; i++) {
				ItemStack stack = player.getInventory().getItem(i);
				if (stack.getItem() == HexcraftItems.FALL_PROTECTION_POPPET.get()) {
					EquipmentSlot equipmentSlot = ServerPlayer.getEquipmentSlotForItem(stack);
					stack.hurtAndBreak(blocksFromDamage, player, entity -> entity.broadcastBreakEvent(equipmentSlot));

					event.setCanceled(true);
					break;
				}
			}
		}

		if (event.getSource().is(DamageTypes.EXPLOSION) || event.getSource().is(DamageTypes.PLAYER_EXPLOSION)) {
			float damage = event.getAmount();
			int inventorySize = player.getInventory().getContainerSize();
			for (int i = 0; i < inventorySize; i++) {
				ItemStack stack = player.getInventory().getItem(i);
				if (stack.getItem() == HexcraftItems.EXPLOSION_PROTECTION_POPPET.get()) {
					EquipmentSlot equipmentSlot = ServerPlayer.getEquipmentSlotForItem(stack);
					stack.hurtAndBreak((int) damage, player, entity -> entity.broadcastBreakEvent(equipmentSlot));

					event.setCanceled(true);
					break;
				}
			}
		}

		if (event.getSource().is(DamageTypes.MOB_PROJECTILE) || event.getSource().is(DamageTypes.ARROW)) {
			float damage = event.getAmount();
			int inventorySize = player.getInventory().getContainerSize();
			for (int i = 0; i < inventorySize; i++) {
				ItemStack stack = player.getInventory().getItem(i);
				if (stack.getItem() == HexcraftItems.PROJECTILE_PROTECTION_POPPET.get()) {
					EquipmentSlot equipmentSlot = ServerPlayer.getEquipmentSlotForItem(stack);
					stack.hurtAndBreak((int) damage, player, entity -> entity.broadcastBreakEvent(equipmentSlot));
					event.setCanceled(true);
					break;
				}
			}
		}

		if (event.getSource().is(DamageTypes.DROWN)) {
			float damage = event.getAmount();
			int inventorySize = player.getInventory().getContainerSize();
			for (int i = 0; i < inventorySize; i++) {
				ItemStack stack = player.getInventory().getItem(i);
				if (stack.getItem() == HexcraftItems.WATER_PROTECTION_POPPET.get()) {
					EquipmentSlot equipmentSlot = ServerPlayer.getEquipmentSlotForItem(stack);
					stack.hurtAndBreak((int) damage, player, entity -> entity.broadcastBreakEvent(equipmentSlot));
					event.setCanceled(true);
					break;
				}
			}
		}

		if (event.getSource().is(DamageTypes.FIREBALL) || event.getSource().is(DamageTypes.IN_FIRE)
				|| event.getSource().is(DamageTypes.ON_FIRE) || event.getSource().is(DamageTypes.UNATTRIBUTED_FIREBALL)
				|| event.getSource().is(DamageTypes.HOT_FLOOR) || event.getSource().is(DamageTypes.LAVA)) {
			float damage = event.getAmount();
			int inventorySize = player.getInventory().getContainerSize();
			for (int i = 0; i < inventorySize; i++) {
				ItemStack stack = player.getInventory().getItem(i);
				if (stack.getItem() == HexcraftItems.FIRE_PROTECTION_POPPET.get()) {
					EquipmentSlot equipmentSlot = ServerPlayer.getEquipmentSlotForItem(stack);
					stack.hurtAndBreak((int) damage, player, entity -> entity.broadcastBreakEvent(equipmentSlot));
					event.setCanceled(true);
					break;
				}
			}
		}

		if (event.getSource().is(DamageTypes.WITHER) || event.getSource().is(DamageTypes.WITHER_SKULL)) {
			float damage = event.getAmount();
			int inventorySize = player.getInventory().getContainerSize();
			for (int i = 0; i < inventorySize; i++) {
				ItemStack stack = player.getSlot(i).get();
				if (stack.getItem() == HexcraftItems.WITHER_PROTECTION_POPPET.get()) {
					EquipmentSlot equipmentSlot = ServerPlayer.getEquipmentSlotForItem(stack);
					stack.hurtAndBreak((int) damage, player, entity -> entity.broadcastBreakEvent(equipmentSlot));
					event.setCanceled(true);
					break;
				}
			}
		}

		if (event.getSource().is(DamageTypes.MAGIC) || event.getSource().is(DamageTypes.INDIRECT_MAGIC)) {
			int inventorySize = player.getInventory().getContainerSize();
			for (int i = 0; i < inventorySize; i++) {
				ItemStack stack = player.getInventory().getItem(i);
				if (stack.getItem() == HexcraftItems.POTION_PROTECTION_POPPET.get()) {
					Collection<MobEffectInstance> activeEffects = player.getActiveEffects();

					for (MobEffectInstance effectInstance : activeEffects) {
						MobEffect effect = effectInstance.getEffect();
						if (!effect.isBeneficial()) {
							player.removeEffect(effect);
						}

						if (!effect.isBeneficial() && effect.isInstantenous())
							event.setCanceled(true);
					}

					EquipmentSlot equipmentSlot = ServerPlayer.getEquipmentSlotForItem(stack);
					stack.hurtAndBreak(1, player, entity -> entity.broadcastBreakEvent(equipmentSlot));
					event.setCanceled(true);
					break;
				}
			}
		}

		float damage = event.getAmount();
		if (damage >= player.getHealth()) {
			int inventorySize = player.getInventory().getContainerSize();
			for (int i = 0; i < inventorySize; i++) {
				ItemStack stack = player.getInventory().getItem(i);
				if (stack.getItem() == HexcraftItems.DEATH_PROTECTION_POPPET.get()
						&& !hasTotemInHand(inventorySize, player)) {
					event.setCanceled(true);
					player.heal(8.0f);
					stack.shrink(1);
					break;
				}
			}
		}
	}

	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent event) {
		if (!(event.player instanceof ServerPlayer player))
			return;

		if (player.getFoodData().getFoodLevel() >= 20)
			return;

		for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
			ItemStack stack = player.getSlot(i).get();
			if (stack.getItem() != HexcraftItems.HUNGER_PROTECTION_POPPET.get())
				continue;
			player.getFoodData().setFoodLevel(20);
			EquipmentSlot equipmentSlot = ServerPlayer.getEquipmentSlotForItem(stack);
			stack.hurtAndBreak(1, player, entity -> entity.broadcastBreakEvent(equipmentSlot));
			break;
		}
	}

	private static boolean hasTotemInHand(int inventorySize, ServerPlayer player) {
		for (int i = 0; i < inventorySize; i++) {
			if (player.getItemInHand(InteractionHand.MAIN_HAND).getItem() == Items.TOTEM_OF_UNDYING
					|| player.getItemInHand(InteractionHand.OFF_HAND).getItem() == Items.TOTEM_OF_UNDYING)
				return true;
		}

		return false;
	}


	protected static BlockHitResult getPlayerPOVHitResult(Level pLevel, Player pPlayer, ClipContext.Fluid pFluidMode) {
		float f = pPlayer.getXRot();
		float f1 = pPlayer.getYRot();
		Vec3 vec3 = pPlayer.getEyePosition();
		float f2 = Mth.cos(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
		float f3 = Mth.sin(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
		float f4 = -Mth.cos(-f * ((float)Math.PI / 180F));
		float f5 = Mth.sin(-f * ((float)Math.PI / 180F));
		float f6 = f3 * f4;
		float f7 = f2 * f4;
		double d0 = pPlayer.getBlockReach();
		Vec3 vec31 = vec3.add((double)f6 * d0, (double)f5 * d0, (double)f7 * d0);
		return pLevel.clip(new ClipContext(vec3, vec31, ClipContext.Block.OUTLINE, pFluidMode, pPlayer));
	}

	@SubscribeEvent
	public static void giveBloodBottleItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getEntity() == null) {
			return;
		}
		Player player = event.getEntity();
		HitResult hitresult = getPlayerPOVHitResult(event.getLevel(), event.getEntity(), ClipContext.Fluid.SOURCE_ONLY);
		if (hitresult.getType() == HitResult.Type.MISS) {
			return;
		}
		if (hitresult.getType() == HitResult.Type.BLOCK) {
			BlockPos blockpos = ((BlockHitResult) hitresult).getBlockPos();
			if (!event.getLevel().getFluidState(blockpos).is(HexcraftBlocks.BLOOD_BLOCK.get().getFluid())) {
				return;
			}
			ItemStack itemInHand = player.getItemInHand(event.getHand());
			if (itemInHand.is(Items.GLASS_BOTTLE)) {
				event.setCanceled(true);
				player.swing(event.getHand());

				ItemStack bloodBottle = new ItemStack(HexcraftItems.BLOOD_BOTTLE.get(), 1);
				player.level().playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.BOTTLE_FILL, SoundSource.NEUTRAL, 1.0F, 1.0F);
				player.level().gameEvent(player, GameEvent.FLUID_PICKUP, blockpos);
				player.addItem(bloodBottle);
				if (!player.isCreative()) {
					itemInHand.shrink(1);
				}
				return;
			}
		}
	}
} 
