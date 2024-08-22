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

public class WitchesOvenRecipeBuilder implements RecipeBuilder {
	private final Item result;
	private final int count;
	private final Item excessResult;
	private final int excessCount;
	private final float experience;
	private final int bakeTime;
	private final List<Ingredient> ingredients = Lists.newArrayList();
	private final Advancement.Builder advancement = Advancement.Builder.advancement();

	public WitchesOvenRecipeBuilder(ItemLike result, int count, ItemLike excessResult, int excessCount,
			float experience, int bakeTime) {
		this.result = result.asItem();
		this.count = count;
		this.excessResult = excessResult.asItem();
		this.excessCount = excessCount;
		this.experience = experience;
		this.bakeTime = bakeTime;
	}

	public static WitchesOvenRecipeBuilder buildOvenRecipe(ItemLike result, int count, ItemLike excessResult,
			int excessCount, float experience, int bakeTime) {
		return new WitchesOvenRecipeBuilder(result, count, excessResult, excessCount, experience, bakeTime);
	}

	public static WitchesOvenRecipeBuilder buildOvenRecipe(ItemLike result, ItemLike excessResult, int excessCount,
			float experience, int bakeTime) {
		return new WitchesOvenRecipeBuilder(result, 1, excessResult, excessCount, experience, bakeTime);
	}

	public static WitchesOvenRecipeBuilder buildOvenRecipe(ItemLike result, int count, ItemLike excessResult,
			float experience, int bakeTime) {
		return new WitchesOvenRecipeBuilder(result, count, excessResult, 1, experience, bakeTime);
	}

	public static WitchesOvenRecipeBuilder buildOvenRecipe(ItemLike result, ItemLike excessResult, float experience,
			int bakeTime) {
		return new WitchesOvenRecipeBuilder(result, 1, excessResult, 1, experience, bakeTime);
	}

	public WitchesOvenRecipeBuilder requires(TagKey<Item> tag) {
		return this.requires(Ingredient.of(tag));
	}

	public WitchesOvenRecipeBuilder requires(ItemLike item) {
		return this.requires(item, 1);
	}

	public WitchesOvenRecipeBuilder requires(ItemLike item, int count) {
		for (int i = 0; i < count; i++)
			this.requires(Ingredient.of(item));
		return this;
	}

	public WitchesOvenRecipeBuilder requires(Ingredient ingredient) {
		return this.requires(ingredient, 1);
	}

	public WitchesOvenRecipeBuilder requires(Ingredient ingredient, int count) {
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

	public Item getExcessResult() {
		return this.excessResult;
	}

	public int getBakeTime() {
		return bakeTime;
	}

	public float getExperience() {
		return experience;
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

		pFinishedRecipeConsumer.accept(new WitchesOvenRecipeBuilder.Result(this.result, this.count, this.excessResult,
				this.excessCount, this.experience, this.bakeTime, this.ingredients, this.advancement,
				pRecipeId.withPrefix("recipes/" + pRecipeId.getPath())));
	}

	public static class Result implements FinishedRecipe {
		private final Item result;
		private final int count;
		private final Item excessResult;
		private final int excessCount;
		private final float experience;
		private final int bakeTime;
		private final List<Ingredient> ingredients;
		private final Advancement.Builder advancement;
		private final ResourceLocation advancementId;

		public Result(Item result, int count, Item excessResult, int excessCount, float experience, int bakeTime,
				List<Ingredient> ingredients, Advancement.Builder advancement, ResourceLocation advancementId) {
			this.result = result;
			this.count = count;
			this.excessResult = excessResult;
			this.excessCount = excessCount;
			this.experience = experience;
			this.bakeTime = bakeTime;
			this.ingredients = ingredients;
			this.advancement = advancement;
			this.advancementId = advancementId;
		}

		@Override
		public void serializeRecipeData(JsonObject pJson) {
			if (this.ingredients.size() > 2)
				throw new IllegalStateException("Witches Oven recipe cannot take more than 2 inputs");

			pJson.addProperty("experience", this.experience);
			pJson.addProperty("bakeTime", this.bakeTime);

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

			// Add Excess Results Object in Recipe JSON
			JsonObject excessResultJsonObject = new JsonObject();
			excessResultJsonObject.addProperty("item", ForgeRegistries.ITEMS.getKey(this.excessResult).toString());
			if (this.excessCount > 1)
				excessResultJsonObject.addProperty("count", this.excessCount);

			pJson.add("excessResult", excessResultJsonObject);
		}

		@Override
		public ResourceLocation getId() {
			return new ResourceLocation(HexcraftMod.MOD_ID, this.result.asItem().toString());
		}

		@Override
		public RecipeSerializer<?> getType() {
			return WitchesOvenRecipe.Serializer.INSTANCE;
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
