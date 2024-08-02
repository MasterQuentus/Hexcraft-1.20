package net.masterquentus.hexcraftmod.item;

import net.minecraft.world.food.FoodProperties;

public class HexcraftFoods {
    public static final FoodProperties JUNIPER_BERRIES = new FoodProperties.Builder().alwaysEat().saturationMod(0.1F)
            .nutrition(2).fast().build();
}
