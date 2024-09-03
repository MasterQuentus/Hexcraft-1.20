package net.masterquentus.hexcraftmod.block.custom.plants;

import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.NetherVines;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;


public class VileVineBlock extends GrowingPlantHeadBlock implements BonemealableBlock {
    protected static final VoxelShape SHAPE = Block.box(4.0D, 9.0D, 4.0D, 12.0D, 16.0D, 12.0D);

    public VileVineBlock(BlockBehaviour.Properties p_154966_) {
        super(p_154966_, Direction.DOWN, SHAPE, false, 0.1D);
    }

    /**
     * Used to determine how much to grow the plant when using bonemeal.
     */
    protected int getBlocksToGrowWhenBonemealed(Random p_154968_) {
        return NetherVines.getBlocksToGrowWhenBonemealed((RandomSource) p_154968_);
    }

    public ItemStack getCloneItemStack(BlockGetter getter, BlockPos pos, BlockState state) {
        return new ItemStack(HexcraftItems.VILEVINE_ITEM.get());
    }

    @Override
    public boolean isLadder(BlockState state, LevelReader level, BlockPos pos, LivingEntity entity) {
        return true;
    }

    protected Block getBodyBlock() {
        return HexcraftBlocks.VILEVINE_PLANT.get();
    }

    protected int getBlocksToGrowWhenBonemealed(RandomSource p_222680_) {
        return NetherVines.getBlocksToGrowWhenBonemealed(p_222680_);
    }
    protected boolean canGrowInto(BlockState p_154971_) {
        return NetherVines.isValidGrowthState(p_154971_);
    }
}