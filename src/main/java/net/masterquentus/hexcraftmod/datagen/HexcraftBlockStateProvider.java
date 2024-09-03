package net.masterquentus.hexcraftmod.datagen;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftBlockStateProvider extends BlockStateProvider {
    public HexcraftBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, HexcraftMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(HexcraftBlocks.VILE_DIRT);
        blockWithItem((RegistryObject<Block>) HexcraftBlocks.EMBER_MOSS_BLOCK);
        blockWithItem(HexcraftBlocks.CRIMSON_MAGMA);
        blockWithItem(HexcraftBlocks.CURSED_SOIL);
        blockWithItem(HexcraftBlocks.CURED_SOIL);
        blockWithItem(HexcraftBlocks.FERTILIZED_DIRT);
        blockWithItem(HexcraftBlocks.BLACK_OBSIDIAN);
        blockWithItem(HexcraftBlocks.PEARL_STONE);
        blockWithItem(HexcraftBlocks.PEARL_COBBLESTONE);
        blockWithItem(HexcraftBlocks.PEARL_STONE_BRICKS);
        blockWithItem(HexcraftBlocks.POLISHED_PEARL_STONE);
        blockWithItem(HexcraftBlocks.CHISELED_PEARL_STONE);
        blockWithItem(HexcraftBlocks.CRACKED_PEARL_STONE);
        blockWithItem(HexcraftBlocks.CRIMSON_STONE);
        blockWithItem(HexcraftBlocks.CRIMSON_COBBLESTONE);
        blockWithItem(HexcraftBlocks.CRIMSON_STONE_BRICKS);
        blockWithItem(HexcraftBlocks.POLISHED_CRIMSON_STONE);
        blockWithItem(HexcraftBlocks.CHISELED_CRIMSON_STONE);
        blockWithItem(HexcraftBlocks.CRACKED_CRIMSON_STONE);
        blockWithItem(HexcraftBlocks.UNDER_WORLD_STONE);
        blockWithItem(HexcraftBlocks.UNDER_WORLD_COBBLESTONE);
        blockWithItem(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS);
        blockWithItem(HexcraftBlocks.POLISHED_UNDER_WORLD_STONE);
        blockWithItem(HexcraftBlocks.CHISELED_UNDER_WORLD_STONE);
        blockWithItem(HexcraftBlocks.CRACKED_UNDER_WORLD_STONE);
        blockWithItem(HexcraftBlocks.CHARSTONE);
        blockWithItem(HexcraftBlocks.CHARSTONE_COBBLESTONE);
        blockWithItem(HexcraftBlocks.CHARSTONE_BRICKS);
        blockWithItem(HexcraftBlocks.POLISHED_CHARSTONE);
        blockWithItem(HexcraftBlocks.CHISELED_CHARSTONE);
        blockWithItem(HexcraftBlocks.CRACKED_CHARSTONE);
        blockWithItem(HexcraftBlocks.CRIMSON_SAND);
        blockWithItem(HexcraftBlocks.CRIMSON_SAND_STONE);
        blockWithItem(HexcraftBlocks.SMOOTH_CRIMSON_SAND_STONE);
        blockWithItem(HexcraftBlocks.CHISELED_CRIMSON_SAND_STONE);
        blockWithItem(HexcraftBlocks.CUT_CRIMSON_SAND_STONE);
        blockWithItem(HexcraftBlocks.FAIRY_SAND);
        blockWithItem(HexcraftBlocks.FAIRY_SAND_STONE);
        blockWithItem(HexcraftBlocks.SMOOTH_FAIRY_SAND_STONE);
        blockWithItem(HexcraftBlocks.CHISELED_FAIRY_SAND_STONE);
        blockWithItem(HexcraftBlocks.CUT_FAIRY_SAND_STONE);
        blockWithItem(HexcraftBlocks.MOONSTONE_ORE);
        blockWithItem(HexcraftBlocks.END_MOONSTONE_ORE);
        blockWithItem(HexcraftBlocks.NETHER_MOONSTONE_ORE);
        blockWithItem(HexcraftBlocks.DEEPSLATE_MOONSTONE_ORE);
        blockWithItem(HexcraftBlocks.SILVER_ORE);
        blockWithItem(HexcraftBlocks.END_SILVER_ORE);
        blockWithItem(HexcraftBlocks.NETHER_SILVER_ORE);
        blockWithItem(HexcraftBlocks.DEEPSLATE_SILVER_ORE);
        blockWithItem(HexcraftBlocks.VAMPIRIC_ORE);
        blockWithItem(HexcraftBlocks.END_VAMPIRIC_ORE);
        blockWithItem(HexcraftBlocks.NETHER_VAMPIRIC_ORE);
        blockWithItem(HexcraftBlocks.DEEPSLATE_VAMPIRIC_ORE);
        blockWithItem(HexcraftBlocks.NYKIUM_ORE);
        blockWithItem(HexcraftBlocks.TRENOGEN_ORE);
        blockWithItem(HexcraftBlocks.DEEPSLATE_TRENOGEN_ORE);
        blockWithItem(HexcraftBlocks.JORMUIM_ORE);
        blockWithItem(HexcraftBlocks.MOONSTONE_BLOCK);
        blockWithItem(HexcraftBlocks.SILVER_BLOCK);
        blockWithItem(HexcraftBlocks.VAMPIRIC_BLOCK);
        blockWithItem(HexcraftBlocks.MAGIC_CRYSTAL_BLOCK);
        stairsBlock(((StairBlock) HexcraftBlocks.PEARL_STONE_STAIRS.get()), blockTexture(HexcraftBlocks.PEARL_STONE.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.PEARL_COBBLESTONE_STAIRS.get()), blockTexture(HexcraftBlocks.PEARL_COBBLESTONE.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.PEARL_STONE_BRICKS_STAIRS.get()), blockTexture(HexcraftBlocks.PEARL_STONE_BRICKS.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.POLISHED_PEARL_STONE_STAIRS.get()), blockTexture(HexcraftBlocks.POLISHED_PEARL_STONE.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.CRIMSON_STONE_STAIRS.get()), blockTexture(HexcraftBlocks.CRIMSON_STONE.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.CRIMSON_COBBLESTONE_STAIRS.get()), blockTexture(HexcraftBlocks.CRIMSON_COBBLESTONE.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.CRIMSON_STONE_BRICKS_STAIRS.get()), blockTexture(HexcraftBlocks.CRIMSON_STONE_BRICKS.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.POLISHED_CRIMSON_STONE_STAIRS.get()), blockTexture(HexcraftBlocks.POLISHED_CRIMSON_STONE.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.UNDER_WORLD_STONE_STAIRS.get()), blockTexture(HexcraftBlocks.UNDER_WORLD_STONE.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.UNDER_WORLD_COBBLESTONE_STAIRS.get()), blockTexture(HexcraftBlocks.UNDER_WORLD_COBBLESTONE.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.UNDER_WORLD_STONE_BRICKS_STAIRS.get()), blockTexture(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.POLISHED_UNDER_WORLD_STONE_STAIRS.get()), blockTexture(HexcraftBlocks.POLISHED_UNDER_WORLD_STONE.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.CHARSTONE_STONE_STAIRS.get()), blockTexture(HexcraftBlocks.CHARSTONE.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.CHARSTONE_COBBLESTONE_STAIRS.get()), blockTexture(HexcraftBlocks.CHARSTONE_COBBLESTONE.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.CHARSTONE_STONE_BRICKS_STAIRS.get()), blockTexture(HexcraftBlocks.CHARSTONE_BRICKS.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.POLISHED_CHARSTONE_STONE_STAIRS.get()), blockTexture(HexcraftBlocks.POLISHED_CHARSTONE.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.CRIMSON_SAND_STONE_STAIRS.get()), blockTexture(HexcraftBlocks.CRIMSON_SAND_STONE.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.SMOOTH_CRIMSON_SAND_STONE_STAIRS.get()), blockTexture(HexcraftBlocks.SMOOTH_CRIMSON_SAND_STONE.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.FAIRY_SAND_STONE_STAIRS.get()), blockTexture(HexcraftBlocks.FAIRY_SAND_STONE.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.SMOOTH_FAIRY_SAND_STONE_STAIRS.get()), blockTexture(HexcraftBlocks.SMOOTH_FAIRY_SAND_STONE.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.PEARL_STONE_SLAB.get()), blockTexture(HexcraftBlocks.PEARL_STONE.get()), blockTexture(HexcraftBlocks.PEARL_STONE.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.PEARL_COBBLESTONE_SLAB.get()), blockTexture(HexcraftBlocks.PEARL_COBBLESTONE.get()), blockTexture(HexcraftBlocks.PEARL_COBBLESTONE.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.PEARL_STONE_BRICKS_SLAB.get()), blockTexture(HexcraftBlocks.PEARL_STONE_BRICKS.get()), blockTexture(HexcraftBlocks.PEARL_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.POLISHED_PEARL_STONE_SLAB.get()), blockTexture(HexcraftBlocks.POLISHED_PEARL_STONE.get()), blockTexture(HexcraftBlocks.POLISHED_PEARL_STONE.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.CRIMSON_STONE_SLAB.get()), blockTexture(HexcraftBlocks.CRIMSON_STONE.get()), blockTexture(HexcraftBlocks.CRIMSON_STONE.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.CRIMSON_COBBLESTONE_SLAB.get()), blockTexture(HexcraftBlocks.CRIMSON_COBBLESTONE.get()), blockTexture(HexcraftBlocks.CRIMSON_COBBLESTONE.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.CRIMSON_STONE_BRICKS_SLAB.get()), blockTexture(HexcraftBlocks.CRIMSON_STONE_BRICKS.get()), blockTexture(HexcraftBlocks.CRIMSON_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.POLISHED_CRIMSON_STONE_SLAB.get()), blockTexture(HexcraftBlocks.POLISHED_CRIMSON_STONE.get()), blockTexture(HexcraftBlocks.POLISHED_CRIMSON_STONE.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.UNDER_WORLD_STONE_SLAB.get()), blockTexture(HexcraftBlocks.UNDER_WORLD_STONE.get()), blockTexture(HexcraftBlocks.UNDER_WORLD_STONE.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.UNDER_WORLD_COBBLESTONE_SLAB.get()), blockTexture(HexcraftBlocks.UNDER_WORLD_COBBLESTONE.get()), blockTexture(HexcraftBlocks.UNDER_WORLD_COBBLESTONE.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.UNDER_WORLD_STONE_BRICKS_SLAB.get()), blockTexture(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get()), blockTexture(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.POLISHED_UNDER_WORLD_STONE_SLAB.get()), blockTexture(HexcraftBlocks.POLISHED_UNDER_WORLD_STONE.get()), blockTexture(HexcraftBlocks.POLISHED_UNDER_WORLD_STONE.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.CHARSTONE_SLAB.get()), blockTexture(HexcraftBlocks.CHARSTONE.get()), blockTexture(HexcraftBlocks.CHARSTONE.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.CHARSTONE_COBBLESTONE_SLAB.get()), blockTexture(HexcraftBlocks.CHARSTONE_COBBLESTONE.get()), blockTexture(HexcraftBlocks.CHARSTONE_COBBLESTONE.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.CHARSTONE_BRICKS_SLAB.get()), blockTexture(HexcraftBlocks.CHARSTONE_BRICKS.get()), blockTexture(HexcraftBlocks.CHARSTONE_BRICKS.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.POLISHED_CHARSTONE_SLAB.get()), blockTexture(HexcraftBlocks.POLISHED_CHARSTONE.get()), blockTexture(HexcraftBlocks.POLISHED_CHARSTONE.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.CRIMSON_SAND_STONE_SLAB.get()), blockTexture(HexcraftBlocks.CRIMSON_SAND_STONE.get()), blockTexture(HexcraftBlocks.CRIMSON_SAND_STONE.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.SMOOTH_CRIMSON_SAND_STONE_SLAB.get()), blockTexture(HexcraftBlocks.SMOOTH_CRIMSON_SAND_STONE.get()), blockTexture(HexcraftBlocks.SMOOTH_CRIMSON_SAND_STONE.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.CUT_CRIMSON_SAND_STONE_SLAB.get()), blockTexture(HexcraftBlocks.CUT_CRIMSON_SAND_STONE.get()), blockTexture(HexcraftBlocks.CUT_CRIMSON_SAND_STONE.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.FAIRY_SAND_STONE_SLAB.get()), blockTexture(HexcraftBlocks.FAIRY_SAND_STONE.get()), blockTexture(HexcraftBlocks.FAIRY_SAND_STONE.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.SMOOTH_FAIRY_SAND_STONE_SLAB.get()), blockTexture(HexcraftBlocks.SMOOTH_FAIRY_SAND_STONE.get()), blockTexture(HexcraftBlocks.SMOOTH_FAIRY_SAND_STONE.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.CUT_FAIRY_SAND_STONE_SLAB.get()), blockTexture(HexcraftBlocks.CUT_FAIRY_SAND_STONE.get()), blockTexture(HexcraftBlocks.CUT_FAIRY_SAND_STONE.get()));





        logBlock(((RotatedPillarBlock) HexcraftBlocks.EBONY_LOG.get()));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.EBONY_WOOD.get()), blockTexture(HexcraftBlocks.EBONY_LOG.get()), blockTexture(HexcraftBlocks.EBONY_LOG.get()));

        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_EBONY_LOG.get()), blockTexture(HexcraftBlocks.STRIPPED_EBONY_LOG.get()),
                new ResourceLocation(HexcraftMod.MOD_ID, "block/stripped_ebony_log_top"));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_EBONY_WOOD.get()), blockTexture(HexcraftBlocks.STRIPPED_EBONY_LOG.get()),
                blockTexture(HexcraftBlocks.STRIPPED_EBONY_LOG.get()));

        blockItem(HexcraftBlocks.EBONY_LOG);
        blockItem(HexcraftBlocks.EBONY_WOOD);
        blockItem(HexcraftBlocks.STRIPPED_EBONY_LOG);
        blockItem(HexcraftBlocks.STRIPPED_EBONY_WOOD);

        blockWithItem(HexcraftBlocks.EBONY_PLANKS);

        leavesBlock(HexcraftBlocks.EBONY_LEAVES);

        logBlock(((RotatedPillarBlock) HexcraftBlocks.BLOOD_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.BLOOD_OAK_WOOD.get()), blockTexture(HexcraftBlocks.BLOOD_OAK_LOG.get()), blockTexture(HexcraftBlocks.BLOOD_OAK_LOG.get()));

        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_BLOOD_OAK_LOG.get()), blockTexture(HexcraftBlocks.STRIPPED_BLOOD_OAK_LOG.get()),
                new ResourceLocation(HexcraftMod.MOD_ID, "block/stripped_blood_oak_log_top"));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_BLOOD_OAK_WOOD.get()), blockTexture(HexcraftBlocks.STRIPPED_BLOOD_OAK_LOG.get()),
                blockTexture(HexcraftBlocks.STRIPPED_BLOOD_OAK_LOG.get()));

        blockItem(HexcraftBlocks.BLOOD_OAK_LOG);
        blockItem(HexcraftBlocks.BLOOD_OAK_WOOD);
        blockItem(HexcraftBlocks.STRIPPED_BLOOD_OAK_LOG);
        blockItem(HexcraftBlocks.STRIPPED_BLOOD_OAK_WOOD);

        blockWithItem(HexcraftBlocks.BLOOD_OAK_PLANKS);

        leavesBlock(HexcraftBlocks.BLOOD_OAK_LEAVES);

        logBlock(((RotatedPillarBlock) HexcraftBlocks.HELL_BARK_LOG.get()));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.HELL_BARK_WOOD.get()), blockTexture(HexcraftBlocks.HELL_BARK_LOG.get()), blockTexture(HexcraftBlocks.HELL_BARK_LOG.get()));

        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_HELL_BARK_LOG.get()), blockTexture(HexcraftBlocks.STRIPPED_HELL_BARK_LOG.get()),
                new ResourceLocation(HexcraftMod.MOD_ID, "block/stripped_hell_bark_log_top"));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_HELL_BARK_WOOD.get()), blockTexture(HexcraftBlocks.STRIPPED_HELL_BARK_LOG.get()),
                blockTexture(HexcraftBlocks.STRIPPED_HELL_BARK_LOG.get()));

        blockItem(HexcraftBlocks.HELL_BARK_LOG);
        blockItem(HexcraftBlocks.HELL_BARK_WOOD);
        blockItem(HexcraftBlocks.STRIPPED_HELL_BARK_LOG);
        blockItem(HexcraftBlocks.STRIPPED_HELL_BARK_WOOD);

        blockWithItem(HexcraftBlocks.HELL_BARK_PLANKS);

        leavesBlock(HexcraftBlocks.HELL_BARK_LEAVES);

        logBlock(((RotatedPillarBlock) HexcraftBlocks.WHITE_OAK_LOG.get()));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.WHITE_OAK_WOOD.get()), blockTexture(HexcraftBlocks.WHITE_OAK_LOG.get()), blockTexture(HexcraftBlocks.WHITE_OAK_LOG.get()));

        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_WHITE_OAK_LOG.get()), blockTexture(HexcraftBlocks.STRIPPED_WHITE_OAK_LOG.get()),
                new ResourceLocation(HexcraftMod.MOD_ID, "block/stripped_white_oak_log_top"));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_WHITE_OAK_WOOD.get()), blockTexture(HexcraftBlocks.STRIPPED_WHITE_OAK_LOG.get()),
                blockTexture(HexcraftBlocks.STRIPPED_WHITE_OAK_LOG.get()));

        blockItem(HexcraftBlocks.WHITE_OAK_LOG);
        blockItem(HexcraftBlocks.WHITE_OAK_WOOD);
        blockItem(HexcraftBlocks.STRIPPED_WHITE_OAK_LOG);
        blockItem(HexcraftBlocks.STRIPPED_WHITE_OAK_WOOD);

        blockWithItem(HexcraftBlocks.WHITE_OAK_PLANKS);

        leavesBlock(HexcraftBlocks.WHITE_OAK_LEAVES);

        logBlock(((RotatedPillarBlock) HexcraftBlocks.ALDER_LOG.get()));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.ALDER_WOOD.get()), blockTexture(HexcraftBlocks.ALDER_LOG.get()), blockTexture(HexcraftBlocks.ALDER_LOG.get()));

        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_ALDER_LOG.get()), blockTexture(HexcraftBlocks.STRIPPED_ALDER_LOG.get()),
                new ResourceLocation(HexcraftMod.MOD_ID, "block/stripped_alder_log_top"));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_ALDER_WOOD.get()), blockTexture(HexcraftBlocks.STRIPPED_ALDER_LOG.get()),
                blockTexture(HexcraftBlocks.STRIPPED_ALDER_LOG.get()));

        blockItem(HexcraftBlocks.ALDER_LOG);
        blockItem(HexcraftBlocks.ALDER_WOOD);
        blockItem(HexcraftBlocks.STRIPPED_ALDER_LOG);
        blockItem(HexcraftBlocks.STRIPPED_ALDER_WOOD);

        blockWithItem(HexcraftBlocks.ALDER_PLANKS);

        leavesBlock(HexcraftBlocks.ALDER_LEAVES);

        logBlock(((RotatedPillarBlock) HexcraftBlocks.WITCH_HAZEL_LOG.get()));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.WITCH_HAZEL_WOOD.get()), blockTexture(HexcraftBlocks.WITCH_HAZEL_LOG.get()), blockTexture(HexcraftBlocks.WITCH_HAZEL_LOG.get()));

        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_WITCH_HAZEL_LOG.get()), blockTexture(HexcraftBlocks.STRIPPED_WITCH_HAZEL_LOG.get()),
                new ResourceLocation(HexcraftMod.MOD_ID, "block/stripped_witch_hazel_log_top"));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_WITCH_HAZEL_WOOD.get()), blockTexture(HexcraftBlocks.STRIPPED_WITCH_HAZEL_LOG.get()),
                blockTexture(HexcraftBlocks.STRIPPED_WITCH_HAZEL_LOG.get()));

        blockItem(HexcraftBlocks.WITCH_HAZEL_LOG);
        blockItem(HexcraftBlocks.WITCH_HAZEL_WOOD);
        blockItem(HexcraftBlocks.STRIPPED_WITCH_HAZEL_LOG);
        blockItem(HexcraftBlocks.STRIPPED_WITCH_HAZEL_WOOD);

        blockWithItem(HexcraftBlocks.WITCH_HAZEL_PLANKS);

        leavesBlock(HexcraftBlocks.WITCH_HAZEL_LEAVES);

        logBlock(((RotatedPillarBlock) HexcraftBlocks.WILLOW_LOG.get()));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.WILLOW_WOOD.get()), blockTexture(HexcraftBlocks.WILLOW_LOG.get()), blockTexture(HexcraftBlocks.WILLOW_LOG.get()));

        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_WILLOW_LOG.get()), blockTexture(HexcraftBlocks.STRIPPED_WILLOW_LOG.get()),
                new ResourceLocation(HexcraftMod.MOD_ID, "block/stripped_willow_log_top"));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_WILLOW_WOOD.get()), blockTexture(HexcraftBlocks.STRIPPED_WILLOW_LOG.get()),
                blockTexture(HexcraftBlocks.STRIPPED_WILLOW_LOG.get()));

        blockItem(HexcraftBlocks.WILLOW_LOG);
        blockItem(HexcraftBlocks.WILLOW_WOOD);
        blockItem(HexcraftBlocks.STRIPPED_WILLOW_LOG);
        blockItem(HexcraftBlocks.STRIPPED_WILLOW_WOOD);

        blockWithItem(HexcraftBlocks.WILLOW_PLANKS);

        leavesBlock(HexcraftBlocks.WILLOW_LEAVES);

        logBlock(((RotatedPillarBlock) HexcraftBlocks.HAWTHORN_LOG.get()));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.HAWTHORN_WOOD.get()), blockTexture(HexcraftBlocks.HAWTHORN_LOG.get()), blockTexture(HexcraftBlocks.HAWTHORN_LOG.get()));

        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_HAWTHORN_LOG.get()), blockTexture(HexcraftBlocks.STRIPPED_HAWTHORN_LOG.get()),
                new ResourceLocation(HexcraftMod.MOD_ID, "block/stripped_hawthorn_log_top"));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_HAWTHORN_WOOD.get()), blockTexture(HexcraftBlocks.STRIPPED_HAWTHORN_LOG.get()),
                blockTexture(HexcraftBlocks.STRIPPED_HAWTHORN_LOG.get()));

        blockItem(HexcraftBlocks.HAWTHORN_LOG);
        blockItem(HexcraftBlocks.HAWTHORN_WOOD);
        blockItem(HexcraftBlocks.STRIPPED_HAWTHORN_LOG);
        blockItem(HexcraftBlocks.STRIPPED_HAWTHORN_WOOD);

        blockWithItem(HexcraftBlocks.HAWTHORN_PLANKS);

        leavesBlock(HexcraftBlocks.HAWTHORN_LEAVES);

        logBlock(((RotatedPillarBlock) HexcraftBlocks.CEDAR_LOG.get()));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.CEDAR_WOOD.get()), blockTexture(HexcraftBlocks.CEDAR_LOG.get()), blockTexture(HexcraftBlocks.CEDAR_LOG.get()));

        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_CEDAR_LOG.get()), blockTexture(HexcraftBlocks.STRIPPED_CEDAR_LOG.get()),
                new ResourceLocation(HexcraftMod.MOD_ID, "block/stripped_cedar_log_top"));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_CEDAR_WOOD.get()), blockTexture(HexcraftBlocks.STRIPPED_CEDAR_LOG.get()),
                blockTexture(HexcraftBlocks.STRIPPED_CEDAR_LOG.get()));

        blockItem(HexcraftBlocks.CEDAR_LOG);
        blockItem(HexcraftBlocks.CEDAR_WOOD);
        blockItem(HexcraftBlocks.STRIPPED_CEDAR_LOG);
        blockItem(HexcraftBlocks.STRIPPED_CEDAR_WOOD);

        blockWithItem(HexcraftBlocks.CEDAR_PLANKS);

        leavesBlock(HexcraftBlocks.CEDAR_LEAVES);

        logBlock(((RotatedPillarBlock) HexcraftBlocks.DISTORTED_LOG.get()));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.DISTORTED_WOOD.get()), blockTexture(HexcraftBlocks.DISTORTED_LOG.get()), blockTexture(HexcraftBlocks.DISTORTED_LOG.get()));

        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_DISTORTED_LOG.get()), blockTexture(HexcraftBlocks.STRIPPED_DISTORTED_LOG.get()),
                new ResourceLocation(HexcraftMod.MOD_ID, "block/stripped_distorted_log_top"));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_DISTORTED_WOOD.get()), blockTexture(HexcraftBlocks.STRIPPED_DISTORTED_LOG.get()),
                blockTexture(HexcraftBlocks.STRIPPED_DISTORTED_LOG.get()));

        blockItem(HexcraftBlocks.DISTORTED_LOG);
        blockItem(HexcraftBlocks.DISTORTED_WOOD);
        blockItem(HexcraftBlocks.STRIPPED_DISTORTED_LOG);
        blockItem(HexcraftBlocks.STRIPPED_DISTORTED_WOOD);

        blockWithItem(HexcraftBlocks.DISTORTED_PLANKS);

        leavesBlock(HexcraftBlocks.DISTORTED_LEAVES);

        logBlock(((RotatedPillarBlock) HexcraftBlocks.ELDER_LOG.get()));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.ELDER_WOOD.get()), blockTexture(HexcraftBlocks.ELDER_LOG.get()), blockTexture(HexcraftBlocks.ELDER_LOG.get()));

        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_ELDER_LOG.get()), blockTexture(HexcraftBlocks.STRIPPED_ELDER_LOG.get()),
                new ResourceLocation(HexcraftMod.MOD_ID, "block/stripped_elder_log_top"));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_ELDER_WOOD.get()), blockTexture(HexcraftBlocks.STRIPPED_ELDER_LOG.get()),
                blockTexture(HexcraftBlocks.STRIPPED_ELDER_LOG.get()));

        blockItem(HexcraftBlocks.ELDER_LOG);
        blockItem(HexcraftBlocks.ELDER_WOOD);
        blockItem(HexcraftBlocks.STRIPPED_ELDER_LOG);
        blockItem(HexcraftBlocks.STRIPPED_ELDER_WOOD);

        blockWithItem(HexcraftBlocks.ELDER_PLANKS);

        leavesBlock(HexcraftBlocks.ELDER_LEAVES);

        logBlock(((RotatedPillarBlock) HexcraftBlocks.JUNIPER_LOG.get()));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.JUNIPER_WOOD.get()), blockTexture(HexcraftBlocks.JUNIPER_LOG.get()), blockTexture(HexcraftBlocks.JUNIPER_LOG.get()));

        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_JUNIPER_LOG.get()), blockTexture(HexcraftBlocks.STRIPPED_JUNIPER_LOG.get()),
                new ResourceLocation(HexcraftMod.MOD_ID, "block/stripped_juniper_log_top"));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_JUNIPER_WOOD.get()), blockTexture(HexcraftBlocks.STRIPPED_JUNIPER_LOG.get()),
                blockTexture(HexcraftBlocks.STRIPPED_JUNIPER_LOG.get()));

        blockItem(HexcraftBlocks.JUNIPER_LOG);
        blockItem(HexcraftBlocks.JUNIPER_WOOD);
        blockItem(HexcraftBlocks.STRIPPED_JUNIPER_LOG);
        blockItem(HexcraftBlocks.STRIPPED_JUNIPER_WOOD);

        blockWithItem(HexcraftBlocks.JUNIPER_PLANKS);

        leavesBlock(HexcraftBlocks.JUNIPER_LEAVES);

        logBlock(((RotatedPillarBlock) HexcraftBlocks.ROWAN_LOG.get()));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.ROWAN_WOOD.get()), blockTexture(HexcraftBlocks.ROWAN_LOG.get()), blockTexture(HexcraftBlocks.ROWAN_LOG.get()));

        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_ROWAN_LOG.get()), blockTexture(HexcraftBlocks.STRIPPED_ROWAN_LOG.get()),
                new ResourceLocation(HexcraftMod.MOD_ID, "block/stripped_rowan_log_top"));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_ROWAN_WOOD.get()), blockTexture(HexcraftBlocks.STRIPPED_ROWAN_LOG.get()),
                blockTexture(HexcraftBlocks.STRIPPED_ROWAN_LOG.get()));

        blockItem(HexcraftBlocks.ROWAN_LOG);
        blockItem(HexcraftBlocks.ROWAN_WOOD);
        blockItem(HexcraftBlocks.STRIPPED_ROWAN_LOG);
        blockItem(HexcraftBlocks.STRIPPED_ROWAN_WOOD);

        blockWithItem(HexcraftBlocks.ROWAN_PLANKS);

        leavesBlock(HexcraftBlocks.ROWAN_LEAVES);

        logBlock(((RotatedPillarBlock) HexcraftBlocks.TWISTED_LOG.get()));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.TWISTED_WOOD.get()), blockTexture(HexcraftBlocks.TWISTED_LOG.get()), blockTexture(HexcraftBlocks.TWISTED_LOG.get()));

        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_TWISTED_LOG.get()), blockTexture(HexcraftBlocks.STRIPPED_TWISTED_LOG.get()),
                new ResourceLocation(HexcraftMod.MOD_ID, "block/stripped_twisted_log_top"));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_TWISTED_WOOD.get()), blockTexture(HexcraftBlocks.STRIPPED_TWISTED_LOG.get()),
                blockTexture(HexcraftBlocks.STRIPPED_TWISTED_LOG.get()));

        blockItem(HexcraftBlocks.TWISTED_LOG);
        blockItem(HexcraftBlocks.TWISTED_WOOD);
        blockItem(HexcraftBlocks.STRIPPED_TWISTED_LOG);
        blockItem(HexcraftBlocks.STRIPPED_TWISTED_WOOD);

        blockWithItem(HexcraftBlocks.TWISTED_PLANKS);

        leavesBlock(HexcraftBlocks.TWISTED_LEAVES);

        logBlock(((RotatedPillarBlock) HexcraftBlocks.WITCH_WOOD_LOG.get()));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.WITCH_WOOD_WOOD.get()), blockTexture(HexcraftBlocks.WITCH_WOOD_LOG.get()), blockTexture(HexcraftBlocks.WITCH_WOOD_LOG.get()));

        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_WITCH_WOOD_LOG.get()), blockTexture(HexcraftBlocks.STRIPPED_WITCH_WOOD_LOG.get()),
                new ResourceLocation(HexcraftMod.MOD_ID, "block/stripped_witch_wood_log_top"));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_WITCH_WOOD_WOOD.get()), blockTexture(HexcraftBlocks.STRIPPED_WITCH_WOOD_LOG.get()),
                blockTexture(HexcraftBlocks.STRIPPED_WITCH_WOOD_LOG.get()));

        blockItem(HexcraftBlocks.WITCH_WOOD_LOG);
        blockItem(HexcraftBlocks.WITCH_WOOD_WOOD);
        blockItem(HexcraftBlocks.STRIPPED_WITCH_WOOD_LOG);
        blockItem(HexcraftBlocks.STRIPPED_WITCH_WOOD_WOOD);

        blockWithItem(HexcraftBlocks.WITCH_WOOD_PLANKS);

        leavesBlock(HexcraftBlocks.WITCH_WOOD_LEAVES);

        logBlock(((RotatedPillarBlock) HexcraftBlocks.ECHO_WOOD_LOG.get()));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.ECHO_WOOD_WOOD.get()), blockTexture(HexcraftBlocks.ECHO_WOOD_LOG.get()), blockTexture(HexcraftBlocks.ECHO_WOOD_LOG.get()));

        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_ECHO_WOOD_LOG.get()), blockTexture(HexcraftBlocks.STRIPPED_ECHO_WOOD_LOG.get()),
                new ResourceLocation(HexcraftMod.MOD_ID, "block/stripped_echo-wood_log_top"));
        axisBlock(((RotatedPillarBlock) HexcraftBlocks.STRIPPED_ECHO_WOOD_WOOD.get()), blockTexture(HexcraftBlocks.STRIPPED_ECHO_WOOD_LOG.get()),
                blockTexture(HexcraftBlocks.STRIPPED_ECHO_WOOD_LOG.get()));

        blockItem(HexcraftBlocks.ECHO_WOOD_LOG);
        blockItem(HexcraftBlocks.ECHO_WOOD_WOOD);
        blockItem(HexcraftBlocks.STRIPPED_ECHO_WOOD_LOG);
        blockItem(HexcraftBlocks.STRIPPED_ECHO_WOOD_WOOD);

        blockWithItem(HexcraftBlocks.ECHO_WOOD_PLANKS);

        leavesBlock(HexcraftBlocks.ECHO_WOOD_LEAVES);

        saplingBlock(HexcraftBlocks.EBONY_SAPLING);
        saplingBlock(HexcraftBlocks.BLOOD_OAK_SAPLING);
        saplingBlock(HexcraftBlocks.HELL_BARK_SAPLING);
        saplingBlock(HexcraftBlocks.WHITE_OAK_SAPLING);
        saplingBlock(HexcraftBlocks.ALDER_SAPLING);
        saplingBlock(HexcraftBlocks.WITCH_HAZEL_SAPLING);
        saplingBlock(HexcraftBlocks.WILLOW_SAPLING);
        saplingBlock(HexcraftBlocks.HAWTHORN_SAPLING);
        saplingBlock(HexcraftBlocks.CEDAR_SAPLING);
        saplingBlock(HexcraftBlocks.DISTORTED_SAPLING);
        saplingBlock(HexcraftBlocks.ELDER_SAPLING);
        saplingBlock(HexcraftBlocks.JUNIPER_SAPLING);
        saplingBlock(HexcraftBlocks.ROWAN_SAPLING);
        saplingBlock(HexcraftBlocks.TWISTED_SAPLING);
        saplingBlock(HexcraftBlocks.WITCH_WOOD_SAPLING);
        saplingBlock(HexcraftBlocks.ECHO_WOOD_SAPLING);



        slabBlock(((SlabBlock) HexcraftBlocks.EBONY_SLAB.get()), blockTexture(HexcraftBlocks.EBONY_PLANKS.get()), blockTexture(HexcraftBlocks.EBONY_PLANKS.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.BLOOD_OAK_SLAB.get()), blockTexture(HexcraftBlocks.BLOOD_OAK_PLANKS.get()), blockTexture(HexcraftBlocks.BLOOD_OAK_PLANKS.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.HELL_BARK_SLAB.get()), blockTexture(HexcraftBlocks.HELL_BARK_PLANKS.get()), blockTexture(HexcraftBlocks.HELL_BARK_PLANKS.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.WHITE_OAK_SLAB.get()), blockTexture(HexcraftBlocks.WHITE_OAK_PLANKS.get()), blockTexture(HexcraftBlocks.WHITE_OAK_PLANKS.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.ALDER_SLAB.get()), blockTexture(HexcraftBlocks.ALDER_PLANKS.get()), blockTexture(HexcraftBlocks.ALDER_PLANKS.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.WITCH_HAZEL_SLAB.get()), blockTexture(HexcraftBlocks.WITCH_WOOD_PLANKS.get()), blockTexture(HexcraftBlocks.WITCH_WOOD_PLANKS.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.WILLOW_SLAB.get()), blockTexture(HexcraftBlocks.WILLOW_PLANKS.get()), blockTexture(HexcraftBlocks.WILLOW_PLANKS.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.HAWTHORN_SLAB.get()), blockTexture(HexcraftBlocks.HAWTHORN_PLANKS.get()), blockTexture(HexcraftBlocks.HAWTHORN_PLANKS.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.CEDAR_SLAB.get()), blockTexture(HexcraftBlocks.CEDAR_PLANKS.get()), blockTexture(HexcraftBlocks.CEDAR_PLANKS.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.DISTORTED_SLAB.get()), blockTexture(HexcraftBlocks.DISTORTED_PLANKS.get()), blockTexture(HexcraftBlocks.DISTORTED_PLANKS.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.ELDER_SLAB.get()), blockTexture(HexcraftBlocks.ELDER_PLANKS.get()), blockTexture(HexcraftBlocks.ELDER_PLANKS.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.JUNIPER_SLAB.get()), blockTexture(HexcraftBlocks.JUNIPER_PLANKS.get()), blockTexture(HexcraftBlocks.JUNIPER_PLANKS.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.ROWAN_SLAB.get()), blockTexture(HexcraftBlocks.ROWAN_PLANKS.get()), blockTexture(HexcraftBlocks.ROWAN_PLANKS.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.TWISTED_SLAB.get()), blockTexture(HexcraftBlocks.TWISTED_PLANKS.get()), blockTexture(HexcraftBlocks.TWISTED_PLANKS.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.WITCH_WOOD_SLAB.get()), blockTexture(HexcraftBlocks.WITCH_WOOD_PLANKS.get()), blockTexture(HexcraftBlocks.WITCH_WOOD_PLANKS.get()));
        slabBlock(((SlabBlock) HexcraftBlocks.ECHO_WOOD_SLAB.get()), blockTexture(HexcraftBlocks.ECHO_WOOD_PLANKS.get()), blockTexture(HexcraftBlocks.ECHO_WOOD_PLANKS.get()));
        wallBlock((WallBlock) HexcraftBlocks.PEARL_STONE_WALL.get(), blockTexture(HexcraftBlocks.PEARL_STONE.get()));
        wallBlock((WallBlock) HexcraftBlocks.CRIMSON_STONE_WALL.get(), blockTexture(HexcraftBlocks.CRIMSON_STONE.get()));
        wallBlock((WallBlock) HexcraftBlocks.UNDER_WORLD_STONE_WALL.get(), blockTexture(HexcraftBlocks.UNDER_WORLD_STONE.get()));
        wallBlock((WallBlock) HexcraftBlocks.CHARSTONE_WALL.get(), blockTexture(HexcraftBlocks.CHARSTONE.get()));
        wallBlock((WallBlock) HexcraftBlocks.CRIMSON_SAND_STONE_WALL.get(), blockTexture(HexcraftBlocks.CRIMSON_SAND_STONE.get()));
        wallBlock((WallBlock) HexcraftBlocks.FAIRY_SAND_STONE_WALL.get(), blockTexture(HexcraftBlocks.FAIRY_SAND_STONE.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.EBONY_STAIRS.get()), blockTexture(HexcraftBlocks.EBONY_PLANKS.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.BLOOD_OAK_STAIRS.get()), blockTexture(HexcraftBlocks.BLOOD_OAK_PLANKS.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.HELL_BARK_STAIRS.get()), blockTexture(HexcraftBlocks.HELL_BARK_PLANKS.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.WHITE_OAK_STAIRS.get()), blockTexture(HexcraftBlocks.WHITE_OAK_PLANKS.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.ALDER_STAIRS.get()), blockTexture(HexcraftBlocks.ALDER_PLANKS.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.WITCH_HAZEL_STAIRS.get()), blockTexture(HexcraftBlocks.WITCH_HAZEL_PLANKS.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.WILLOW_STAIRS.get()), blockTexture(HexcraftBlocks.WILLOW_PLANKS.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.HAWTHORN_STAIRS.get()), blockTexture(HexcraftBlocks.HAWTHORN_PLANKS.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.CEDAR_STAIRS.get()), blockTexture(HexcraftBlocks.CEDAR_PLANKS.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.DISTORTED_STAIRS.get()), blockTexture(HexcraftBlocks.DISTORTED_PLANKS.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.ELDER_STAIRS.get()), blockTexture(HexcraftBlocks.ELDER_PLANKS.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.JUNIPER_STAIRS.get()), blockTexture(HexcraftBlocks.JUNIPER_PLANKS.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.ROWAN_STAIRS.get()), blockTexture(HexcraftBlocks.ROWAN_PLANKS.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.TWISTED_STAIRS.get()), blockTexture(HexcraftBlocks.TWISTED_PLANKS.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.WITCH_WOOD_STAIRS.get()), blockTexture(HexcraftBlocks.WITCH_WOOD_PLANKS.get()));
        stairsBlock(((StairBlock) HexcraftBlocks.ECHO_WOOD_STAIRS.get()), blockTexture(HexcraftBlocks.ECHO_WOOD_PLANKS.get()));
        buttonBlock((ButtonBlock) HexcraftBlocks.PEARL_STONE_BUTTON.get(), blockTexture(HexcraftBlocks.PEARL_STONE.get()));
        buttonBlock((ButtonBlock) HexcraftBlocks.CRIMSON_STONE_BUTTON.get(), blockTexture(HexcraftBlocks.CRIMSON_STONE.get()));
        buttonBlock((ButtonBlock) HexcraftBlocks.UNDER_WORLD_STONE_BUTTON.get(), blockTexture(HexcraftBlocks.UNDER_WORLD_STONE.get()));
        buttonBlock((ButtonBlock) HexcraftBlocks.CHARSTONE_BUTTON.get(), blockTexture(HexcraftBlocks.CHARSTONE.get()));
        buttonBlock((ButtonBlock) HexcraftBlocks.EBONY_BUTTON.get(), blockTexture(HexcraftBlocks.EBONY_PLANKS.get()));
        buttonBlock((ButtonBlock) HexcraftBlocks.BLOOD_OAK_BUTTON.get(), blockTexture(HexcraftBlocks.BLOOD_OAK_PLANKS.get()));
        buttonBlock((ButtonBlock) HexcraftBlocks.HELL_BARK_BUTTON.get(), blockTexture(HexcraftBlocks.HELL_BARK_PLANKS.get()));
        buttonBlock((ButtonBlock) HexcraftBlocks.WHITE_OAK_BUTTON.get(), blockTexture(HexcraftBlocks.WHITE_OAK_PLANKS.get()));
        buttonBlock((ButtonBlock) HexcraftBlocks.ALDER_BUTTON.get(), blockTexture(HexcraftBlocks.ALDER_PLANKS.get()));
        buttonBlock((ButtonBlock) HexcraftBlocks.WITCH_HAZEL_BUTTON.get(), blockTexture(HexcraftBlocks.WITCH_HAZEL_PLANKS.get()));
        buttonBlock((ButtonBlock) HexcraftBlocks.WILLOW_BUTTON.get(), blockTexture(HexcraftBlocks.WILLOW_PLANKS.get()));
        buttonBlock((ButtonBlock) HexcraftBlocks.HAWTHORN_BUTTON.get(), blockTexture(HexcraftBlocks.HAWTHORN_PLANKS.get()));
        buttonBlock((ButtonBlock) HexcraftBlocks.CEDAR_BUTTON.get(), blockTexture(HexcraftBlocks.CEDAR_PLANKS.get()));
        buttonBlock((ButtonBlock) HexcraftBlocks.DISTORTED_BUTTON.get(), blockTexture(HexcraftBlocks.DISTORTED_PLANKS.get()));
        buttonBlock((ButtonBlock) HexcraftBlocks.ELDER_BUTTON.get(), blockTexture(HexcraftBlocks.ELDER_PLANKS.get()));
        buttonBlock((ButtonBlock) HexcraftBlocks.JUNIPER_BUTTON.get(), blockTexture(HexcraftBlocks.JUNIPER_PLANKS.get()));
        buttonBlock((ButtonBlock) HexcraftBlocks.ROWAN_BUTTON.get(), blockTexture(HexcraftBlocks.ROWAN_PLANKS.get()));
        buttonBlock((ButtonBlock) HexcraftBlocks.TWISTED_BUTTON.get(), blockTexture(HexcraftBlocks.TWISTED_PLANKS.get()));
        buttonBlock((ButtonBlock) HexcraftBlocks.WITCH_WOOD_BUTTON.get(), blockTexture(HexcraftBlocks.WITCH_WOOD_PLANKS.get()));
        buttonBlock((ButtonBlock) HexcraftBlocks.ECHO_WOOD_BUTTON.get(), blockTexture(HexcraftBlocks.ECHO_WOOD_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) HexcraftBlocks.PEARL_STONE_PRESSURE_PLATE.get(), blockTexture(HexcraftBlocks.PEARL_STONE.get()));
        pressurePlateBlock((PressurePlateBlock) HexcraftBlocks.CRIMSON_STONE_PRESSURE_PLATE.get(), blockTexture(HexcraftBlocks.CRIMSON_STONE.get()));
        pressurePlateBlock((PressurePlateBlock) HexcraftBlocks.UNDER_WORLD_STONE_PRESSURE_PLATE.get(), blockTexture(HexcraftBlocks.UNDER_WORLD_STONE.get()));
        pressurePlateBlock((PressurePlateBlock) HexcraftBlocks.CHARSTONE_PRESSURE_PLATE.get(), blockTexture(HexcraftBlocks.CHARSTONE.get()));
        pressurePlateBlock((PressurePlateBlock) HexcraftBlocks.EBONY_PRESSURE_PLATE.get(), blockTexture(HexcraftBlocks.EBONY_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) HexcraftBlocks.BLOOD_OAK_PRESSURE_PLATE.get(), blockTexture(HexcraftBlocks.BLOOD_OAK_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) HexcraftBlocks.HELL_BARK_PRESSURE_PLATE.get(), blockTexture(HexcraftBlocks.HELL_BARK_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) HexcraftBlocks.WHITE_OAK_PRESSURE_PLATE.get(), blockTexture(HexcraftBlocks.WHITE_OAK_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) HexcraftBlocks.ALDER_PRESSURE_PLATE.get(), blockTexture(HexcraftBlocks.ALDER_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) HexcraftBlocks.WITCH_HAZEL_PRESSURE_PLATE.get(), blockTexture(HexcraftBlocks.WITCH_HAZEL_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) HexcraftBlocks.WILLOW_PRESSURE_PLATE.get(), blockTexture(HexcraftBlocks.WILLOW_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) HexcraftBlocks.HAWTHORN_PRESSURE_PLATE.get(), blockTexture(HexcraftBlocks.HAWTHORN_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) HexcraftBlocks.CEDAR_PRESSURE_PLATE.get(), blockTexture(HexcraftBlocks.CEDAR_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) HexcraftBlocks.DISTORTED_PRESSURE_PLATE.get(), blockTexture(HexcraftBlocks.DISTORTED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) HexcraftBlocks.ELDER_PRESSURE_PLATE.get(), blockTexture(HexcraftBlocks.ELDER_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) HexcraftBlocks.JUNIPER_PRESSURE_PLATE.get(), blockTexture(HexcraftBlocks.JUNIPER_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) HexcraftBlocks.ROWAN_PRESSURE_PLATE.get(), blockTexture(HexcraftBlocks.ROWAN_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) HexcraftBlocks.TWISTED_PRESSURE_PLATE.get(), blockTexture(HexcraftBlocks.TWISTED_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) HexcraftBlocks.WITCH_WOOD_PRESSURE_PLATE.get(), blockTexture(HexcraftBlocks.WITCH_WOOD_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) HexcraftBlocks.ECHO_WOOD_PRESSURE_PLATE.get(), blockTexture(HexcraftBlocks.ECHO_WOOD_PLANKS.get()));
        fenceBlock((FenceBlock) HexcraftBlocks.EBONY_FENCE.get(), blockTexture(HexcraftBlocks.EBONY_PLANKS.get()));
        fenceBlock((FenceBlock) HexcraftBlocks.BLOOD_OAK_FENCE.get(), blockTexture(HexcraftBlocks.BLOOD_OAK_PLANKS.get()));
        fenceBlock((FenceBlock) HexcraftBlocks.HELL_BARK_FENCE.get(), blockTexture(HexcraftBlocks.HELL_BARK_PLANKS.get()));
        fenceBlock((FenceBlock) HexcraftBlocks.WHITE_OAK_FENCE.get(), blockTexture(HexcraftBlocks.WHITE_OAK_PLANKS.get()));
        fenceBlock((FenceBlock) HexcraftBlocks.ALDER_FENCE.get(), blockTexture(HexcraftBlocks.ALDER_PLANKS.get()));
        fenceBlock((FenceBlock) HexcraftBlocks.WITCH_HAZEL_FENCE.get(), blockTexture(HexcraftBlocks.WITCH_HAZEL_PLANKS.get()));
        fenceBlock((FenceBlock) HexcraftBlocks.WILLOW_FENCE.get(), blockTexture(HexcraftBlocks.WILLOW_PLANKS.get()));
        fenceBlock((FenceBlock) HexcraftBlocks.HAWTHORN_FENCE.get(), blockTexture(HexcraftBlocks.HAWTHORN_PLANKS.get()));
        fenceBlock((FenceBlock) HexcraftBlocks.CEDAR_FENCE.get(), blockTexture(HexcraftBlocks.CEDAR_PLANKS.get()));
        fenceBlock((FenceBlock) HexcraftBlocks.DISTORTED_FENCE.get(), blockTexture(HexcraftBlocks.DISTORTED_PLANKS.get()));
        fenceBlock((FenceBlock) HexcraftBlocks.ELDER_FENCE.get(), blockTexture(HexcraftBlocks.ELDER_PLANKS.get()));
        fenceBlock((FenceBlock) HexcraftBlocks.JUNIPER_FENCE.get(), blockTexture(HexcraftBlocks.JUNIPER_PLANKS.get()));
        fenceBlock((FenceBlock) HexcraftBlocks.ROWAN_FENCE.get(), blockTexture(HexcraftBlocks.ROWAN_PLANKS.get()));
        fenceBlock((FenceBlock) HexcraftBlocks.TWISTED_FENCE.get(), blockTexture(HexcraftBlocks.TWISTED_PLANKS.get()));
        fenceBlock((FenceBlock) HexcraftBlocks.WITCH_WOOD_FENCE.get(), blockTexture(HexcraftBlocks.WITCH_WOOD_PLANKS.get()));
        fenceBlock((FenceBlock) HexcraftBlocks.ECHO_WOOD_FENCE.get(), blockTexture(HexcraftBlocks.ECHO_WOOD_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) HexcraftBlocks.EBONY_FENCE_GATE.get(), blockTexture(HexcraftBlocks.EBONY_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) HexcraftBlocks.BLOOD_OAK_FENCE_GATE.get(), blockTexture(HexcraftBlocks.BLOOD_OAK_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) HexcraftBlocks.HELL_BARK_FENCE_GATE.get(), blockTexture(HexcraftBlocks.HELL_BARK_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) HexcraftBlocks.WHITE_OAK_FENCE_GATE.get(), blockTexture(HexcraftBlocks.WHITE_OAK_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) HexcraftBlocks.ALDER_FENCE_GATE.get(), blockTexture(HexcraftBlocks.ALDER_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) HexcraftBlocks.WITCH_HAZEL_FENCE_GATE.get(), blockTexture(HexcraftBlocks.WITCH_HAZEL_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) HexcraftBlocks.WILLOW_FENCE_GATE.get(), blockTexture(HexcraftBlocks.WILLOW_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) HexcraftBlocks.HAWTHORN_FENCE_GATE.get(), blockTexture(HexcraftBlocks.HAWTHORN_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) HexcraftBlocks.CEDAR_FENCE_GATE.get(), blockTexture(HexcraftBlocks.CEDAR_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) HexcraftBlocks.DISTORTED_FENCE_GATE.get(), blockTexture(HexcraftBlocks.DISTORTED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) HexcraftBlocks.ELDER_FENCE_GATE.get(), blockTexture(HexcraftBlocks.ELDER_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) HexcraftBlocks.JUNIPER_FENCE_GATE.get(), blockTexture(HexcraftBlocks.JUNIPER_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) HexcraftBlocks.ROWAN_FENCE_GATE.get(), blockTexture(HexcraftBlocks.ROWAN_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) HexcraftBlocks.TWISTED_FENCE_GATE.get(), blockTexture(HexcraftBlocks.TWISTED_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) HexcraftBlocks.WITCH_WOOD_FENCE_GATE.get(), blockTexture(HexcraftBlocks.WITCH_WOOD_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) HexcraftBlocks.ECHO_WOOD_FENCE_GATE.get(), blockTexture(HexcraftBlocks.ECHO_WOOD_PLANKS.get()));
        doorBlockWithRenderType((DoorBlock)HexcraftBlocks.EBONY_DOOR.get(), modLoc("block/ebony_door_bottom"), modLoc("block/ebony_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock)HexcraftBlocks.BLOOD_OAK_DOOR.get(), modLoc("block/blood_oak_door_bottom"), modLoc("block/blood_oak_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock)HexcraftBlocks.HELL_BARK_DOOR.get(), modLoc("block/hell_bark_door_bottom"), modLoc("block/hell_bark_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock)HexcraftBlocks.WHITE_OAK_DOOR.get(), modLoc("block/white_oak_door_bottom"), modLoc("block/white_oak_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock)HexcraftBlocks.ALDER_DOOR.get(), modLoc("block/alder_door_bottom"), modLoc("block/alder_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock)HexcraftBlocks.WITCH_HAZEL_DOOR.get(), modLoc("block/witch_hazel_door_bottom"), modLoc("block/witch_hazel_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock)HexcraftBlocks.WILLOW_DOOR.get(), modLoc("block/willow_door_bottom"), modLoc("block/willow_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock)HexcraftBlocks.HAWTHORN_DOOR.get(), modLoc("block/hawthorn_door_bottom"), modLoc("block/hawthorn_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock)HexcraftBlocks.CEDAR_DOOR.get(), modLoc("block/cedar_door_bottom"), modLoc("block/cedar_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock)HexcraftBlocks.DISTORTED_DOOR.get(), modLoc("block/distorted_door_bottom"), modLoc("block/distorted_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock)HexcraftBlocks.ELDER_DOOR.get(), modLoc("block/elder_door_bottom"), modLoc("block/elder_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock)HexcraftBlocks.JUNIPER_DOOR.get(), modLoc("block/juniper_door_bottom"), modLoc("block/juniper_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock)HexcraftBlocks.ROWAN_DOOR.get(), modLoc("block/rowan_door_bottom"), modLoc("block/rowan_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock)HexcraftBlocks.TWISTED_DOOR.get(), modLoc("block/twisted_door_bottom"), modLoc("block/twisted_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock)HexcraftBlocks.WITCH_WOOD_DOOR.get(), modLoc("block/witch_wood_door_bottom"), modLoc("block/witch_wood_door_top"), "cutout");
        doorBlockWithRenderType((DoorBlock)HexcraftBlocks.ECHO_WOOD_DOOR.get(), modLoc("block/echo_wood_door_bottom"), modLoc("block/echo_wood_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) HexcraftBlocks.EBONY_TRAPDOOR.get(), modLoc("block/ebony_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) HexcraftBlocks.BLOOD_OAK_TRAPDOOR.get(), modLoc("block/blood_oak_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) HexcraftBlocks.HELL_BARK_TRAPDOOR.get(), modLoc("block/hell_bark_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) HexcraftBlocks.WHITE_OAK_TRAPDOOR.get(), modLoc("block/white_oak_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) HexcraftBlocks.ALDER_TRAPDOOR.get(), modLoc("block/alder_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) HexcraftBlocks.WITCH_HAZEL_TRAPDOOR.get(), modLoc("block/witch_hazel_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) HexcraftBlocks.WILLOW_TRAPDOOR.get(), modLoc("block/willow_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) HexcraftBlocks.HAWTHORN_TRAPDOOR.get(), modLoc("block/hawthorn_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) HexcraftBlocks.CEDAR_TRAPDOOR.get(), modLoc("block/cedar_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) HexcraftBlocks.DISTORTED_TRAPDOOR.get(), modLoc("block/distorted_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) HexcraftBlocks.ELDER_TRAPDOOR.get(), modLoc("block/elder_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) HexcraftBlocks.JUNIPER_TRAPDOOR.get(), modLoc("block/juniper_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) HexcraftBlocks.ROWAN_TRAPDOOR.get(), modLoc("block/rowan_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) HexcraftBlocks.TWISTED_TRAPDOOR.get(), modLoc("block/twisted_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) HexcraftBlocks.WITCH_WOOD_TRAPDOOR.get(), modLoc("block/witch_wood_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) HexcraftBlocks.ECHO_WOOD_TRAPDOOR.get(), modLoc("block/echo_wood_trapdoor"), true, "cutout");




        blockItem(HexcraftBlocks.PEARL_STONE_STAIRS);
        blockItem(HexcraftBlocks.PEARL_COBBLESTONE_STAIRS);
        blockItem(HexcraftBlocks.PEARL_STONE_BRICKS_STAIRS);
        blockItem(HexcraftBlocks.POLISHED_PEARL_STONE_STAIRS);
        blockItem(HexcraftBlocks.CRIMSON_STONE_STAIRS);
        blockItem(HexcraftBlocks.CRIMSON_COBBLESTONE_STAIRS);
        blockItem(HexcraftBlocks.CRIMSON_STONE_BRICKS_STAIRS);
        blockItem(HexcraftBlocks.POLISHED_CRIMSON_STONE_STAIRS);
        blockItem(HexcraftBlocks.UNDER_WORLD_STONE_STAIRS);
        blockItem(HexcraftBlocks.UNDER_WORLD_COBBLESTONE_STAIRS);
        blockItem(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS_STAIRS);
        blockItem(HexcraftBlocks.POLISHED_UNDER_WORLD_STONE_STAIRS);
        blockItem(HexcraftBlocks.CHARSTONE_STONE_STAIRS);
        blockItem(HexcraftBlocks.CHARSTONE_COBBLESTONE_STAIRS);
        blockItem(HexcraftBlocks.CHARSTONE_STONE_BRICKS_STAIRS);
        blockItem(HexcraftBlocks.POLISHED_CHARSTONE_STONE_STAIRS);
        blockItem(HexcraftBlocks.CRIMSON_SAND_STONE_STAIRS);
        blockItem(HexcraftBlocks.SMOOTH_CRIMSON_SAND_STONE_STAIRS);
        blockItem(HexcraftBlocks.FAIRY_SAND_STONE_STAIRS);
        blockItem(HexcraftBlocks.SMOOTH_FAIRY_SAND_STONE_STAIRS);
        blockItem(HexcraftBlocks.PEARL_STONE_SLAB);
        blockItem(HexcraftBlocks.PEARL_COBBLESTONE_SLAB);
        blockItem(HexcraftBlocks.PEARL_STONE_BRICKS_SLAB);
        blockItem(HexcraftBlocks.POLISHED_PEARL_STONE_SLAB);
        blockItem(HexcraftBlocks.CRIMSON_STONE_SLAB);
        blockItem(HexcraftBlocks.CRIMSON_COBBLESTONE_SLAB);
        blockItem(HexcraftBlocks.CRIMSON_STONE_BRICKS_SLAB);
        blockItem(HexcraftBlocks.POLISHED_CRIMSON_STONE_SLAB);
        blockItem(HexcraftBlocks.UNDER_WORLD_STONE_SLAB);
        blockItem(HexcraftBlocks.UNDER_WORLD_COBBLESTONE_SLAB);
        blockItem(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS_SLAB);
        blockItem(HexcraftBlocks.POLISHED_UNDER_WORLD_STONE_SLAB);
        blockItem(HexcraftBlocks.CHARSTONE_SLAB);
        blockItem(HexcraftBlocks.CHARSTONE_COBBLESTONE_SLAB);
        blockItem(HexcraftBlocks.CHARSTONE_BRICKS_SLAB);
        blockItem(HexcraftBlocks.POLISHED_CHARSTONE_SLAB);
        blockItem(HexcraftBlocks.CRIMSON_SAND_STONE_SLAB);
        blockItem(HexcraftBlocks.SMOOTH_CRIMSON_SAND_STONE_SLAB);
        blockItem(HexcraftBlocks.CUT_CRIMSON_SAND_STONE_SLAB);
        blockItem(HexcraftBlocks.FAIRY_SAND_STONE_SLAB);
        blockItem(HexcraftBlocks.SMOOTH_FAIRY_SAND_STONE_SLAB);
        blockItem(HexcraftBlocks.CUT_FAIRY_SAND_STONE_SLAB);
        blockItem(HexcraftBlocks.EBONY_SLAB);
        blockItem(HexcraftBlocks.BLOOD_OAK_SLAB);
        blockItem(HexcraftBlocks.HELL_BARK_SLAB);
        blockItem(HexcraftBlocks.WHITE_OAK_SLAB);
        blockItem(HexcraftBlocks.ALDER_SLAB);
        blockItem(HexcraftBlocks.WITCH_HAZEL_SLAB);
        blockItem(HexcraftBlocks.WILLOW_SLAB);
        blockItem(HexcraftBlocks.HAWTHORN_SLAB);
        blockItem(HexcraftBlocks.CEDAR_SLAB);
        blockItem(HexcraftBlocks.DISTORTED_SLAB);
        blockItem(HexcraftBlocks.ELDER_SLAB);
        blockItem(HexcraftBlocks.JUNIPER_SLAB);
        blockItem(HexcraftBlocks.ROWAN_SLAB);
        blockItem(HexcraftBlocks.TWISTED_SLAB);
        blockItem(HexcraftBlocks.WITCH_WOOD_SLAB);
        blockItem(HexcraftBlocks.ECHO_WOOD_SLAB);
        blockItem(HexcraftBlocks.EBONY_STAIRS);
        blockItem(HexcraftBlocks.BLOOD_OAK_STAIRS);
        blockItem(HexcraftBlocks.HELL_BARK_STAIRS);
        blockItem(HexcraftBlocks.WHITE_OAK_STAIRS);
        blockItem(HexcraftBlocks.ALDER_STAIRS);
        blockItem(HexcraftBlocks.WITCH_HAZEL_STAIRS);
        blockItem(HexcraftBlocks.WILLOW_STAIRS);
        blockItem(HexcraftBlocks.HAWTHORN_STAIRS);
        blockItem(HexcraftBlocks.CEDAR_STAIRS);
        blockItem(HexcraftBlocks.DISTORTED_STAIRS);
        blockItem(HexcraftBlocks.ELDER_STAIRS);
        blockItem(HexcraftBlocks.JUNIPER_STAIRS);
        blockItem(HexcraftBlocks.ROWAN_STAIRS);
        blockItem(HexcraftBlocks.TWISTED_STAIRS);
        blockItem(HexcraftBlocks.WITCH_WOOD_STAIRS);
        blockItem(HexcraftBlocks.ECHO_WOOD_STAIRS);
        blockItem(HexcraftBlocks.PEARL_STONE_PRESSURE_PLATE);
        blockItem(HexcraftBlocks.CRIMSON_STONE_PRESSURE_PLATE);
        blockItem(HexcraftBlocks.UNDER_WORLD_STONE_PRESSURE_PLATE);
        blockItem(HexcraftBlocks.CHARSTONE_PRESSURE_PLATE);
        blockItem(HexcraftBlocks.EBONY_PRESSURE_PLATE);
        blockItem(HexcraftBlocks.BLOOD_OAK_PRESSURE_PLATE);
        blockItem(HexcraftBlocks.HELL_BARK_PRESSURE_PLATE);
        blockItem(HexcraftBlocks.WHITE_OAK_PRESSURE_PLATE);
        blockItem(HexcraftBlocks.ALDER_PRESSURE_PLATE);
        blockItem(HexcraftBlocks.WITCH_HAZEL_PRESSURE_PLATE);
        blockItem(HexcraftBlocks.WILLOW_PRESSURE_PLATE);
        blockItem(HexcraftBlocks.HAWTHORN_PRESSURE_PLATE);
        blockItem(HexcraftBlocks.CEDAR_PRESSURE_PLATE);
        blockItem(HexcraftBlocks.DISTORTED_PRESSURE_PLATE);
        blockItem(HexcraftBlocks.ELDER_PRESSURE_PLATE);
        blockItem(HexcraftBlocks.JUNIPER_PRESSURE_PLATE);
        blockItem(HexcraftBlocks.ROWAN_PRESSURE_PLATE);
        blockItem(HexcraftBlocks.TWISTED_PRESSURE_PLATE);
        blockItem(HexcraftBlocks.WITCH_WOOD_PRESSURE_PLATE);
        blockItem(HexcraftBlocks.ECHO_WOOD_PRESSURE_PLATE);
        blockItem(HexcraftBlocks.EBONY_FENCE_GATE);
        blockItem(HexcraftBlocks.BLOOD_OAK_FENCE_GATE);
        blockItem(HexcraftBlocks.HELL_BARK_FENCE_GATE);
        blockItem(HexcraftBlocks.WHITE_OAK_FENCE_GATE);
        blockItem(HexcraftBlocks.ALDER_FENCE_GATE);
        blockItem(HexcraftBlocks.WITCH_HAZEL_FENCE_GATE);
        blockItem(HexcraftBlocks.WILLOW_FENCE_GATE);
        blockItem(HexcraftBlocks.HAWTHORN_FENCE_GATE);
        blockItem(HexcraftBlocks.CEDAR_FENCE_GATE);
        blockItem(HexcraftBlocks.DISTORTED_FENCE_GATE);
        blockItem(HexcraftBlocks.ELDER_FENCE_GATE);
        blockItem(HexcraftBlocks.JUNIPER_FENCE_GATE);
        blockItem(HexcraftBlocks.ROWAN_FENCE_GATE);
        blockItem(HexcraftBlocks.TWISTED_FENCE_GATE);
        blockItem(HexcraftBlocks.WITCH_WOOD_FENCE_GATE);
        blockItem(HexcraftBlocks.ECHO_WOOD_FENCE_GATE);
        blockItem(HexcraftBlocks.EBONY_TRAPDOOR, "_bottom");
        blockItem(HexcraftBlocks.BLOOD_OAK_TRAPDOOR, "_bottom");
        blockItem(HexcraftBlocks.HELL_BARK_TRAPDOOR, "_bottom");
        blockItem(HexcraftBlocks.WHITE_OAK_TRAPDOOR, "_bottom");
        blockItem(HexcraftBlocks.ALDER_TRAPDOOR, "_bottom");
        blockItem(HexcraftBlocks.WITCH_HAZEL_TRAPDOOR, "_bottom");
        blockItem(HexcraftBlocks.WILLOW_TRAPDOOR, "_bottom");
        blockItem(HexcraftBlocks.HAWTHORN_TRAPDOOR, "_bottom");
        blockItem(HexcraftBlocks.CEDAR_TRAPDOOR, "_bottom");
        blockItem(HexcraftBlocks.DISTORTED_TRAPDOOR, "_bottom");
        blockItem(HexcraftBlocks.ELDER_TRAPDOOR, "_bottom");
        blockItem(HexcraftBlocks.JUNIPER_TRAPDOOR, "_bottom");
        blockItem(HexcraftBlocks.ROWAN_TRAPDOOR, "_bottom");
        blockItem(HexcraftBlocks.TWISTED_TRAPDOOR, "_bottom");
        blockItem(HexcraftBlocks.WITCH_WOOD_TRAPDOOR, "_bottom");
        blockItem(HexcraftBlocks.ECHO_WOOD_TRAPDOOR, "_bottom");

        signBlock(((StandingSignBlock) HexcraftBlocks.EBONY_SIGN.get()), ((WallSignBlock) HexcraftBlocks.EBONY_WALL_SIGN.get()),
                blockTexture(HexcraftBlocks.EBONY_PLANKS.get()));

        hangingSignBlock(HexcraftBlocks.EBONY_HANGING_SIGN.get(), HexcraftBlocks.EBONY_WALL_HANGING_SIGN.get(),
                blockTexture(HexcraftBlocks.EBONY_PLANKS.get()));

        signBlock(((StandingSignBlock) HexcraftBlocks.BLOOD_OAK_SIGN.get()), ((WallSignBlock) HexcraftBlocks.BLOOD_OAK_WALL_SIGN.get()),
                blockTexture(HexcraftBlocks.BLOOD_OAK_PLANKS.get()));

        hangingSignBlock(HexcraftBlocks.BLOOD_OAK_HANGING_SIGN.get(), HexcraftBlocks.BLOOD_OAK_WALL_HANGING_SIGN.get(),
                blockTexture(HexcraftBlocks.BLOOD_OAK_PLANKS.get()));

        signBlock(((StandingSignBlock) HexcraftBlocks.HELL_BARK_SIGN.get()), ((WallSignBlock) HexcraftBlocks.HELL_BARK_WALL_SIGN.get()),
                blockTexture(HexcraftBlocks.HELL_BARK_PLANKS.get()));

        hangingSignBlock(HexcraftBlocks.HELL_BARK_HANGING_SIGN.get(), HexcraftBlocks.HELL_BARK_WALL_HANGING_SIGN.get(),
                blockTexture(HexcraftBlocks.HELL_BARK_PLANKS.get()));

        signBlock(((StandingSignBlock) HexcraftBlocks.WHITE_OAK_SIGN.get()), ((WallSignBlock) HexcraftBlocks.WHITE_OAK_WALL_SIGN.get()),
                blockTexture(HexcraftBlocks.WHITE_OAK_PLANKS.get()));

        hangingSignBlock(HexcraftBlocks.WHITE_OAK_HANGING_SIGN.get(), HexcraftBlocks.WHITE_OAK_WALL_HANGING_SIGN.get(),
                blockTexture(HexcraftBlocks.WHITE_OAK_PLANKS.get()));

        signBlock(((StandingSignBlock) HexcraftBlocks.ALDER_SIGN.get()), ((WallSignBlock) HexcraftBlocks.ALDER_WALL_SIGN.get()),
                blockTexture(HexcraftBlocks.ALDER_PLANKS.get()));

        hangingSignBlock(HexcraftBlocks.ALDER_HANGING_SIGN.get(), HexcraftBlocks.ALDER_WALL_HANGING_SIGN.get(),
                blockTexture(HexcraftBlocks.ALDER_PLANKS.get()));

        signBlock(((StandingSignBlock) HexcraftBlocks.WITCH_HAZEL_SIGN.get()), ((WallSignBlock) HexcraftBlocks.WITCH_HAZEL_WALL_SIGN.get()),
                blockTexture(HexcraftBlocks.WITCH_HAZEL_PLANKS.get()));

        hangingSignBlock(HexcraftBlocks.WITCH_HAZEL_HANGING_SIGN.get(), HexcraftBlocks.WITCH_HAZEL_WALL_HANGING_SIGN.get(),
                blockTexture(HexcraftBlocks.WITCH_HAZEL_PLANKS.get()));

        signBlock(((StandingSignBlock) HexcraftBlocks.WILLOW_SIGN.get()), ((WallSignBlock) HexcraftBlocks.WILLOW_WALL_SIGN.get()),
                blockTexture(HexcraftBlocks.WILLOW_PLANKS.get()));

        hangingSignBlock(HexcraftBlocks.WILLOW_HANGING_SIGN.get(), HexcraftBlocks.WILLOW_WALL_HANGING_SIGN.get(),
                blockTexture(HexcraftBlocks.WILLOW_PLANKS.get()));

        signBlock(((StandingSignBlock) HexcraftBlocks.HAWTHORN_SIGN.get()), ((WallSignBlock) HexcraftBlocks.HAWTHORN_WALL_SIGN.get()),
                blockTexture(HexcraftBlocks.HAWTHORN_PLANKS.get()));

        hangingSignBlock(HexcraftBlocks.HAWTHORN_HANGING_SIGN.get(), HexcraftBlocks.HAWTHORN_WALL_HANGING_SIGN.get(),
                blockTexture(HexcraftBlocks.HAWTHORN_PLANKS.get()));

        signBlock(((StandingSignBlock) HexcraftBlocks.CEDAR_SIGN.get()), ((WallSignBlock) HexcraftBlocks.CEDAR_WALL_SIGN.get()),
                blockTexture(HexcraftBlocks.CEDAR_PLANKS.get()));

        hangingSignBlock(HexcraftBlocks.CEDAR_HANGING_SIGN.get(), HexcraftBlocks.CEDAR_WALL_HANGING_SIGN.get(),
                blockTexture(HexcraftBlocks.CEDAR_PLANKS.get()));

        signBlock(((StandingSignBlock) HexcraftBlocks.DISTORTED_SIGN.get()), ((WallSignBlock) HexcraftBlocks.DISTORTED_WALL_SIGN.get()),
                blockTexture(HexcraftBlocks.DISTORTED_PLANKS.get()));

        hangingSignBlock(HexcraftBlocks.DISTORTED_HANGING_SIGN.get(), HexcraftBlocks.DISTORTED_WALL_HANGING_SIGN.get(),
                blockTexture(HexcraftBlocks.DISTORTED_PLANKS.get()));

        signBlock(((StandingSignBlock) HexcraftBlocks.ELDER_SIGN.get()), ((WallSignBlock) HexcraftBlocks.ELDER_WALL_SIGN.get()),
                blockTexture(HexcraftBlocks.ELDER_PLANKS.get()));

        hangingSignBlock(HexcraftBlocks.ELDER_HANGING_SIGN.get(), HexcraftBlocks.ELDER_WALL_HANGING_SIGN.get(),
                blockTexture(HexcraftBlocks.ELDER_PLANKS.get()));

        signBlock(((StandingSignBlock) HexcraftBlocks.JUNIPER_SIGN.get()), ((WallSignBlock) HexcraftBlocks.JUNIPER_WALL_SIGN.get()),
                blockTexture(HexcraftBlocks.JUNIPER_PLANKS.get()));

        hangingSignBlock(HexcraftBlocks.JUNIPER_HANGING_SIGN.get(), HexcraftBlocks.JUNIPER_WALL_HANGING_SIGN.get(),
                blockTexture(HexcraftBlocks.JUNIPER_PLANKS.get()));

        signBlock(((StandingSignBlock) HexcraftBlocks.ROWAN_SIGN.get()), ((WallSignBlock) HexcraftBlocks.ROWAN_WALL_SIGN.get()),
                blockTexture(HexcraftBlocks.ROWAN_PLANKS.get()));

        hangingSignBlock(HexcraftBlocks.ROWAN_HANGING_SIGN.get(), HexcraftBlocks.ROWAN_WALL_HANGING_SIGN.get(),
                blockTexture(HexcraftBlocks.ROWAN_PLANKS.get()));

        signBlock(((StandingSignBlock) HexcraftBlocks.TWISTED_SIGN.get()), ((WallSignBlock) HexcraftBlocks.TWISTED_WALL_SIGN.get()),
                blockTexture(HexcraftBlocks.TWISTED_PLANKS.get()));

        hangingSignBlock(HexcraftBlocks.TWISTED_HANGING_SIGN.get(), HexcraftBlocks.TWISTED_WALL_HANGING_SIGN.get(),
                blockTexture(HexcraftBlocks.TWISTED_PLANKS.get()));

        signBlock(((StandingSignBlock) HexcraftBlocks.WITCH_WOOD_SIGN.get()), ((WallSignBlock) HexcraftBlocks.WITCH_WOOD_WALL_SIGN.get()),
                blockTexture(HexcraftBlocks.WITCH_WOOD_PLANKS.get()));

        hangingSignBlock(HexcraftBlocks.WITCH_WOOD_HANGING_SIGN.get(), HexcraftBlocks.WITCH_WOOD_WALL_HANGING_SIGN.get(),
                blockTexture(HexcraftBlocks.WITCH_WOOD_PLANKS.get()));

        signBlock(((StandingSignBlock) HexcraftBlocks.ECHO_WOOD_SIGN.get()), ((WallSignBlock) HexcraftBlocks.ECHO_WOOD_WALL_SIGN.get()),
                blockTexture(HexcraftBlocks.ECHO_WOOD_PLANKS.get()));

        hangingSignBlock(HexcraftBlocks.ECHO_WOOD_HANGING_SIGN.get(), HexcraftBlocks.ECHO_WOOD_WALL_HANGING_SIGN.get(),
                blockTexture(HexcraftBlocks.ECHO_WOOD_PLANKS.get()));

        

    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("hexcraftmod:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("hexcraftmod:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }


    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
