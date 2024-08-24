package net.masterquentus.hexcraftmod.worldgen.biome;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.worldgen.biome.custom.HexcraftOverworldRegon;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class HexcraftTerrablenderAPI {
    public static void registerRegions() {
        Regions.register(new HexcraftOverworldRegon(new ResourceLocation(HexcraftMod.MOD_ID, "overworld"), 5));
    }
}
