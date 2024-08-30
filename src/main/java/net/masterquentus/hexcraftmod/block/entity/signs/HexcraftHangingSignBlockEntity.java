package net.masterquentus.hexcraftmod.block.entity.signs;

import net.masterquentus.hexcraftmod.block.entity.HexcraftBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.HangingSignBlockEntity;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class HexcraftHangingSignBlockEntity extends SignBlockEntity {
    public HexcraftHangingSignBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(HexcraftBlockEntities.Hexcraft_HANGING_SIGN.get(),blockPos, blockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return HexcraftBlockEntities.Hexcraft_HANGING_SIGN.get();
    }
}
