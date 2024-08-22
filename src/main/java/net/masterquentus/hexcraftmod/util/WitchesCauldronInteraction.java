package net.masterquentus.hexcraftmod.util;

import java.util.Map;

import com.google.common.base.Predicate;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.block.custom.WitchesCauldron;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;

// Mod implementation of CauldronInteraction. No longer used in favor of methods in WitchesCauldron#use. Must be called somewhere in Mod class to fire. 
public interface WitchesCauldronInteraction {
	Map<Item, WitchesCauldronInteraction> EMPTY = newInteractionMap();
	Map<Item, WitchesCauldronInteraction> WATER = newInteractionMap();
	WitchesCauldronInteraction FILL_WATER = (state, level, pos, player, hand, stack) -> {
		return emptyBucket(level, pos, player, hand, stack, HexcraftBlocks.WITCHES_CAULDRON.get().defaultBlockState()
				.setValue(WitchesCauldron.LEVEL, Integer.valueOf(3)), SoundEvents.BUCKET_EMPTY);
	};

	static Object2ObjectOpenHashMap<Item, WitchesCauldronInteraction> newInteractionMap() {
		return Util.make(new Object2ObjectOpenHashMap<>(), (function) -> {
			function.defaultReturnValue((state, level, pos, player, hand, stack) -> {
				return InteractionResult.PASS;
			});
		});
	}

	InteractionResult interact(BlockState pBlockState, Level pLevel, BlockPos pBlockPos, Player pPlayer,
			InteractionHand pHand, ItemStack pStack);

	static void bootstrap() {
		addDefaultInteractions(EMPTY);
		EMPTY.put(Items.POTION, (state, level, pos, player, hand, stack) -> {
			if (PotionUtils.getPotion(stack) != Potions.WATER) {
				return InteractionResult.PASS;
			} else {
				if (!level.isClientSide) {
					Item item = stack.getItem();
					player.setItemInHand(hand,
							ItemUtils.createFilledResult(stack, player, new ItemStack(Items.GLASS_BOTTLE)));
					player.awardStat(Stats.ITEM_USED.get(item));
					level.setBlockAndUpdate(pos,
							HexcraftBlocks.WITCHES_CAULDRON.get().defaultBlockState().cycle(WitchesCauldron.LEVEL));
					level.playSound((Player) null, pos, SoundEvents.BOTTLE_EMPTY, SoundSource.BLOCKS, 1.0F, 1.0F);
					level.gameEvent((Entity) null, GameEvent.FLUID_PLACE, pos);
				}
				return InteractionResult.sidedSuccess(level.isClientSide);
			}
		});
		addDefaultInteractions(WATER);
		WATER.put(Items.BUCKET, (state, level, pos, player, hand, stack) -> {
			return fillBucket(state, level, pos, player, hand, stack, new ItemStack(Items.WATER_BUCKET),
					blockstate -> blockstate.getValue(WitchesCauldron.LEVEL) == 3, SoundEvents.BUCKET_FILL);
		});
		WATER.put(Items.GLASS_BOTTLE, (state, level, pos, player, hand, stack) -> {
			if (!level.isClientSide) {
				Item item = stack.getItem();
				player.setItemInHand(hand, ItemUtils.createFilledResult(stack, player,
						PotionUtils.setPotion(new ItemStack(Items.POTION), Potions.WATER)));
				player.awardStat(Stats.ITEM_USED.get(item));
				level.playSound((Player) null, pos, SoundEvents.BOTTLE_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);
				level.gameEvent((Entity) null, GameEvent.FLUID_PICKUP, pos);
			}
			return InteractionResult.sidedSuccess(level.isClientSide);
		});
		WATER.put(Items.POTION, (state, level, pos, player, hand, stack) -> {
			if (state.getValue(WitchesCauldron.LEVEL) != 3 && PotionUtils.getPotion(stack) == Potions.WATER) {
				if (!level.isClientSide) {
					player.setItemInHand(hand,
							ItemUtils.createFilledResult(stack, player, new ItemStack(Items.GLASS_BOTTLE)));
					player.awardStat(Stats.ITEM_USED.get(stack.getItem()));
					level.setBlockAndUpdate(pos, state.cycle(WitchesCauldron.LEVEL));
					level.playSound((Player) null, pos, SoundEvents.BOTTLE_EMPTY, SoundSource.BLOCKS, 1.0F, 1.0F);
					level.gameEvent((Entity) null, GameEvent.FLUID_PLACE, pos);
				}
				return InteractionResult.sidedSuccess(level.isClientSide);
			} else {
				return InteractionResult.PASS;
			}
		});
	}

	static void addDefaultInteractions(Map<Item, WitchesCauldronInteraction> pInteractionsMap) {
		pInteractionsMap.put(Items.WATER_BUCKET, FILL_WATER);
	}

	static InteractionResult fillBucket(BlockState pBlockState, Level pLevel, BlockPos pPos, Player pPlayer,
			InteractionHand pHand, ItemStack pEmptyStack, ItemStack pFilledStack, Predicate<BlockState> pStatePredicate,
			SoundEvent pFillSound) {
		if (!pStatePredicate.test(pBlockState)) {
			return InteractionResult.PASS;
		} else {
			if (!pLevel.isClientSide) {
				Item item = pEmptyStack.getItem();
				pPlayer.setItemInHand(pHand, ItemUtils.createFilledResult(pEmptyStack, pPlayer, pFilledStack));
				pPlayer.awardStat(Stats.ITEM_USED.get(item));
				pLevel.setBlockAndUpdate(pPos, HexcraftBlocks.WITCHES_CAULDRON.get().defaultBlockState());
				pLevel.playSound((Player) null, pPos, pFillSound, SoundSource.BLOCKS, 1.0F, 1.0F);
				pLevel.gameEvent((Entity) null, GameEvent.FLUID_PICKUP, pPos);
			}
			return InteractionResult.sidedSuccess(pLevel.isClientSide);
		}
	}

	static InteractionResult emptyBucket(Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand,
			ItemStack pFilledStack, BlockState pState, SoundEvent pEmptySound) {
		if (!pLevel.isClientSide) {
			Item item = pFilledStack.getItem();
			pPlayer.setItemInHand(pHand,
					ItemUtils.createFilledResult(pFilledStack, pPlayer, new ItemStack(Items.BUCKET)));
			pPlayer.awardStat(Stats.ITEM_USED.get(item));
			pLevel.setBlockAndUpdate(pPos, pState);
			pLevel.playSound((Player) null, pPos, pEmptySound, SoundSource.BLOCKS, 1.0F, 1.0F);
			pLevel.gameEvent((Entity) null, GameEvent.FLUID_PLACE, pPos);
		}
		return InteractionResult.sidedSuccess(pLevel.isClientSide);
	}
}