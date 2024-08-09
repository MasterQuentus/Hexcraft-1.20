package net.masterquentus.hexcraftmod.util;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class HexcraftTags {
    public static class Blocks {

        public static final TagKey<Block> DIRT_BLOCKS = tag("dirt_blocks");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(HexcraftMod.MOD_ID, name));

        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }

    }

    public static class Items {
        public static final TagKey<Item> VOODOO_POPPETS = createItemTag(HexcraftMod.id("voodoo_poppets"));

        public static final TagKey<Item> FIT_IN_WITCHES_SATCHEL = tag("fits_in_witches_satchel");

    }

    public static class MobEffects {


    }

    public static class Biomes {


    }

    public static class EntityTypes {
        public static final TagKey<EntityType<?>> MONSTERS = createEntityTag(HexcraftMod.id("monsters"));
        public static final TagKey<EntityType<?>> TAGLOCK_BLACKLIST = createEntityTag(HexcraftMod.id("taglock_blacklist"));
    }

    private static <T> TagKey<T> createTag(ResourceKey<? extends Registry<T>> registry, ResourceLocation name) {
        return TagKey.create(registry, name);
    }

    public static TagKey<Item> createItemTag(ResourceLocation name) {
        return createTag(Registries.ITEM, name);
    }

    private static TagKey<Item> tag(String name) {
        return ItemTags.create(new ResourceLocation(HexcraftMod.MOD_ID, name));
    }

    public static TagKey<Block> createBlockTag(ResourceLocation name) {
        return createTag(Registries.BLOCK, name);
    }

    public static TagKey<EntityType<?>> createEntityTag(ResourceLocation name) {
        return createTag(Registries.ENTITY_TYPE, name);
    }

    public static TagKey<Biome> createBiomeTag(ResourceLocation name) {
        return createTag(Registries.BIOME, name);
    }

    public static TagKey<MobEffect> createEffectTag(ResourceLocation name) {
        return createTag(Registries.MOB_EFFECT, name);
    }

}
