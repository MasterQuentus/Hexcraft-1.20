package net.masterquentus.hexcraftmod.datagen;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.masterquentus.hexcraftmod.util.HexcraftTags;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
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


    }

    public void addVanillaTags(Provider provider) {

    }

}
