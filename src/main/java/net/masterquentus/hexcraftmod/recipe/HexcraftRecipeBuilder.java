package net.masterquentus.hexcraftmod.recipe;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public abstract class HexcraftRecipeBuilder implements RecipeBuilder {

    private final String subFolder;

    protected HexcraftRecipeBuilder() {
        this(null);
    }

    protected HexcraftRecipeBuilder(String subFolder) {
        this.subFolder = subFolder;
    }

    @Override
    @Deprecated
    public RecipeBuilder unlockedBy(String name, CriterionTriggerInstance trigger) {
        return this;
    }

    @Override
    public RecipeBuilder group(String group) {
        return this;
    }

    @Override
    public void save(@NotNull Consumer<FinishedRecipe> consumer) {
        this.save(consumer, getDefaultRecipeId());
    }

    private ResourceLocation getDefaultRecipeId() {
        return new ResourceLocation(HexcraftMod.MOD_ID, subFolder == null ? getRecipeName() : subFolder + "/" + getRecipeName());
    }

    protected abstract String getRecipeName();

}