package net.masterquentus.hexcraftmod.datagen;

import org.jetbrains.annotations.Nullable;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;

public class HexcraftDamageTypes {
	public static final ResourceKey<DamageType> SACRIFICE = ResourceKey.create(Registries.DAMAGE_TYPE,
			HexcraftMod.id("sacrifice"));

	public static final ResourceKey<DamageType> SOUND = ResourceKey.create(Registries.DAMAGE_TYPE,
			HexcraftMod.id("sound"));

	public static final ResourceKey<DamageType> VOODOO = ResourceKey.create(Registries.DAMAGE_TYPE,
			HexcraftMod.id("voodoo"));

	// Unused unless used externally
	public static DamageSource source(Level level, ResourceKey<DamageType> damageType) {
		return source(level, damageType, null);
	}

	// Unused unless used externally
	public static DamageSource source(Level level, ResourceKey<DamageType> damageType, @Nullable Entity source) {
		return new DamageSource(
				level.registryAccess().registry(Registries.DAMAGE_TYPE).get().getHolderOrThrow(damageType), source);
	}

	public static void bootstrap(BootstapContext<DamageType> pContext) {
		pContext.register(SACRIFICE, new DamageType("sacrifice", 0.1F));
		pContext.register(SOUND, new DamageType("sound", 0.1F));
		pContext.register(VOODOO, new DamageType("voodoo", 0.1F));
	}
}