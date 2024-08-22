package net.masterquentus.hexcraftmod.util;

import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;

// Creates one location for every tickable BE. For it to be valid, BE must extend it
public interface ITickableBlockEntity {
	void tick();

	static <T extends BlockEntity> BlockEntityTicker<T> getTickerHelper(Level level) {
		return level.isClientSide() ? null
				: (level0, pos0, state0, blockEntity0) -> ((ITickableBlockEntity) blockEntity0).tick();
	}
}
