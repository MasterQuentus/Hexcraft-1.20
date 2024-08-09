package net.masterquentus.hexcraftmod.worldgen;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class HexcraftConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_VAMPIRIC_ORE_KEY = registerKey("vampiric_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_VAMPIRIC_ORE_KEY = registerKey("nether_vampiric_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_VAMPIRIC_ORE_KEY = registerKey("end_vampiric_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILVER_ORE_KEY = registerKey("silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SILVER_ORE_KEY = registerKey("nether_silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SILVER_ORE_KEY = registerKey("end_silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MOON_STONE_ORE_KEY = registerKey("moon_stone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_MOON_STONE_ORE_KEY = registerKey("nether_moon_stone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_MOON_STONE_ORE_KEY = registerKey("end_moon_stone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TRENOGEN_ORE_KEY = registerKey("trenogen_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> JORMUIM_ORE_KEY = registerKey("jormuim_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> PEARL_STONE_ORE_KEY = registerKey("pearl_stone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRIMSON_STONE_ORE_KEY = registerKey("crimson_stone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHARSTONE_ORE_KEY = registerKey("charstone_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGIC_CRYSTAL_GEODE_KEY = registerKey("magic_crystal_geode");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceabeles = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceabeles = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceabeles = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceabeles = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldVampiricOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        HexcraftBlocks.VAMPIRIC_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, HexcraftBlocks.DEEPSLATE_VAMPIRIC_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldSilverOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        HexcraftBlocks.SILVER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, HexcraftBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldMoonStoneOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        HexcraftBlocks.MOONSTONE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, HexcraftBlocks.DEEPSLATE_MOONSTONE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldTrenogenOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        HexcraftBlocks.TRENOGEN_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, HexcraftBlocks.DEEPSLATE_TRENOGEN_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldPearlStoneOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                HexcraftBlocks.PEARL_STONE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldCrimsonStoneOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                HexcraftBlocks.CRIMSON_STONE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldCharstoneOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                HexcraftBlocks.CHARSTONE.get().defaultBlockState()));

        register(context, OVERWORLD_VAMPIRIC_ORE_KEY, Feature.ORE, new OreConfiguration(overworldVampiricOres, 9));
        register(context, NETHER_VAMPIRIC_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceabeles,
                HexcraftBlocks.NETHER_VAMPIRIC_ORE.get().defaultBlockState(), 9));
        register(context, END_VAMPIRIC_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceabeles,
                HexcraftBlocks.END_VAMPIRIC_ORE.get().defaultBlockState(), 9));
        register(context, OVERWORLD_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSilverOres, 9));
        register(context, NETHER_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceabeles,
                HexcraftBlocks.NETHER_SILVER_ORE.get().defaultBlockState(), 9));
        register(context, END_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceabeles,
                HexcraftBlocks.END_SILVER_ORE.get().defaultBlockState(), 9));
        register(context, OVERWORLD_MOON_STONE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldMoonStoneOres, 9));
        register(context, NETHER_MOON_STONE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceabeles,
                HexcraftBlocks.NETHER_MOONSTONE_ORE.get().defaultBlockState(), 9));
        register(context, END_MOON_STONE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceabeles,
                HexcraftBlocks.END_MOONSTONE_ORE.get().defaultBlockState(), 9));
        register(context, OVERWORLD_TRENOGEN_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTrenogenOres, 9));
        register(context, JORMUIM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceabeles,
                HexcraftBlocks.JORMUIM_ORE.get().defaultBlockState(), 9));

        register(context, PEARL_STONE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPearlStoneOres, 64));

        register(context, CRIMSON_STONE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCrimsonStoneOres, 64));

        register(context, CHARSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCharstoneOres, 64));

        register(context, MAGIC_CRYSTAL_GEODE_KEY, Feature.GEODE,
                new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                        BlockStateProvider.simple(HexcraftBlocks.MAGIC_CRYSTAL_BLOCK.get()), BlockStateProvider.simple(HexcraftBlocks.BUDDING_MAGIC_CRYSTAL.get()),
                        BlockStateProvider.simple(Blocks.CALCITE), BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                        List.of(HexcraftBlocks.SMALL_MAGIC_CRYSTAL_BUD.get().defaultBlockState(), HexcraftBlocks.MEDIUM_MAGIC_CRYSTAL_BUD.get().defaultBlockState(),
                                HexcraftBlocks.LARGE_MAGIC_CRYSTAL_BUD.get().defaultBlockState(), HexcraftBlocks.MAGIC_CRYSTAL_CLUSTER.get().defaultBlockState()),
                        BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS), new GeodeLayerSettings(1.7, 2.2, 3.2, 4.2),
                        new GeodeCrackSettings(0.95, 2.0, 2), 0.35, 0.083,
                        true, UniformInt.of(4, 6), UniformInt.of(3, 4),
                        UniformInt.of(1, 2), -16, 16, 0.05, 1));


    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(HexcraftMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}