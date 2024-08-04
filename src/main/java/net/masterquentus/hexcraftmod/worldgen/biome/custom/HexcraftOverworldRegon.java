package net.masterquentus.hexcraftmod.worldgen.biome.custom;

import com.mojang.datafixers.util.Pair;
import net.masterquentus.hexcraftmod.worldgen.biome.HexcraftBiomes;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class HexcraftOverworldRegon extends Region {
    public HexcraftOverworldRegon(ResourceLocation name,  int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint,
            ResourceKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> {
            modifiedVanillaOverworldBuilder.replaceBiome(Biomes.FOREST, HexcraftBiomes.VAMPIRE_FOREST);
        });
    }
}
