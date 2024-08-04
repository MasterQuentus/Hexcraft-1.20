package net.masterquentus.hexcraftmod.block.entity;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, HexcraftMod.MOD_ID);


    public static final RegistryObject<BlockEntityType<WitchesOvenBlockEntity>> WITCHES_OVEN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("witches_oven_block_entity", () ->
                    BlockEntityType.Builder.of(WitchesOvenBlockEntity::new,
                            HexcraftBlocks.WITCHES_OVEN.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}