package net.masterquentus.hexcraftmod.worldgen.biome.suface;

import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.worldgen.biome.HexcraftBiomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class HexcraftSurfaceRules {
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource STONE = makeStateRule(Blocks.STONE);
    private static final SurfaceRules.RuleSource VILE_GRASS_BLOCK = makeStateRule(HexcraftBlocks.VILE_GRASS_BLOCK.get());
    private static final SurfaceRules.RuleSource CRIMSON_SAND_BLOCK = makeStateRule(HexcraftBlocks.CRIMSON_SAND.get());
    private static final SurfaceRules.RuleSource UNDER_WORLD_STONE_BLOCK = makeStateRule(HexcraftBlocks.UNDER_WORLD_STONE.get());

    public static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);

        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return SurfaceRules.sequence(
                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(HexcraftBiomes.VAMPIRE_FOREST),
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, VILE_GRASS_BLOCK)),
                        SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, STONE)),


                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(HexcraftBiomes.CRIMSON_DESERT),
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, CRIMSON_SAND_BLOCK)),
                        SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, UNDER_WORLD_STONE_BLOCK))
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}