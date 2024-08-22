package net.masterquentus.hexcraftmod.recipe;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftRecipes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister
			.create(ForgeRegistries.RECIPE_SERIALIZERS, HexcraftMod.MOD_ID);

	public static final RegistryObject<RecipeSerializer<WitchesOvenRecipe>> WITCHES_OVEN_SERIALIZER = SERIALIZERS
			.register("witches_oven", () -> WitchesOvenRecipe.Serializer.INSTANCE);

	public static final RegistryObject<RecipeSerializer<WitchesCauldronRecipe>> WITCHES_CAULDRON_SERIALIZER = SERIALIZERS
			.register("witches_cauldron", () -> WitchesCauldronRecipe.Serializer.INSTANCE);

	public static void register(IEventBus eventBus) {
		SERIALIZERS.register(eventBus);
	}
}