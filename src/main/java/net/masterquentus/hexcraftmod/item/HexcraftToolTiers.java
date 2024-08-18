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

}