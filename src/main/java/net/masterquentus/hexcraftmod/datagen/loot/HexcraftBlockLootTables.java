package net.masterquentus.hexcraftmod.datagen.loot;

import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.block.custom.plants.AerpinePlantBlock;
import net.masterquentus.hexcraftmod.block.custom.plants.MandrakePlantBlock;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class HexcraftBlockLootTables extends BlockLootSubProvider {
	public HexcraftBlockLootTables() {
		super(Set.of(), FeatureFlags.REGISTRY.allFlags());
	}

	@Override
	protected void generate() {
		this.dropSelf(HexcraftBlocks.MOONSTONE_BLOCK.get());

		this.dropSelf(HexcraftBlocks.SILVER_BLOCK.get());

		this.dropSelf(HexcraftBlocks.VAMPIRIC_BLOCK.get());

		this.dropSelf(HexcraftBlocks.BLACK_OBSIDIAN.get());

		this.dropSelf(HexcraftBlocks.AMETHYST_CHIMES.get());

		this.dropSelf(HexcraftBlocks.PURE_MAGIC_CRYSTAL.get());

		this.dropSelf(HexcraftBlocks.WITCHES_OVEN.get());

		this.dropSelf(HexcraftBlocks.WITCHES_CAULDRON.get());

		this.dropSelf(HexcraftBlocks.CURSED_SOIL.get());

		this.dropSelf(HexcraftBlocks.CURED_SOIL.get());

		this.dropSelf(HexcraftBlocks.FERTILIZED_DIRT.get());

		this.dropSelf(HexcraftBlocks.VILE_DIRT.get());

		this.dropSelf(HexcraftBlocks.VAMPIRE_ORCHID.get());

		this.add(HexcraftBlocks.POTTED_VAMPIRE_ORCHID.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_VAMPIRE_ORCHID.get()));

		this.dropSelf(HexcraftBlocks.BLOODY_ROSE.get());

		this.add(HexcraftBlocks.POTTED_BLOODY_ROSE.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_BLOODY_ROSE.get()));

		this.dropSelf(HexcraftBlocks.GLINT_WEED.get());

		this.dropSelf(HexcraftBlocks.SPANISH_MOSS.get());

		this.dropSelf(HexcraftBlocks.VILEVINE.get());

		this.dropSelf(HexcraftBlocks.DEMON_HEART.get());

		this.dropSelf(HexcraftBlocks.EBONY_LOG.get());

		this.dropSelf(HexcraftBlocks.BLOOD_OAK_LOG.get());

		this.dropSelf(HexcraftBlocks.HELL_BARK_LOG.get());

		this.dropSelf(HexcraftBlocks.WHITE_OAK_LOG.get());

		this.dropSelf(HexcraftBlocks.ALDER_LOG.get());

		this.dropSelf(HexcraftBlocks.WITCH_HAZEL_LOG.get());

		this.dropSelf(HexcraftBlocks.WILLOW_LOG.get());

		this.dropSelf(HexcraftBlocks.HAWTHORN_LOG.get());

		this.dropSelf(HexcraftBlocks.CEDAR_LOG.get());

		this.dropSelf(HexcraftBlocks.DISTORTED_LOG.get());

		this.dropSelf(HexcraftBlocks.ELDER_LOG.get());

		this.dropSelf(HexcraftBlocks.JUNIPER_LOG.get());

		this.dropSelf(HexcraftBlocks.ROWAN_LOG.get());

		this.dropSelf(HexcraftBlocks.TWISTED_LOG.get());

		this.dropSelf(HexcraftBlocks.WITCH_WOOD_LOG.get());

		this.dropSelf(HexcraftBlocks.ECHO_WOOD_LOG.get());

		this.dropSelf(HexcraftBlocks.EBONY_WOOD.get());

		this.dropSelf(HexcraftBlocks.BLOOD_OAK_WOOD.get());

		this.dropSelf(HexcraftBlocks.HELL_BARK_WOOD.get());

		this.dropSelf(HexcraftBlocks.WHITE_OAK_WOOD.get());

		this.dropSelf(HexcraftBlocks.ALDER_WOOD.get());

		this.dropSelf(HexcraftBlocks.WITCH_HAZEL_WOOD.get());

		this.dropSelf(HexcraftBlocks.WILLOW_WOOD.get());

		this.dropSelf(HexcraftBlocks.HAWTHORN_WOOD.get());

		this.dropSelf(HexcraftBlocks.CEDAR_WOOD.get());

		this.dropSelf(HexcraftBlocks.DISTORTED_WOOD.get());

		this.dropSelf(HexcraftBlocks.ELDER_WOOD.get());

		this.dropSelf(HexcraftBlocks.JUNIPER_WOOD.get());

		this.dropSelf(HexcraftBlocks.ROWAN_WOOD.get());

		this.dropSelf(HexcraftBlocks.TWISTED_WOOD.get());

		this.dropSelf(HexcraftBlocks.WITCH_WOOD_WOOD.get());

		this.dropSelf(HexcraftBlocks.ECHO_WOOD_WOOD.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_EBONY_LOG.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_BLOOD_OAK_LOG.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_HELL_BARK_LOG.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_WHITE_OAK_LOG.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_ALDER_LOG.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_WITCH_HAZEL_LOG.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_WILLOW_LOG.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_HAWTHORN_LOG.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_CEDAR_LOG.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_DISTORTED_LOG.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_ELDER_LOG.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_JUNIPER_LOG.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_ROWAN_LOG.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_TWISTED_LOG.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_WITCH_WOOD_LOG.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_ECHO_WOOD_LOG.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_EBONY_WOOD.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_BLOOD_OAK_WOOD.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_HELL_BARK_WOOD.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_WHITE_OAK_WOOD.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_ALDER_WOOD.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_WITCH_HAZEL_WOOD.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_WILLOW_WOOD.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_HAWTHORN_WOOD.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_CEDAR_WOOD.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_DISTORTED_WOOD.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_ELDER_WOOD.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_JUNIPER_WOOD.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_ROWAN_WOOD.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_TWISTED_WOOD.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_WITCH_WOOD_WOOD.get());

		this.dropSelf(HexcraftBlocks.STRIPPED_ECHO_WOOD_WOOD.get());

		this.dropSelf(HexcraftBlocks.EBONY_PLANKS.get());

		this.dropSelf(HexcraftBlocks.BLOOD_OAK_PLANKS.get());

		this.dropSelf(HexcraftBlocks.HELL_BARK_PLANKS.get());

		this.dropSelf(HexcraftBlocks.WHITE_OAK_PLANKS.get());

		this.dropSelf(HexcraftBlocks.ALDER_PLANKS.get());

		this.dropSelf(HexcraftBlocks.WITCH_HAZEL_PLANKS.get());

		this.dropSelf(HexcraftBlocks.WILLOW_PLANKS.get());

		this.dropSelf(HexcraftBlocks.HAWTHORN_PLANKS.get());

		this.dropSelf(HexcraftBlocks.CEDAR_PLANKS.get());

		this.dropSelf(HexcraftBlocks.DISTORTED_PLANKS.get());

		this.dropSelf(HexcraftBlocks.ELDER_PLANKS.get());

		this.dropSelf(HexcraftBlocks.JUNIPER_PLANKS.get());

		this.dropSelf(HexcraftBlocks.ROWAN_PLANKS.get());

		this.dropSelf(HexcraftBlocks.TWISTED_PLANKS.get());

		this.dropSelf(HexcraftBlocks.WITCH_WOOD_PLANKS.get());

		this.dropSelf(HexcraftBlocks.ECHO_WOOD_PLANKS.get());

		this.dropSelf(HexcraftBlocks.EBONY_SAPLING.get());

		this.dropSelf(HexcraftBlocks.BLOOD_OAK_SAPLING.get());

		this.dropSelf(HexcraftBlocks.HELL_BARK_SAPLING.get());

		this.dropSelf(HexcraftBlocks.WHITE_OAK_SAPLING.get());

		this.dropSelf(HexcraftBlocks.ALDER_SAPLING.get());

		this.dropSelf(HexcraftBlocks.WITCH_HAZEL_SAPLING.get());

		this.dropSelf(HexcraftBlocks.WILLOW_SAPLING.get());

		this.dropSelf(HexcraftBlocks.HAWTHORN_SAPLING.get());

		this.dropSelf(HexcraftBlocks.CEDAR_SAPLING.get());

		this.dropSelf(HexcraftBlocks.DISTORTED_SAPLING.get());

		this.dropSelf(HexcraftBlocks.ELDER_SAPLING.get());

		this.dropSelf(HexcraftBlocks.JUNIPER_SAPLING.get());

		this.dropSelf(HexcraftBlocks.ROWAN_SAPLING.get());

		this.dropSelf(HexcraftBlocks.TWISTED_SAPLING.get());

		this.dropSelf(HexcraftBlocks.WITCH_WOOD_SAPLING.get());

		this.dropSelf(HexcraftBlocks.ECHO_WOOD_SAPLING.get());

		this.add(HexcraftBlocks.EBONY_LEAVES.get(), block ->
				createLeavesDrops(block, HexcraftBlocks.EBONY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

		this.add(HexcraftBlocks.BLOOD_OAK_LEAVES.get(), block ->
				createLeavesDrops(block, HexcraftBlocks.BLOOD_OAK_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

		this.add(HexcraftBlocks.HELL_BARK_LEAVES.get(), block ->
				createLeavesDrops(block, HexcraftBlocks.HELL_BARK_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

		this.add(HexcraftBlocks.WHITE_OAK_LEAVES.get(), block ->
				createLeavesDrops(block, HexcraftBlocks.WHITE_OAK_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

		this.add(HexcraftBlocks.ALDER_LEAVES.get(), block ->
				createLeavesDrops(block, HexcraftBlocks.ALDER_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

		this.add(HexcraftBlocks.WITCH_HAZEL_LEAVES.get(), block ->
				createLeavesDrops(block, HexcraftBlocks.WITCH_HAZEL_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

		this.add(HexcraftBlocks.WILLOW_LEAVES.get(), block ->
				createLeavesDrops(block, HexcraftBlocks.WILLOW_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

		this.add(HexcraftBlocks.HAWTHORN_LEAVES.get(), block ->
				createLeavesDrops(block, HexcraftBlocks.HAWTHORN_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

		this.add(HexcraftBlocks.CEDAR_LEAVES.get(), block ->
				createLeavesDrops(block, HexcraftBlocks.CEDAR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

		this.add(HexcraftBlocks.DISTORTED_LEAVES.get(), block ->
				createLeavesDrops(block, HexcraftBlocks.DISTORTED_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

		this.add(HexcraftBlocks.ELDER_LEAVES.get(), block ->
				createLeavesDrops(block, HexcraftBlocks.ELDER_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

		this.add(HexcraftBlocks.JUNIPER_LEAVES.get(), block ->
				createLeavesDrops(block, HexcraftBlocks.JUNIPER_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

		this.add(HexcraftBlocks.ROWAN_LEAVES.get(), block ->
				createLeavesDrops(block, HexcraftBlocks.ROWAN_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

		this.add(HexcraftBlocks.TWISTED_LEAVES.get(), block ->
				createLeavesDrops(block, HexcraftBlocks.TWISTED_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

		this.add(HexcraftBlocks.WITCH_WOOD_LEAVES.get(), block ->
				createLeavesDrops(block, HexcraftBlocks.WITCH_WOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

		this.add(HexcraftBlocks.ECHO_WOOD_LEAVES.get(), block ->
				createLeavesDrops(block, HexcraftBlocks.ECHO_WOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

		this.dropSelf(HexcraftBlocks.HELL_FUNGAL_LAMP.get());

		this.dropSelf(HexcraftBlocks.ECHO_FUNGAL_LAMP.get());

		this.dropSelf(HexcraftBlocks.PEARL_COBBLESTONE.get());

		this.dropSelf(HexcraftBlocks.PEARL_STONE_BRICKS.get());

		this.dropSelf(HexcraftBlocks.POLISHED_PEARL_STONE.get());

		this.dropSelf(HexcraftBlocks.CHISELED_PEARL_STONE.get());

		this.dropSelf(HexcraftBlocks.CRACKED_PEARL_STONE.get());

		this.dropSelf(HexcraftBlocks.CRIMSON_COBBLESTONE.get());

		this.dropSelf(HexcraftBlocks.CRIMSON_STONE_BRICKS.get());

		this.dropSelf(HexcraftBlocks.POLISHED_CRIMSON_STONE.get());

		this.dropSelf(HexcraftBlocks.CHISELED_CRIMSON_STONE.get());

		this.dropSelf(HexcraftBlocks.CRACKED_CRIMSON_STONE.get());

		this.dropSelf(HexcraftBlocks.UNDER_WORLD_COBBLESTONE.get());

		this.dropSelf(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get());

		this.dropSelf(HexcraftBlocks.POLISHED_UNDER_WORLD_STONE.get());

		this.dropSelf(HexcraftBlocks.CHISELED_UNDER_WORLD_STONE.get());

		this.dropSelf(HexcraftBlocks.CRACKED_UNDER_WORLD_STONE.get());

		this.dropSelf(HexcraftBlocks.CHARSTONE_COBBLESTONE.get());

		this.dropSelf(HexcraftBlocks.CHARSTONE_BRICKS.get());

		this.dropSelf(HexcraftBlocks.POLISHED_CHARSTONE.get());

		this.dropSelf(HexcraftBlocks.CHISELED_CHARSTONE.get());

		this.dropSelf(HexcraftBlocks.CRACKED_CHARSTONE.get());

		this.dropSelf(HexcraftBlocks.PEARL_STONE_STAIRS.get());

		this.dropSelf(HexcraftBlocks.PEARL_COBBLESTONE_STAIRS.get());

		this.dropSelf(HexcraftBlocks.PEARL_STONE_BRICKS_STAIRS.get());

		this.dropSelf(HexcraftBlocks.POLISHED_PEARL_STONE_STAIRS.get());

		this.dropSelf(HexcraftBlocks.CRIMSON_STONE_STAIRS.get());

		this.dropSelf(HexcraftBlocks.CRIMSON_COBBLESTONE_STAIRS.get());

		this.dropSelf(HexcraftBlocks.CRIMSON_STONE_BRICKS_STAIRS.get());

		this.dropSelf(HexcraftBlocks.POLISHED_CRIMSON_STONE_STAIRS.get());

		this.dropSelf(HexcraftBlocks.UNDER_WORLD_STONE_STAIRS.get());

		this.dropSelf(HexcraftBlocks.UNDER_WORLD_COBBLESTONE_STAIRS.get());

		this.dropSelf(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS_STAIRS.get());

		this.dropSelf(HexcraftBlocks.POLISHED_UNDER_WORLD_STONE_STAIRS.get());

		this.dropSelf(HexcraftBlocks.CHARSTONE_STONE_STAIRS.get());

		this.dropSelf(HexcraftBlocks.CHARSTONE_COBBLESTONE_STAIRS.get());

		this.dropSelf(HexcraftBlocks.CHARSTONE_STONE_BRICKS_STAIRS.get());

		this.dropSelf(HexcraftBlocks.POLISHED_CHARSTONE_STONE_STAIRS.get());

		this.dropSelf(HexcraftBlocks.PEARL_STONE_SLAB.get());

		this.dropSelf(HexcraftBlocks.PEARL_COBBLESTONE_SLAB.get());

		this.dropSelf(HexcraftBlocks.PEARL_STONE_BRICKS_SLAB.get());

		this.dropSelf(HexcraftBlocks.POLISHED_PEARL_STONE_SLAB.get());

		this.dropSelf(HexcraftBlocks.CRIMSON_STONE_SLAB.get());

		this.dropSelf(HexcraftBlocks.CRIMSON_COBBLESTONE_SLAB.get());

		this.dropSelf(HexcraftBlocks.CRIMSON_STONE_BRICKS_SLAB.get());

		this.dropSelf(HexcraftBlocks.POLISHED_CRIMSON_STONE_SLAB.get());

		this.dropSelf(HexcraftBlocks.UNDER_WORLD_STONE_SLAB.get());

		this.dropSelf(HexcraftBlocks.UNDER_WORLD_COBBLESTONE_SLAB.get());

		this.dropSelf(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS_SLAB.get());

		this.dropSelf(HexcraftBlocks.POLISHED_UNDER_WORLD_STONE_SLAB.get());

		this.dropSelf(HexcraftBlocks.CHARSTONE_SLAB.get());

		this.dropSelf(HexcraftBlocks.CHARSTONE_COBBLESTONE_SLAB.get());

		this.dropSelf(HexcraftBlocks.CHARSTONE_BRICKS_SLAB.get());

		this.dropSelf(HexcraftBlocks.POLISHED_CHARSTONE_SLAB.get());

		this.dropSelf(HexcraftBlocks.MAGIC_CRYSTAL_BLOCK.get());

		this.dropOther(HexcraftBlocks.MAGIC_CRYSTAL_CLUSTER.get(), HexcraftItems.MAGIC_CRYSTAL.get());

		this.dropOther(HexcraftBlocks.LARGE_MAGIC_CRYSTAL_BUD.get(), HexcraftItems.MAGIC_CRYSTAL.get());

		this.dropOther(HexcraftBlocks.WITCHES_LADDER.get(), HexcraftItems.WITCHES_LADDER_ITEM.get());

		this.add(HexcraftBlocks.VILE_GRASS_BLOCK.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.VILE_GRASS_BLOCK.get(), Item.byBlock(HexcraftBlocks.VILE_DIRT.get())));

		this.add(HexcraftBlocks.EBONY_BOOKSHELF.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.EBONY_BOOKSHELF.get(), Item.byBlock(HexcraftBlocks.EBONY_PLANKS.get())));

		this.add(HexcraftBlocks.BLOOD_OAK_BOOKSHELF.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.BLOOD_OAK_BOOKSHELF.get(), Item.byBlock(HexcraftBlocks.BLOOD_OAK_PLANKS.get())));

		this.add(HexcraftBlocks.HELL_BARK_BOOKSHELF.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.HELL_BARK_BOOKSHELF.get(), Item.byBlock(HexcraftBlocks.HELL_BARK_PLANKS.get())));

		this.add(HexcraftBlocks.WHITE_OAK_BOOKSHELF.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.WHITE_OAK_BOOKSHELF.get(), Item.byBlock(HexcraftBlocks.WHITE_OAK_PLANKS.get())));

		this.add(HexcraftBlocks.ALDER_BOOKSHELF.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.ALDER_BOOKSHELF.get(), Item.byBlock(HexcraftBlocks.ALDER_PLANKS.get())));

		this.add(HexcraftBlocks.WITCH_HAZEL_BOOKSHELF.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.WITCH_HAZEL_BOOKSHELF.get(), Item.byBlock(HexcraftBlocks.WITCH_HAZEL_PLANKS.get())));

		this.add(HexcraftBlocks.WILLOW_BOOKSHELF.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.WILLOW_BOOKSHELF.get(), Item.byBlock(HexcraftBlocks.WILLOW_PLANKS.get())));

		this.add(HexcraftBlocks.HAWTHORN_BOOKSHELF.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.HAWTHORN_BOOKSHELF.get(), Item.byBlock(HexcraftBlocks.HAWTHORN_PLANKS.get())));

		this.add(HexcraftBlocks.CEDAR_BOOKSHELF.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.CEDAR_BOOKSHELF.get(), Item.byBlock(HexcraftBlocks.CEDAR_PLANKS.get())));

		this.add(HexcraftBlocks.DISTORTED_BOOKSHELF.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.DISTORTED_BOOKSHELF.get(), Item.byBlock(HexcraftBlocks.DISTORTED_BOOKSHELF.get())));

		this.add(HexcraftBlocks.ELDER_BOOKSHELF.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.ELDER_BOOKSHELF.get(), Item.byBlock(HexcraftBlocks.ELDER_PLANKS.get())));

		this.add(HexcraftBlocks.JUNIPER_BOOKSHELF.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.JUNIPER_BOOKSHELF.get(), Item.byBlock(HexcraftBlocks.JUNIPER_PLANKS.get())));

		this.add(HexcraftBlocks.ROWAN_BOOKSHELF.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.ROWAN_BOOKSHELF.get(), Item.byBlock(HexcraftBlocks.ROWAN_PLANKS.get())));

		this.add(HexcraftBlocks.TWISTED_BOOKSHELF.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.TWISTED_BOOKSHELF.get(), Item.byBlock(HexcraftBlocks.TWISTED_PLANKS.get())));

		this.add(HexcraftBlocks.WITCH_WOOD_BOOKSHELF.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.WITCH_WOOD_BOOKSHELF.get(), Item.byBlock(HexcraftBlocks.WITCH_WOOD_PLANKS.get())));

		this.add(HexcraftBlocks.ECHO_WOOD_BOOKSHELF.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.ECHO_WOOD_BOOKSHELF.get(), Item.byBlock(HexcraftBlocks.ECHO_WOOD_PLANKS.get())));

		this.add(HexcraftBlocks.PEARL_STONE.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.PEARL_STONE.get(), Item.byBlock(HexcraftBlocks.PEARL_COBBLESTONE.get())));

		this.add(HexcraftBlocks.CRIMSON_STONE.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.CRIMSON_STONE.get(), Item.byBlock(HexcraftBlocks.CRIMSON_COBBLESTONE.get())));

		this.add(HexcraftBlocks.UNDER_WORLD_STONE.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.UNDER_WORLD_STONE.get(), Item.byBlock(HexcraftBlocks.UNDER_WORLD_COBBLESTONE.get())));

		this.add(HexcraftBlocks.CHARSTONE.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.CHARSTONE.get(), Item.byBlock(HexcraftBlocks.CHARSTONE_COBBLESTONE.get())));

		this.add(HexcraftBlocks.MOONSTONE_ORE.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.MOONSTONE_ORE.get(), HexcraftItems.MOONSTONE.get()));

		this.add(HexcraftBlocks.DEEPSLATE_MOONSTONE_ORE.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.DEEPSLATE_MOONSTONE_ORE.get(), HexcraftItems.MOONSTONE.get()));

		this.add(HexcraftBlocks.NETHER_MOONSTONE_ORE.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.NETHER_MOONSTONE_ORE.get(), HexcraftItems.MOONSTONE.get()));

		this.add(HexcraftBlocks.END_MOONSTONE_ORE.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.END_MOONSTONE_ORE.get(), HexcraftItems.MOONSTONE.get()));

		this.add(HexcraftBlocks.SILVER_ORE.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.SILVER_ORE.get(), HexcraftItems.RAW_SILVER.get()));

		this.add(HexcraftBlocks.DEEPSLATE_SILVER_ORE.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.DEEPSLATE_SILVER_ORE.get(), HexcraftItems.RAW_SILVER.get()));

		this.add(HexcraftBlocks.NETHER_SILVER_ORE.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.NETHER_SILVER_ORE.get(), HexcraftItems.RAW_SILVER.get()));

		this.add(HexcraftBlocks.END_SILVER_ORE.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.END_SILVER_ORE.get(), HexcraftItems.RAW_SILVER.get()));

		this.add(HexcraftBlocks.VAMPIRIC_ORE.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.VAMPIRIC_ORE.get(), HexcraftItems.VAMPIRIC_GEM.get()));

		this.add(HexcraftBlocks.DEEPSLATE_VAMPIRIC_ORE.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.DEEPSLATE_VAMPIRIC_ORE.get(), HexcraftItems.VAMPIRIC_GEM.get()));

		this.add(HexcraftBlocks.NETHER_VAMPIRIC_ORE.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.NETHER_VAMPIRIC_ORE.get(), HexcraftItems.VAMPIRIC_GEM.get()));

		this.add(HexcraftBlocks.END_VAMPIRIC_ORE.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.END_VAMPIRIC_ORE.get(), HexcraftItems.VAMPIRIC_GEM.get()));

		this.add(HexcraftBlocks.NYKIUM_ORE.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.NYKIUM_ORE.get(), HexcraftItems.RAW_BLOODY_NYKIUM.get()));

		this.add(HexcraftBlocks.TRENOGEN_ORE.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.TRENOGEN_ORE.get(), HexcraftItems.RAW_CUROGEN.get()));

		this.add(HexcraftBlocks.DEEPSLATE_TRENOGEN_ORE.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.DEEPSLATE_TRENOGEN_ORE.get(), HexcraftItems.RAW_CUROGEN.get()));

		this.add(HexcraftBlocks.JORMUIM_ORE.get(),
				block -> createCopperLikeOreDrops(HexcraftBlocks.JORMUIM_ORE.get(), HexcraftItems.RAW_JORMIUM.get()));


		LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
				.hasBlockStateProperties(HexcraftBlocks.AERPINE_FLOWER.get())
				.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3))
				.or(LootItemBlockStatePropertyCondition
						.hasBlockStateProperties(HexcraftBlocks.AERPINE_FLOWER.get())
						.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3)));

		LootItemCondition.Builder lootitemcondition$builder2 = LootItemBlockStatePropertyCondition
				.hasBlockStateProperties(HexcraftBlocks.BELLADONNA_PLANT.get())
				.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3))
				.or(LootItemBlockStatePropertyCondition
						.hasBlockStateProperties(HexcraftBlocks.BELLADONNA_PLANT.get())
						.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3)));

		LootItemCondition.Builder lootitemcondition$builder3 = LootItemBlockStatePropertyCondition
				.hasBlockStateProperties(HexcraftBlocks.GARLIC_PLANT.get())
				.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 2))
				.or(LootItemBlockStatePropertyCondition
						.hasBlockStateProperties(HexcraftBlocks.GARLIC_PLANT.get())
						.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 2)));

		LootItemCondition.Builder lootitemcondition$builder4 = LootItemBlockStatePropertyCondition
				.hasBlockStateProperties(HexcraftBlocks.HELLEBORE_PLANT.get())
				.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3))
				.or(LootItemBlockStatePropertyCondition
						.hasBlockStateProperties(HexcraftBlocks.HELLEBORE_PLANT.get())
						.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3)));

		LootItemCondition.Builder lootitemcondition$builder5 = LootItemBlockStatePropertyCondition
				.hasBlockStateProperties(HexcraftBlocks.IRENIAL_FLOWER.get())
				.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3))
				.or(LootItemBlockStatePropertyCondition
						.hasBlockStateProperties(HexcraftBlocks.IRENIAL_FLOWER.get())
						.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3)));

		LootItemCondition.Builder lootitemcondition$builder6 = LootItemBlockStatePropertyCondition
				.hasBlockStateProperties(HexcraftBlocks.MANDRAKE_FLOWER.get())
				.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3))
				.or(LootItemBlockStatePropertyCondition
						.hasBlockStateProperties(HexcraftBlocks.MANDRAKE_FLOWER.get())
						.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3)));

		LootItemCondition.Builder lootitemcondition$builder7 = LootItemBlockStatePropertyCondition
				.hasBlockStateProperties(HexcraftBlocks.MIRA_FLOWER.get())
				.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3))
				.or(LootItemBlockStatePropertyCondition
						.hasBlockStateProperties(HexcraftBlocks.MIRA_FLOWER.get())
						.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3)));

		LootItemCondition.Builder lootitemcondition$builder8 = LootItemBlockStatePropertyCondition
				.hasBlockStateProperties(HexcraftBlocks.PERENNIA_FLOWER.get())
				.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3))
				.or(LootItemBlockStatePropertyCondition
						.hasBlockStateProperties(HexcraftBlocks.PERENNIA_FLOWER.get())
						.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3)));

		LootItemCondition.Builder lootitemcondition$builder9 = LootItemBlockStatePropertyCondition
				.hasBlockStateProperties(HexcraftBlocks.SAGE_PLANT.get())
				.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3))
				.or(LootItemBlockStatePropertyCondition
						.hasBlockStateProperties(HexcraftBlocks.SAGE_PLANT.get())
						.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3)));

		LootItemCondition.Builder lootitemcondition$builder10 = LootItemBlockStatePropertyCondition
				.hasBlockStateProperties(HexcraftBlocks.SENIA_FLOWER.get())
				.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3))
				.or(LootItemBlockStatePropertyCondition
						.hasBlockStateProperties(HexcraftBlocks.SENIA_FLOWER.get())
						.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3)));

		LootItemCondition.Builder lootitemcondition$builder11 = LootItemBlockStatePropertyCondition
				.hasBlockStateProperties(HexcraftBlocks.VERVAIN_FLOWER.get())
				.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3))
				.or(LootItemBlockStatePropertyCondition
						.hasBlockStateProperties(HexcraftBlocks.VERVAIN_FLOWER.get())
						.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3)));

		LootItemCondition.Builder lootitemcondition$builder12 = LootItemBlockStatePropertyCondition
				.hasBlockStateProperties(HexcraftBlocks.WATER_ARTICHOKE_PLANT.get())
				.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3))
				.or(LootItemBlockStatePropertyCondition
						.hasBlockStateProperties(HexcraftBlocks.WATER_ARTICHOKE_PLANT.get())
						.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3)));

		LootItemCondition.Builder lootitemcondition$builder13 = LootItemBlockStatePropertyCondition
				.hasBlockStateProperties(HexcraftBlocks.WOLFSBANE_FLOWER.get())
				.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3))
				.or(LootItemBlockStatePropertyCondition
						.hasBlockStateProperties(HexcraftBlocks.WOLFSBANE_FLOWER.get())
						.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3)));

		LootItemCondition.Builder lootitemcondition$builder14 = LootItemBlockStatePropertyCondition
				.hasBlockStateProperties(HexcraftBlocks.WORMWOOD_PLANT.get())
				.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3))
				.or(LootItemBlockStatePropertyCondition
						.hasBlockStateProperties(HexcraftBlocks.WORMWOOD_PLANT.get())
						.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3)));

		LootItemCondition.Builder lootitemcondition$builder15 = LootItemBlockStatePropertyCondition
				.hasBlockStateProperties(HexcraftBlocks.XERIFAE_FLOWER.get())
				.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3))
				.or(LootItemBlockStatePropertyCondition
						.hasBlockStateProperties(HexcraftBlocks.XERIFAE_FLOWER.get())
						.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(AerpinePlantBlock.AGE, 3)));



		this.add(HexcraftBlocks.AERPINE_FLOWER.get(), createCropDrops(HexcraftBlocks.AERPINE_FLOWER.get(), HexcraftItems.AERPINE.get(),
				HexcraftItems.AERPINE_SEEDS.get(), lootitemcondition$builder));

		this.add(HexcraftBlocks.BELLADONNA_PLANT.get(), createCropDrops(HexcraftBlocks.BELLADONNA_PLANT.get(), HexcraftItems.BELLADONNA.get(),
				HexcraftItems.BELLADONNA_SEEDS.get(), lootitemcondition$builder2));

		this.add(HexcraftBlocks.GARLIC_PLANT.get(), createCropDrops(HexcraftBlocks.GARLIC_PLANT.get(), HexcraftItems.GARLIC.get(),
				HexcraftItems.GARLIC.get(), lootitemcondition$builder3));

		this.add(HexcraftBlocks.HELLEBORE_PLANT.get(), createCropDrops(HexcraftBlocks.HELLEBORE_PLANT.get(), HexcraftItems.HELLEBORE.get(),
				HexcraftItems.HELLEBORE_SEEDS.get(), lootitemcondition$builder4));

		this.add(HexcraftBlocks.IRENIAL_FLOWER.get(), createCropDrops(HexcraftBlocks.IRENIAL_FLOWER.get(), HexcraftItems.IRENIAL.get(),
				HexcraftItems.IRENIAL_SEEDS.get(), lootitemcondition$builder5));

		this.add(HexcraftBlocks.MANDRAKE_FLOWER.get(), createCropDrops(HexcraftBlocks.MANDRAKE_FLOWER.get(), HexcraftItems.MANDRAKE_ROOT.get(),
				HexcraftItems.MANDRAKE_SEEDS.get(), lootitemcondition$builder6));

		this.add(HexcraftBlocks.MIRA_FLOWER.get(), createCropDrops(HexcraftBlocks.MIRA_FLOWER.get(), HexcraftItems.MIRA.get(),
				HexcraftItems.MIRA_SEEDS.get(), lootitemcondition$builder7));

		this.add(HexcraftBlocks.PERENNIA_FLOWER.get(), createCropDrops(HexcraftBlocks.PERENNIA_FLOWER.get(), HexcraftItems.PERENNIA.get(),
				HexcraftItems.PERENNIA_SEEDS.get(), lootitemcondition$builder8));

		this.add(HexcraftBlocks.SAGE_PLANT.get(), createCropDrops(HexcraftBlocks.SAGE_PLANT.get(), HexcraftItems.SAGE.get(),
				HexcraftItems.SAGE_SEEDS.get(), lootitemcondition$builder9));

		this.add(HexcraftBlocks.SENIA_FLOWER.get(), createCropDrops(HexcraftBlocks.SENIA_FLOWER.get(), HexcraftItems.SENIA.get(),
				HexcraftItems.SENIA_SEEDS.get(), lootitemcondition$builder10));

		this.add(HexcraftBlocks.VERVAIN_FLOWER.get(), createCropDrops(HexcraftBlocks.VERVAIN_FLOWER.get(), HexcraftItems.VERVAIN.get(),
				HexcraftItems.VERVAIN_SEEDS.get(), lootitemcondition$builder11));

		this.add(HexcraftBlocks.WATER_ARTICHOKE_PLANT.get(), createCropDrops(HexcraftBlocks.WATER_ARTICHOKE_PLANT.get(), HexcraftItems.WATER_ARTICHOKE.get(),
				HexcraftItems.WATER_ARTICHOKE_SEEDS.get(), lootitemcondition$builder12));

		this.add(HexcraftBlocks.WOLFSBANE_FLOWER.get(), createCropDrops(HexcraftBlocks.WOLFSBANE_FLOWER.get(), HexcraftItems.WOLFSBANE.get(),
				HexcraftItems.WOLFSBANE_SEEDS.get(), lootitemcondition$builder13));

		this.add(HexcraftBlocks.WORMWOOD_PLANT.get(), createCropDrops(HexcraftBlocks.WORMWOOD_PLANT.get(), HexcraftItems.WORMWOOD.get(),
				HexcraftItems.WORMWOOD_SEEDS.get(), lootitemcondition$builder14));

		this.add(HexcraftBlocks.XERIFAE_FLOWER.get(), createCropDrops(HexcraftBlocks.XERIFAE_FLOWER.get(), HexcraftItems.XERIFAE.get(),
				HexcraftItems.XERIFAE_SEEDS.get(), lootitemcondition$builder15));

	}

	private void dropOther(Item item) {
	}

	protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
		return createSilkTouchDispatchTable(pBlock,
				this.applyExplosionDecay(pBlock,
						LootItem.lootTableItem(item)
								.apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
								.apply(ApplyBonusCount.addOreBonusCount(Enchantments.SILK_TOUCH))));

	}


	@Override
	protected Iterable<Block> getKnownBlocks() {
		return HexcraftBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
	}
}