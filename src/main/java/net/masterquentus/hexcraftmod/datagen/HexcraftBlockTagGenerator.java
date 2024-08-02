package net.masterquentus.hexcraftmod.datagen;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class HexcraftBlockTagGenerator extends BlockTagsProvider {
    public HexcraftBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, HexcraftMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(HexcraftBlocks.AMETHYST_CHIMES.get(),
                        HexcraftBlocks.MOONSTONE_ORE.get(),
                        HexcraftBlocks.END_MOONSTONE_ORE.get(),
                        HexcraftBlocks.NETHER_MOONSTONE_ORE.get(),
                        HexcraftBlocks.DEEPSLATE_MOONSTONE_ORE.get(),
                        HexcraftBlocks.SILVER_ORE.get(),
                        HexcraftBlocks.END_SILVER_ORE.get(),
                        HexcraftBlocks.NETHER_SILVER_ORE.get(),
                        HexcraftBlocks.DEEPSLATE_SILVER_ORE.get(),
                        HexcraftBlocks.NYKIUM_ORE.get(),
                        HexcraftBlocks.TRENOGEN_ORE.get(),
                        HexcraftBlocks.DEEPSLATE_TRENOGEN_ORE.get(),
                        HexcraftBlocks.JORMUIM_ORE.get(),
                        HexcraftBlocks.MOONSTONE_BLOCK.get(),
                        HexcraftBlocks.SILVER_BLOCK.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(HexcraftBlocks.BLACK_OBSIDIAN.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(HexcraftBlocks.VAMPIRIC_ORE.get(),
                        HexcraftBlocks.END_VAMPIRIC_ORE.get(),
                        HexcraftBlocks.NETHER_VAMPIRIC_ORE.get(),
                        HexcraftBlocks.DEEPSLATE_VAMPIRIC_ORE.get(),
                        HexcraftBlocks.VAMPIRIC_BLOCK.get());


        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(HexcraftBlocks.VILE_GRASS_BLOCK.get(), HexcraftBlocks.VILE_DIRT.get(),
                     HexcraftBlocks.CURSED_SOIL.get(), HexcraftBlocks.CURED_SOIL.get(),
                     HexcraftBlocks.FERTILIZED_DIRT.get());
    }

}
