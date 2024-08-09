package net.masterquentus.hexcraftmod.item;

import net.minecraft.world.food.FoodProperties;

public class HexcraftFoods {
    public static final FoodProperties JUNIPER_BERRIES = new FoodProperties.Builder().alwaysEat().saturationMod(0.1F)
            .nutrition(2).fast().build();

    public static final FoodProperties BLOOD_BERRIES = new FoodProperties.Builder().alwaysEat().saturationMod(0.1F)
            .nutrition(2).fast().build();

    public static final FoodProperties BLOOD_APPLE = new FoodProperties.Builder().alwaysEat().saturationMod(0.3F)
            .nutrition(4).fast().build();
}
