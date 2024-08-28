package net.masterquentus.hexcraftmod.recipe;

import mezz.jei.api.recipe.RecipeType;
import net.masterquentus.hexcraftmod.HexcraftMod;

public class JEIRecipeTypes {

    public static final RecipeType<WitchesCauldronRecipe> RECIPE_TYPE_WITCH_CAULDRON = new RecipeType<>(HexcraftMod.id("witch_cauldron_category"), WitchesCauldronRecipe.class);
    public static final RecipeType<JEIMutandisRecipe> RECIPE_TYPE_MUTANDIS = new RecipeType<>(HexcraftMod.id("mutandis_category"), JEIMutandisRecipe.class);
    public static final RecipeType<JEIMutandisRecipe> RECIPE_TYPE_MUTANDIS_EXTREMIS = new RecipeType<>(HexcraftMod.id("mutandis_extremis_category"), JEIMutandisRecipe.class);

}
