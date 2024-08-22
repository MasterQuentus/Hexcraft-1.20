package net.masterquentus.hexcraftmod.block;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.custom.*;
import net.masterquentus.hexcraftmod.block.custom.plants.*;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.masterquentus.hexcraftmod.worldgen.tree.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftBlocks {

	private static ToIntFunction<BlockState> litBlockEmission(int pLightValue) {
		return (p_50763_) -> {
			return (Boolean) p_50763_.getValue(BlockStateProperties.LIT) ? pLightValue : 0;
		};
	}

	public static final DeferredRegister<Block> BLOCKS =
			DeferredRegister.create(ForgeRegistries.BLOCKS, HexcraftMod.MOD_ID);


	public static final RegistryObject<Block> VILE_GRASS_BLOCK = registerBlock("vile_grass_block",
			() -> new VileGrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)
					.strength(0.6F).randomTicks().sound(SoundType.GRASS)));

	public static final RegistryObject<Block> VILE_DIRT = registerBlock("vile_dirt",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)
					.strength(0.5F)));

	public static final RegistryObject <Block> CURSED_SOIL = registerBlock("cursed_soil",
			() -> new CursedSoilBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).strength(0.6F).sound(SoundType.SOUL_SAND)));

	public static final RegistryObject <Block> CURED_SOIL = registerBlock("cured_soil",
			() -> new CuredSoilBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(0.6F).sound(SoundType.SOUL_SOIL)));

	public static final RegistryObject <Block> FERTILIZED_DIRT = registerBlock("fertilized_dirt",
			() -> new FertilizedDirtBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(0.6F).sound(SoundType.GRAVEL)));

	public static final RegistryObject <Block> VAMPIRE_ORCHID = registerBlock("vampire_orchid",
			() -> new FlowerBlock(() -> MobEffects.HEALTH_BOOST, 4, BlockBehaviour.Properties.copy(Blocks.ALLIUM)));

	public static final RegistryObject <Block> POTTED_VAMPIRE_ORCHID = BLOCKS.register("potted_vampire_orchid",
			() -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), VAMPIRE_ORCHID, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM)));

	public static final RegistryObject <Block> BLOODY_ROSE = registerBlock("bloody_rose",
			BloodyRoseBlock::new);

	public static final RegistryObject <Block> POTTED_BLOODY_ROSE = BLOCKS.register("potted_bloody_rose",
			() -> new FlowerPotBlock((() -> (FlowerPotBlock) Blocks.FLOWER_POT), BLOODY_ROSE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM)));

	public static final Supplier<Block> GLINT_WEED = registerBlock("glint_weed",
			GlintWeedBlock::new);

	public static final Supplier<Block> SPANISH_MOSS = registerBlock("spanish_moss",
			SpanishMossBlock::new);

	public static final RegistryObject <Block> DEMON_HEART = registerBlock("demon_heart",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.SCULK)
					.strength(0.5F).sound(SoundType.WET_GRASS).noOcclusion()));

	public static final RegistryObject<Block> WITCHES_LADDER = BLOCKS.register("witches_ladder",
			() -> new WitchesLadderBlock(BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES)
					.instabreak().noOcclusion().randomTicks()));

	public static final RegistryObject<Block> WITCHES_LADDER_PLANT = BLOCKS.register("witches_ladder_plant",
			() -> new WitchesLadderPlant(BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES)
					.instabreak().noOcclusion().noLootTable()));

	public static final RegistryObject<Block> BLOOD_BERRIES_PLANT = registerBlockWithoutBlockItem("blood_berries_plant",
			() -> new BloodBerryBush(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).noOcclusion().randomTicks().noLootTable()));

	public static final RegistryObject <Block> BLACK_OBSIDIAN = registerBlock("black_obsidian",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()
					.strength(50.0F, 1200.0F).sound(SoundType.STONE)));

	public static final RegistryObject<Block> ECHO_FUNGAL_LAMP = registerBlock("echo_fungal_lamp",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.VERDANT_FROGLIGHT)
					.strength(1.0F).sound(SoundType.FROGLIGHT)
					.lightLevel((state) -> 15)));

	public static final RegistryObject<Block> HELL_FUNGAL_LAMP = registerBlock("hell_fungal_lamp",
			() -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.VERDANT_FROGLIGHT)
					.strength(1.0F).sound(SoundType.FROGLIGHT)
					.lightLevel((state) -> 15)));

	public static final RegistryObject<Block> PEARL_STONE = registerBlock("pearl_stone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> PEARL_COBBLESTONE = registerBlock("pearl_cobblestone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F, 6.0F)));

	public static final RegistryObject<Block> PEARL_STONE_BRICKS = registerBlock("pearl_stone_bricks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> POLISHED_PEARL_STONE = registerBlock("polished_pearl_stone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CHISELED_PEARL_STONE = registerBlock("chiseled_pearl_stone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CRACKED_PEARL_STONE = registerBlock("cracked_pearl_stone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CRIMSON_STONE = registerBlock("crimson_stone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CRIMSON_COBBLESTONE = registerBlock("crimson_cobblestone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F, 6.0F)));

	public static final RegistryObject<Block> CRIMSON_STONE_BRICKS = registerBlock("crimson_stone_bricks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> POLISHED_CRIMSON_STONE = registerBlock("polished_crimson_stone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CHISELED_CRIMSON_STONE = registerBlock("chiseled_crimson_stone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CRACKED_CRIMSON_STONE = registerBlock("cracked_crimson_stone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> UNDER_WORLD_STONE = registerBlock("under_world_stone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> UNDER_WORLD_COBBLESTONE = registerBlock("under_world_cobblestone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F, 6.0F)));

	public static final RegistryObject<Block> UNDER_WORLD_STONE_BRICKS = registerBlock("under_world_stone_bricks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> POLISHED_UNDER_WORLD_STONE = registerBlock("polished_under_world_stone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CHISELED_UNDER_WORLD_STONE = registerBlock("chiseled_under_world_stone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CRACKED_UNDER_WORLD_STONE = registerBlock("cracked_under_world_stone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
					.requiresCorrectToolForDrops().strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CHARSTONE = registerBlock("charstone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CHARSTONE_COBBLESTONE = registerBlock("charstone_cobblestone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2.0F, 6.0F)));

	public static final RegistryObject<Block> CHARSTONE_BRICKS = registerBlock("charstone_bricks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> POLISHED_CHARSTONE = registerBlock("polished_charstone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CHISELED_CHARSTONE = registerBlock("chiseled_charstone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CRACKED_CHARSTONE = registerBlock("cracked_charstone",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
					.strength(1.5F, 6.0F)));


	//Saplings
	public static final RegistryObject<Block> EBONY_SAPLING = registerBlock("ebony_sapling",
			() -> new SaplingBlock(new EbonyTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

	public static final RegistryObject<Block> BLOOD_OAK_SAPLING = registerBlock("blood_oak_sapling",
			() -> new SaplingBlock(new BloodOakTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

	public static final RegistryObject<Block> HELL_BARK_SAPLING = registerBlock("hell_bark_sapling",
			() -> new SaplingBlock(new HellBarkTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

	public static final RegistryObject<Block> WHITE_OAK_SAPLING = registerBlock("white_oak_sapling",
			() -> new SaplingBlock(new WhiteOakTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

	public static final RegistryObject<Block> ALDER_SAPLING = registerBlock("alder_sapling",
			() -> new SaplingBlock(new AlderTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

	public static final RegistryObject<Block> WITCH_HAZEL_SAPLING = registerBlock("witch_hazel_sapling",
			() -> new SaplingBlock(new WitchHazelTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

	public static final RegistryObject<Block> WILLOW_SAPLING = registerBlock("willow_sapling",
			() -> new SaplingBlock(new WillowTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

	public static final RegistryObject<Block> HAWTHORN_SAPLING = registerBlock("hawthorn_sapling",
			() -> new SaplingBlock(new HawthornTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

	public static final RegistryObject<Block> CEDAR_SAPLING = registerBlock("cedar_sapling",
			() -> new SaplingBlock(new CedarTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

	public static final RegistryObject<Block> DISTORTED_SAPLING = registerBlock("distorted_sapling",
			() -> new SaplingBlock(new DistortedTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

	public static final RegistryObject<Block> ELDER_SAPLING = registerBlock("elder_sapling",
			() -> new SaplingBlock(new ElderTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

	public static final RegistryObject<Block> JUNIPER_SAPLING = registerBlock("juniper_sapling",
			() -> new SaplingBlock(new JuniperTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

	public static final RegistryObject<Block> ROWAN_SAPLING = registerBlock("rowan_sapling",
			() -> new SaplingBlock(new RowanTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

	public static final RegistryObject<Block> TWISTED_SAPLING = registerBlock("twisted_sapling",
			() -> new SaplingBlock(new TwistedTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

	public static final RegistryObject<Block> WITCH_WOOD_SAPLING = registerBlock("witch_wood_sapling",
			() -> new SaplingBlock(new WitchWoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

	public static final RegistryObject<Block> ECHO_WOOD_SAPLING = registerBlock("echo_sapling",
			() -> new SaplingBlock(new EchoTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

	//Leaves
	public static final RegistryObject<Block> EBONY_LEAVES = registerBlock("ebony_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
					return true;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
					return 60;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
					return 30;
				}
			});

	public static final RegistryObject<Block> BLOOD_OAK_LEAVES = registerBlock("blood_oak_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return true;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 60;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 30;
				}
			});

	public static final RegistryObject<Block> HELL_BARK_LEAVES = registerBlock("hell_bark_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 60;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 30;
				}
			});

	public static final RegistryObject<Block> WHITE_OAK_LEAVES = registerBlock("white_oak_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 60;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 30;
				}
			});

	public static final RegistryObject<Block> ALDER_LEAVES = registerBlock("alder_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 60;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 30;
				}
			});

	public static final RegistryObject<Block> WITCH_HAZEL_LEAVES = registerBlock("witch_hazel_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 60;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 30;
				}
			});

	public static final RegistryObject<Block> WILLOW_LEAVES = registerBlock("willow_leaves",
			() -> new WillowLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));


	public static final RegistryObject<Block> HAWTHORN_LEAVES = registerBlock("hawthorn_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 60;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 30;
				}
			});

	public static final RegistryObject<Block> CEDAR_LEAVES = registerBlock("cedar_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 60;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 30;
				}
			});

	public static final RegistryObject<Block> DISTORTED_LEAVES = registerBlock("distorted_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 60;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 30;
				}
			});

	public static final RegistryObject<Block> ELDER_LEAVES = registerBlock("elder_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 60;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 30;
				}
			});

	public static final RegistryObject<Block> JUNIPER_LEAVES = registerBlock("juniper_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 60;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 30;
				}
			});

	public static final RegistryObject<Block> ROWAN_LEAVES = registerBlock("rowan_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 60;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 30;
				}
			});

	public static final RegistryObject<Block> TWISTED_LEAVES = registerBlock("twisted_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 60;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 30;
				}
			});

	public static final RegistryObject<Block> WITCH_WOOD_LEAVES = registerBlock("witch_wood_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 60;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 30;
				}
			});

	public static final RegistryObject<Block> ECHO_WOOD_LEAVES = registerBlock("echo_wood_leaves",
			() -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 60;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 30;
				}
			});


	//Leaves Pile
	public static final RegistryObject <Block> EBONY_LEAVES_PILE = registerBlock("ebony_leaves_pile",
			() -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F)
					.sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()));

	public static final RegistryObject <Block> BLOOD_OAK_LEAVES_PILE = registerBlock("blood_oak_leaves_pile",
			() -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F)
					.sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()));

	public static final RegistryObject <Block> HELL_BARK_LEAVES_PILE = registerBlock("hell_bark_leaves_pile",
			() -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F)
					.sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()));

	public static final RegistryObject <Block> WHITE_OAK_LEAVES_PILE = registerBlock("white_oak_leaves_pile",
			() -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F)
					.sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()));

	public static final RegistryObject <Block> ALDER_LEAVES_PILE = registerBlock("alder_leaves_pile",
			() -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F)
					.sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()));

	public static final RegistryObject <Block> WITCH_HAZEL_LEAVES_PILE = registerBlock("witch_hazel_leaves_pile",
			() -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F)
					.sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()));

	public static final RegistryObject <Block> WILLOW_LEAVES_PILE = registerBlock("willow_leaves_pile",
			() -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F)
					.sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()));

	public static final RegistryObject <Block> HAWTHORN_LEAVES_PILE = registerBlock("hawthorn_leaves_pile",
			() -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F)
					.sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()));

	public static final RegistryObject <Block> CEDAR_LEAVES_PILE = registerBlock("cedar_leaves_pile",
			() -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F)
					.sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()));

	public static final RegistryObject <Block> DISTORTED_LEAVES_PILE = registerBlock("distorted_leaves_pile",
			() -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F)
					.sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()));

	public static final RegistryObject <Block> ELDER_LEAVES_PILE = registerBlock("elder_leaves_pile",
			() -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F)
					.sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()));

	public static final RegistryObject <Block> JUNIPER_LEAVES_PILE = registerBlock("juniper_leaves_pile",
			() -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F)
					.sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()));

	public static final RegistryObject <Block> ROWAN_LEAVES_PILE = registerBlock("rowan_leaves_pile",
			() -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F)
					.sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()));

	public static final RegistryObject <Block> TWISTED_LEAVES_PILE = registerBlock("twisted_leaves_pile",
			() -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F)
					.sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()));

	public static final RegistryObject <Block> WITCH_WOOD_LEAVES_PILE = registerBlock("witch_wood_leaves_pile",
			() -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F)
					.sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()));

	public static final RegistryObject <Block> ECHO_WOOD_LEAVES_PILE = registerBlock("echo_wood_leaves_pile",
			() -> new CarpetBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).strength(0.1F)
					.sound(SoundType.GRASS).noLootTable().noOcclusion().noCollission()));


	//Logs
	public static final RegistryObject<Block> EBONY_LOG = registerBlock("ebony_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> BLOOD_OAK_LOG = registerBlock("blood_oak_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> HELL_BARK_LOG = registerBlock("hell_bark_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
			));

	public static final RegistryObject<Block> WHITE_OAK_LOG = registerBlock("white_oak_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> ALDER_LOG = registerBlock("alder_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> WITCH_HAZEL_LOG = registerBlock("witch_hazel_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> WILLOW_LOG = registerBlock("willow_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> HAWTHORN_LOG = registerBlock("hawthorn_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> CEDAR_LOG = registerBlock("cedar_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> DISTORTED_LOG = registerBlock("distorted_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> ELDER_LOG = registerBlock("elder_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> JUNIPER_LOG = registerBlock("juniper_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> ROWAN_LOG = registerBlock("rowan_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> TWISTED_LOG = registerBlock("twisted_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> WITCH_WOOD_LOG = registerBlock("witch_wood_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> ECHO_WOOD_LOG = registerBlock("echo_wood_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(2.0F)
			));

	//Striped Logs
	public static final RegistryObject<Block> STRIPPED_EBONY_LOG = registerBlock("stripped_ebony_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> STRIPPED_BLOOD_OAK_LOG = registerBlock("stripped_blood_oak_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> STRIPPED_HELL_BARK_LOG = registerBlock("stripped_hell_bark_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> STRIPPED_WHITE_OAK_LOG = registerBlock("stripped_white_oak_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> STRIPPED_ALDER_LOG = registerBlock("stripped_alder_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> STRIPPED_WITCH_HAZEL_LOG = registerBlock("stripped_witch_hazel_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> STRIPPED_HAWTHORN_LOG = registerBlock("stripped_hawthorn_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> STRIPPED_CEDAR_LOG = registerBlock("stripped_cedar_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> STRIPPED_DISTORTED_LOG = registerBlock("stripped_distorted_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> STRIPPED_ELDER_LOG = registerBlock("stripped_elder_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> STRIPPED_JUNIPER_LOG = registerBlock("stripped_juniper_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> STRIPPED_ROWAN_LOG = registerBlock("stripped_rowan_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> STRIPPED_TWISTED_LOG = registerBlock("stripped_twisted_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> STRIPPED_WITCH_WOOD_LOG = registerBlock("stripped_witch_wood_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
			));

	public static final RegistryObject<Block> STRIPPED_ECHO_WOOD_LOG = registerBlock("stripped_echo_wood_log",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F)
			));

	//Wood
	public static final RegistryObject<Block> EBONY_WOOD = registerBlock("ebony_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> BLOOD_OAK_WOOD = registerBlock("blood_oak_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> HELL_BARK_WOOD = registerBlock("hell_bark_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> WHITE_OAK_WOOD = registerBlock("white_oak_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> ALDER_WOOD = registerBlock("alder_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> WITCH_HAZEL_WOOD = registerBlock("witch_hazel_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> WILLOW_WOOD = registerBlock("willow_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> HAWTHORN_WOOD = registerBlock("hawthorn_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> CEDAR_WOOD = registerBlock("cedar_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> DISTORTED_WOOD = registerBlock("distorted_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> ELDER_WOOD = registerBlock("elder_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> JUNIPER_WOOD = registerBlock("juniper_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> ROWAN_WOOD = registerBlock("rowan_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> TWISTED_WOOD = registerBlock("twisted_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> WITCH_WOOD_WOOD = registerBlock("witch_wood_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> ECHO_WOOD_WOOD = registerBlock("echo_wood_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(2.0F)
			));

	//Stripped Wood
	public static final RegistryObject<Block> STRIPPED_EBONY_WOOD = registerBlock("stripped_ebony_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> STRIPPED_BLOOD_OAK_WOOD = registerBlock("stripped_blood_oak_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> STRIPPED_HELL_BARK_WOOD = registerBlock("stripped_hell_bark_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> STRIPPED_WHITE_OAK_WOOD = registerBlock("stripped_white_oak_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> STRIPPED_ALDER_WOOD = registerBlock("stripped_alder_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> STRIPPED_WITCH_HAZEL_WOOD = registerBlock("stripped_witch_hazel_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> STRIPPED_HAWTHORN_WOOD = registerBlock("stripped_hawthorn_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> STRIPPED_CEDAR_WOOD = registerBlock("stripped_cedar_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> STRIPPED_DISTORTED_WOOD = registerBlock("stripped_distorted_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> STRIPPED_ELDER_WOOD = registerBlock("stripped_elder_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> STRIPPED_JUNIPER_WOOD = registerBlock("stripped_juniper_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> STRIPPED_ROWAN_WOOD = registerBlock("stripped_rowan_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> STRIPPED_TWISTED_WOOD = registerBlock("stripped_twisted_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> STRIPPED_WITCH_WOOD_WOOD = registerBlock("stripped_witch_wood_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
			));
	public static final RegistryObject<Block> STRIPPED_ECHO_WOOD_WOOD = registerBlock("stripped_echo_wood_wood",
			() -> new HexcraftFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F)
			));



	//Planks
	public static final RegistryObject<Block> EBONY_PLANKS = registerBlock("ebony_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return true;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 20;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}
			});

	public static final RegistryObject<Block> BLOOD_OAK_PLANKS = registerBlock("blood_oak_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return true;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 20;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}
			});

	public static final RegistryObject<Block> HELL_BARK_PLANKS = registerBlock("hell_bark_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 20;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}
			});

	public static final RegistryObject<Block> WHITE_OAK_PLANKS = registerBlock("white_oak_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 20;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}
			});

	public static final RegistryObject<Block> ALDER_PLANKS = registerBlock("alder_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 20;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}
			});

	public static final RegistryObject<Block> WITCH_HAZEL_PLANKS = registerBlock("witch_hazel_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 20;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}
			});

	public static final RegistryObject<Block> WILLOW_PLANKS = registerBlock("willow_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 20;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}
			});

	public static final RegistryObject<Block> HAWTHORN_PLANKS = registerBlock("hawthorn_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 20;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}
			});

	public static final RegistryObject<Block> CEDAR_PLANKS = registerBlock("cedar_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 20;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}
			});

	public static final RegistryObject<Block> DISTORTED_PLANKS = registerBlock("distorted_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 20;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}
			});

	public static final RegistryObject<Block> ELDER_PLANKS = registerBlock("elder_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 20;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}
			});

	public static final RegistryObject<Block> JUNIPER_PLANKS = registerBlock("juniper_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 20;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}
			});

	public static final RegistryObject<Block> ROWAN_PLANKS = registerBlock("rowan_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 20;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}
			});

	public static final RegistryObject<Block> TWISTED_PLANKS = registerBlock("twisted_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 20;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}
			});

	public static final RegistryObject<Block> WITCH_WOOD_PLANKS = registerBlock("witch_wood_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 20;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}
			});
	public static final RegistryObject<Block> ECHO_WOOD_PLANKS = registerBlock("echo_wood_planks",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
				@Override
				public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return false;
				}

				@Override
				public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 20;
				}

				@Override
				public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
					return 5;
				}
			});


	//Bookshelves
	public static final RegistryObject<Block> EBONY_BOOKSHELF = registerBlock("ebony_bookshelf",
			() -> new HexcraftBookshelf(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
					.strength(1.5F)));

	public static final RegistryObject<Block> BLOOD_OAK_BOOKSHELF = registerBlock("blood_oak_bookshelf",
			() -> new HexcraftBookshelf(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
					.strength(1.5F)));

	public static final RegistryObject<Block> HELL_BARK_BOOKSHELF = registerBlock("hell_bark_bookshelf",
			() -> new HexcraftBookshelf(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
					.strength(1.5F)));

	public static final RegistryObject<Block> WHITE_OAK_BOOKSHELF = registerBlock("white_oak_bookshelf",
			() -> new HexcraftBookshelf(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
					.strength(1.5F)));

	public static final RegistryObject<Block> ALDER_BOOKSHELF = registerBlock("alder_bookshelf",
			() -> new HexcraftBookshelf(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
					.strength(1.5F)));

	public static final RegistryObject<Block> WITCH_HAZEL_BOOKSHELF = registerBlock("witch_hazel_bookshelf",
			() -> new HexcraftBookshelf(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
					.strength(1.5F)));

	public static final RegistryObject<Block> WILLOW_BOOKSHELF = registerBlock("willow_bookshelf",
			() -> new HexcraftBookshelf(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
					.strength(1.5F)));

	public static final RegistryObject<Block> HAWTHORN_BOOKSHELF = registerBlock("hawthorn_bookshelf",
			() -> new HexcraftBookshelf(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
					.strength(1.5F)));

	public static final RegistryObject<Block> CEDAR_BOOKSHELF = registerBlock("cedar_bookshelf",
			() -> new HexcraftBookshelf(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
					.strength(1.5F)));

	public static final RegistryObject<Block> DISTORTED_BOOKSHELF = registerBlock("distorted_bookshelf",
			() -> new HexcraftBookshelf(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
					.strength(1.5F)));

	public static final RegistryObject<Block> ELDER_BOOKSHELF = registerBlock("elder_bookshelf",
			() -> new HexcraftBookshelf(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
					.strength(1.5F)));

	public static final RegistryObject<Block> JUNIPER_BOOKSHELF = registerBlock("juniper_bookshelf",
			() -> new HexcraftBookshelf(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
					.strength(1.5F)));

	public static final RegistryObject<Block> ROWAN_BOOKSHELF = registerBlock("rowan_bookshelf",
			() -> new HexcraftBookshelf(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
					.strength(1.5F)));

	public static final RegistryObject<Block> TWISTED_BOOKSHELF = registerBlock("twisted_bookshelf",
			() -> new HexcraftBookshelf(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
					.strength(1.5F)));

	public static final RegistryObject<Block> WITCH_WOOD_BOOKSHELF = registerBlock("witch_wood_bookshelf",
			() -> new HexcraftBookshelf(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
					.strength(1.5F)));

	public static final RegistryObject<Block> ECHO_WOOD_BOOKSHELF = registerBlock("echo_wood_bookshelf",
			() -> new HexcraftBookshelf(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
					.strength(1.5F)));

	//Stairs
	public static final RegistryObject<Block> PEARL_STONE_STAIRS = registerBlock("pearl_stone_stairs",
			() -> new StairBlock(() -> HexcraftBlocks.PEARL_STONE.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> PEARL_COBBLESTONE_STAIRS = registerBlock("pearl_cobblestone_stairs",
			() -> new StairBlock(() -> HexcraftBlocks.PEARL_STONE.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> PEARL_STONE_BRICKS_STAIRS = registerBlock("pearl_stone_bricks_stairs",
			() -> new StairBlock(() -> HexcraftBlocks.PEARL_STONE_BRICKS.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> POLISHED_PEARL_STONE_STAIRS = registerBlock("polished_pearl_stone_stairs",
			() -> new StairBlock(() -> HexcraftBlocks.POLISHED_PEARL_STONE.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CRIMSON_STONE_STAIRS = registerBlock("crimson_stone_stairs",
			() -> new StairBlock(() -> HexcraftBlocks.CRIMSON_STONE.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CRIMSON_COBBLESTONE_STAIRS = registerBlock("crimson_cobblestone_stairs",
			() -> new StairBlock(() -> HexcraftBlocks.CRIMSON_COBBLESTONE.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CRIMSON_STONE_BRICKS_STAIRS = registerBlock("crimson_stone_bricks_stairs",
			() -> new StairBlock(() -> HexcraftBlocks.CRIMSON_STONE_BRICKS.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> POLISHED_CRIMSON_STONE_STAIRS = registerBlock("polished_crimson_stone_stairs",
			() -> new StairBlock(() -> HexcraftBlocks.POLISHED_CRIMSON_STONE.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> UNDER_WORLD_STONE_STAIRS = registerBlock("under_world_stone_stairs",
			() -> new StairBlock(() -> HexcraftBlocks.UNDER_WORLD_STONE.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> UNDER_WORLD_COBBLESTONE_STAIRS = registerBlock("under_world_cobblestone_stairs",
			() -> new StairBlock(() -> HexcraftBlocks.UNDER_WORLD_COBBLESTONE.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> UNDER_WORLD_STONE_BRICKS_STAIRS = registerBlock("under_world_stone_bricks_stairs",
			() -> new StairBlock(() -> HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> POLISHED_UNDER_WORLD_STONE_STAIRS = registerBlock("polished_under_world_stone_stairs",
			() -> new StairBlock(() -> HexcraftBlocks.POLISHED_UNDER_WORLD_STONE.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CHARSTONE_STONE_STAIRS = registerBlock("charstone_stairs",
			() -> new StairBlock(() -> HexcraftBlocks.CHARSTONE.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CHARSTONE_COBBLESTONE_STAIRS = registerBlock("charstone_cobblestone_stairs",
			() -> new StairBlock(() -> HexcraftBlocks.CHARSTONE_COBBLESTONE.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CHARSTONE_STONE_BRICKS_STAIRS = registerBlock("charstone_bricks_stairs",
			() -> new StairBlock(() -> HexcraftBlocks.CHARSTONE_BRICKS.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> POLISHED_CHARSTONE_STONE_STAIRS = registerBlock("polished_charstone_stairs",
			() -> new StairBlock(() -> HexcraftBlocks.POLISHED_CHARSTONE.get().defaultBlockState(),
					BlockBehaviour.Properties.copy(Blocks.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject <Block> AMETHYST_CHIMES = registerBlock("amethyst_chimes",
			() -> new AmethysChimesBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)
					.strength(1.7F).requiresCorrectToolForDrops()
					.sound(SoundType.AMETHYST).noOcclusion()));

	public static final RegistryObject <Block> WITCHES_OVEN = registerBlock("witches_oven",
			() -> new WitchesOven(BlockBehaviour.Properties.copy(Blocks.FURNACE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()
					.strength(3.5F).lightLevel(litBlockEmission(13)).noOcclusion().sound(SoundType.ANVIL)));

	public static final RegistryObject <Block> WITCHES_CAULDRON = registerBlock("witches_cauldron",
			() -> new WitchesCauldron(BlockBehaviour.Properties.copy(Blocks.CAULDRON).requiresCorrectToolForDrops()
					.strength(3.5F).noOcclusion()));

	//Slabs
	public static final RegistryObject<Block> PEARL_STONE_SLAB = registerBlock("pearl_stone_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> PEARL_COBBLESTONE_SLAB = registerBlock("pearl_cobblestone_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F)));

	public static final RegistryObject<Block> PEARL_STONE_BRICKS_SLAB = registerBlock("pearl_stone_bricks_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> POLISHED_PEARL_STONE_SLAB = registerBlock("polished_pearl_stone_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CRIMSON_STONE_SLAB = registerBlock("crimson_stone_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CRIMSON_COBBLESTONE_SLAB = registerBlock("crimson_cobblestone_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F)));

	public static final RegistryObject<Block> CRIMSON_STONE_BRICKS_SLAB = registerBlock("crimson_stone_bricks_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> POLISHED_CRIMSON_STONE_SLAB = registerBlock("polished_crimson_stone_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> UNDER_WORLD_STONE_SLAB = registerBlock("under_world_stone_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> UNDER_WORLD_COBBLESTONE_SLAB = registerBlock("under_world_cobblestone_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F)));

	public static final RegistryObject<Block> UNDER_WORLD_STONE_BRICKS_SLAB = registerBlock("under_world_stone_bricks_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> POLISHED_UNDER_WORLD_STONE_SLAB = registerBlock("polished_under_world_stone_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CHARSTONE_SLAB = registerBlock("charstone_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> CHARSTONE_COBBLESTONE_SLAB = registerBlock("charstone_cobblestone_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).strength(2.0F, 6.0F)));

	public static final RegistryObject<Block> CHARSTONE_BRICKS_SLAB = registerBlock("charstone_bricks_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F)));

	public static final RegistryObject<Block> POLISHED_CHARSTONE_SLAB = registerBlock("polished_charstone_slab",
			() -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).strength(1.5F, 6.0F)));


	//Ores
	public static final RegistryObject <Block> MOONSTONE_ORE = registerBlock("moonstone_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()
					.strength(3.0F, 3.0F).sound(SoundType.STONE), UniformInt.of(3, 7)));

	public static final RegistryObject <Block> END_MOONSTONE_ORE = registerBlock("end_moonstone_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()
					.strength(3.0F, 3.0F).sound(SoundType.STONE), UniformInt.of(3, 7)));

	public static final RegistryObject <Block> NETHER_MOONSTONE_ORE = registerBlock("nether_moonstone_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()
					.strength(3.0F, 3.0F).sound(SoundType.NETHER_ORE), UniformInt.of(3, 7)));

	public static final RegistryObject <Block> DEEPSLATE_MOONSTONE_ORE = registerBlock("deepslate_moonstone_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()
					.strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)));

	public static final RegistryObject <Block> SILVER_ORE = registerBlock("silver_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()
					.strength(3.0F, 3.0F).sound(SoundType.STONE), UniformInt.of(3, 7)));

	public static final RegistryObject <Block> END_SILVER_ORE = registerBlock("end_silver_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()
					.strength(3.0F, 3.0F).sound(SoundType.STONE), UniformInt.of(3, 7)));

	public static final RegistryObject <Block> NETHER_SILVER_ORE = registerBlock("nether_silver_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()
					.strength(3.0F, 3.0F).sound(SoundType.NETHER_ORE), UniformInt.of(3, 7)));

	public static final RegistryObject <Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()
					.strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)));

	public static final RegistryObject <Block> VAMPIRIC_ORE = registerBlock("vampiric_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()
					.strength(3.0F, 3.0F).sound(SoundType.STONE), UniformInt.of(3, 7)));

	public static final RegistryObject <Block> END_VAMPIRIC_ORE = registerBlock("end_vampiric_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()
					.strength(3.0F, 3.0F).sound(SoundType.STONE), UniformInt.of(3, 7)));

	public static final RegistryObject <Block> NETHER_VAMPIRIC_ORE = registerBlock("nether_vampiric_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()
					.strength(3.0F, 3.0F).sound(SoundType.NETHER_ORE), UniformInt.of(3, 7)));

	public static final RegistryObject <Block> DEEPSLATE_VAMPIRIC_ORE = registerBlock("deepslate_vampiric_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()
					.strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)));

	public static final RegistryObject <Block> NYKIUM_ORE = registerBlock("nykium_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()
					.strength(3.0F, 3.0F).sound(SoundType.NETHER_ORE), UniformInt.of(3, 7)));

	public static final RegistryObject <Block> TRENOGEN_ORE = registerBlock("trenogen_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()
					.strength(3.0F, 3.0F).sound(SoundType.STONE), UniformInt.of(3, 7)));

	public static final RegistryObject <Block> DEEPSLATE_TRENOGEN_ORE = registerBlock("deepslate_trenogen_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()
					.strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE), UniformInt.of(3, 7)));

	public static final RegistryObject <Block> JORMUIM_ORE = registerBlock("jormuim_ore",
			() -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()
					.strength(3.0F, 3.0F).sound(SoundType.STONE), UniformInt.of(3, 7)));

	//Geodes
	public static final RegistryObject <Block> MAGIC_CRYSTAL_BLOCK = registerBlock("magic_crystal_block",
			() -> new AmethystBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).strength(1.5F).requiresCorrectToolForDrops()
					.sound(SoundType.AMETHYST)));

	public static final RegistryObject <Block> BUDDING_MAGIC_CRYSTAL = registerBlock("budding_magic_crystal",
			() -> new BuddingMagicalCrystalBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).randomTicks().strength(1.5F).requiresCorrectToolForDrops().noLootTable()
					.sound(SoundType.AMETHYST)));

	public static final RegistryObject <Block> MAGIC_CRYSTAL_CLUSTER = registerBlock("magic_crystal_cluster",
			() -> new MagicCrystalClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).noOcclusion()
					.randomTicks().strength(1.5F).requiresCorrectToolForDrops().randomTicks()
					.sound(SoundType.AMETHYST).lightLevel((state) -> 5)));

	public static final RegistryObject <Block> LARGE_MAGIC_CRYSTAL_BUD = registerBlock("large_magic_crystal_bud",
			() -> new MagicCrystalClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).noOcclusion()
					.randomTicks().strength(1.5F).requiresCorrectToolForDrops()
					.sound(SoundType.AMETHYST).lightLevel((state) -> 4)));

	public static final RegistryObject <Block> MEDIUM_MAGIC_CRYSTAL_BUD = registerBlock("medium_magic_crystal_bud",
			() -> new MagicCrystalClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).noOcclusion()
					.randomTicks().strength(1.5F).requiresCorrectToolForDrops()
					.sound(SoundType.AMETHYST).lightLevel((state) -> 2).noLootTable()));

	public static final RegistryObject <Block> SMALL_MAGIC_CRYSTAL_BUD = registerBlock("small_magic_crystal_bud",
			() -> new MagicCrystalClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).noOcclusion()
					.randomTicks().strength(1.5F).requiresCorrectToolForDrops()
					.sound(SoundType.AMETHYST).lightLevel((state) -> 1).noLootTable()));


	//Ore Blocks
	public static final RegistryObject <Block> MOONSTONE_BLOCK = registerBlock("moonstone_block",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).requiresCorrectToolForDrops()
					.strength(5.0F, 6.0F).sound(SoundType.METAL)));

	public static final RegistryObject <Block> SILVER_BLOCK = registerBlock("silver_block",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops()
					.strength(5.0F, 6.0F).sound(SoundType.METAL)));

	public static final RegistryObject <Block> VAMPIRIC_BLOCK = registerBlock("vampiric_block",
			() -> new Block(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).requiresCorrectToolForDrops()
					.strength(5.0F, 6.0F).sound(SoundType.METAL)));

	//Crops
	public static final RegistryObject<Block> MANDRAKE_FLOWER = registerBlockWithoutBlockItem("mandrake_flower",
			() -> new MandrakePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().randomTicks()));

	public static final RegistryObject<Block> GARLIC_PLANT = registerBlockWithoutBlockItem("garlic_plant",
			() -> new GarlicPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().randomTicks()));

	public static final RegistryObject<Block> VERVAIN_FLOWER = registerBlockWithoutBlockItem("vervain_flower",
			() -> new VervainPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().randomTicks()));

	public static final RegistryObject<Block> WOLFSBANE_FLOWER = registerBlockWithoutBlockItem("wolfsbane_flower",
			() -> new WolfsBanePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().randomTicks()));

	public static final RegistryObject<Block> IRENIAL_FLOWER = registerBlockWithoutBlockItem("irenial_flower",
			() -> new IrenialPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().randomTicks()));

	public static final RegistryObject<Block> MIRA_FLOWER = registerBlockWithoutBlockItem("mira_flower",
			() -> new MiraPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().randomTicks()));

	public static final RegistryObject<Block> XERIFAE_FLOWER = registerBlockWithoutBlockItem("xerifae_flower",
			() -> new XerifaePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().randomTicks()));

	public static final RegistryObject<Block> SENIA_FLOWER = registerBlockWithoutBlockItem("senia_flower",
			() -> new SeniaPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().randomTicks()));

	public static final RegistryObject<Block> AERPINE_FLOWER = registerBlockWithoutBlockItem("aerpine_flower",
			() -> new AerpinePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().randomTicks()));

	public static final RegistryObject<Block> PERENNIA_FLOWER = registerBlockWithoutBlockItem("perennia_flower",
			() -> new PerenniaPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().randomTicks()));

	public static final RegistryObject<Block> BELLADONNA_PLANT = registerBlockWithoutBlockItem("belladonna_plant",
			() -> new BelladonnaPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().randomTicks()));

	public static final RegistryObject<Block> HELLEBORE_PLANT = registerBlockWithoutBlockItem("hellebore_plant",
			() -> new HelleborePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().randomTicks()));

	public static final RegistryObject<Block> SAGE_PLANT = registerBlockWithoutBlockItem("sage_plant",
			() -> new SagePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().randomTicks()));

	public static final RegistryObject<Block> WORMWOOD_PLANT = registerBlockWithoutBlockItem("wormwood_plant",
			() -> new WormwoodPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).sound(SoundType.NETHER_WART).noOcclusion().randomTicks()));

	public static final RegistryObject<Block> WATER_ARTICHOKE_PLANT = registerBlockWithoutBlockItem("water_artichoke_plant",
			() -> new WaterArtichokePlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).sound(SoundType.WET_GRASS).noOcclusion().randomTicks()));

	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}

	private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
		return HexcraftItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
		return BLOCKS.register(name, block);
	}

	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}