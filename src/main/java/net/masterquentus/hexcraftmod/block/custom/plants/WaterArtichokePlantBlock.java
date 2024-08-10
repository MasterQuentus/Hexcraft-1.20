package net.masterquentus.hexcraftmod.block.custom.plants;

import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;

public class WaterArtichokePlantBlock extends CropBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_3;
    public WaterArtichokePlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxAge() {
        return 3;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return HexcraftItems.WATER_ARTICHOKE_SEEDS.get();
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        FluidState clickedState = level.getFluidState(pos);
        FluidState aboveClicked = level.getFluidState(pos.above());
        return clickedState.getType() == Fluids.WATER && clickedState.isSource() && aboveClicked.getType() == Fluids.EMPTY;
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pPos) {
        BlockPos blockpos = pPos.below();
        return mayPlaceOn(level.getBlockState(blockpos), level, blockpos);
    }

}