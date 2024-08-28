package net.masterquentus.hexcraftmod.fluid;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class HexcraftFluidTypes {
    public static final ResourceLocation BLOOD_STILL_RL = new ResourceLocation(HexcraftMod.MOD_ID,"block/blood_still");
    public static final ResourceLocation BLOOD_FLOWING_RL = new ResourceLocation(HexcraftMod.MOD_ID,"block/blood_flow");
    public static final ResourceLocation BLOOD_OVERLAY_RL = new ResourceLocation(HexcraftMod.MOD_ID,"mics/blood_overlay");



    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, HexcraftMod.MOD_ID);


    public static final RegistryObject<FluidType> BLOOD_FLUID_TYPE = registerFluidType("blood_fluid",
            new BaseFluidType(BLOOD_STILL_RL, BLOOD_FLOWING_RL, BLOOD_OVERLAY_RL, 0xA1E038D0,
                    new Vector3f(224f / 255f, 56f / 255f, 208f / 255f),
                    FluidType.Properties.create().density(15).viscosity(5).canDrown(true).canPushEntity(true)
                            .canSwim(true).supportsBoating(true).sound(SoundAction.get("drink"),
                                    SoundEvents.HONEY_DRINK)));




    private static RegistryObject<FluidType> registerFluidType(String name, FluidType fluidType) {
        return FLUID_TYPES.register(name, () -> fluidType);
    }


    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }

}
