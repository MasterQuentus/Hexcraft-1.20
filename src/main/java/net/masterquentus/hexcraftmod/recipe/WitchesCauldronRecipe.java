package net.masterquentus.hexcraftmod.recipe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Nullable;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.Level;

public class WitchesCauldronRecipe implements Recipe<SimpleContainer> {
	protected final RecipeType<?> type;
	private final ResourceLocation id;
	private final NonNullList<Ingredient> ingredients;
	private final ItemStack result;
	protected final int brewTime;

	public WitchesCauldronRecipe(ResourceLocation id, NonNullList<Ingredient> ingredients, ItemStack result,
			int brewTime) {
		this.type = Type.INSTANCE;
		this.id = id;
		this.ingredients = ingredients;
		this.result = result;
		this.brewTime = brewTime;
	}

	@Override
	public boolean matches(SimpleContainer pContainer, Level pLevel) {
		if (pLevel.isClientSide())
			return false;

		List<ItemStack> itemsInContainer = new ArrayList<>();
		for (int i = 0; i < pContainer.getContainerSize(); i++)
			itemsInContainer.add(pContainer.getItem(i));

		List<Ingredient> ingredientsToMatch = new ArrayList<>(this.ingredients);

		for (ItemStack stack : itemsInContainer) {
			if (stack.isEmpty())
				continue;

			boolean matched = false;
			Iterator<Ingredient> iterator = ingredientsToMatch.iterator();

			while (iterator.hasNext()) {
				Ingredient ingredient = iterator.next();
				if (ingredient.test(stack)) {
					matched = true;
					iterator.remove();
					break;
				}
			}

			if (!matched)
				return false;
		}

		return ingredientsToMatch.isEmpty();
	}

	@Override
	public NonNullList<Ingredient> getIngredients() {
		return this.ingredients;
	}

	@Override
	public ItemStack assemble(SimpleContainer pContainer, RegistryAccess pRegistryAccess) {
		return result.copy();
	}

	@Override
	public boolean canCraftInDimensions(int pWidth, int pHeight) {
		return true;
	}

	@Override
	public ItemStack getResultItem(RegistryAccess pRegistryAccess) {
		return result.copy();
	}

	@Override
	public ResourceLocation getId() {
		return this.id;
	}

	@Override
	public ItemStack getToastSymbol() {
		return new ItemStack(HexcraftBlocks.WITCHES_CAULDRON.get());
	}

	@Override
	public RecipeSerializer<?> getSerializer() {
		return Serializer.INSTANCE;
	}

	@Override
	public RecipeType<?> getType() {
		return Type.INSTANCE;
	}

	public int getBrewTime() {
		return this.brewTime;
	}

	public static class Type implements RecipeType<WitchesCauldronRecipe> {
		public static final Type INSTANCE = new Type();
		public static final String ID = "witches_cauldron";
	}

	public static class Serializer implements RecipeSerializer<WitchesCauldronRecipe> {
		public static final Serializer INSTANCE = new Serializer();
		public static final ResourceLocation ID = new ResourceLocation(HexcraftMod.MOD_ID,
				WitchesCauldronRecipe.Type.ID);

		@Override
		public WitchesCauldronRecipe fromJson(ResourceLocation pRecipeId, JsonObject pJson) {
			int brewTime = GsonHelper.getAsInt(pJson, "brewTime");

			ItemStack result = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pJson, "result"));

			JsonArray ingredients = GsonHelper.getAsJsonArray(pJson, "ingredients");
			NonNullList<Ingredient> inputs = NonNullList.withSize(3, Ingredient.EMPTY);

			for (int i = 0; i < inputs.size(); i++)
				inputs.set(i, Ingredient.fromJson(ingredients.get(i)));

			return new WitchesCauldronRecipe(pRecipeId, inputs, result, brewTime);
		}

		@Override
		public @Nullable WitchesCauldronRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
			int brewTime = pBuffer.readInt();

			NonNullList<Ingredient> ingredients = NonNullList.withSize(pBuffer.readInt(), Ingredient.EMPTY);
			for (int i = 0; i < ingredients.size(); i++) {
				ingredients.set(i, Ingredient.fromNetwork(pBuffer));
			}

			ItemStack result = pBuffer.readItem();
			return new WitchesCauldronRecipe(pRecipeId, ingredients, result, brewTime);
		}

		@Override
		public void toNetwork(FriendlyByteBuf pBuffer, WitchesCauldronRecipe pRecipe) {
			pBuffer.writeInt(pRecipe.getBrewTime());

			pBuffer.writeInt(pRecipe.ingredients.size());
			for (Ingredient ingredient : pRecipe.getIngredients()) {
				ingredient.toNetwork(pBuffer);
			}

			pBuffer.writeItemStack(pRecipe.getResultItem(null), false);
		}
	}
}