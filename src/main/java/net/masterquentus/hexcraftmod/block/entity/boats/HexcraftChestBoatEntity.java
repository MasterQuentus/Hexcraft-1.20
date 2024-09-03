package net.masterquentus.hexcraftmod.block.entity.boats;

import net.masterquentus.hexcraftmod.entity.custom.HexcraftEntities;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class HexcraftChestBoatEntity extends ChestBoat {
	private static final EntityDataAccessor<Integer> DATA_ID_TYPE = SynchedEntityData.defineId(Boat.class,
			EntityDataSerializers.INT);

	public HexcraftChestBoatEntity(EntityType<? extends ChestBoat> pEntityType, Level pLevel) {
		super(pEntityType, pLevel);
	}

	public HexcraftChestBoatEntity(Level pLevel, double pX, double pY, double pZ) {
		this(HexcraftEntities.HEXCRAFT_CHEST_BOAT.get(), pLevel);
		this.setPos(pX, pY, pZ);
		this.xo = pX;
		this.yo = pY;
		this.zo = pZ;
	}

	@Override
	public Item getDropItem() {
		switch (getModVariant()) {
		case EBONY -> HexcraftItems.EBONY_CHEST_BOAT.get();
		case ALDER -> HexcraftItems.ALDER_CHEST_BOAT.get();
		case BLOOD_OAK -> HexcraftItems.BLOOD_OAK_CHEST_BOAT.get();
		case CEDAR -> HexcraftItems.CEDAR_CHEST_BOAT.get();
		case DISTORTED -> HexcraftItems.DISTORTED_CHEST_BOAT.get();
		case ELDER -> HexcraftItems.ELDER_CHEST_BOAT.get();
		case HAWTHORN -> HexcraftItems.HAWTHORN_CHEST_BOAT.get();
		case HELL_BARK -> HexcraftItems.HELL_BARK_CHEST_BOAT.get();
		case JUNIPER -> HexcraftItems.JUNIPER_CHEST_BOAT.get();
		case ROWAN -> HexcraftItems.ROWAN_CHEST_BOAT.get();
		case TWISTED -> HexcraftItems.TWISTED_CHEST_BOAT.get();
		case WHITE_OAK -> HexcraftItems.WHITE_OAK_CHEST_BOAT.get();
		case WILLOW -> HexcraftItems.WILLOW_CHEST_BOAT.get();
		case WITCH_HAZEL -> HexcraftItems.WITCH_HAZEL_CHEST_BOAT.get();
		case WITCH_WOOD -> HexcraftItems.WITCH_WOOD_CHEST_BOAT.get();
		case ECHO_WOOD -> HexcraftItems.ECHO_WOOD_CHEST_BOAT.get();
		}
		return super.getDropItem();
	}

	public void setVariant(HexcraftBoatEntity.Type pVariant) {
		this.entityData.set(DATA_ID_TYPE, pVariant.ordinal());
	}

	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_ID_TYPE, HexcraftBoatEntity.Type.EBONY.ordinal());
		/*this.entityData.define(DATA_ID_TYPE, HexcraftBoatEntity.Type.BLOOD_OAK.ordinal());
		this.entityData.define(DATA_ID_TYPE, HexcraftBoatEntity.Type.HELL_BARK.ordinal());
		this.entityData.define(DATA_ID_TYPE, HexcraftBoatEntity.Type.WHITE_OAK.ordinal());
		this.entityData.define(DATA_ID_TYPE, HexcraftBoatEntity.Type.ALDER.ordinal());
		this.entityData.define(DATA_ID_TYPE, HexcraftBoatEntity.Type.WITCH_HAZEL.ordinal());
		this.entityData.define(DATA_ID_TYPE, HexcraftBoatEntity.Type.WILLOW.ordinal());
		this.entityData.define(DATA_ID_TYPE, HexcraftBoatEntity.Type.HAWTHORN.ordinal());
		this.entityData.define(DATA_ID_TYPE, HexcraftBoatEntity.Type.CEDAR.ordinal());
		this.entityData.define(DATA_ID_TYPE, HexcraftBoatEntity.Type.DISTORTED.ordinal());
		this.entityData.define(DATA_ID_TYPE, HexcraftBoatEntity.Type.ELDER.ordinal());
		this.entityData.define(DATA_ID_TYPE, HexcraftBoatEntity.Type.JUNIPER.ordinal());
		this.entityData.define(DATA_ID_TYPE, HexcraftBoatEntity.Type.ROWAN.ordinal());
		this.entityData.define(DATA_ID_TYPE, HexcraftBoatEntity.Type.TWISTED.ordinal());
		this.entityData.define(DATA_ID_TYPE, HexcraftBoatEntity.Type.WITCH_WOOD.ordinal());
		this.entityData.define(DATA_ID_TYPE, HexcraftBoatEntity.Type.ECHO_WOOD.ordinal());*/
	}

	protected void addAdditionalSaveData(CompoundTag pCompound) {
		pCompound.putString("Type", this.getModVariant().getSerializedName());
	}

	protected void readAdditionalSaveData(CompoundTag pCompound) {
		if (pCompound.contains("Type", 8)) {
			this.setVariant(HexcraftBoatEntity.Type.byName(pCompound.getString("Type")));
		}
	}

	public HexcraftBoatEntity.Type getModVariant() {
		return HexcraftBoatEntity.Type.byId(this.entityData.get(DATA_ID_TYPE));
	}
}