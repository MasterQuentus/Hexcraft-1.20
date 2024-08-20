package net.masterquentus.hexcraftmod.datagen;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.masterquentus.hexcraftmod.util.HexcraftTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class HexcraftItemTagGenerator extends ItemTagsProvider {
    public HexcraftItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, HexcraftMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(HexcraftTags.Items.FIT_IN_WITCHES_SATCHEL)
                .addTags(ItemTags.SAPLINGS, ItemTags.FLOWERS, ItemTags.TALL_FLOWERS);

        tag(HexcraftTags.Items.WITCHES_OVEN_BLACKLIST)
                .addOptionalTag(new ResourceLocation("forge", "ores"))
                .addOptionalTag(new ResourceLocation("c", "ores"));

        this.tag(ItemTags.PLANKS)
                .add(HexcraftBlocks.EBONY_PLANKS.get().asItem())
                .add(HexcraftBlocks.BLOOD_OAK_PLANKS.get().asItem())
                .add(HexcraftBlocks.HELL_BARK_PLANKS.get().asItem())
                .add(HexcraftBlocks.WHITE_OAK_PLANKS.get().asItem())
                .add(HexcraftBlocks.ALDER_PLANKS.get().asItem())
                .add(HexcraftBlocks.WITCH_HAZEL_PLANKS.get().asItem())
                .add(HexcraftBlocks.WILLOW_PLANKS.get().asItem())
                .add(HexcraftBlocks.HAWTHORN_PLANKS.get().asItem())
                .add(HexcraftBlocks.CEDAR_PLANKS.get().asItem())
                .add(HexcraftBlocks.DISTORTED_PLANKS.get().asItem())
                .add(HexcraftBlocks.ELDER_PLANKS.get().asItem())
                .add(HexcraftBlocks.JUNIPER_PLANKS.get().asItem())
                .add(HexcraftBlocks.ROWAN_PLANKS.get().asItem())
                .add(HexcraftBlocks.TWISTED_PLANKS.get().asItem())
                .add(HexcraftBlocks.WITCH_WOOD_PLANKS.get().asItem())
                .add(HexcraftBlocks.ECHO_WOOD_PLANKS.get().asItem());

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(HexcraftBlocks.EBONY_LOG.get().asItem())
                .add(HexcraftBlocks.EBONY_WOOD.get().asItem())
                .add(HexcraftBlocks.STRIPPED_EBONY_LOG.get().asItem())
                .add(HexcraftBlocks.STRIPPED_EBONY_WOOD.get().asItem())
                .add(HexcraftBlocks.BLOOD_OAK_LOG.get().asItem())
                .add(HexcraftBlocks.BLOOD_OAK_WOOD.get().asItem())
                .add(HexcraftBlocks.STRIPPED_BLOOD_OAK_LOG.get().asItem())
                .add(HexcraftBlocks.STRIPPED_BLOOD_OAK_WOOD.get().asItem())
                .add(HexcraftBlocks.WHITE_OAK_LOG.get().asItem())
                .add(HexcraftBlocks.WHITE_OAK_WOOD.get().asItem())
                .add(HexcraftBlocks.STRIPPED_WHITE_OAK_LOG.get().asItem())
                .add(HexcraftBlocks.STRIPPED_WHITE_OAK_WOOD.get().asItem())
                .add(HexcraftBlocks.ALDER_LOG.get().asItem())
                .add(HexcraftBlocks.ALDER_WOOD.get().asItem())
                .add(HexcraftBlocks.STRIPPED_ALDER_LOG.get().asItem())
                .add(HexcraftBlocks.STRIPPED_ALDER_WOOD.get().asItem())
                .add(HexcraftBlocks.WITCH_HAZEL_LOG.get().asItem())
                .add(HexcraftBlocks.WITCH_HAZEL_WOOD.get().asItem())
                .add(HexcraftBlocks.STRIPPED_WITCH_HAZEL_LOG.get().asItem())
                .add(HexcraftBlocks.STRIPPED_WITCH_HAZEL_WOOD.get().asItem())
                .add(HexcraftBlocks.WILLOW_LOG.get().asItem())
                .add(HexcraftBlocks.WILLOW_WOOD.get().asItem())
                .add(HexcraftBlocks.STRIPPED_WILLOW_LOG.get().asItem())
                .add(HexcraftBlocks.STRIPPED_WILLOW_WOOD.get().asItem())
                .add(HexcraftBlocks.HAWTHORN_LOG.get().asItem())
                .add(HexcraftBlocks.HAWTHORN_WOOD.get().asItem())
                .add(HexcraftBlocks.STRIPPED_HAWTHORN_LOG.get().asItem())
                .add(HexcraftBlocks.STRIPPED_HAWTHORN_WOOD.get().asItem())
                .add(HexcraftBlocks.CEDAR_LOG.get().asItem())
                .add(HexcraftBlocks.CEDAR_WOOD.get().asItem())
                .add(HexcraftBlocks.STRIPPED_CEDAR_LOG.get().asItem())
                .add(HexcraftBlocks.STRIPPED_CEDAR_WOOD.get().asItem())
                .add(HexcraftBlocks.DISTORTED_LOG.get().asItem())
                .add(HexcraftBlocks.DISTORTED_WOOD.get().asItem())
                .add(HexcraftBlocks.STRIPPED_DISTORTED_LOG.get().asItem())
                .add(HexcraftBlocks.STRIPPED_DISTORTED_WOOD.get().asItem())
                .add(HexcraftBlocks.ELDER_LOG.get().asItem())
                .add(HexcraftBlocks.ELDER_WOOD.get().asItem())
                .add(HexcraftBlocks.STRIPPED_ELDER_LOG.get().asItem())
                .add(HexcraftBlocks.STRIPPED_ELDER_WOOD.get().asItem())
                .add(HexcraftBlocks.JUNIPER_LOG.get().asItem())
                .add(HexcraftBlocks.JUNIPER_WOOD.get().asItem())
                .add(HexcraftBlocks.STRIPPED_JUNIPER_LOG.get().asItem())
                .add(HexcraftBlocks.STRIPPED_JUNIPER_WOOD.get().asItem())
                .add(HexcraftBlocks.ROWAN_LOG.get().asItem())
                .add(HexcraftBlocks.ROWAN_WOOD.get().asItem())
                .add(HexcraftBlocks.STRIPPED_ROWAN_LOG.get().asItem())
                .add(HexcraftBlocks.STRIPPED_ROWAN_WOOD.get().asItem())
                .add(HexcraftBlocks.TWISTED_LOG.get().asItem())
                .add(HexcraftBlocks.TWISTED_WOOD.get().asItem())
                .add(HexcraftBlocks.STRIPPED_TWISTED_LOG.get().asItem())
                .add(HexcraftBlocks.STRIPPED_TWISTED_WOOD.get().asItem())
                .add(HexcraftBlocks.WITCH_WOOD_LOG.get().asItem())
                .add(HexcraftBlocks.WITCH_WOOD_WOOD.get().asItem())
                .add(HexcraftBlocks.STRIPPED_WITCH_WOOD_LOG.get().asItem())
                .add(HexcraftBlocks.STRIPPED_WITCH_WOOD_WOOD.get().asItem())
                .add(HexcraftBlocks.ECHO_WOOD_LOG.get().asItem())
                .add(HexcraftBlocks.ECHO_WOOD_WOOD.get().asItem())
                .add(HexcraftBlocks.STRIPPED_ECHO_WOOD_LOG.get().asItem())
                .add(HexcraftBlocks.STRIPPED_ECHO_WOOD_WOOD.get().asItem());

        this.tag(ItemTags.SAPLINGS)
                .add(HexcraftBlocks.EBONY_SAPLING.get().asItem())
                .add(HexcraftBlocks.BLOOD_OAK_SAPLING.get().asItem())
                .add(HexcraftBlocks.HELL_BARK_SAPLING.get().asItem())
                .add(HexcraftBlocks.WHITE_OAK_SAPLING.get().asItem())
                .add(HexcraftBlocks.ALDER_SAPLING.get().asItem())
                .add(HexcraftBlocks.WITCH_HAZEL_SAPLING.get().asItem())
                .add(HexcraftBlocks.WILLOW_SAPLING.get().asItem())
                .add(HexcraftBlocks.HAWTHORN_SAPLING.get().asItem())
                .add(HexcraftBlocks.CEDAR_SAPLING.get().asItem())
                .add(HexcraftBlocks.DISTORTED_SAPLING.get().asItem())
                .add(HexcraftBlocks.ELDER_SAPLING.get().asItem())
                .add(HexcraftBlocks.JUNIPER_SAPLING.get().asItem())
                .add(HexcraftBlocks.ROWAN_SAPLING.get().asItem())
                .add(HexcraftBlocks.TWISTED_SAPLING.get().asItem())
                .add(HexcraftBlocks.WITCH_WOOD_SAPLING.get().asItem())
                .add(HexcraftBlocks.ECHO_WOOD_SAPLING.get().asItem());

        this.tag(ItemTags.DIRT)
                .add(HexcraftBlocks.VILE_GRASS_BLOCK.get().asItem())
                .add(HexcraftBlocks.VILE_DIRT.get().asItem());

        this.tag(ItemTags.FLOWERS)
                .add(HexcraftBlocks.VAMPIRE_ORCHID.get().asItem())
                .add(HexcraftBlocks.BLOODY_ROSE.get().asItem());

        this.tag(ItemTags.LEAVES)
                .add(HexcraftBlocks.EBONY_LEAVES.get().asItem())
                .add(HexcraftBlocks.BLOOD_OAK_LEAVES.get().asItem())
                .add(HexcraftBlocks.HELL_BARK_LEAVES.get().asItem())
                .add(HexcraftBlocks.WHITE_OAK_LEAVES.get().asItem())
                .add(HexcraftBlocks.ALDER_LEAVES.get().asItem())
                .add(HexcraftBlocks.WITCH_HAZEL_LEAVES.get().asItem())
                .add(HexcraftBlocks.WILLOW_LEAVES.get().asItem())
                .add(HexcraftBlocks.HAWTHORN_LEAVES.get().asItem())
                .add(HexcraftBlocks.CEDAR_LEAVES.get().asItem())
                .add(HexcraftBlocks.DISTORTED_LEAVES.get().asItem())
                .add(HexcraftBlocks.ELDER_LEAVES.get().asItem())
                .add(HexcraftBlocks.JUNIPER_LEAVES.get().asItem())
                .add(HexcraftBlocks.ROWAN_LEAVES.get().asItem())
                .add(HexcraftBlocks.TWISTED_LEAVES.get().asItem())
                .add(HexcraftBlocks.WITCH_WOOD_LEAVES.get().asItem())
                .add(HexcraftBlocks.ECHO_WOOD_LEAVES.get().asItem());

        this.tag(ItemTags.SLABS)
                .add(HexcraftBlocks.PEARL_STONE_SLAB.get().asItem())
                .add(HexcraftBlocks.PEARL_COBBLESTONE_SLAB.get().asItem())
                .add(HexcraftBlocks.PEARL_STONE_BRICKS_SLAB.get().asItem())
                .add(HexcraftBlocks.POLISHED_PEARL_STONE_SLAB.get().asItem())
                .add(HexcraftBlocks.CRIMSON_STONE_SLAB.get().asItem())
                .add(HexcraftBlocks.CRIMSON_COBBLESTONE_SLAB.get().asItem())
                .add(HexcraftBlocks.CRIMSON_STONE_BRICKS_SLAB.get().asItem())
                .add(HexcraftBlocks.POLISHED_CRIMSON_STONE_SLAB.get().asItem())
                .add(HexcraftBlocks.UNDER_WORLD_STONE_SLAB.get().asItem())
                .add(HexcraftBlocks.UNDER_WORLD_COBBLESTONE_SLAB.get().asItem())
                .add(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS_SLAB.get().asItem())
                .add(HexcraftBlocks.POLISHED_UNDER_WORLD_STONE_SLAB.get().asItem())
                .add(HexcraftBlocks.CHARSTONE_SLAB.get().asItem())
                .add(HexcraftBlocks.CHARSTONE_COBBLESTONE_SLAB.get().asItem())
                .add(HexcraftBlocks.CHARSTONE_BRICKS_SLAB.get().asItem())
                .add(HexcraftBlocks.POLISHED_CHARSTONE_SLAB.get().asItem());

        this.tag(ItemTags.STAIRS)
                .add(HexcraftBlocks.PEARL_STONE_STAIRS.get().asItem())
                .add(HexcraftBlocks.PEARL_COBBLESTONE_STAIRS.get().asItem())
                .add(HexcraftBlocks.PEARL_STONE_BRICKS_STAIRS.get().asItem())
                .add(HexcraftBlocks.POLISHED_PEARL_STONE_STAIRS.get().asItem())
                .add(HexcraftBlocks.CRIMSON_STONE_STAIRS.get().asItem())
                .add(HexcraftBlocks.CRIMSON_COBBLESTONE_STAIRS.get().asItem())
                .add(HexcraftBlocks.CRIMSON_STONE_BRICKS_STAIRS.get().asItem())
                .add(HexcraftBlocks.POLISHED_CRIMSON_STONE_STAIRS.get().asItem())
                .add(HexcraftBlocks.UNDER_WORLD_STONE_STAIRS.get().asItem())
                .add(HexcraftBlocks.UNDER_WORLD_COBBLESTONE_STAIRS.get().asItem())
                .add(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS_STAIRS.get().asItem())
                .add(HexcraftBlocks.POLISHED_UNDER_WORLD_STONE_STAIRS.get().asItem())
                .add(HexcraftBlocks.CHARSTONE_STONE_STAIRS.get().asItem())
                .add(HexcraftBlocks.CHARSTONE_COBBLESTONE_STAIRS.get().asItem())
                .add(HexcraftBlocks.CHARSTONE_STONE_BRICKS_STAIRS.get().asItem())
                .add(HexcraftBlocks.POLISHED_CHARSTONE_STONE_STAIRS.get().asItem());

        this.tag(ItemTags.VILLAGER_PLANTABLE_SEEDS)
                .add(HexcraftItems.MANDRAKE_SEEDS.get().asItem())
                .add(HexcraftItems.GARLIC.get().asItem())
                .add(HexcraftItems.VERVAIN_SEEDS.get().asItem())
                .add(HexcraftItems.WOLFSBANE_SEEDS.get().asItem())
                .add(HexcraftItems.IRENIAL_SEEDS.get().asItem())
                .add(HexcraftItems.MIRA_SEEDS.get().asItem())
                .add(HexcraftItems.XERIFAE_SEEDS.get().asItem())
                .add(HexcraftItems.SENIA_SEEDS.get().asItem())
                .add(HexcraftItems.AERPINE_SEEDS.get().asItem())
                .add(HexcraftItems.PERENNIA_SEEDS.get().asItem())
                .add(HexcraftItems.BELLADONNA_SEEDS.get().asItem())
                .add(HexcraftItems.HELLEBORE_SEEDS.get().asItem())
                .add(HexcraftItems.SAGE_SEEDS.get().asItem())
                .add(HexcraftItems.WORMWOOD_SEEDS.get().asItem())
                .add(HexcraftItems.WATER_ARTICHOKE_SEEDS.get().asItem());

        this.tag(ItemTags.NON_FLAMMABLE_WOOD)
                .add(HexcraftBlocks.HELL_BARK_LOG.get().asItem())
                .add(HexcraftBlocks.HELL_BARK_WOOD.get().asItem())
                .add(HexcraftBlocks.STRIPPED_HELL_BARK_LOG.get().asItem())
                .add(HexcraftBlocks.STRIPPED_HELL_BARK_WOOD.get().asItem())
                .add(HexcraftBlocks.HELL_BARK_PLANKS.get().asItem());



    }

    public void addVanillaTags(Provider provider) {

    }

}
