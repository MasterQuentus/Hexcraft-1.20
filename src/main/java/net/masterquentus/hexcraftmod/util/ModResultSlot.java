package net.masterquentus.hexcraftmod.util;

import org.jetbrains.annotations.NotNull;

import net.masterquentus.hexcraftmod.block.entity.WitchesOvenBlockEntity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ModResultSlot extends SlotItemHandler {
	private final Player player;
	private int removeCount;

	public ModResultSlot(Player player, IItemHandler itemHandler, int index, int xPosition, int yPosition) {
		super(itemHandler, index, xPosition, yPosition);
		this.player = player;
	}

	@Override
	public boolean mayPlace(@NotNull ItemStack stack) {
		return false;
	}

	@Override
	public @NotNull ItemStack remove(int amount) {
		if (this.hasItem())
			this.removeCount += Math.min(amount, this.getItem().getCount());
		return super.remove(amount);
	}

	@Override
	public void onTake(Player pPlayer, ItemStack pStack) {
		this.checkTakeAchievements(pStack);
		super.onTake(pPlayer, pStack);
	}

	@Override
	protected void onQuickCraft(ItemStack pStack, int pAmount) {
		this.removeCount += pAmount;
		this.checkTakeAchievements(pStack);
	}

	@Override
	protected void checkTakeAchievements(ItemStack pStack) {
		pStack.onCraftedBy(this.player.level(), this.player, this.removeCount);
		Player player = this.player;
		if (player instanceof ServerPlayer serverPlayer) {
			Container container = this.container;
			if (container instanceof WitchesOvenBlockEntity blockEntity) {
				blockEntity.awardUsedRecipesAndPopExperience(serverPlayer);
			}
		}
		super.checkTakeAchievements(pStack);
	}
}