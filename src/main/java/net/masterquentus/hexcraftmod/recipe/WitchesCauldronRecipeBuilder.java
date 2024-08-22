package net.masterquentus.hexcraftmod.recipe;

import java.util.List;
import java.util.function.Consumer;

import org.apache.commons.compress.utils.Lists;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;

public class WitchesCauldronRecipeBuilder implements RecipeBuilder {
	private final Item result;
	private final int count;
	private final int brewTime;
	private final List<Ingredient> ingredients = Lists.newArrayList();
	private final Advancement.Builder advancement = Advancement.Builder.advancement();

	public WitchesCauldronRecipeBuilder(ItemLike result, int count, int brewTime) {
		this.result = result.asItem();
		this.count = count;
		this.brewTime = brewTime;
	}

	public static WitchesCauldronRecipeBuilder buildCauldronRecipe(ItemLike result, int count, int brewTime) {
		return new WitchesCauldronRecipeBuilder(result, count, brewTime);
	}

	public static WitchesCauldronRecipeBuilder buildCauldronRecipe(ItemLike result, int count) {
		return new WitchesCauldronRecipeBuilder(result, count, 100);
	}

	public static WitchesCauldronRecipeBuilder buildCauldronRecipe(ItemLike result) {
		return new WitchesCauldronRecipeBuilder(result, 1, 100);
	}

	public WitchesCauldronRecipeBuilder requires(TagKey<Item> tag) {
		return this.requires(Ingredient.of(tag));
	}

	public WitchesCauldronRecipeBuilder requires(ItemLike item) {
		return this.requires(item, 1);
	}

	public WitchesCauldronRecipeBuilder requires(ItemLike item, int count) {
		for (int i = 0; i < count; i++)
			this.requires(Ingredient.of(item));
		return this;
	}

	public WitchesCauldronRecipeBuilder requires(Ingredient ingredient) {
		return this.requires(ingredient, 1);
	}

	public WitchesCauldronRecipeBuilder requires(Ingredient ingredient, int count) {
		for (int i = 0; i < count; i++)
			this.ingredients.add(ingredient);
		return this;
	}

	@Override
	public RecipeBuilder unlockedBy(String pCriterionName, CriterionTriggerInstance pCriterionTrigger) {
		this.advancement.addCriterion(pCriterionName, pCriterionTrigger);
		return this;
	}

	@Override
	public RecipeBuilder group(String pGroupName) {
		return this;
	}

	@Override
	public Item getResult() {
		return this.result;
	}

	public int getBrewTime() {
		return brewTime;
	}

	private void ensureValid(ResourceLocation id) {
		if (this.advancement.getCriteria().isEmpty())
			throw new IllegalStateException("No way of obtaining recipe " + id);
	}

	@Override
	public void save(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ResourceLocation pRecipeId) {
		this.ensureValid(pRecipeId);
		this.advancement.parent(new ResourceLocation("recipes/root"))
				.addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(pRecipeId))
				.rewards(AdvancementRewards.Builder.recipe(pRecipeId)).requirements(RequirementsStrategy.OR);

		pFinishedRecipeConsumer.accept(new WitchesCauldronRecipeBuilder.Result(this.result, this.count, this.brewTime,
				this.ingredients, this.advancement, pRecipeId.withPrefix("recipes/" + pRecipeId.getPath())));
	}

	public static class Result implements FinishedRecipe {
		private final Item result;
		private final int count;
		private final int brewTime;
		private final List<Ingredient> ingredients;
		private final Advancement.Builder advancement;
		private final ResourceLocation advancementId;

		public Result(Item result, int count, int brewTime, List<Ingredient> ingredients,
				Advancement.Builder advancement, ResourceLocation advancementId) {
			this.result = result;
			this.count = count;
			this.brewTime = brewTime;
			this.ingredients = ingredients;
			this.advancement = advancement;
			this.advancementId = advancementId;
		}

		@Override
		public void serializeRecipeData(JsonObject pJson) {
			if (this.ingredients.size() > 3)
				throw new IllegalStateException("Witches Cauldron recipe cannot take more than 3 inputs");

			pJson.addProperty("brewTime", this.brewTime);

			// Adds Ingredients List in Recipe JSON
			JsonArray jsonarray = new JsonArray();
			for (Ingredient ingredient : this.ingredients)
				jsonarray.add(ingredient.toJson());

			pJson.add("ingredients", jsonarray);

			// Add Results Object in Recipe JSON
			JsonObject resultJsonObject = new JsonObject();
			resultJsonObject.addProperty("item", ForgeRegistries.ITEMS.getKey(this.result).toString());
			if (this.count > 1)
				resultJsonObject.addProperty("count", this.count);

			pJson.add("result", resultJsonObject);
		}

		@Override
		public ResourceLocation getId() {
			return new ResourceLocation(HexcraftMod.MOD_ID, this.result.asItem().toString());
		}

		@Override
		public RecipeSerializer<?> getType() {
			return WitchesCauldronRecipe.Serializer.INSTANCE;
		}

		@Override
		public JsonObject serializeAdvancement() {
			return this.advancement.serializeToJson();
		}

		@Override
		public ResourceLocation getAdvancementId() {
			return this.advancementId;
		}
	}
}
