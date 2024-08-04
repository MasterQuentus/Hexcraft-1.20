package net.masterquentus.hexcraftmod.worldgen;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class HexcraftPlacedFeatures {

    public static final ResourceKey<PlacedFeature> VAMPIRIC_ORE_PLACED_KEY = registerKey("vampiric_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_VAMPIRIC_ORE_PLACED_KEY = registerKey("nether_vampiric_ore_placed");
    public static final ResourceKey<PlacedFeature> END_VAMPIRIC_ORE_PLACED_KEY = registerKey("end_vampiric_ore_placed");
    public static final ResourceKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_SILVER_ORE_PLACED_KEY = registerKey("nether_silver_ore_placed");
    public static final ResourceKey<PlacedFeature> END_SILVER_ORE_PLACED_KEY = registerKey("end_silver_ore_placed");
    public static final ResourceKey<PlacedFeature> MOON_STONE_ORE_PLACED_KEY = registerKey("moon_stone_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_MOON_STONE_ORE_PLACED_KEY = registerKey("nether_moon_stone_ore_placed");
    public static final ResourceKey<PlacedFeature> END_MOON_STONE_ORE_PLACED_KEY = registerKey("end_moon_stone_ore_placed");
    public static final ResourceKey<PlacedFeature> TRENOGEN_ORE_PLACED_KEY = registerKey("trenogen_ore_placed");
    public static final ResourceKey<PlacedFeature> JORMUIM_ORE_PLACED_KEY = registerKey("jormuim_ore_placed");
    public static final ResourceKey<PlacedFeature> PEARL_STONE_ORE_PLACED_KEY = registerKey("pearl_stone_ore_placed");
    public static final ResourceKey<PlacedFeature> CRIMSON_STONE_ORE_PLACED_KEY = registerKey("crimson_stone_ore_placed");
    public static final ResourceKey<PlacedFeature> CHARSTONE_ORE_PLACED_KEY = registerKey("charstone_ore_placed");

    public static final ResourceKey<PlacedFeature> MAGIC_CRYSTAL_GEODE_PLACED_KEY = registerKey("magic_crystal_geode_placed");

    public static final ResourceKey<PlacedFeature> VAMPIRE_ORCHID_PLACED_KEY = registerKey("vampire_orchid_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, VAMPIRIC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.OVERWORLD_VAMPIRIC_ORE_KEY),
                HexcraftOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, NETHER_VAMPIRIC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.NETHER_VAMPIRIC_ORE_KEY),
                HexcraftOrePlacement.commonOrePlacement(9,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, END_VAMPIRIC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.END_VAMPIRIC_ORE_KEY),
                HexcraftOrePlacement.commonOrePlacement(7,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.OVERWORLD_SILVER_ORE_KEY),
                HexcraftOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, NETHER_SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.NETHER_SILVER_ORE_KEY),
                HexcraftOrePlacement.commonOrePlacement(9,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, END_SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.END_SILVER_ORE_KEY),
                HexcraftOrePlacement.commonOrePlacement(7,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, MOON_STONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.OVERWORLD_MOON_STONE_ORE_KEY),
                HexcraftOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, NETHER_MOON_STONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.NETHER_MOON_STONE_ORE_KEY),
                HexcraftOrePlacement.commonOrePlacement(9,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, END_MOON_STONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.END_MOON_STONE_ORE_KEY),
                HexcraftOrePlacement.commonOrePlacement(7,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, TRENOGEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.OVERWORLD_TRENOGEN_ORE_KEY),
                HexcraftOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, JORMUIM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.JORMUIM_ORE_KEY),
                HexcraftOrePlacement.commonOrePlacement(7,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, PEARL_STONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.PEARL_STONE_ORE_KEY),
                HexcraftOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, CRIMSON_STONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.CRIMSON_STONE_ORE_KEY),
                HexcraftOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, CHARSTONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.CHARSTONE_ORE_KEY),
                HexcraftOrePlacement.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, MAGIC_CRYSTAL_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.MAGIC_CRYSTAL_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(24), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30)),
                        BiomeFilter.biome()));
        register(context, VAMPIRE_ORCHID_PLACED_KEY, configuredFeatures.getOrThrow(HexcraftConfiguredFeatures.VAMPIRE_ORCHID_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(HexcraftMod.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}