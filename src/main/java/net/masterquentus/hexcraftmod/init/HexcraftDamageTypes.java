package net.masterquentus.hexcraftmod.init;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class HexcraftDamageTypes {

    public static final ResourceKey<DamageType> SACRIFICE = ResourceKey.create(Registries.DAMAGE_TYPE, HexcraftMod.id("sacrifice"));
    public static final ResourceKey<DamageType> SOUND = ResourceKey.create(Registries.DAMAGE_TYPE, HexcraftMod.id("sound"));
    public static final ResourceKey<DamageType> VOODOO = ResourceKey.create(Registries.DAMAGE_TYPE, HexcraftMod.id("voodoo"));

    public static DamageSource source(Level level, ResourceKey<DamageType> damageType) {
        return source(level, damageType, null);
    }

    public static DamageSource source(Level level, ResourceKey<DamageType> damageType, @Nullable Entity source) {
        return new DamageSource(level.registryAccess().registry(Registries.DAMAGE_TYPE).get().getHolderOrThrow(damageType), source);
    }

}