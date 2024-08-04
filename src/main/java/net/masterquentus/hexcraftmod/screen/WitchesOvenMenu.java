package net.masterquentus.hexcraftmod.screen;


import net.masterquentus.hexcraftmod.recipe.WitchesOvenRecipe;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.RecipeBookType;

public class WitchesOvenMenu extends AbstractFurnaceMenu {
    protected WitchesOvenMenu(int pContainerId, Inventory pPlayerInventory, FriendlyByteBuf friendlyByteBuf) {
        this(pContainerId, pPlayerInventory);
    }

    public WitchesOvenMenu(int pContainerId, Inventory pPlayerInventory, Container container, ContainerData data) {
        super(HexcraftMenuTypes.WITCHES_OVEN_MENU.get(), WitchesOvenRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory, container, data);
    }

    public WitchesOvenMenu(int pContainerId, Inventory pPlayerInventory) {
        super(HexcraftMenuTypes.WITCHES_OVEN_MENU.get(), WitchesOvenRecipe.Type.INSTANCE, RecipeBookType.FURNACE, pContainerId, pPlayerInventory);
    }
}
