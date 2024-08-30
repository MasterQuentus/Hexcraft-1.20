package net.masterquentus.hexcraftmod.block.custom.signs;

import net.masterquentus.hexcraftmod.block.entity.signs.HexcraftHangingSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class HexcraftWallHangingSignBlock extends WallHangingSignBlock {
    public HexcraftWallHangingSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new HexcraftHangingSignBlockEntity(pPos, pState);
    }
}
