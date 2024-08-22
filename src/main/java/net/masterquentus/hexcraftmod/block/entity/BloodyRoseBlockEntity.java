package net.masterquentus.hexcraftmod.block.entity;

import java.util.UUID;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BloodyRoseBlockEntity extends BlockEntity {

	private UUID uuid = null;
	private String name = null;

	public BloodyRoseBlockEntity(BlockPos pos, BlockState state) {
		super(HexcraftBlockEntities.BLOODY_ROSE.get(), pos, state);
	}

	public UUID getUUID() {
		return uuid;
	}

	public void setUUID(UUID uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void reset() {
		this.uuid = null;
		this.name = null;
	}

	@Override
	public void saveAdditional(CompoundTag nbt) {
		super.saveAdditional(nbt);
		if (uuid != null)
			nbt.putUUID("uuid", uuid);
	}

	@Override
	public void load(CompoundTag nbt) {
		super.load(nbt);
		if (nbt.contains("uuid"))
			this.uuid = nbt.getUUID("uuid");
	}

}