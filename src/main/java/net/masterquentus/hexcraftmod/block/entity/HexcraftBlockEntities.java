package net.masterquentus.hexcraftmod.block.entity;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.block.entity.signs.HexcraftHangingSignBlockEntity;
import net.masterquentus.hexcraftmod.block.entity.signs.HexcraftSignBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class HexcraftBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister
			.create(ForgeRegistries.BLOCK_ENTITY_TYPES, HexcraftMod.MOD_ID);

	public static final RegistryObject<BlockEntityType<WitchesOvenBlockEntity>> WITCHES_OVEN_BLOCK_ENTITY = BLOCK_ENTITIES
			.register("witches_oven_block_entity", () -> BlockEntityType.Builder
					.of(WitchesOvenBlockEntity::new, HexcraftBlocks.WITCHES_OVEN.get()).build(null));

	public static final RegistryObject<BlockEntityType<WitchesCauldronBlockEntity>> WITCHES_CAULDRON_BLOCK_ENTITY = BLOCK_ENTITIES
			.register("witches_cauldron_block_entity", () -> BlockEntityType.Builder
					.of(WitchesCauldronBlockEntity::new, HexcraftBlocks.WITCHES_CAULDRON.get()).build(null));

	public static final RegistryObject<BlockEntityType<BloodyRoseBlockEntity>> BLOODY_ROSE = BLOCK_ENTITIES
			.register("bloody_rose", () -> BlockEntityType.Builder
					.of(BloodyRoseBlockEntity::new, HexcraftBlocks.WITCHES_OVEN.get()).build(null));

	public static final RegistryObject<BlockEntityType<HexcraftSignBlockEntity>> Hexcraft_SIGN = BLOCK_ENTITIES
			.register("hexcraft_sign", () -> BlockEntityType.Builder
					.of(HexcraftSignBlockEntity::new, HexcraftBlocks.EBONY_SIGN.get(), HexcraftBlocks.EBONY_WALL_SIGN.get(),
							HexcraftBlocks.BLOOD_OAK_SIGN.get(), HexcraftBlocks.BLOOD_OAK_WALL_SIGN.get(),
							HexcraftBlocks.HELL_BARK_SIGN.get(), HexcraftBlocks.HELL_BARK_WALL_SIGN.get(),
							HexcraftBlocks.WHITE_OAK_SIGN.get(), HexcraftBlocks.WHITE_OAK_WALL_SIGN.get(),
							HexcraftBlocks.ALDER_SIGN.get(), HexcraftBlocks.ALDER_WALL_SIGN.get(),
							HexcraftBlocks.WITCH_HAZEL_SIGN.get(), HexcraftBlocks.WITCH_HAZEL_WALL_SIGN.get(),
							HexcraftBlocks.WILLOW_SIGN.get(), HexcraftBlocks.WILLOW_WALL_SIGN.get(),
							HexcraftBlocks.HAWTHORN_SIGN.get(), HexcraftBlocks.HAWTHORN_WALL_SIGN.get(),
							HexcraftBlocks.CEDAR_SIGN.get(), HexcraftBlocks.CEDAR_WALL_SIGN.get(),
							HexcraftBlocks.DISTORTED_SIGN.get(), HexcraftBlocks.DISTORTED_WALL_SIGN.get(),
							HexcraftBlocks.ELDER_SIGN.get(), HexcraftBlocks.ELDER_WALL_SIGN.get(),
							HexcraftBlocks.JUNIPER_SIGN.get(), HexcraftBlocks.JUNIPER_WALL_SIGN.get(),
							HexcraftBlocks.ROWAN_SIGN.get(), HexcraftBlocks.ROWAN_WALL_SIGN.get(),
							HexcraftBlocks.TWISTED_SIGN.get(), HexcraftBlocks.TWISTED_WALL_SIGN.get(),
							HexcraftBlocks.WITCH_WOOD_SIGN.get(), HexcraftBlocks.WITCH_WOOD_WALL_SIGN.get(),
							HexcraftBlocks.ECHO_WOOD_SIGN.get(), HexcraftBlocks.ECHO_WOOD_WALL_SIGN.get()).build(null));

	public static final RegistryObject<BlockEntityType<HexcraftHangingSignBlockEntity>> Hexcraft_HANGING_SIGN = BLOCK_ENTITIES
			.register("hexcraft_hanging_sign", () -> BlockEntityType.Builder
					.of(HexcraftHangingSignBlockEntity::new, HexcraftBlocks.EBONY_HANGING_SIGN.get(), HexcraftBlocks.EBONY_WALL_HANGING_SIGN.get(),
							HexcraftBlocks.BLOOD_OAK_HANGING_SIGN.get(), HexcraftBlocks.BLOOD_OAK_WALL_HANGING_SIGN.get(),
							HexcraftBlocks.HELL_BARK_HANGING_SIGN.get(), HexcraftBlocks.HELL_BARK_WALL_HANGING_SIGN.get(),
							HexcraftBlocks.WHITE_OAK_HANGING_SIGN.get(), HexcraftBlocks.WHITE_OAK_WALL_HANGING_SIGN.get(),
							HexcraftBlocks.ALDER_HANGING_SIGN.get(), HexcraftBlocks.ALDER_WALL_HANGING_SIGN.get(),
							HexcraftBlocks.WITCH_HAZEL_HANGING_SIGN.get(), HexcraftBlocks.WITCH_HAZEL_WALL_HANGING_SIGN.get(),
							HexcraftBlocks.WILLOW_HANGING_SIGN.get(), HexcraftBlocks.WILLOW_WALL_HANGING_SIGN.get(),
							HexcraftBlocks.HAWTHORN_HANGING_SIGN.get(), HexcraftBlocks.HAWTHORN_WALL_HANGING_SIGN.get(),
							HexcraftBlocks.CEDAR_HANGING_SIGN.get(), HexcraftBlocks.CEDAR_WALL_HANGING_SIGN.get(),
							HexcraftBlocks.DISTORTED_HANGING_SIGN.get(), HexcraftBlocks.DISTORTED_WALL_HANGING_SIGN.get(),
							HexcraftBlocks.ELDER_HANGING_SIGN.get(), HexcraftBlocks.ELDER_WALL_HANGING_SIGN.get(),
							HexcraftBlocks.JUNIPER_HANGING_SIGN.get(), HexcraftBlocks.JUNIPER_WALL_HANGING_SIGN.get(),
							HexcraftBlocks.ROWAN_HANGING_SIGN.get(), HexcraftBlocks.ROWAN_WALL_HANGING_SIGN.get(),
							HexcraftBlocks.TWISTED_HANGING_SIGN.get(), HexcraftBlocks.TWISTED_WALL_HANGING_SIGN.get(),
							HexcraftBlocks.WITCH_WOOD_HANGING_SIGN.get(), HexcraftBlocks.WITCH_WOOD_WALL_HANGING_SIGN.get(),
							HexcraftBlocks.ECHO_WOOD_HANGING_SIGN.get(), HexcraftBlocks.ECHO_WOOD_WALL_HANGING_SIGN.get()).build(null));

	//Crates



	public static void register(IEventBus eventBus) {
		BLOCK_ENTITIES.register(eventBus);
	}
}