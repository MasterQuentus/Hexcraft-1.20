package net.masterquentus.hexcraftmod.datagen;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.util.HexcraftTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.apache.commons.codec.binary.Hex;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class HexcraftBlockTagGenerator extends BlockTagsProvider {
	public HexcraftBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, HexcraftMod.MOD_ID, existingFileHelper);
	}

	@Override
	protected void addTags(HolderLookup.Provider pProvider) {

		this.tag(HexcraftTags.Blocks.CROPS)
				.add(HexcraftBlocks.BELLADONNA_PLANT.get(), HexcraftBlocks.VERVAIN_FLOWER.get(), HexcraftBlocks.MANDRAKE_FLOWER.get(),
						HexcraftBlocks.GARLIC_PLANT.get(), HexcraftBlocks.WOLFSBANE_FLOWER.get(), HexcraftBlocks.IRENIAL_FLOWER.get(),
						HexcraftBlocks.MIRA_FLOWER.get(), HexcraftBlocks.XERIFAE_FLOWER.get(), HexcraftBlocks.SENIA_FLOWER.get(),
						HexcraftBlocks.AERPINE_FLOWER.get(), HexcraftBlocks.PERENNIA_FLOWER.get(), HexcraftBlocks.HELLEBORE_PLANT.get(),
						HexcraftBlocks.SAGE_PLANT.get(), HexcraftBlocks.WORMWOOD_PLANT.get());

		this.tag(HexcraftTags.Blocks.MUTANDIS_BLACKLIST)
				.add(Blocks.WITHER_ROSE)
				.add(HexcraftBlocks.BLOODY_ROSE.get());
		this.tag(HexcraftTags.Blocks.MUTANDIS_EXTREMIS_PLANTS)
				.addTag(HexcraftTags.Blocks.MUTANDIS_PLANTS)
				.addTag(HexcraftTags.Blocks.CROPS)
				.addTag(BlockTags.CROPS)
				.add(Blocks.SUGAR_CANE, Blocks.CACTUS)
				.add(HexcraftBlocks.BLOODY_ROSE.get());
		this.tag(HexcraftTags.Blocks.MUTANDIS_PLANTS)
				.addTag(BlockTags.SAPLINGS)
				.addTag(BlockTags.SMALL_FLOWERS)
				.add(Blocks.GRASS, Blocks.BROWN_MUSHROOM, Blocks.RED_MUSHROOM)
				.add(HexcraftBlocks.WITCHES_LADDER.get(), HexcraftBlocks.GLINT_WEED.get(),
						HexcraftBlocks.SPANISH_MOSS.get(),HexcraftBlocks.ALDER_SAPLING.get(),
						HexcraftBlocks.ELDER_SAPLING.get(), HexcraftBlocks.HAWTHORN_SAPLING.get(),
						HexcraftBlocks.CEDAR_SAPLING.get(),HexcraftBlocks.ROWAN_SAPLING.get(),HexcraftBlocks.EMBER_MOSS.get());

		this.tag(HexcraftTags.Blocks.BLIGHT_DECAYABLE_PLANTS)
				.addTag(BlockTags.SAPLINGS)
				.addTag(BlockTags.SMALL_FLOWERS)
				.add(Blocks.GRASS, Blocks.FERN, Blocks.SWEET_BERRY_BUSH)
				.add(HexcraftBlocks.GLINT_WEED.get(), HexcraftBlocks.BLOOD_BERRIES_PLANT.get(),HexcraftBlocks.EMBER_MOSS.get());


		this.tag(BlockTags.NEEDS_IRON_TOOL)
				.add(HexcraftBlocks.AMETHYST_CHIMES.get(),
						HexcraftBlocks.PURE_MAGIC_CRYSTAL.get(),
						HexcraftBlocks.MOONSTONE_ORE.get(),
						HexcraftBlocks.END_MOONSTONE_ORE.get(),
						HexcraftBlocks.NETHER_MOONSTONE_ORE.get(),
						HexcraftBlocks.DEEPSLATE_MOONSTONE_ORE.get(),
						HexcraftBlocks.SILVER_ORE.get(),
						HexcraftBlocks.END_SILVER_ORE.get(),
						HexcraftBlocks.NETHER_SILVER_ORE.get(),
						HexcraftBlocks.DEEPSLATE_SILVER_ORE.get(),
						HexcraftBlocks.NYKIUM_ORE.get(),
						HexcraftBlocks.TRENOGEN_ORE.get(),
						HexcraftBlocks.DEEPSLATE_TRENOGEN_ORE.get(),
						HexcraftBlocks.JORMUIM_ORE.get(),
						HexcraftBlocks.MOONSTONE_BLOCK.get(),
						HexcraftBlocks.SILVER_BLOCK.get(),
						HexcraftBlocks.MAGIC_CRYSTAL_BLOCK.get(),
						HexcraftBlocks.BUDDING_MAGIC_CRYSTAL.get(),
						HexcraftBlocks.MAGIC_CRYSTAL_CLUSTER.get(),
						HexcraftBlocks.LARGE_MAGIC_CRYSTAL_BUD.get(),
						HexcraftBlocks.MEDIUM_MAGIC_CRYSTAL_BUD.get(),
						HexcraftBlocks.SMALL_MAGIC_CRYSTAL_BUD.get());

		this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
				.add(HexcraftBlocks.BLACK_OBSIDIAN.get());

		this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
				.add(HexcraftBlocks.AMETHYST_CHIMES.get(),
						HexcraftBlocks.PURE_MAGIC_CRYSTAL.get(),
						HexcraftBlocks.MOONSTONE_ORE.get(),
						HexcraftBlocks.END_MOONSTONE_ORE.get(),
						HexcraftBlocks.NETHER_MOONSTONE_ORE.get(),
						HexcraftBlocks.DEEPSLATE_MOONSTONE_ORE.get(),
						HexcraftBlocks.SILVER_ORE.get(),
						HexcraftBlocks.END_SILVER_ORE.get(),
						HexcraftBlocks.NETHER_SILVER_ORE.get(),
						HexcraftBlocks.DEEPSLATE_SILVER_ORE.get(),
						HexcraftBlocks.NYKIUM_ORE.get(),
						HexcraftBlocks.TRENOGEN_ORE.get(),
						HexcraftBlocks.DEEPSLATE_TRENOGEN_ORE.get(),
						HexcraftBlocks.JORMUIM_ORE.get(),
						HexcraftBlocks.MOONSTONE_BLOCK.get(),
						HexcraftBlocks.SILVER_BLOCK.get(),
						HexcraftBlocks.MAGIC_CRYSTAL_BLOCK.get(),
						HexcraftBlocks.BUDDING_MAGIC_CRYSTAL.get(),
						HexcraftBlocks.MAGIC_CRYSTAL_CLUSTER.get(),
						HexcraftBlocks.LARGE_MAGIC_CRYSTAL_BUD.get(),
						HexcraftBlocks.MEDIUM_MAGIC_CRYSTAL_BUD.get(),
						HexcraftBlocks.SMALL_MAGIC_CRYSTAL_BUD.get(),
						HexcraftBlocks.BLACK_OBSIDIAN.get(),
						HexcraftBlocks.VAMPIRIC_ORE.get(),
						HexcraftBlocks.END_VAMPIRIC_ORE.get(),
						HexcraftBlocks.NETHER_VAMPIRIC_ORE.get(),
						HexcraftBlocks.DEEPSLATE_VAMPIRIC_ORE.get(),
						HexcraftBlocks.VAMPIRIC_BLOCK.get(),
						HexcraftBlocks.PEARL_STONE.get(),
						HexcraftBlocks.PEARL_COBBLESTONE.get(),
						HexcraftBlocks.PEARL_STONE_BRICKS.get(),
						HexcraftBlocks.POLISHED_PEARL_STONE.get(),
						HexcraftBlocks.CHISELED_PEARL_STONE.get(),
						HexcraftBlocks.CRACKED_PEARL_STONE.get(),
						HexcraftBlocks.CRIMSON_STONE.get(),
						HexcraftBlocks.CRIMSON_COBBLESTONE.get(),
						HexcraftBlocks.CRIMSON_STONE_BRICKS.get(),
						HexcraftBlocks.POLISHED_CRIMSON_STONE.get(),
						HexcraftBlocks.CHISELED_CRIMSON_STONE.get(),
						HexcraftBlocks.CRACKED_CRIMSON_STONE.get(),
						HexcraftBlocks.UNDER_WORLD_STONE.get(),
						HexcraftBlocks.UNDER_WORLD_COBBLESTONE.get(),
						HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get(),
						HexcraftBlocks.POLISHED_UNDER_WORLD_STONE.get(),
						HexcraftBlocks.CHISELED_UNDER_WORLD_STONE.get(),
						HexcraftBlocks.CRACKED_UNDER_WORLD_STONE.get(),
						HexcraftBlocks.CHARSTONE.get(),
						HexcraftBlocks.CHARSTONE_COBBLESTONE.get(),
						HexcraftBlocks.CHARSTONE_BRICKS.get(),
						HexcraftBlocks.POLISHED_CHARSTONE.get(),
						HexcraftBlocks.CHISELED_CHARSTONE.get(),
						HexcraftBlocks.CRACKED_CHARSTONE.get(),
						HexcraftBlocks.PEARL_STONE_STAIRS.get(),
						HexcraftBlocks.PEARL_COBBLESTONE_STAIRS.get(),
						HexcraftBlocks.PEARL_STONE_BRICKS_STAIRS.get(),
						HexcraftBlocks.POLISHED_PEARL_STONE_STAIRS.get(),
						HexcraftBlocks.CRIMSON_STONE_STAIRS.get(),
						HexcraftBlocks.CRIMSON_COBBLESTONE_STAIRS.get(),
						HexcraftBlocks.CRIMSON_STONE_BRICKS_STAIRS.get(),
						HexcraftBlocks.POLISHED_CRIMSON_STONE_STAIRS.get(),
						HexcraftBlocks.UNDER_WORLD_STONE_STAIRS.get(),
						HexcraftBlocks.UNDER_WORLD_COBBLESTONE_STAIRS.get(),
						HexcraftBlocks.UNDER_WORLD_STONE_BRICKS_STAIRS.get(),
						HexcraftBlocks.POLISHED_UNDER_WORLD_STONE_STAIRS.get(),
						HexcraftBlocks.CHARSTONE_STONE_STAIRS.get(),
						HexcraftBlocks.CHARSTONE_COBBLESTONE_STAIRS.get(),
						HexcraftBlocks.CHARSTONE_STONE_BRICKS_STAIRS.get(),
						HexcraftBlocks.POLISHED_CHARSTONE_STONE_STAIRS.get(),
						HexcraftBlocks.PEARL_STONE_SLAB.get(),
						HexcraftBlocks.PEARL_COBBLESTONE_SLAB.get(),
						HexcraftBlocks.PEARL_STONE_BRICKS_SLAB.get(),
						HexcraftBlocks.POLISHED_PEARL_STONE_SLAB.get(),
						HexcraftBlocks.CRIMSON_STONE_SLAB.get(),
						HexcraftBlocks.CRIMSON_COBBLESTONE_SLAB.get(),
						HexcraftBlocks.CRIMSON_STONE_BRICKS_SLAB.get(),
						HexcraftBlocks.POLISHED_CRIMSON_STONE_SLAB.get(),
						HexcraftBlocks.UNDER_WORLD_STONE_SLAB.get(),
						HexcraftBlocks.UNDER_WORLD_COBBLESTONE_SLAB.get(),
						HexcraftBlocks.UNDER_WORLD_STONE_BRICKS_SLAB.get(),
						HexcraftBlocks.POLISHED_UNDER_WORLD_STONE_SLAB.get(),
						HexcraftBlocks.CHARSTONE_SLAB.get(),
						HexcraftBlocks.CHARSTONE_COBBLESTONE_SLAB.get(),
						HexcraftBlocks.CHARSTONE_BRICKS_SLAB.get(),
						HexcraftBlocks.POLISHED_CHARSTONE_SLAB.get(),
						HexcraftBlocks.WITCHES_OVEN.get(),
						HexcraftBlocks.WITCHES_CAULDRON.get());


		this.tag(BlockTags.MINEABLE_WITH_AXE)
				.add(HexcraftBlocks.EBONY_LOG.get())
				.add(HexcraftBlocks.EBONY_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_EBONY_LOG.get())
				.add(HexcraftBlocks.STRIPPED_EBONY_WOOD.get())
				.add(HexcraftBlocks.BLOOD_OAK_LOG.get())
				.add(HexcraftBlocks.BLOOD_OAK_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_BLOOD_OAK_LOG.get())
				.add(HexcraftBlocks.STRIPPED_BLOOD_OAK_WOOD.get())
				.add(HexcraftBlocks.WHITE_OAK_LOG.get())
				.add(HexcraftBlocks.WHITE_OAK_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_WHITE_OAK_LOG.get())
				.add(HexcraftBlocks.STRIPPED_WHITE_OAK_WOOD.get())
				.add(HexcraftBlocks.ALDER_LOG.get())
				.add(HexcraftBlocks.ALDER_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_ALDER_LOG.get())
				.add(HexcraftBlocks.STRIPPED_ALDER_WOOD.get())
				.add(HexcraftBlocks.WITCH_HAZEL_LOG.get())
				.add(HexcraftBlocks.WITCH_HAZEL_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_WITCH_HAZEL_LOG.get())
				.add(HexcraftBlocks.STRIPPED_WITCH_HAZEL_WOOD.get())
				.add(HexcraftBlocks.WILLOW_LOG.get())
				.add(HexcraftBlocks.WILLOW_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_WILLOW_LOG.get())
				.add(HexcraftBlocks.STRIPPED_WILLOW_WOOD.get())
				.add(HexcraftBlocks.HAWTHORN_LOG.get())
				.add(HexcraftBlocks.HAWTHORN_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_HAWTHORN_LOG.get())
				.add(HexcraftBlocks.STRIPPED_HAWTHORN_WOOD.get())
				.add(HexcraftBlocks.CEDAR_LOG.get())
				.add(HexcraftBlocks.CEDAR_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_CEDAR_LOG.get())
				.add(HexcraftBlocks.STRIPPED_CEDAR_WOOD.get())
				.add(HexcraftBlocks.DISTORTED_LOG.get())
				.add(HexcraftBlocks.DISTORTED_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_DISTORTED_LOG.get())
				.add(HexcraftBlocks.STRIPPED_DISTORTED_WOOD.get())
				.add(HexcraftBlocks.ELDER_LOG.get())
				.add(HexcraftBlocks.ELDER_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_ELDER_LOG.get())
				.add(HexcraftBlocks.STRIPPED_ELDER_WOOD.get())
				.add(HexcraftBlocks.JUNIPER_LOG.get())
				.add(HexcraftBlocks.JUNIPER_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_JUNIPER_LOG.get())
				.add(HexcraftBlocks.STRIPPED_JUNIPER_WOOD.get())
				.add(HexcraftBlocks.ROWAN_LOG.get())
				.add(HexcraftBlocks.ROWAN_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_ROWAN_LOG.get())
				.add(HexcraftBlocks.STRIPPED_ROWAN_WOOD.get())
				.add(HexcraftBlocks.TWISTED_LOG.get())
				.add(HexcraftBlocks.TWISTED_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_TWISTED_LOG.get())
				.add(HexcraftBlocks.STRIPPED_TWISTED_WOOD.get())
				.add(HexcraftBlocks.WITCH_WOOD_LOG.get())
				.add(HexcraftBlocks.WITCH_WOOD_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_WITCH_WOOD_LOG.get())
				.add(HexcraftBlocks.STRIPPED_WITCH_WOOD_WOOD.get())
				.add(HexcraftBlocks.ECHO_WOOD_LOG.get())
				.add(HexcraftBlocks.ECHO_WOOD_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_ECHO_WOOD_LOG.get())
				.add(HexcraftBlocks.STRIPPED_ECHO_WOOD_WOOD.get())
				.add(HexcraftBlocks.EBONY_PLANKS.get())
				.add(HexcraftBlocks.BLOOD_OAK_PLANKS.get())
				.add(HexcraftBlocks.HELL_BARK_PLANKS.get())
				.add(HexcraftBlocks.WHITE_OAK_PLANKS.get())
				.add(HexcraftBlocks.ALDER_PLANKS.get())
				.add(HexcraftBlocks.WITCH_HAZEL_PLANKS.get())
				.add(HexcraftBlocks.WILLOW_PLANKS.get())
				.add(HexcraftBlocks.HAWTHORN_PLANKS.get())
				.add(HexcraftBlocks.CEDAR_PLANKS.get())
				.add(HexcraftBlocks.DISTORTED_PLANKS.get())
				.add(HexcraftBlocks.ELDER_PLANKS.get())
				.add(HexcraftBlocks.JUNIPER_PLANKS.get())
				.add(HexcraftBlocks.ROWAN_PLANKS.get())
				.add(HexcraftBlocks.TWISTED_PLANKS.get())
				.add(HexcraftBlocks.WITCH_WOOD_PLANKS.get())
				.add(HexcraftBlocks.ECHO_WOOD_PLANKS.get())
				.add(HexcraftBlocks.EBONY_SLAB.get())
				.add(HexcraftBlocks.BLOOD_OAK_SLAB.get())
				.add(HexcraftBlocks.HELL_BARK_SLAB.get())
				.add(HexcraftBlocks.WHITE_OAK_SLAB.get())
				.add(HexcraftBlocks.ALDER_SLAB.get())
				.add(HexcraftBlocks.WITCH_HAZEL_SLAB.get())
				.add(HexcraftBlocks.WILLOW_SLAB.get())
				.add(HexcraftBlocks.HAWTHORN_SLAB.get())
				.add(HexcraftBlocks.CEDAR_SLAB.get())
				.add(HexcraftBlocks.DISTORTED_SLAB.get())
				.add(HexcraftBlocks.ELDER_SLAB.get())
				.add(HexcraftBlocks.JUNIPER_SLAB.get())
				.add(HexcraftBlocks.ROWAN_SLAB.get())
				.add(HexcraftBlocks.TWISTED_SLAB.get())
				.add(HexcraftBlocks.WITCH_WOOD_SLAB.get())
				.add(HexcraftBlocks.ECHO_WOOD_SLAB.get())
				.add(HexcraftBlocks.EBONY_SLAB.get())
				.add(HexcraftBlocks.BLOOD_OAK_SLAB.get())
				.add(HexcraftBlocks.HELL_BARK_SLAB.get())
				.add(HexcraftBlocks.WHITE_OAK_SLAB.get())
				.add(HexcraftBlocks.ALDER_SLAB.get())
				.add(HexcraftBlocks.WITCH_HAZEL_SLAB.get())
				.add(HexcraftBlocks.WILLOW_SLAB.get())
				.add(HexcraftBlocks.HAWTHORN_SLAB.get())
				.add(HexcraftBlocks.CEDAR_SLAB.get())
				.add(HexcraftBlocks.DISTORTED_SLAB.get())
				.add(HexcraftBlocks.ELDER_SLAB.get())
				.add(HexcraftBlocks.JUNIPER_SLAB.get())
				.add(HexcraftBlocks.ROWAN_SLAB.get())
				.add(HexcraftBlocks.TWISTED_SLAB.get())
				.add(HexcraftBlocks.WITCH_WOOD_SLAB.get())
				.add(HexcraftBlocks.ECHO_WOOD_SLAB.get())
				.add(HexcraftBlocks.EBONY_BUTTON.get())
				.add(HexcraftBlocks.BLOOD_OAK_BUTTON.get())
				.add(HexcraftBlocks.HELL_BARK_BUTTON.get())
				.add(HexcraftBlocks.WHITE_OAK_BUTTON.get())
				.add(HexcraftBlocks.ALDER_BUTTON.get())
				.add(HexcraftBlocks.WITCH_HAZEL_BUTTON.get())
				.add(HexcraftBlocks.WILLOW_BUTTON.get())
				.add(HexcraftBlocks.HAWTHORN_BUTTON.get())
				.add(HexcraftBlocks.CEDAR_BUTTON.get())
				.add(HexcraftBlocks.DISTORTED_BUTTON.get())
				.add(HexcraftBlocks.ELDER_BUTTON.get())
				.add(HexcraftBlocks.JUNIPER_BUTTON.get())
				.add(HexcraftBlocks.ROWAN_BUTTON.get())
				.add(HexcraftBlocks.TWISTED_BUTTON.get())
				.add(HexcraftBlocks.WITCH_WOOD_BUTTON.get())
				.add(HexcraftBlocks.ECHO_WOOD_BUTTON.get())
				.add(HexcraftBlocks.EBONY_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.BLOOD_OAK_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.HELL_BARK_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.WHITE_OAK_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.ALDER_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.WITCH_HAZEL_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.WILLOW_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.HAWTHORN_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.CEDAR_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.DISTORTED_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.ELDER_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.JUNIPER_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.ROWAN_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.TWISTED_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.WITCH_WOOD_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.ECHO_WOOD_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.EBONY_FENCE.get())
				.add(HexcraftBlocks.BLOOD_OAK_FENCE.get())
				.add(HexcraftBlocks.HELL_BARK_FENCE.get())
				.add(HexcraftBlocks.WHITE_OAK_FENCE.get())
				.add(HexcraftBlocks.ALDER_FENCE.get())
				.add(HexcraftBlocks.WITCH_HAZEL_FENCE.get())
				.add(HexcraftBlocks.WILLOW_FENCE.get())
				.add(HexcraftBlocks.HAWTHORN_FENCE.get())
				.add(HexcraftBlocks.CEDAR_FENCE.get())
				.add(HexcraftBlocks.DISTORTED_FENCE.get())
				.add(HexcraftBlocks.ELDER_FENCE.get())
				.add(HexcraftBlocks.JUNIPER_FENCE.get())
				.add(HexcraftBlocks.ROWAN_FENCE.get())
				.add(HexcraftBlocks.TWISTED_FENCE.get())
				.add(HexcraftBlocks.WITCH_WOOD_FENCE.get())
				.add(HexcraftBlocks.ECHO_WOOD_FENCE.get())
				.add(HexcraftBlocks.EBONY_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.BLOOD_OAK_FENCE_GATE.get())
				.add(HexcraftBlocks.HELL_BARK_FENCE_GATE.get())
				.add(HexcraftBlocks.WHITE_OAK_FENCE_GATE.get())
				.add(HexcraftBlocks.ALDER_FENCE_GATE.get())
				.add(HexcraftBlocks.WITCH_HAZEL_FENCE_GATE.get())
				.add(HexcraftBlocks.WILLOW_FENCE_GATE.get())
				.add(HexcraftBlocks.HAWTHORN_FENCE_GATE.get())
				.add(HexcraftBlocks.CEDAR_FENCE_GATE.get())
				.add(HexcraftBlocks.DISTORTED_FENCE_GATE.get())
				.add(HexcraftBlocks.ELDER_FENCE_GATE.get())
				.add(HexcraftBlocks.JUNIPER_FENCE_GATE.get())
				.add(HexcraftBlocks.ROWAN_FENCE_GATE.get())
				.add(HexcraftBlocks.TWISTED_FENCE_GATE.get())
				.add(HexcraftBlocks.WITCH_WOOD_FENCE_GATE.get())
				.add(HexcraftBlocks.ECHO_WOOD_FENCE_GATE.get());



		this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
				.add(HexcraftBlocks.VILE_GRASS_BLOCK.get(), HexcraftBlocks.VILE_DIRT.get(),
						HexcraftBlocks.CURSED_SOIL.get(), HexcraftBlocks.CURED_SOIL.get(),
						HexcraftBlocks.FERTILIZED_DIRT.get());


		this.tag(BlockTags.DIRT)
				.add(HexcraftBlocks.VILE_GRASS_BLOCK.get(), HexcraftBlocks.VILE_DIRT.get(),
						HexcraftBlocks.CURSED_SOIL.get(), HexcraftBlocks.CURED_SOIL.get(),
						HexcraftBlocks.FERTILIZED_DIRT.get());

		this.tag(BlockTags.BASE_STONE_OVERWORLD)
				.add(HexcraftBlocks.PEARL_STONE.get(), HexcraftBlocks.CRIMSON_STONE.get(),
						HexcraftBlocks.UNDER_WORLD_STONE.get(), HexcraftBlocks.CHARSTONE.get());

		this.tag(BlockTags.STONE_BRICKS)
				.add(HexcraftBlocks.PEARL_STONE_BRICKS.get(), HexcraftBlocks.CRIMSON_STONE_BRICKS.get(),
						HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get(), HexcraftBlocks.CHARSTONE_BRICKS.get());

		this.tag(BlockTags.SMALL_FLOWERS)
				.add(HexcraftBlocks.VAMPIRE_ORCHID.get(), HexcraftBlocks.BLOODY_ROSE.get());

		this.tag(BlockTags.ANIMALS_SPAWNABLE_ON)
				.add(HexcraftBlocks.VILE_GRASS_BLOCK.get());

		this.tag(BlockTags.ENDERMAN_HOLDABLE)
				.add(HexcraftBlocks.VILE_GRASS_BLOCK.get(), HexcraftBlocks.VILE_DIRT.get(),
						HexcraftBlocks.PEARL_STONE.get(), HexcraftBlocks.CRIMSON_STONE_BRICKS.get(),
						HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get(), HexcraftBlocks.CHARSTONE_BRICKS.get());

		this.tag(BlockTags.LOGS_THAT_BURN)
				.add(HexcraftBlocks.EBONY_LOG.get())
				.add(HexcraftBlocks.EBONY_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_EBONY_LOG.get())
				.add(HexcraftBlocks.STRIPPED_EBONY_WOOD.get())
				.add(HexcraftBlocks.BLOOD_OAK_LOG.get())
				.add(HexcraftBlocks.BLOOD_OAK_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_BLOOD_OAK_LOG.get())
				.add(HexcraftBlocks.STRIPPED_BLOOD_OAK_WOOD.get())
				.add(HexcraftBlocks.WHITE_OAK_LOG.get())
				.add(HexcraftBlocks.WHITE_OAK_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_WHITE_OAK_LOG.get())
				.add(HexcraftBlocks.STRIPPED_WHITE_OAK_WOOD.get())
				.add(HexcraftBlocks.ALDER_LOG.get())
				.add(HexcraftBlocks.ALDER_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_ALDER_LOG.get())
				.add(HexcraftBlocks.STRIPPED_ALDER_WOOD.get())
				.add(HexcraftBlocks.WITCH_HAZEL_LOG.get())
				.add(HexcraftBlocks.WITCH_HAZEL_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_WITCH_HAZEL_LOG.get())
				.add(HexcraftBlocks.STRIPPED_WITCH_HAZEL_WOOD.get())
				.add(HexcraftBlocks.WILLOW_LOG.get())
				.add(HexcraftBlocks.WILLOW_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_WILLOW_LOG.get())
				.add(HexcraftBlocks.STRIPPED_WILLOW_WOOD.get())
				.add(HexcraftBlocks.HAWTHORN_LOG.get())
				.add(HexcraftBlocks.HAWTHORN_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_HAWTHORN_LOG.get())
				.add(HexcraftBlocks.STRIPPED_HAWTHORN_WOOD.get())
				.add(HexcraftBlocks.CEDAR_LOG.get())
				.add(HexcraftBlocks.CEDAR_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_CEDAR_LOG.get())
				.add(HexcraftBlocks.STRIPPED_CEDAR_WOOD.get())
				.add(HexcraftBlocks.DISTORTED_LOG.get())
				.add(HexcraftBlocks.DISTORTED_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_DISTORTED_LOG.get())
				.add(HexcraftBlocks.STRIPPED_DISTORTED_WOOD.get())
				.add(HexcraftBlocks.ELDER_LOG.get())
				.add(HexcraftBlocks.ELDER_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_ELDER_LOG.get())
				.add(HexcraftBlocks.STRIPPED_ELDER_WOOD.get())
				.add(HexcraftBlocks.JUNIPER_LOG.get())
				.add(HexcraftBlocks.JUNIPER_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_JUNIPER_LOG.get())
				.add(HexcraftBlocks.STRIPPED_JUNIPER_WOOD.get())
				.add(HexcraftBlocks.ROWAN_LOG.get())
				.add(HexcraftBlocks.ROWAN_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_ROWAN_LOG.get())
				.add(HexcraftBlocks.STRIPPED_ROWAN_WOOD.get())
				.add(HexcraftBlocks.TWISTED_LOG.get())
				.add(HexcraftBlocks.TWISTED_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_TWISTED_LOG.get())
				.add(HexcraftBlocks.STRIPPED_TWISTED_WOOD.get())
				.add(HexcraftBlocks.WITCH_WOOD_LOG.get())
				.add(HexcraftBlocks.WITCH_WOOD_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_WITCH_WOOD_LOG.get())
				.add(HexcraftBlocks.STRIPPED_WITCH_WOOD_WOOD.get())
				.add(HexcraftBlocks.ECHO_WOOD_LOG.get())
				.add(HexcraftBlocks.ECHO_WOOD_WOOD.get())
				.add(HexcraftBlocks.STRIPPED_ECHO_WOOD_LOG.get())
				.add(HexcraftBlocks.STRIPPED_ECHO_WOOD_WOOD.get());

		this.tag(BlockTags.PLANKS)
				.add(HexcraftBlocks.EBONY_PLANKS.get())
				.add(HexcraftBlocks.BLOOD_OAK_PLANKS.get())
				.add(HexcraftBlocks.HELL_BARK_PLANKS.get())
				.add(HexcraftBlocks.WHITE_OAK_PLANKS.get())
				.add(HexcraftBlocks.ALDER_PLANKS.get())
				.add(HexcraftBlocks.WITCH_HAZEL_PLANKS.get())
				.add(HexcraftBlocks.WILLOW_PLANKS.get())
				.add(HexcraftBlocks.HAWTHORN_PLANKS.get())
				.add(HexcraftBlocks.CEDAR_PLANKS.get())
				.add(HexcraftBlocks.DISTORTED_PLANKS.get())
				.add(HexcraftBlocks.ELDER_PLANKS.get())
				.add(HexcraftBlocks.JUNIPER_PLANKS.get())
				.add(HexcraftBlocks.ROWAN_PLANKS.get())
				.add(HexcraftBlocks.TWISTED_PLANKS.get())
				.add(HexcraftBlocks.WITCH_WOOD_PLANKS.get())
				.add(HexcraftBlocks.ECHO_WOOD_PLANKS.get());

		this.tag(BlockTags.WOODEN_SLABS)
				.add(HexcraftBlocks.EBONY_SLAB.get())
				.add(HexcraftBlocks.BLOOD_OAK_SLAB.get())
				.add(HexcraftBlocks.HELL_BARK_SLAB.get())
				.add(HexcraftBlocks.WHITE_OAK_SLAB.get())
				.add(HexcraftBlocks.ALDER_SLAB.get())
				.add(HexcraftBlocks.WITCH_HAZEL_SLAB.get())
				.add(HexcraftBlocks.WILLOW_SLAB.get())
				.add(HexcraftBlocks.HAWTHORN_SLAB.get())
				.add(HexcraftBlocks.CEDAR_SLAB.get())
				.add(HexcraftBlocks.DISTORTED_SLAB.get())
				.add(HexcraftBlocks.ELDER_SLAB.get())
				.add(HexcraftBlocks.JUNIPER_SLAB.get())
				.add(HexcraftBlocks.ROWAN_SLAB.get())
				.add(HexcraftBlocks.TWISTED_SLAB.get())
				.add(HexcraftBlocks.WITCH_WOOD_SLAB.get())
				.add(HexcraftBlocks.ECHO_WOOD_SLAB.get());

		this.tag(BlockTags.WOODEN_STAIRS)
				.add(HexcraftBlocks.EBONY_STAIRS.get())
				.add(HexcraftBlocks.BLOOD_OAK_STAIRS.get())
				.add(HexcraftBlocks.HELL_BARK_STAIRS.get())
				.add(HexcraftBlocks.WHITE_OAK_STAIRS.get())
				.add(HexcraftBlocks.ALDER_STAIRS.get())
				.add(HexcraftBlocks.WITCH_HAZEL_STAIRS.get())
				.add(HexcraftBlocks.WILLOW_STAIRS.get())
				.add(HexcraftBlocks.HAWTHORN_STAIRS.get())
				.add(HexcraftBlocks.CEDAR_STAIRS.get())
				.add(HexcraftBlocks.DISTORTED_STAIRS.get())
				.add(HexcraftBlocks.ELDER_STAIRS.get())
				.add(HexcraftBlocks.JUNIPER_STAIRS.get())
				.add(HexcraftBlocks.ROWAN_STAIRS.get())
				.add(HexcraftBlocks.TWISTED_STAIRS.get())
				.add(HexcraftBlocks.WITCH_WOOD_STAIRS.get())
				.add(HexcraftBlocks.ECHO_WOOD_STAIRS.get());

		this.tag(BlockTags.WOODEN_BUTTONS)
				.add(HexcraftBlocks.EBONY_BUTTON.get())
				.add(HexcraftBlocks.BLOOD_OAK_BUTTON.get())
				.add(HexcraftBlocks.HELL_BARK_BUTTON.get())
				.add(HexcraftBlocks.WHITE_OAK_BUTTON.get())
				.add(HexcraftBlocks.ALDER_BUTTON.get())
				.add(HexcraftBlocks.WITCH_HAZEL_BUTTON.get())
				.add(HexcraftBlocks.WILLOW_BUTTON.get())
				.add(HexcraftBlocks.HAWTHORN_BUTTON.get())
				.add(HexcraftBlocks.CEDAR_BUTTON.get())
				.add(HexcraftBlocks.DISTORTED_BUTTON.get())
				.add(HexcraftBlocks.ELDER_BUTTON.get())
				.add(HexcraftBlocks.JUNIPER_BUTTON.get())
				.add(HexcraftBlocks.ROWAN_BUTTON.get())
				.add(HexcraftBlocks.TWISTED_BUTTON.get())
				.add(HexcraftBlocks.WITCH_WOOD_BUTTON.get())
				.add(HexcraftBlocks.ECHO_WOOD_BUTTON.get());

		this.tag(BlockTags.WOODEN_PRESSURE_PLATES)
				.add(HexcraftBlocks.EBONY_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.BLOOD_OAK_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.HELL_BARK_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.WHITE_OAK_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.ALDER_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.WITCH_HAZEL_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.WILLOW_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.HAWTHORN_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.CEDAR_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.DISTORTED_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.ELDER_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.JUNIPER_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.ROWAN_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.TWISTED_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.WITCH_WOOD_PRESSURE_PLATE.get())
				.add(HexcraftBlocks.ECHO_WOOD_PRESSURE_PLATE.get());

		this.tag(BlockTags.WOODEN_FENCES)
				.add(HexcraftBlocks.EBONY_FENCE.get())
				.add(HexcraftBlocks.BLOOD_OAK_FENCE.get())
				.add(HexcraftBlocks.HELL_BARK_FENCE.get())
				.add(HexcraftBlocks.WHITE_OAK_FENCE.get())
				.add(HexcraftBlocks.ALDER_FENCE.get())
				.add(HexcraftBlocks.WITCH_HAZEL_FENCE.get())
				.add(HexcraftBlocks.WILLOW_FENCE.get())
				.add(HexcraftBlocks.HAWTHORN_FENCE.get())
				.add(HexcraftBlocks.CEDAR_FENCE.get())
				.add(HexcraftBlocks.DISTORTED_FENCE.get())
				.add(HexcraftBlocks.ELDER_FENCE.get())
				.add(HexcraftBlocks.JUNIPER_FENCE.get())
				.add(HexcraftBlocks.ROWAN_FENCE.get())
				.add(HexcraftBlocks.TWISTED_FENCE.get())
				.add(HexcraftBlocks.WITCH_WOOD_FENCE.get())
				.add(HexcraftBlocks.ECHO_WOOD_FENCE.get());


		this.tag(BlockTags.FENCE_GATES)
				.add(HexcraftBlocks.EBONY_FENCE_GATE.get())
				.add(HexcraftBlocks.BLOOD_OAK_FENCE_GATE.get())
				.add(HexcraftBlocks.HELL_BARK_FENCE_GATE.get())
				.add(HexcraftBlocks.WHITE_OAK_FENCE_GATE.get())
				.add(HexcraftBlocks.ALDER_FENCE_GATE.get())
				.add(HexcraftBlocks.WITCH_HAZEL_FENCE_GATE.get())
				.add(HexcraftBlocks.WILLOW_FENCE_GATE.get())
				.add(HexcraftBlocks.HAWTHORN_FENCE_GATE.get())
				.add(HexcraftBlocks.CEDAR_FENCE_GATE.get())
				.add(HexcraftBlocks.DISTORTED_FENCE_GATE.get())
				.add(HexcraftBlocks.ELDER_FENCE_GATE.get())
				.add(HexcraftBlocks.JUNIPER_FENCE_GATE.get())
				.add(HexcraftBlocks.ROWAN_FENCE_GATE.get())
				.add(HexcraftBlocks.TWISTED_FENCE_GATE.get())
				.add(HexcraftBlocks.WITCH_WOOD_FENCE_GATE.get())
				.add(HexcraftBlocks.ECHO_WOOD_FENCE_GATE.get());


	}

}
