package net.masterquentus.hexcraftmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.MossBlock;
import net.minecraft.world.level.block.state.BlockState;

public class EmberMoss extends MossBlock implements BonemealableBlock {
    public EmberMoss(Properties p_153790_) {
        super(p_153790_);
    }
    @Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        entity.setSecondsOnFire(3);
        super.entityInside(state, level, pos, entity);
    }
}
