package net.masterquentus.hexcraftmod.entity.custom;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.entity.boats.HexcraftBoatEntity;
import net.masterquentus.hexcraftmod.block.entity.boats.HexcraftChestBoatEntity;
import net.masterquentus.hexcraftmod.custom.projectile.VampiricStaffProjectileEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HexcraftMod.MOD_ID);


    public static final RegistryObject<EntityType<HexcraftBoatEntity>> HEXCRAFT_BOAT =
            ENTITY_TYPES.register("hexcraft_boat", () -> EntityType.Builder.<HexcraftBoatEntity>of(HexcraftBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("hexcraft_boat"));

    public static final RegistryObject<EntityType<HexcraftChestBoatEntity>> HEXCRAFT_CHEST_BOAT =
            ENTITY_TYPES.register("hexcraft_chest_boat", () -> EntityType.Builder.<HexcraftChestBoatEntity>of(HexcraftChestBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("hexcraft_chest_boat"));

    public static final RegistryObject<EntityType<VampiricStaffProjectileEntity>> VAMPIRIC_STAFF_PROJECTILE =
            ENTITY_TYPES.register("vampiric_staff_projectile",
                    () -> EntityType.Builder.<VampiricStaffProjectileEntity>of(VampiricStaffProjectileEntity::new, MobCategory.AMBIENT)
                            .sized(0.25f, 0.25f)
                            .build(new ResourceLocation(HexcraftMod.MOD_ID, "vampiric_staff_projectile").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
