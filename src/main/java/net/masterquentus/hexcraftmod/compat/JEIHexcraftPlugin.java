package net.masterquentus.hexcraftmod.compat;

import java.util.List;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.recipe.WitchesOvenRecipe;
import net.masterquentus.hexcraftmod.screen.WitchesOvenScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

@JeiPlugin
public class JEIHexcraftPlugin implements IModPlugin {

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation(HexcraftMod.MOD_ID, "jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new WitchesOvenCategory(registration.getJeiHelpers().getGuiHelper(), 200));
		registration.addRecipeCategories(new WitchesCauldronCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	@SuppressWarnings("resource")
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager manager = Minecraft.getInstance().level.getRecipeManager();
		List<WitchesOvenRecipe> witchesOvenRecipes = manager.getAllRecipesFor(WitchesOvenRecipe.Type.INSTANCE);
		// List<WitchesCauldronRecipe> witchesCauldronRecipes = manager
		// .getAllRecipesFor(WitchesCauldronRecipe.Type.INSTANCE);

		registration.addRecipes(WitchesOvenCategory.WITCHES_OVEN_TYPE, witchesOvenRecipes);
		// registration.addRecipes(WitchesCauldronCategory.WITCHES_CAULDRON_TYPE,
		// witchesCauldronRecipes);
	}

	@Override
	public void registerGuiHandlers(IGuiHandlerRegistration registration) {
		registration.addRecipeClickArea(WitchesOvenScreen.class, 80, 21, 22, 15, WitchesOvenCategory.WITCHES_OVEN_TYPE);
		// Cauldron doesn't need one since no GUI
	}
}
