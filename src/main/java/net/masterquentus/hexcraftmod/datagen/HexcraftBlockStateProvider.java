package net.masterquentus.hexcraftmod.datagen;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
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

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(HexcraftMod.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
