package net.masterquentus.hexcraftmod.datagen;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.masterquentus.hexcraftmod.loot.AddItemModifier;
import net.masterquentus.hexcraftmod.loot.AddSusSandItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;


public class HexcraftGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public HexcraftGlobalLootModifiersProvider(PackOutput output) {
        super(output, HexcraftMod.MOD_ID);
    }

    @Override
    protected void start() {


        add("salt_from_suspicious_sand", new AddSusSandItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/desert_pyramid")).build() }, HexcraftItems.SALT.get()));




    }
}