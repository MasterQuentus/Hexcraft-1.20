package net.masterquentus.hexcraftmod.item;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;


public class HexcraftToolTiers {
    public static final ForgeTier ARTHANA = new ForgeTier(0, 32, 12.0F,
            0.0F, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(HexcraftItems.SILVER_INGOT.get()));

    public static final ForgeTier STEEL = new ForgeTier(1, 1763, 7.0F,
            0.0F, 24, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(HexcraftItems.STEEL_INGOT.get()));

    public static final ForgeTier DARKSTEEL = new ForgeTier(1, 1561, 12.0F,
            0.0F, 24, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(HexcraftItems.STEEL_INGOT.get()));

    public static final ForgeTier BLOODYNYKIUM = new ForgeTier(1, 2031, 12.0F,
            0.0F, 15, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(HexcraftItems.BLOODY_NYKIUM.get()));

    public static final ForgeTier JORMIUM = new ForgeTier(1, 250, 12.0F,
            0.0F, 15, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(HexcraftItems.JORMIUM_INGOT.get()));

    public static final ForgeTier CUROGEN = new ForgeTier(1, 2031, 12.0F,
            0.0F, 15, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(HexcraftItems.CUROGEN.get()));

    public static final ForgeTier SILVER = new ForgeTier(1, 250, 7.0F,
            0.0F, 24, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(HexcraftItems.SILVER_INGOT.get()));

    public static final ForgeTier VAMPIRIC = new ForgeTier(1, 250, 7.0F,
            0.0F, 24, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(HexcraftItems.VAMPIRIC_GEM.get()));

}