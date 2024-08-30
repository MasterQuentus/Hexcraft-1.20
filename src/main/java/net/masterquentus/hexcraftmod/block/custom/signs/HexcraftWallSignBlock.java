package net.masterquentus.hexcraftmod.block.custom.signs;

import net.masterquentus.hexcraftmod.block.entity.signs.HexcraftSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class HexcraftWallSignBlock extends WallSignBlock {
    public HexcraftWallSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new HexcraftSignBlockEntity(pPos, pState);
    }
}
