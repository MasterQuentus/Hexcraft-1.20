package net.masterquentus.hexcraftmod.worldgen;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class HexcraftBiomeModifers {

    public static final ResourceKey<BiomeModifier> ADD_VAMPIRIC_ORE = registerKey("add_vampiric_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_VAMPIRIC_ORE = registerKey("add_nether_vampiric_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_VAMPIRIC_ORE = registerKey("add_end_vampiric_ore");
    public static final ResourceKey<BiomeModifier> ADD_SILVER_ORE = registerKey("add_silver_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_SILVER_ORE = registerKey("add_nether_silver_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_SILVER_ORE = registerKey("add_end_silver_ore");
    public static final ResourceKey<BiomeModifier> ADD_MOON_STONE_ORE = registerKey("add_moon_stone_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_MOON_STONE_ORE = registerKey("add_nether_moon_stone_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_MOON_STONE_ORE = registerKey("add_end_moon_stone_ore");
    public static final ResourceKey<BiomeModifier> ADD_TRENOGEN_ORE = registerKey("add_trenogen_ore");
    public static final ResourceKey<BiomeModifier> ADD_JORMUIM_ORE = registerKey("add_jormuim_ore");

    public static final ResourceKey<BiomeModifier> ADD_PEARL_STONE_ORE = registerKey("add_pearl_stone_ore");
    public static final ResourceKey<BiomeModifier> ADD_CRIMSON_STONE_ORE = registerKey("add_crimson_stone_ore");
    public static final ResourceKey<BiomeModifier> ADD_CHARSTONE_ORE = registerKey("add_charstone_ore");
    public static final ResourceKey<BiomeModifier> ADD_MAGIC_CRYSTAL_GEODE = registerKey("add_alexandrite_geode");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_VAMPIRIC_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(HexcraftPlacedFeatures.VAMPIRIC_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_VAMPIRIC_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(HexcraftPlacedFeatures.NETHER_VAMPIRIC_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_VAMPIRIC_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(HexcraftPlacedFeatures.END_VAMPIRIC_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SILVER_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(HexcraftPlacedFeatures.SILVER_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_SILVER_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(HexcraftPlacedFeatures.NETHER_SILVER_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_SILVER_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(HexcraftPlacedFeatures.END_SILVER_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MOON_STONE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(HexcraftPlacedFeatures.MOON_STONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_MOON_STONE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(HexcraftPlacedFeatures.NETHER_MOON_STONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_MOON_STONE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(HexcraftPlacedFeatures.END_MOON_STONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_TRENOGEN_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(HexcraftPlacedFeatures.TRENOGEN_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_JORMUIM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(HexcraftPlacedFeatures.JORMUIM_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_PEARL_STONE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(HexcraftPlacedFeatures.PEARL_STONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CRIMSON_STONE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(HexcraftPlacedFeatures.CRIMSON_STONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHARSTONE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(HexcraftPlacedFeatures.CHARSTONE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MAGIC_CRYSTAL_GEODE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(HexcraftPlacedFeatures.MAGIC_CRYSTAL_GEODE_PLACED_KEY)),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS));


    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(HexcraftMod.MOD_ID, name));
    }
}