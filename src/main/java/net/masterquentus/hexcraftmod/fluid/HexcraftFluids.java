package net.masterquentus.hexcraftmod.fluid;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, HexcraftMod.MOD_ID);


    public static final RegistryObject<FlowingFluid> SOURCE_BLOOD = FLUIDS.register("blood_fluid",
            () -> new ForgeFlowingFluid.Source(HexcraftFluids.BLOOD_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_BLOOD = FLUIDS.register("flowing_blood_fluid",
            () -> new ForgeFlowingFluid.Flowing(HexcraftFluids.BLOOD_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties BLOOD_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            HexcraftFluidTypes.BLOOD_FLUID_TYPE, SOURCE_BLOOD, FLOWING_BLOOD)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(HexcraftBlocks.BLOOD_BLOCK)
            .bucket(HexcraftItems.BLOOD_BUCKET);



    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}