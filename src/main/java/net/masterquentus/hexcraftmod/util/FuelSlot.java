package net.masterquentus.hexcraftmod.util;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class FuelSlot extends SlotItemHandler {
	public FuelSlot(IItemHandler pContainer, int pSlot, int pX, int pY) {
		super(pContainer, pSlot, pX, pY);
	}

	@Override
	public boolean mayPlace(ItemStack pStack) {
		return this.isFuel(pStack) || this.isBucket(pStack);
	}

	@Override
	public int getMaxStackSize(ItemStack pStack) {
		return this.isBucket(pStack) ? 1 : super.getMaxStackSize(pStack);
	}

	private boolean isBucket(ItemStack stack) {
		return stack.is(Items.BUCKET);
	}

	private boolean isFuel(ItemStack stack) {
		return ForgeHooks.getBurnTime(stack, null) > 0;
	}
}
