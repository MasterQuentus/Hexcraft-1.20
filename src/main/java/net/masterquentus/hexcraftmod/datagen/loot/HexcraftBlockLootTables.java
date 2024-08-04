package net.masterquentus.hexcraftmod.datagen.loot;

import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
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

        this.dropSelf(HexcraftBlocks.WITCHES_OVEN.get());

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


        this.add(HexcraftBlocks.VILE_GRASS_BLOCK.get(),
                block -> createCopperLikeOreDrops(HexcraftBlocks.VILE_GRASS_BLOCK.get(), Item.byBlock(HexcraftBlocks.VILE_DIRT.get())));

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