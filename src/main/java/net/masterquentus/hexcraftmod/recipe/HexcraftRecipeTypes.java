package net.masterquentus.hexcraftmod.recipe;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class HexcraftRecipeTypes {
	public static final DeferredRegister<RecipeType<?>> TYPES = DeferredRegister.create(ForgeRegistries.RECIPE_TYPES,
			HexcraftMod.MOD_ID);

	public static final RegistryObject<RecipeType<WitchesOvenRecipe>> WITCHES_OVEN = TYPES.register("witches_oven",
			() -> WitchesOvenRecipe.Type.INSTANCE);

	public static final RegistryObject<RecipeType<WitchesCauldronRecipe>> WITCHES_CAULDRON = TYPES
			.register("witches_cauldron", () -> WitchesCauldronRecipe.Type.INSTANCE);


	public static void register(IEventBus eventBus) {
		TYPES.register(eventBus);
	}
}