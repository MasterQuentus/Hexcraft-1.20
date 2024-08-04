package net.masterquentus.hexcraftmod.screen;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.recipe.WitchesOvenRecipeBookComponent;
import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class WitchesOvenScreen extends AbstractFurnaceScreen<WitchesOvenMenu> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(HexcraftMod.MOD_ID, "textures/gui/withes_oven.png");


    public WitchesOvenScreen(WitchesOvenMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, new WitchesOvenRecipeBookComponent(), pPlayerInventory, pTitle, TEXTURE);
    }
}
