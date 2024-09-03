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

		this.dropSelf(HexcraftBlocks.WISPY_COTTON.get());

		this.add(HexcraftBlocks.POTTED_WISPY_COTTON.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_WISPY_COTTON.get()));

		this.dropSelf(HexcraftBlocks.SOUL_FLOWER.get());

		this.add(HexcraftBlocks.POTTED_SOUL_FLOWER.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_SOUL_FLOWER.get()));

		this.dropSelf(HexcraftBlocks.BLOODY_ROSE.get());

		this.add(HexcraftBlocks.POTTED_BLOODY_ROSE.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_BLOODY_ROSE.get()));

		this.dropSelf(HexcraftBlocks.BLOOD_MUSHROOM.get());

		this.add(HexcraftBlocks.POTTED_BLOOD_MUSHROOM.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_BLOOD_MUSHROOM.get()));

		this.dropSelf(HexcraftBlocks.VILESHROOM.get());

		this.add(HexcraftBlocks.POTTED_VILESHROOM.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_VILESHROOM.get()));

		this.dropSelf(HexcraftBlocks.GHOSTSHROOM.get());

		this.add(HexcraftBlocks.POTTED_GHOSTSHROOM.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_GHOSTSHROOM.get()));

		this.dropSelf(HexcraftBlocks.WILD_BRAMBLE.get());

		this.dropSelf(HexcraftBlocks.ENDER_BRAMBLE.get());

		this.dropSelf(HexcraftBlocks.CRIMSON_MAGMA.get());

		this.dropSelf(HexcraftBlocks.GLINT_WEED.get());

		this.dropSelf(HexcraftBlocks.SPANISH_MOSS.get());

		this.dropSelf(HexcraftBlocks.EMBER_MOSS_BLOCK.get());

		this.dropSelf(HexcraftBlocks.EMBER_MOSS_CARPET.get());

		this.dropSelf(HexcraftBlocks.LIVING_KELP_BLOCK.get());

		this.dropSelf(HexcraftBlocks.EMBER_MOSS.get());

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

		this.add(HexcraftBlocks.POTTED_EBONY_SAPLING.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_EBONY_SAPLING.get()));

		this.dropSelf(HexcraftBlocks.BLOOD_OAK_SAPLING.get());

		this.add(HexcraftBlocks.POTTED_BLOOD_OAK_SAPLING.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_BLOOD_OAK_SAPLING.get()));

		this.dropSelf(HexcraftBlocks.HELL_BARK_SAPLING.get());

		this.add(HexcraftBlocks.POTTED_HELL_BARK_SAPLING.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_HELL_BARK_SAPLING.get()));

		this.dropSelf(HexcraftBlocks.WHITE_OAK_SAPLING.get());

		this.add(HexcraftBlocks.POTTED_WHITE_OAK_SAPLING.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_WHITE_OAK_SAPLING.get()));

		this.dropSelf(HexcraftBlocks.ALDER_SAPLING.get());

		this.add(HexcraftBlocks.POTTED_ALDER_SAPLING.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_ALDER_SAPLING.get()));

		this.dropSelf(HexcraftBlocks.WITCH_HAZEL_SAPLING.get());

		this.add(HexcraftBlocks.POTTED_WITCH_HAZEL_SAPLING.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_WITCH_HAZEL_SAPLING.get()));

		this.dropSelf(HexcraftBlocks.WILLOW_SAPLING.get());

		this.add(HexcraftBlocks.POTTED_WILLOW_SAPLING.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_WILLOW_SAPLING.get()));

		this.dropSelf(HexcraftBlocks.HAWTHORN_SAPLING.get());

		this.add(HexcraftBlocks.POTTED_HAWTHORN_SAPLING.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_HAWTHORN_SAPLING.get()));

		this.dropSelf(HexcraftBlocks.CEDAR_SAPLING.get());

		this.add(HexcraftBlocks.POTTED_CEDAR_SAPLING.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_CEDAR_SAPLING.get()));

		this.dropSelf(HexcraftBlocks.DISTORTED_SAPLING.get());

		this.add(HexcraftBlocks.POTTED_DISTORTED_SAPLING.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_DISTORTED_SAPLING.get()));

		this.dropSelf(HexcraftBlocks.ELDER_SAPLING.get());

		this.add(HexcraftBlocks.POTTED_ELDER_SAPLING.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_ELDER_SAPLING.get()));

		this.dropSelf(HexcraftBlocks.JUNIPER_SAPLING.get());

		this.add(HexcraftBlocks.POTTED_JUNIPER_SAPLING.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_JUNIPER_SAPLING.get()));

		this.dropSelf(HexcraftBlocks.ROWAN_SAPLING.get());

		this.add(HexcraftBlocks.POTTED_ROWAN_SAPLING.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_ROWAN_SAPLING.get()));

		this.dropSelf(HexcraftBlocks.TWISTED_SAPLING.get());

		this.add(HexcraftBlocks.POTTED_TWISTED_SAPLING.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_TWISTED_SAPLING.get()));

		this.dropSelf(HexcraftBlocks.WITCH_WOOD_SAPLING.get());

		this.add(HexcraftBlocks.POTTED_WITCH_WOOD_SAPLING.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_WITCH_WOOD_SAPLING.get()));

		this.dropSelf(HexcraftBlocks.ECHO_WOOD_SAPLING.get());

		this.add(HexcraftBlocks.POTTED_ECHO_WOOD_SAPLING.get(),
				createPotFlowerItemTable(HexcraftBlocks.POTTED_ECHO_WOOD_SAPLING.get()));

		this.add(HexcraftBlocks.EBONY_LEAVES.get(), block ->
				createLeavesDrops(block, HexcraftBlocks.EBONY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

		this.add(HexcraftBlocks.BLOOD_OAK_LEAVES.get(), block ->
				createOakLeavesDrops(block, HexcraftBlocks.BLOOD_OAK_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

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

		this.dropSelf(HexcraftBlocks.VILESHROOM_LAMP.get());

		this.dropSelf(HexcraftBlocks.GHOSTSHROOM_LAMP.get());

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

		this.dropSelf(HexcraftBlocks.CRIMSON_SAND.get());

		this.dropSelf(HexcraftBlocks.CRIMSON_SAND_STONE.get());

		this.dropSelf(HexcraftBlocks.SMOOTH_CRIMSON_SAND_STONE.get());

		this.dropSelf(HexcraftBlocks.CHISELED_CRIMSON_SAND_STONE.get());

		this.dropSelf(HexcraftBlocks.CUT_CRIMSON_SAND_STONE.get());

		this.dropSelf(HexcraftBlocks.FAIRY_SAND.get());

		this.dropSelf(HexcraftBlocks.FAIRY_SAND_STONE.get());

		this.dropSelf(HexcraftBlocks.SMOOTH_FAIRY_SAND_STONE.get());

		this.dropSelf(HexcraftBlocks.CHISELED_FAIRY_SAND_STONE.get());

		this.dropSelf(HexcraftBlocks.CUT_FAIRY_SAND_STONE.get());

		this.dropWhenSilkTouch(HexcraftBlocks.CRIMSON_GLASS.get());

		this.dropWhenSilkTouch(HexcraftBlocks.CRIMSON_GLASS_PANE.get());

		this.dropWhenSilkTouch(HexcraftBlocks.FAIRY_GLASS.get());

		this.dropWhenSilkTouch(HexcraftBlocks.FAIRY_GLASS_PANE.get());

		this.dropWhenSilkTouch(HexcraftBlocks.CRIMSON_ICE.get());

		this.dropWhenSilkTouch(HexcraftBlocks.CRIMSON_PACKED_ICE.get());

		this.dropSelf(HexcraftBlocks.PEARL_STONE_WALL.get());

		this.dropSelf(HexcraftBlocks.CRIMSON_STONE_WALL.get());

		this.dropSelf(HexcraftBlocks.UNDER_WORLD_STONE_WALL.get());

		this.dropSelf(HexcraftBlocks.CHARSTONE_WALL.get());

		this.dropSelf(HexcraftBlocks.CRIMSON_SAND_STONE_WALL.get());

		this.dropSelf(HexcraftBlocks.FAIRY_SAND_STONE_WALL.get());

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

		this.dropSelf(HexcraftBlocks.CRIMSON_SAND_STONE_STAIRS.get());

		this.dropSelf(HexcraftBlocks.SMOOTH_CRIMSON_SAND_STONE_STAIRS.get());

		this.dropSelf(HexcraftBlocks.FAIRY_SAND_STONE_STAIRS.get());

		this.dropSelf(HexcraftBlocks.SMOOTH_FAIRY_SAND_STONE_STAIRS.get());

		this.dropSelf(HexcraftBlocks.EBONY_STAIRS.get());

		this.dropSelf(HexcraftBlocks.BLOOD_OAK_STAIRS.get());

		this.dropSelf(HexcraftBlocks.HELL_BARK_STAIRS.get());

		this.dropSelf(HexcraftBlocks.WHITE_OAK_STAIRS.get());

		this.dropSelf(HexcraftBlocks.ALDER_STAIRS.get());

		this.dropSelf(HexcraftBlocks.WITCH_HAZEL_STAIRS.get());

		this.dropSelf(HexcraftBlocks.WILLOW_STAIRS.get());

		this.dropSelf(HexcraftBlocks.HAWTHORN_STAIRS.get());

		this.dropSelf(HexcraftBlocks.CEDAR_STAIRS.get());

		this.dropSelf(HexcraftBlocks.DISTORTED_STAIRS.get());

		this.dropSelf(HexcraftBlocks.ELDER_STAIRS.get());

		this.dropSelf(HexcraftBlocks.JUNIPER_STAIRS.get());

		this.dropSelf(HexcraftBlocks.ROWAN_STAIRS.get());

		this.dropSelf(HexcraftBlocks.TWISTED_STAIRS.get());

		this.dropSelf(HexcraftBlocks.WITCH_WOOD_STAIRS.get());

		this.dropSelf(HexcraftBlocks.ECHO_WOOD_STAIRS.get());

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

		this.dropSelf(HexcraftBlocks.CRIMSON_SAND_STONE_SLAB.get());

		this.dropSelf(HexcraftBlocks.SMOOTH_CRIMSON_SAND_STONE_SLAB.get());

		this.dropSelf(HexcraftBlocks.CUT_CRIMSON_SAND_STONE_SLAB.get());

		this.dropSelf(HexcraftBlocks.FAIRY_SAND_STONE_SLAB.get());

		this.dropSelf(HexcraftBlocks.SMOOTH_FAIRY_SAND_STONE_SLAB.get());

		this.dropSelf(HexcraftBlocks.CUT_FAIRY_SAND_STONE_SLAB.get());

		this.dropSelf(HexcraftBlocks.EBONY_SLAB.get());

		this.dropSelf(HexcraftBlocks.BLOOD_OAK_SLAB.get());

		this.dropSelf(HexcraftBlocks.HELL_BARK_SLAB.get());

		this.dropSelf(HexcraftBlocks.WHITE_OAK_SLAB.get());

		this.dropSelf(HexcraftBlocks.ALDER_SLAB.get());

		this.dropSelf(HexcraftBlocks.WITCH_HAZEL_SLAB.get());

		this.dropSelf(HexcraftBlocks.WILLOW_SLAB.get());

		this.dropSelf(HexcraftBlocks.HAWTHORN_SLAB.get());

		this.dropSelf(HexcraftBlocks.CEDAR_SLAB.get());

		this.dropSelf(HexcraftBlocks.DISTORTED_SLAB.get());

		this.dropSelf(HexcraftBlocks.ELDER_SLAB.get());

		this.dropSelf(HexcraftBlocks.JUNIPER_SLAB.get());

		this.dropSelf(HexcraftBlocks.ROWAN_SLAB.get());

		this.dropSelf(HexcraftBlocks.TWISTED_SLAB.get());

		this.dropSelf(HexcraftBlocks.WITCH_WOOD_SLAB.get());

		this.dropSelf(HexcraftBlocks.ECHO_WOOD_SLAB.get());

		this.dropSelf(HexcraftBlocks.PEARL_STONE_BUTTON.get());

		this.dropSelf(HexcraftBlocks.CRIMSON_STONE_BUTTON.get());

		this.dropSelf(HexcraftBlocks.UNDER_WORLD_STONE_BUTTON.get());

		this.dropSelf(HexcraftBlocks.CHARSTONE_BUTTON.get());

		this.dropSelf(HexcraftBlocks.EBONY_BUTTON.get());

		this.dropSelf(HexcraftBlocks.BLOOD_OAK_BUTTON.get());

		this.dropSelf(HexcraftBlocks.HELL_BARK_BUTTON.get());

		this.dropSelf(HexcraftBlocks.WHITE_OAK_BUTTON.get());

		this.dropSelf(HexcraftBlocks.ALDER_BUTTON.get());

		this.dropSelf(HexcraftBlocks.WITCH_HAZEL_BUTTON.get());

		this.dropSelf(HexcraftBlocks.WILLOW_BUTTON.get());

		this.dropSelf(HexcraftBlocks.HAWTHORN_BUTTON.get());

		this.dropSelf(HexcraftBlocks.CEDAR_BUTTON.get());

		this.dropSelf(HexcraftBlocks.DISTORTED_BUTTON.get());

		this.dropSelf(HexcraftBlocks.ELDER_BUTTON.get());

		this.dropSelf(HexcraftBlocks.JUNIPER_BUTTON.get());

		this.dropSelf(HexcraftBlocks.ROWAN_BUTTON.get());

		this.dropSelf(HexcraftBlocks.TWISTED_BUTTON.get());

		this.dropSelf(HexcraftBlocks.WITCH_WOOD_BUTTON.get());

		this.dropSelf(HexcraftBlocks.ECHO_WOOD_BUTTON.get());

		this.dropSelf(HexcraftBlocks.EBONY_FENCE.get());

		this.dropSelf(HexcraftBlocks.BLOOD_OAK_FENCE.get());

		this.dropSelf(HexcraftBlocks.HELL_BARK_FENCE.get());

		this.dropSelf(HexcraftBlocks.WHITE_OAK_FENCE.get());

		this.dropSelf(HexcraftBlocks.ALDER_FENCE.get());

		this.dropSelf(HexcraftBlocks.WITCH_HAZEL_FENCE.get());

		this.dropSelf(HexcraftBlocks.WILLOW_FENCE.get());

		this.dropSelf(HexcraftBlocks.HAWTHORN_FENCE.get());

		this.dropSelf(HexcraftBlocks.CEDAR_FENCE.get());

		this.dropSelf(HexcraftBlocks.DISTORTED_FENCE.get());

		this.dropSelf(HexcraftBlocks.ELDER_FENCE.get());

		this.dropSelf(HexcraftBlocks.JUNIPER_FENCE.get());

		this.dropSelf(HexcraftBlocks.ROWAN_FENCE.get());

		this.dropSelf(HexcraftBlocks.TWISTED_FENCE.get());

		this.dropSelf(HexcraftBlocks.WITCH_WOOD_FENCE.get());

		this.dropSelf(HexcraftBlocks.ECHO_WOOD_FENCE.get());

		this.dropSelf(HexcraftBlocks.EBONY_FENCE_GATE.get());

		this.dropSelf(HexcraftBlocks.BLOOD_OAK_FENCE_GATE.get());

		this.dropSelf(HexcraftBlocks.HELL_BARK_FENCE_GATE.get());

		this.dropSelf(HexcraftBlocks.WHITE_OAK_FENCE_GATE.get());

		this.dropSelf(HexcraftBlocks.ALDER_FENCE_GATE.get());

		this.dropSelf(HexcraftBlocks.WITCH_HAZEL_FENCE_GATE.get());

		this.dropSelf(HexcraftBlocks.WILLOW_FENCE_GATE.get());

		this.dropSelf(HexcraftBlocks.HAWTHORN_FENCE_GATE.get());

		this.dropSelf(HexcraftBlocks.CEDAR_FENCE_GATE.get());

		this.dropSelf(HexcraftBlocks.DISTORTED_FENCE_GATE.get());

		this.dropSelf(HexcraftBlocks.ELDER_FENCE_GATE.get());

		this.dropSelf(HexcraftBlocks.JUNIPER_FENCE_GATE.get());

		this.dropSelf(HexcraftBlocks.ROWAN_FENCE_GATE.get());

		this.dropSelf(HexcraftBlocks.TWISTED_FENCE_GATE.get());

		this.dropSelf(HexcraftBlocks.WITCH_WOOD_FENCE_GATE.get());

		this.dropSelf(HexcraftBlocks.ECHO_WOOD_FENCE_GATE.get());

		this.add(HexcraftBlocks.EBONY_DOOR.get(),
				block -> createDoorTable(HexcraftBlocks.EBONY_DOOR.get()));

		this.add(HexcraftBlocks.BLOOD_OAK_DOOR.get(),
				block -> createDoorTable(HexcraftBlocks.BLOOD_OAK_DOOR.get()));

		this.add(HexcraftBlocks.HELL_BARK_DOOR.get(),
				block -> createDoorTable(HexcraftBlocks.HELL_BARK_DOOR.get()));

		this.add(HexcraftBlocks.WHITE_OAK_DOOR.get(),
				block -> createDoorTable(HexcraftBlocks.WHITE_OAK_DOOR.get()));

		this.add(HexcraftBlocks.ALDER_DOOR.get(),
				block -> createDoorTable(HexcraftBlocks.ALDER_DOOR.get()));

		this.add(HexcraftBlocks.WITCH_HAZEL_DOOR.get(),
				block -> createDoorTable(HexcraftBlocks.WITCH_HAZEL_DOOR.get()));

		this.add(HexcraftBlocks.WILLOW_DOOR.get(),
				block -> createDoorTable(HexcraftBlocks.WILLOW_DOOR.get()));

		this.add(HexcraftBlocks.HAWTHORN_DOOR.get(),
				block -> createDoorTable(HexcraftBlocks.HAWTHORN_DOOR.get()));

		this.add(HexcraftBlocks.CEDAR_DOOR.get(),
				block -> createDoorTable(HexcraftBlocks.CEDAR_DOOR.get()));

		this.add(HexcraftBlocks.DISTORTED_DOOR.get(),
				block -> createDoorTable(HexcraftBlocks.DISTORTED_DOOR.get()));

		this.add(HexcraftBlocks.ELDER_DOOR.get(),
				block -> createDoorTable(HexcraftBlocks.ELDER_DOOR.get()));

		this.add(HexcraftBlocks.JUNIPER_DOOR.get(),
				block -> createDoorTable(HexcraftBlocks.JUNIPER_DOOR.get()));

		this.add(HexcraftBlocks.ROWAN_DOOR.get(),
				block -> createDoorTable(HexcraftBlocks.ROWAN_DOOR.get()));

		this.add(HexcraftBlocks.TWISTED_DOOR.get(),
				block -> createDoorTable(HexcraftBlocks.TWISTED_DOOR.get()));

		this.add(HexcraftBlocks.WITCH_WOOD_DOOR.get(),
				block -> createDoorTable(HexcraftBlocks.WITCH_WOOD_DOOR.get()));

		this.add(HexcraftBlocks.ECHO_WOOD_DOOR.get(),
				block -> createDoorTable(HexcraftBlocks.ECHO_WOOD_DOOR.get()));

		this.dropSelf(HexcraftBlocks.EBONY_TRAPDOOR.get());

		this.dropSelf(HexcraftBlocks.BLOOD_OAK_TRAPDOOR.get());

		this.dropSelf(HexcraftBlocks.HELL_BARK_TRAPDOOR.get());

		this.dropSelf(HexcraftBlocks.WHITE_OAK_TRAPDOOR.get());

		this.dropSelf(HexcraftBlocks.ALDER_TRAPDOOR.get());

		this.dropSelf(HexcraftBlocks.WITCH_HAZEL_TRAPDOOR.get());

		this.dropSelf(HexcraftBlocks.WILLOW_TRAPDOOR.get());

		this.dropSelf(HexcraftBlocks.HAWTHORN_TRAPDOOR.get());

		this.dropSelf(HexcraftBlocks.CEDAR_TRAPDOOR.get());

		this.dropSelf(HexcraftBlocks.DISTORTED_TRAPDOOR.get());

		this.dropSelf(HexcraftBlocks.ELDER_TRAPDOOR.get());

		this.dropSelf(HexcraftBlocks.JUNIPER_TRAPDOOR.get());

		this.dropSelf(HexcraftBlocks.ROWAN_TRAPDOOR.get());

		this.dropSelf(HexcraftBlocks.TWISTED_TRAPDOOR.get());

		this.dropSelf(HexcraftBlocks.WITCH_WOOD_TRAPDOOR.get());

		this.dropSelf(HexcraftBlocks.ECHO_WOOD_TRAPDOOR.get());

		this.dropSelf(HexcraftBlocks.PEARL_STONE_PRESSURE_PLATE.get());

		this.dropSelf(HexcraftBlocks.CRIMSON_STONE_PRESSURE_PLATE.get());

		this.dropSelf(HexcraftBlocks.UNDER_WORLD_STONE_PRESSURE_PLATE.get());

		this.dropSelf(HexcraftBlocks.CHARSTONE_PRESSURE_PLATE.get());

		this.dropSelf(HexcraftBlocks.EBONY_PRESSURE_PLATE.get());

		this.dropSelf(HexcraftBlocks.BLOOD_OAK_PRESSURE_PLATE.get());

		this.dropSelf(HexcraftBlocks.HELL_BARK_PRESSURE_PLATE.get());

		this.dropSelf(HexcraftBlocks.WHITE_OAK_PRESSURE_PLATE.get());

		this.dropSelf(HexcraftBlocks.ALDER_PRESSURE_PLATE.get());

		this.dropSelf(HexcraftBlocks.WITCH_HAZEL_PRESSURE_PLATE.get());

		this.dropSelf(HexcraftBlocks.WILLOW_PRESSURE_PLATE.get());

		this.dropSelf(HexcraftBlocks.HAWTHORN_PRESSURE_PLATE.get());

		this.dropSelf(HexcraftBlocks.CEDAR_PRESSURE_PLATE.get());

		this.dropSelf(HexcraftBlocks.DISTORTED_PRESSURE_PLATE.get());

		this.dropSelf(HexcraftBlocks.ELDER_PRESSURE_PLATE.get());

		this.dropSelf(HexcraftBlocks.JUNIPER_PRESSURE_PLATE.get());

		this.dropSelf(HexcraftBlocks.ROWAN_PRESSURE_PLATE.get());

		this.dropSelf(HexcraftBlocks.TWISTED_PRESSURE_PLATE.get());

		this.dropSelf(HexcraftBlocks.WITCH_WOOD_PRESSURE_PLATE.get());

		this.dropSelf(HexcraftBlocks.ECHO_WOOD_PRESSURE_PLATE.get());

		this.dropSelf(HexcraftBlocks.MAGIC_CRYSTAL_BLOCK.get());

		this.dropOther(HexcraftBlocks.MAGIC_CRYSTAL_CLUSTER.get(), HexcraftItems.MAGIC_CRYSTAL.get());

		this.dropOther(HexcraftBlocks.LARGE_MAGIC_CRYSTAL_BUD.get(), HexcraftItems.MAGIC_CRYSTAL.get());

		this.dropOther(HexcraftBlocks.WITCHES_LADDER.get(), HexcraftItems.WITCHES_LADDER_ITEM.get());;

		this.dropOther(HexcraftBlocks.LIVING_KELP.get(), HexcraftItems.LIVING_KELP_ITEM.get());;

		this.dropOther(HexcraftBlocks.VILEVINE.get(), HexcraftItems.VILEVINE_ITEM.get());;

		this.dropOther(HexcraftBlocks.BLOOD_MUSHROOM_BLOCK.get(), HexcraftBlocks.BLOOD_MUSHROOM.get());

		this.dropOther(HexcraftBlocks.BLOOD_MUSHROOM_STEM.get(), HexcraftBlocks.BLOOD_MUSHROOM.get());

		this.dropOther(HexcraftBlocks.VILESHROOM_BLOCK.get(), HexcraftBlocks.VILESHROOM.get());

		this.dropOther(HexcraftBlocks.VILESHROOM_STEM.get(), HexcraftBlocks.VILESHROOM.get());

		this.dropOther(HexcraftBlocks.GHOSTSHROOM_BLOCK.get(), HexcraftBlocks.GHOSTSHROOM.get());

		this.dropOther(HexcraftBlocks.GHOSTSHROOM_STEM.get(), HexcraftBlocks.GHOSTSHROOM.get());

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


		this.add(HexcraftBlocks.EBONY_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.EBONY_SIGN.get()));
		this.add(HexcraftBlocks.EBONY_WALL_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.EBONY_SIGN.get()));
		this.add(HexcraftBlocks.EBONY_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.EBONY_HANGING_SIGN.get()));
		this.add(HexcraftBlocks.EBONY_WALL_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.EBONY_HANGING_SIGN.get()));

		this.add(HexcraftBlocks.BLOOD_OAK_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.BLOOD_OAK_SIGN.get()));
		this.add(HexcraftBlocks.BLOOD_OAK_WALL_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.BLOOD_OAK_SIGN.get()));
		this.add(HexcraftBlocks.BLOOD_OAK_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.BLOOD_OAK_HANGING_SIGN.get()));
		this.add(HexcraftBlocks.BLOOD_OAK_WALL_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.BLOOD_OAK_HANGING_SIGN.get()));

		this.add(HexcraftBlocks.HELL_BARK_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.HELL_BARK_SIGN.get()));
		this.add(HexcraftBlocks.HELL_BARK_WALL_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.HELL_BARK_SIGN.get()));
		this.add(HexcraftBlocks.HELL_BARK_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.HELL_BARK_HANGING_SIGN.get()));
		this.add(HexcraftBlocks.HELL_BARK_WALL_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.HELL_BARK_HANGING_SIGN.get()));

		this.add(HexcraftBlocks.WHITE_OAK_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.WHITE_OAK_SIGN.get()));
		this.add(HexcraftBlocks.WHITE_OAK_WALL_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.WHITE_OAK_SIGN.get()));
		this.add(HexcraftBlocks.WHITE_OAK_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.WHITE_OAK_HANGING_SIGN.get()));
		this.add(HexcraftBlocks.WHITE_OAK_WALL_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.WHITE_OAK_HANGING_SIGN.get()));

		this.add(HexcraftBlocks.ALDER_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.ALDER_SIGN.get()));
		this.add(HexcraftBlocks.ALDER_WALL_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.ALDER_SIGN.get()));
		this.add(HexcraftBlocks.ALDER_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.ALDER_HANGING_SIGN.get()));
		this.add(HexcraftBlocks.ALDER_WALL_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.ALDER_HANGING_SIGN.get()));

		this.add(HexcraftBlocks.WITCH_HAZEL_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.WITCH_HAZEL_SIGN.get()));
		this.add(HexcraftBlocks.WITCH_HAZEL_WALL_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.WITCH_HAZEL_SIGN.get()));
		this.add(HexcraftBlocks.WITCH_HAZEL_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.WITCH_HAZEL_HANGING_SIGN.get()));
		this.add(HexcraftBlocks.WITCH_HAZEL_WALL_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.WITCH_HAZEL_HANGING_SIGN.get()));

		this.add(HexcraftBlocks.WILLOW_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.WILLOW_SIGN.get()));
		this.add(HexcraftBlocks.WILLOW_WALL_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.WILLOW_SIGN.get()));
		this.add(HexcraftBlocks.WILLOW_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.WILLOW_HANGING_SIGN.get()));
		this.add(HexcraftBlocks.WILLOW_WALL_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.WILLOW_HANGING_SIGN.get()));

		this.add(HexcraftBlocks.HAWTHORN_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.HAWTHORN_SIGN.get()));
		this.add(HexcraftBlocks.HAWTHORN_WALL_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.HAWTHORN_SIGN.get()));
		this.add(HexcraftBlocks.HAWTHORN_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.HAWTHORN_HANGING_SIGN.get()));
		this.add(HexcraftBlocks.HAWTHORN_WALL_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.HAWTHORN_HANGING_SIGN.get()));

		this.add(HexcraftBlocks.CEDAR_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.CEDAR_SIGN.get()));
		this.add(HexcraftBlocks.CEDAR_WALL_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.CEDAR_SIGN.get()));
		this.add(HexcraftBlocks.CEDAR_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.CEDAR_HANGING_SIGN.get()));
		this.add(HexcraftBlocks.CEDAR_WALL_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.CEDAR_HANGING_SIGN.get()));

		this.add(HexcraftBlocks.DISTORTED_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.DISTORTED_SIGN.get()));
		this.add(HexcraftBlocks.DISTORTED_WALL_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.DISTORTED_SIGN.get()));
		this.add(HexcraftBlocks.DISTORTED_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.DISTORTED_HANGING_SIGN.get()));
		this.add(HexcraftBlocks.DISTORTED_WALL_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.DISTORTED_HANGING_SIGN.get()));

		this.add(HexcraftBlocks.ELDER_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.ELDER_SIGN.get()));
		this.add(HexcraftBlocks.ELDER_WALL_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.ELDER_SIGN.get()));
		this.add(HexcraftBlocks.ELDER_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.ELDER_HANGING_SIGN.get()));
		this.add(HexcraftBlocks.ELDER_WALL_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.ELDER_HANGING_SIGN.get()));

		this.add(HexcraftBlocks.JUNIPER_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.JUNIPER_SIGN.get()));
		this.add(HexcraftBlocks.JUNIPER_WALL_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.JUNIPER_SIGN.get()));
		this.add(HexcraftBlocks.JUNIPER_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.JUNIPER_HANGING_SIGN.get()));
		this.add(HexcraftBlocks.JUNIPER_WALL_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.JUNIPER_HANGING_SIGN.get()));

		this.add(HexcraftBlocks.ROWAN_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.ROWAN_SIGN.get()));
		this.add(HexcraftBlocks.ROWAN_WALL_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.ROWAN_SIGN.get()));
		this.add(HexcraftBlocks.ROWAN_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.ROWAN_HANGING_SIGN.get()));
		this.add(HexcraftBlocks.ROWAN_WALL_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.ROWAN_HANGING_SIGN.get()));

		this.add(HexcraftBlocks.TWISTED_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.TWISTED_SIGN.get()));
		this.add(HexcraftBlocks.TWISTED_WALL_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.TWISTED_SIGN.get()));
		this.add(HexcraftBlocks.TWISTED_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.TWISTED_HANGING_SIGN.get()));
		this.add(HexcraftBlocks.TWISTED_WALL_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.TWISTED_HANGING_SIGN.get()));

		this.add(HexcraftBlocks.WITCH_WOOD_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.WITCH_WOOD_SIGN.get()));
		this.add(HexcraftBlocks.WITCH_WOOD_WALL_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.WITCH_WOOD_SIGN.get()));
		this.add(HexcraftBlocks.WITCH_WOOD_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.WITCH_WOOD_HANGING_SIGN.get()));
		this.add(HexcraftBlocks.WITCH_WOOD_WALL_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.WITCH_WOOD_HANGING_SIGN.get()));

		this.add(HexcraftBlocks.ECHO_WOOD_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.ECHO_WOOD_SIGN.get()));
		this.add(HexcraftBlocks.ECHO_WOOD_WALL_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.ECHO_WOOD_SIGN.get()));
		this.add(HexcraftBlocks.ECHO_WOOD_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.ECHO_WOOD_HANGING_SIGN.get()));
		this.add(HexcraftBlocks.ECHO_WOOD_WALL_HANGING_SIGN.get(), block ->
				createSingleItemTable(HexcraftItems.ECHO_WOOD_HANGING_SIGN.get()));

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