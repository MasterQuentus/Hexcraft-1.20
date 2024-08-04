package net.masterquentus.hexcraftmod.util;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Block;

public class HexcraftTags {
    public static class Blocks {

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(HexcraftMod.MOD_ID, name));
        }

    }


    public static class Items {

    }

    public static class EntityTypes {
        public static final TagKey<EntityType<?>> MONSTERS = createEntityTag(HexcraftMod.id("monsters"));
        public static final TagKey<EntityType<?>> TAGLOCK_BLACKLIST = createEntityTag(HexcraftMod.id("taglock_blacklist"));
    }

    private static <T> TagKey<T> createTag(ResourceKey<? extends Registry<T>> registry, ResourceLocation name) {
        return TagKey.create(registry, name);
    }

    public static TagKey<EntityType<?>> createEntityTag(ResourceLocation name) {
        return createTag(Registries.ENTITY_TYPE, name);
    }
}
