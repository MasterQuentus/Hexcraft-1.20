package net.masterquentus.hexcraftmod.worldgen.biome;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.worldgen.biome.custom.HexcraftOverworldRegion;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class HexcraftTerraBlenderAPI {
    public static void registerRegions() {
        Regions.register(new HexcraftOverworldRegion(new ResourceLocation(HexcraftMod.MOD_ID, "overworld"), 5));
    }
}