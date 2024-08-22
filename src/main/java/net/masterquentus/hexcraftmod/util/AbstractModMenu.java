package net.masterquentus.hexcraftmod.util;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

/*
 *  Helper menu class that does majority of the work
 *  
 *  Allows for minimal boilerplate code within regular menu class, while still keeping them customizable
 */
public abstract class AbstractModMenu extends AbstractContainerMenu implements AddedPlayerInventories {
	/**
	 * CREDIT GOES TO: diesieben07 | https://github.com/diesieben07/SevenCommons
	 * must assign a slot number to each of the slots used by the GUI. For this
	 * container, we can see both the tile inventory's slots as well as the player
	 * inventory slots and the hotbar. Each time we add a Slot to the container, it
	 * automatically increases the slotIndex, which means 0 - 8 = hotbar slots
	 * (which will map to the InventoryPlayer slot numbers 0 - 8) 9 - 35 = player
	 * inventory slots (which map to the InventoryPlayer slot numbers 9 - 35) 36 -
	 * 44 = TileInventory slots, which map to our TileEntity slot numbers 0 - 8)
	 */

	private static final int HOTBAR_SLOT_COUNT = 9;
	private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
	private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
	private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
	private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
	private static final int VANILLA_FIRST_SLOT_INDEX = 0;
	private static final int BE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;

	// THIS YOU HAVE TO DEFINE!
	private int blockEntityInventorySlotCount; // must be the number of slots you have!

	protected AbstractModMenu(MenuType<?> menuType, int containerId, int blockEntityInventorySlotCount) {
		super(menuType, containerId);
		this.blockEntityInventorySlotCount = blockEntityInventorySlotCount;
	}

	@Override
	public void addPlayerInventory(Inventory inventory) {
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 9; x++)
				addSlot(new Slot(inventory, x + y * 9 + 9, 8 + x * 18, 84 + y * 18));
		}
	}

	@Override
	public void addPlayerHotbar(Inventory inventory) {
		for (int i = 0; i < 9; i++)
			addSlot(new Slot(inventory, i, 8 + i * 18, 142));
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		Slot sourceSlot = slots.get(index);
		if (sourceSlot == null || !sourceSlot.hasItem())
			return ItemStack.EMPTY; // EMPTY_ITEM
		ItemStack sourceStack = sourceSlot.getItem();
		ItemStack copyOfSourceStack = sourceStack.copy();

		// Check if the slot clicked is one of the vanilla container slots
		if (index < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
			// This is a vanilla container slot so merge the stack into the tile inventory
			if (!moveItemStackTo(sourceStack, BE_INVENTORY_FIRST_SLOT_INDEX,
					BE_INVENTORY_FIRST_SLOT_INDEX + this.blockEntityInventorySlotCount, false)) {
				return ItemStack.EMPTY; // EMPTY_ITEM
			}
		} else if (index < BE_INVENTORY_FIRST_SLOT_INDEX + this.blockEntityInventorySlotCount) {
			// This is a TE slot so merge the stack into the players inventory
			if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT,
					false)) {
				return ItemStack.EMPTY;
			}
		} else {
			System.out.println("Invalid slotIndex:" + index);
			return ItemStack.EMPTY;
		}
		// If stack size == 0 (the entire stack was moved) set slot contents to null
		if (sourceStack.getCount() == 0) {
			sourceSlot.set(ItemStack.EMPTY);
		} else {
			sourceSlot.setChanged();
		}
		sourceSlot.onTake(playerIn, sourceStack);
		return copyOfSourceStack;
	}
}
