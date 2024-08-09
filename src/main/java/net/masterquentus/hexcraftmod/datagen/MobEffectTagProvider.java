package net.masterquentus.hexcraftmod.datagen;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.util.HexcraftTags;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class MobEffectTagProvider extends IntrinsicHolderTagsProvider<MobEffect> {

    public MobEffectTagProvider(PackOutput output, CompletableFuture<Provider> provider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, Registries.MOB_EFFECT, provider, mobEffect -> ForgeRegistries.MOB_EFFECTS.getResourceKey(mobEffect).orElse(null), HexcraftMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(Provider provider) {
        addHexcraftTags(provider);
    }

    private void addHexcraftTags(Provider provider) {

    }
}
