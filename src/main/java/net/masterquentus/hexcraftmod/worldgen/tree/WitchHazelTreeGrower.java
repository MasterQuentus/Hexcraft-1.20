package net.masterquentus.hexcraftmod.worldgen.tree;

import net.masterquentus.hexcraftmod.worldgen.HexcraftConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class WitchHazelTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
        return HexcraftConfiguredFeatures.WITCH_HAZEL_KEY;
    }
}