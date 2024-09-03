package net.masterquentus.hexcraftmod.block.entity.boats;

import java.util.function.IntFunction;

import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.entity.custom.HexcraftEntities;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.ByIdMap;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class HexcraftBoatEntity extends Boat {
	private static final EntityDataAccessor<Integer> DATA_ID_TYPE = SynchedEntityData.defineId(Boat.class,
			EntityDataSerializers.INT);

	public HexcraftBoatEntity(EntityType<? extends Boat> pEntityType, Level pLevel) {
		super(pEntityType, pLevel);
	}

	public HexcraftBoatEntity(Level pLevel, double pX, double pY, double pZ) {
		this(HexcraftEntities.HEXCRAFT_BOAT.get(), pLevel);
		this.setPos(pX, pY, pZ);
		this.xo = pX;
		this.yo = pY;
		this.zo = pZ;
	}

	@Override
	public Item getDropItem() {
		switch (getModVariant()) {
		case EBONY -> HexcraftItems.EBONY_BOAT.get();
		case ALDER -> HexcraftItems.ALDER_BOAT.get();
		case BLOOD_OAK -> HexcraftItems.BLOOD_OAK_BOAT.get();
		case CEDAR -> HexcraftItems.CEDAR_BOAT.get();
		case DISTORTED -> HexcraftItems.DISTORTED_BOAT.get();
		case ELDER -> HexcraftItems.ELDER_BOAT.get();
		case HAWTHORN -> HexcraftItems.HAWTHORN_BOAT.get();
		case HELL_BARK -> HexcraftItems.HELL_BARK_BOAT.get();
		case JUNIPER -> HexcraftItems.JUNIPER_BOAT.get();
		case ROWAN -> HexcraftItems.ROWAN_BOAT.get();
		case TWISTED -> HexcraftItems.TWISTED_BOAT.get();
		case WHITE_OAK -> HexcraftItems.WHITE_OAK_BOAT.get();
		case WILLOW -> HexcraftItems.WILLOW_BOAT.get();
		case WITCH_HAZEL -> HexcraftItems.WITCH_HAZEL_BOAT.get();
		case WITCH_WOOD -> HexcraftItems.WITCH_WOOD_BOAT.get();
		case ECHO_WOOD -> HexcraftItems.ECHO_WOOD_BOAT.get();
		}
		return super.getDropItem();
	}

	public void setVariant(Type pVariant) {
		this.entityData.set(DATA_ID_TYPE, pVariant.ordinal());
	}

	public Type getModVariant() {
		return Type.byId(this.entityData.get(DATA_ID_TYPE));
	}

	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_ID_TYPE, Type.EBONY.ordinal());
		//this.entityData.define(DATA_ID_TYPE, Type.BLOOD_OAK.ordinal());
		/*this.entityData.define(DATA_ID_TYPE, Type.HELL_BARK.ordinal());
		this.entityData.define(DATA_ID_TYPE, Type.WHITE_OAK.ordinal());
		this.entityData.define(DATA_ID_TYPE, Type.ALDER.ordinal());
		this.entityData.define(DATA_ID_TYPE, Type.WITCH_HAZEL.ordinal());
		this.entityData.define(DATA_ID_TYPE, Type.WILLOW.ordinal());
		this.entityData.define(DATA_ID_TYPE, Type.HAWTHORN.ordinal());
		this.entityData.define(DATA_ID_TYPE, Type.CEDAR.ordinal());
		this.entityData.define(DATA_ID_TYPE, Type.DISTORTED.ordinal());
		this.entityData.define(DATA_ID_TYPE, Type.ELDER.ordinal());
		this.entityData.define(DATA_ID_TYPE, Type.JUNIPER.ordinal());
		this.entityData.define(DATA_ID_TYPE, Type.ROWAN.ordinal());
		this.entityData.define(DATA_ID_TYPE, Type.TWISTED.ordinal());
		this.entityData.define(DATA_ID_TYPE, Type.WITCH_WOOD.ordinal());
		this.entityData.define(DATA_ID_TYPE, Type.ECHO_WOOD.ordinal());*/
	}

	protected void addAdditionalSaveData(CompoundTag pCompound) {
		pCompound.putString("Type", this.getModVariant().getSerializedName());
	}

	protected void readAdditionalSaveData(CompoundTag pCompound) {
		if (pCompound.contains("Type", 8)) {
			this.setVariant(Type.byName(pCompound.getString("Type")));
		}
	}

	@SuppressWarnings("deprecation")
	public static enum Type implements StringRepresentable {
		EBONY(HexcraftBlocks.EBONY_PLANKS.get(), "ebony"),
		BLOOD_OAK(HexcraftBlocks.BLOOD_OAK_PLANKS.get(), "blood_oak"),
		HELL_BARK(HexcraftBlocks.HELL_BARK_PLANKS.get(), "hell_bark"),
		WHITE_OAK(HexcraftBlocks.WHITE_OAK_PLANKS.get(), "white_oak"),
		ALDER(HexcraftBlocks.ALDER_PLANKS.get(), "alder"),
		WITCH_HAZEL(HexcraftBlocks.WITCH_HAZEL_PLANKS.get(), "witch_hazel"),
		WILLOW(HexcraftBlocks.WILLOW_PLANKS.get(), "willow"),
		HAWTHORN(HexcraftBlocks.HAWTHORN_PLANKS.get(), "hawthorn"), CEDAR(HexcraftBlocks.CEDAR_PLANKS.get(), "cedar"),
		DISTORTED(HexcraftBlocks.DISTORTED_PLANKS.get(), "distorted"),
		ELDER(HexcraftBlocks.ELDER_PLANKS.get(), "elder"), JUNIPER(HexcraftBlocks.JUNIPER_PLANKS.get(), "juniper"),
		ROWAN(HexcraftBlocks.ROWAN_PLANKS.get(), "rowan"), TWISTED(HexcraftBlocks.TWISTED_PLANKS.get(), "twisted"),
		WITCH_WOOD(HexcraftBlocks.WITCH_WOOD_PLANKS.get(), "witch_wood"),
		ECHO_WOOD(HexcraftBlocks.ECHO_WOOD_PLANKS.get(), "echo_wood");

		private final String name;
		private final Block planks;
		public static final EnumCodec<Type> CODEC = StringRepresentable
				.fromEnum(Type::values);
		private static final IntFunction<Type> BY_ID = ByIdMap.continuous(Enum::ordinal, values(),
				ByIdMap.OutOfBoundsStrategy.ZERO);

		private Type(Block pPlanks, String pName) {
			this.name = pName;
			this.planks = pPlanks;
		}

		public String getSerializedName() {
			return this.name;
		}

		public String getName() {
			return this.name;
		}

		public Block getPlanks() {
			return this.planks;
		}

		public String toString() {
			return this.name;
		}

		public static Type byId(int pId) {
			return BY_ID.apply(pId);
		}

		public static Type byName(String pName) {
			//Type[] boatType = values();

			//for (Type type : boatType) {
			//	if (type.getName().equals(pName)) {
			//		return type;
			//	}
			//}

			return CODEC.byName(pName, EBONY);
		}
	}
}