package net.masterquentus.hexcraftmod.worldgen;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.MangrovePropaguleBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.HugeFungusConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.DarkOakFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.RandomSpreadFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.SpruceFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.rootplacers.AboveRootPlacement;
import net.minecraft.world.level.levelgen.feature.rootplacers.MangroveRootPlacement;
import net.minecraft.world.level.levelgen.feature.rootplacers.MangroveRootPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.RandomizedIntStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.AttachedToLeavesDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.DarkOakTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.UpwardsBranchingTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;
import java.util.Optional;

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

	public static final ResourceKey<ConfiguredFeature<?, ?>> EBONY_KEY = registerKey("ebony");

	public static final ResourceKey<ConfiguredFeature<?, ?>> BLOOD_OAK_KEY = registerKey("blood_oak");

	public static final ResourceKey<ConfiguredFeature<?, ?>> HELL_BARK_KEY = registerKey("hell_bark");

	public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_OAK_KEY = registerKey("white_oak");

	public static final ResourceKey<ConfiguredFeature<?, ?>> ALDER_KEY = registerKey("alder");

	public static final ResourceKey<ConfiguredFeature<?, ?>> WITCH_HAZEL_KEY = registerKey("witch_hazel");

	public static final ResourceKey<ConfiguredFeature<?, ?>> WILLOW_KEY = registerKey("willow");

	public static final ResourceKey<ConfiguredFeature<?, ?>> HAWTHORN_KEY = registerKey("hawthorn");

	public static final ResourceKey<ConfiguredFeature<?, ?>> CEDAR_KEY = registerKey("cedar");

	public static final ResourceKey<ConfiguredFeature<?, ?>> DISTORTED_KEY = registerKey("distorted");

	public static final ResourceKey<ConfiguredFeature<?, ?>> ELDER_KEY = registerKey("elder");

	public static final ResourceKey<ConfiguredFeature<?, ?>> JUNIPER_KEY = registerKey("juniper");

	public static final ResourceKey<ConfiguredFeature<?, ?>> ROWAN_KEY = registerKey("rowan");

	public static final ResourceKey<ConfiguredFeature<?, ?>> TWISTED_KEY = registerKey("twisted");

	public static final ResourceKey<ConfiguredFeature<?, ?>> WITCH_WOOD_KEY = registerKey("witch_wood");

	public static final ResourceKey<ConfiguredFeature<?, ?>> ECHO_KEY = registerKey("echo");


	public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

		HolderGetter<Block> $$1 = context.lookup(Registries.BLOCK);

		BlockPredicate $$2 = BlockPredicate.matchesBlocks(new Block[]{HexcraftBlocks.HELL_BARK_SAPLING.get(), HexcraftBlocks.ECHO_WOOD_SAPLING.get(), Blocks.OAK_SAPLING,
				Blocks.SPRUCE_SAPLING, Blocks.BIRCH_SAPLING, Blocks.JUNGLE_SAPLING, Blocks.ACACIA_SAPLING, Blocks.CHERRY_SAPLING, Blocks.DARK_OAK_SAPLING, Blocks.MANGROVE_PROPAGULE,
				Blocks.DANDELION, Blocks.TORCHFLOWER, Blocks.POPPY, Blocks.BLUE_ORCHID, Blocks.ALLIUM, Blocks.AZURE_BLUET, Blocks.RED_TULIP, Blocks.ORANGE_TULIP, Blocks.WHITE_TULIP,
				Blocks.PINK_TULIP, Blocks.OXEYE_DAISY, Blocks.CORNFLOWER, Blocks.WITHER_ROSE, Blocks.LILY_OF_THE_VALLEY, Blocks.BROWN_MUSHROOM, Blocks.RED_MUSHROOM, Blocks.WHEAT, Blocks.SUGAR_CANE,
				Blocks.ATTACHED_PUMPKIN_STEM, Blocks.ATTACHED_MELON_STEM, Blocks.PUMPKIN_STEM, Blocks.MELON_STEM, Blocks.LILY_PAD, Blocks.NETHER_WART, Blocks.COCOA, Blocks.CARROTS,
				Blocks.POTATOES, Blocks.CHORUS_PLANT, Blocks.CHORUS_FLOWER, Blocks.TORCHFLOWER_CROP, Blocks.PITCHER_CROP, Blocks.BEETROOTS, Blocks.SWEET_BERRY_BUSH, Blocks.WARPED_FUNGUS,
				Blocks.CRIMSON_FUNGUS, Blocks.WEEPING_VINES, Blocks.WEEPING_VINES_PLANT, Blocks.TWISTING_VINES, Blocks.TWISTING_VINES_PLANT, Blocks.CAVE_VINES, Blocks.CAVE_VINES_PLANT,
				Blocks.SPORE_BLOSSOM, Blocks.AZALEA, Blocks.FLOWERING_AZALEA, Blocks.MOSS_CARPET, Blocks.PINK_PETALS, Blocks.BIG_DRIPLEAF, Blocks.BIG_DRIPLEAF_STEM, Blocks.SMALL_DRIPLEAF});


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

		register(context, EBONY_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
				BlockStateProvider.simple(HexcraftBlocks.EBONY_LOG.get()),
				new StraightTrunkPlacer(5, 2, 1),

				BlockStateProvider.simple(HexcraftBlocks.EBONY_LEAVES.get()),
				new SpruceFoliagePlacer(UniformInt.of(3, 3), UniformInt.of(0, 0),
						UniformInt.of(3, 4)),

				new TwoLayersFeatureSize(2, 0, 2)).ignoreVines().build());

		register(context, BLOOD_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
				BlockStateProvider.simple(HexcraftBlocks.BLOOD_OAK_LOG.get()),
				new DarkOakTrunkPlacer(2, 3, 3),

				BlockStateProvider.simple(HexcraftBlocks.BLOOD_OAK_LEAVES.get()),
				new DarkOakFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2)),

				new TwoLayersFeatureSize(2, 0, 2)).build());

		register(context, HELL_BARK_KEY, Feature.HUGE_FUNGUS, new HugeFungusConfiguration(Blocks.DIRT.defaultBlockState(),
				HexcraftBlocks.HELL_BARK_LOG.get().defaultBlockState(), HexcraftBlocks.HELL_BARK_LEAVES.get().defaultBlockState(), HexcraftBlocks.HELL_FUNGAL_LAMP.get().defaultBlockState(), $$2, true));

		register(context, WHITE_OAK_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
				BlockStateProvider.simple(HexcraftBlocks.WHITE_OAK_LOG.get()),
				new DarkOakTrunkPlacer(2, 3, 3),

				BlockStateProvider.simple(HexcraftBlocks.WHITE_OAK_LEAVES.get()),
				new DarkOakFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2)),

				new TwoLayersFeatureSize(2, 0, 2)).build());

		register(context, ALDER_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
				BlockStateProvider.simple(HexcraftBlocks.ALDER_LOG.get()),
				new StraightTrunkPlacer(2, 3, 2),

				BlockStateProvider.simple(HexcraftBlocks.ALDER_LEAVES.get()),
				new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
				new TwoLayersFeatureSize(1, 0, 2)).build());

		register(context, WITCH_HAZEL_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
				BlockStateProvider.simple(HexcraftBlocks.WITCH_HAZEL_LOG.get()),
				new ForkingTrunkPlacer(2, 4, 4),

				BlockStateProvider.simple(HexcraftBlocks.WITCH_WOOD_LEAVES.get()),
				new DarkOakFoliagePlacer(UniformInt.of(0, 0),
						UniformInt.of(0, 0)),
				new TwoLayersFeatureSize(1, 1, 0)).ignoreVines().build());

		register(context, WILLOW_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
				BlockStateProvider.simple(HexcraftBlocks.WILLOW_LOG.get()),
				new ForkingTrunkPlacer(2, 4, 4),

				BlockStateProvider.simple(HexcraftBlocks.WILLOW_LEAVES.get()),
				new DarkOakFoliagePlacer(UniformInt.of(0, 0),
						UniformInt.of(0, 0)),
				new TwoLayersFeatureSize(1, 1, 0)).ignoreVines().build());

		register(context, HAWTHORN_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
				BlockStateProvider.simple(HexcraftBlocks.HAWTHORN_LOG.get()),
				new ForkingTrunkPlacer(3,3,3),

				BlockStateProvider.simple(HexcraftBlocks.HAWTHORN_LEAVES.get()),
				new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(3), 3),
				new TwoLayersFeatureSize(3,3,3)).ignoreVines().build());

		register(context, CEDAR_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
				BlockStateProvider.simple(HexcraftBlocks.CEDAR_LOG.get()),
				new StraightTrunkPlacer(3,2,2),

				BlockStateProvider.simple(HexcraftBlocks.CEDAR_LEAVES.get()),
				new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(7), 7),
				new TwoLayersFeatureSize(3,3,3)).ignoreVines().build());

		register(context, DISTORTED_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
				BlockStateProvider.simple(HexcraftBlocks.DISTORTED_LOG.get()),
				new StraightTrunkPlacer(2,3,3),

				BlockStateProvider.simple(HexcraftBlocks.DISTORTED_LEAVES.get()),
				new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
				new TwoLayersFeatureSize(3,2,0)).ignoreVines().build());

		register(context, ELDER_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
				BlockStateProvider.simple(HexcraftBlocks.ELDER_LOG.get()),
				new StraightTrunkPlacer(2,3,3),

				BlockStateProvider.simple(HexcraftBlocks.ELDER_LEAVES.get()),
				new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
				new TwoLayersFeatureSize(3,2,0)).ignoreVines().build());

		register(context, JUNIPER_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
				BlockStateProvider.simple(HexcraftBlocks.JUNIPER_LOG.get()),
				new ForkingTrunkPlacer(2,4,4),

				BlockStateProvider.simple(HexcraftBlocks.JUNIPER_LEAVES.get()),
				new DarkOakFoliagePlacer (UniformInt.of(1, 1),
						UniformInt.of(0, 0)),
				new TwoLayersFeatureSize(1,1,0)).ignoreVines().build());

		register(context, ROWAN_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
				BlockStateProvider.simple(HexcraftBlocks.ROWAN_LOG.get()),
				new StraightTrunkPlacer(3,4,4),

				BlockStateProvider.simple(HexcraftBlocks.ROWAN_LEAVES.get()),
				new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), 3),
				new TwoLayersFeatureSize(3,2,0)).ignoreVines().build());

		register(context, TWISTED_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
				BlockStateProvider.simple(HexcraftBlocks.TWISTED_LOG.get()),
				new ForkingTrunkPlacer(4,4,4),

				BlockStateProvider.simple(HexcraftBlocks.TWISTED_LEAVES.get()),
				new DarkOakFoliagePlacer (UniformInt.of(0, 0),
						UniformInt.of(0, 0)),
				new TwoLayersFeatureSize(1,1,0)).ignoreVines().build());

		register(context, WITCH_WOOD_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
				BlockStateProvider.simple(HexcraftBlocks.WITCH_WOOD_LOG.get()),
				new ForkingTrunkPlacer(4,4,4),

				BlockStateProvider.simple(HexcraftBlocks.WITCH_WOOD_LEAVES.get()),
				new DarkOakFoliagePlacer (UniformInt.of(0, 0),
						UniformInt.of(0, 0)),
				new TwoLayersFeatureSize(1,1,0)).ignoreVines().build());

		register(context, ECHO_KEY, Feature.HUGE_FUNGUS, new HugeFungusConfiguration(Blocks.DIRT.defaultBlockState(),
				HexcraftBlocks.ECHO_WOOD_LOG.get().defaultBlockState(), HexcraftBlocks.ECHO_WOOD_LEAVES.get().defaultBlockState(), HexcraftBlocks.ECHO_FUNGAL_LAMP.get().defaultBlockState(), $$2, true));

	}

	public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
		return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(HexcraftMod.MOD_ID, name));
	}

	private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
																						  ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
		context.register(key, new ConfiguredFeature<>(feature, configuration));
	}

	private static TreeConfiguration.TreeConfigurationBuilder createStraightBlobTree(Block p_195147_, Block p_195148_, int pBaseHeight, int pHeightRandA, int pHeightRandB, int p_195152_) {
		return new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(p_195147_), new StraightTrunkPlacer(pBaseHeight, pHeightRandA, pHeightRandB), BlockStateProvider.simple(p_195148_), new BlobFoliagePlacer(ConstantInt.of(p_195152_), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1));
	}

}