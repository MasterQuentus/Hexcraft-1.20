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
        this.dropSelf(HexcraftBlocks.CURSED_SOIL.get());
        this.dropSelf(HexcraftBlocks.CURED_SOIL.get());
        this.dropSelf(HexcraftBlocks.FERTILIZED_DIRT.get());
        this.dropSelf(HexcraftBlocks.VILE_DIRT.get());
        this.add(HexcraftBlocks.VILE_GRASS_BLOCK.get(),
                block -> createCopperLikeOreDrops(HexcraftBlocks.VILE_GRASS_BLOCK.get(), Item.byBlock(HexcraftBlocks.VILE_DIRT.get())));

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