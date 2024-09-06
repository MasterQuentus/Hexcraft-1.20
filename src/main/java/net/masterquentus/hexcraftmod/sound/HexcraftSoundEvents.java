package net.masterquentus.hexcraftmod.sound;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.platform.services.CommonServices;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class HexcraftSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, HexcraftMod.MOD_ID);

    public static Supplier<SoundEvent> CHALK_WRITE = register("chalk_write",
            () -> SoundEvent.createVariableRangeEvent(HexcraftMod.id("chalk_write")));

    public static Supplier<SoundEvent> BROOM_SWEEP = register("broom_sweep",
            () -> SoundEvent.createVariableRangeEvent(HexcraftMod.id("broom_sweep")));



    private static <T extends SoundEvent> Supplier<T> register(String name, Supplier<T> soundSupplier) {
        return CommonServices.COMMON_REGISTRY.register(BuiltInRegistries.SOUND_EVENT, name, soundSupplier);
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}