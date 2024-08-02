package net.masterquentus.hexcraftmod.datagen;

import net.masterquentus.hexcraftmod.datagen.loot.HexcraftBlockLootTables;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class HexcraftLootTableProvider {
    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(HexcraftBlockLootTables::new, LootContextParamSets.BLOCK)
        ));
    }
}