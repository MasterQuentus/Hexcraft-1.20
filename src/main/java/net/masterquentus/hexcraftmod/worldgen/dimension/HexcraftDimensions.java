package net.masterquentus.hexcraftmod.worldgen.dimension;

import com.mojang.datafixers.util.Pair;
import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.worldgen.biome.HexcraftBiomes;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;

import java.util.List;
import java.util.OptionalLong;

public class HexcraftDimensions {
    public static final ResourceKey<LevelStem> UNDERWORLDDIM_KEY = ResourceKey.create(Registries.LEVEL_STEM,
            new ResourceLocation(HexcraftMod.MOD_ID, "underworlddim"));
    public static final ResourceKey<Level> UNDERWORLDDIM_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION,
            new ResourceLocation(HexcraftMod.MOD_ID, "underworlddim"));
    public static final ResourceKey<DimensionType> UNDERWORLD_DIM_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE,
            new ResourceLocation(HexcraftMod.MOD_ID, "underworlddim_type"));


    public static void bootstrapType(BootstapContext<DimensionType> context) {
        context.register(UNDERWORLD_DIM_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                false, // hasSkylight
                true, // hasCeiling
                false, // ultraWarm
                false, // natural
                1.0, // coordinateScale
                false, // bedWorks
                true, // respawnAnchorWorks
                0, // minY
                256, // height
                256, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                BuiltinDimensionTypes.OVERWORLD_EFFECTS, // effectsLocation
                1.0f, // ambientLight
                new DimensionType.MonsterSettings(false, false, ConstantInt.of(0), 0)));
    }


    public static void bootstrapStem(BootstapContext<LevelStem> context) {
        HolderGetter<Biome> biomeRegistry = context.lookup(Registries.BIOME);
        HolderGetter<DimensionType> dimTypes = context.lookup(Registries.DIMENSION_TYPE);
        HolderGetter<NoiseGeneratorSettings> noiseGenSettings = context.lookup(Registries.NOISE_SETTINGS);
        //HolderGetter<NoiseGeneratorSettings> defaultBlock = (HolderGetter<NoiseGeneratorSettings>) HexcraftBlocks.UNDER_WORLD_STONE.get();


        NoiseBasedChunkGenerator noiseBasedChunkGenerator = new NoiseBasedChunkGenerator(
                MultiNoiseBiomeSource.createFromList(
                        new Climate.ParameterList<>(List.of(Pair.of(
                                        Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(HexcraftBiomes.VAMPIRE_FOREST)),
                                Pair.of(
                                        Climate.parameters(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F), biomeRegistry.getOrThrow(HexcraftBiomes.CRIMSON_DESERT))
                        ))),

                noiseGenSettings.getOrThrow(NoiseGeneratorSettings.CAVES));

        LevelStem stem = new LevelStem(dimTypes.getOrThrow(HexcraftDimensions.UNDERWORLD_DIM_TYPE), noiseBasedChunkGenerator);

        context.register(UNDERWORLDDIM_KEY, stem);
    }
}