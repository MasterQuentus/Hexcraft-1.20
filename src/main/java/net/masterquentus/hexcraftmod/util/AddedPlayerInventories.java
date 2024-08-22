package net.masterquentus.hexcraftmod.util;

import net.minecraft.world.entity.player.Inventory;

/*
 *  Helper interface that adds quick ways to sent inventory sizes in menus
 */
public interface AddedPlayerInventories {
	void addPlayerInventory(Inventory inventory);

	void addPlayerHotbar(Inventory inventory);
}
