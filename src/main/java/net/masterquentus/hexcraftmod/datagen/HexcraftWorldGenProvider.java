package net.masterquentus.hexcraftmod.datagen;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.worldgen.HexcraftBiomeModifers;
import net.masterquentus.hexcraftmod.worldgen.HexcraftConfiguredFeatures;
import net.masterquentus.hexcraftmod.worldgen.HexcraftPlacedFeatures;
import net.masterquentus.hexcraftmod.worldgen.biome.HexcraftBiomes;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class HexcraftWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, HexcraftConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, HexcraftPlacedFeatures::bootstrap)
            .add(Registries.BIOME, HexcraftBiomes::boostrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, HexcraftBiomeModifers::bootstrap);

    public HexcraftWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(HexcraftMod.MOD_ID));
    }
}