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
						HexcraftBlocks.CEDAR_SAPLING.get(),HexcraftBlocks.ROWAN_SAPLING.get());

		this.tag(HexcraftTags.Blocks.BLIGHT_DECAYABLE_PLANTS)
				.addTag(BlockTags.SAPLINGS)
				.addTag(BlockTags.SMALL_FLOWERS)
				.add(Blocks.GRASS, Blocks.FERN, Blocks.SWEET_BERRY_BUSH)
				.add(HexcraftBlocks.GLINT_WEED.get(), HexcraftBlocks.BLOOD_BERRIES_PLANT.get());


		this.tag(BlockTags.NEEDS_IRON_TOOL)
				.add(HexcraftBlocks.AMETHYST_CHIMES.get(),
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
						HexcraftBlocks.POLISHED_CHARSTONE_SLAB.get());


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

		this.tag(BlockTags.FLOWERS)
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
	}

}
