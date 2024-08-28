package net.masterquentus.hexcraftmod.recipe;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.*;
import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.compat.WitchesCauldronCategory;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.masterquentus.hexcraftmod.screen.HexcraftMenuTypes;
import net.masterquentus.hexcraftmod.screen.WitchesOvenMenu;
import net.masterquentus.hexcraftmod.util.HexcraftTags;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

@JeiPlugin
public class HexcraftJEIPlugin implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return HexcraftMod.id("jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        //registration.addRecipeCategories(new WitchesCauldronCategory(registration.getJeiHelpers(), JEIRecipeTypes.RECIPE_TYPE_WITCH_CAULDRON));
        registration.addRecipeCategories(new MutandisCategory(registration.getJeiHelpers(), JEIRecipeTypes.RECIPE_TYPE_MUTANDIS, new ItemStack(HexcraftItems.MUTANDIS.get()), Component.translatable("jei.enchanted.mutandis")));
        registration.addRecipeCategories(new MutandisCategory(registration.getJeiHelpers(), JEIRecipeTypes.RECIPE_TYPE_MUTANDIS_EXTREMIS, new ItemStack(HexcraftItems.MUTANDIS_EXTREMIS.get()), Component.translatable("jei.enchanted.mutandis_extremis")));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {;
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        registration.addRecipes(JEIRecipeTypes.RECIPE_TYPE_WITCH_CAULDRON, recipeManager.getAllRecipesFor(HexcraftRecipeTypes.WITCHES_CAULDRON.get()));

        BuiltInRegistries.BLOCK.getTag(HexcraftTags.Blocks.MUTANDIS_PLANTS).ifPresent(tag -> registration.addRecipes(JEIRecipeTypes.RECIPE_TYPE_MUTANDIS, tag.stream()
                .filter(block -> !BuiltInRegistries.BLOCK.getTag(HexcraftTags.Blocks.MUTANDIS_BLACKLIST).map(t -> t.contains(block)).orElse(false))
                .map(block -> new JEIMutandisRecipe(HexcraftTags.Blocks.MUTANDIS_PLANTS, new ItemStack(block.value()), Component.translatable("jei.enchanted.mutandis.description"))).toList()));

        BuiltInRegistries.BLOCK.getTag(HexcraftTags.Blocks.MUTANDIS_EXTREMIS_PLANTS).ifPresent(tag -> registration.addRecipes(JEIRecipeTypes.RECIPE_TYPE_MUTANDIS_EXTREMIS, tag.stream()
                .filter(block -> !BuiltInRegistries.BLOCK.getTag(HexcraftTags.Blocks.MUTANDIS_EXTREMIS_BLACKLIST).map(t -> t.contains(block)).orElse(false))
                .map(block -> new JEIMutandisRecipe(HexcraftTags.Blocks.MUTANDIS_EXTREMIS_PLANTS, new ItemStack(block.value()), Component.translatable("jei.enchanted.mutandis.description"))).toList()));

    }

    @Override
    public void registerRecipeTransferHandlers(IRecipeTransferRegistration registration) {
        registration.addRecipeTransferHandler(WitchesOvenMenu.class, HexcraftMenuTypes.WITCHES_OVEN_MENU.get(),
                JEIRecipeTypes.RECIPE_TYPE_WITCH_CAULDRON, 0, 1, 5, 36);
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(HexcraftItems.MUTANDIS.get().getDefaultInstance(), JEIRecipeTypes.RECIPE_TYPE_MUTANDIS);
        registration.addRecipeCatalyst(HexcraftItems.MUTANDIS_EXTREMIS.get().getDefaultInstance(), JEIRecipeTypes.RECIPE_TYPE_MUTANDIS_EXTREMIS);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
    }

}