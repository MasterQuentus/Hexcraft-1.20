package net.masterquentus.hexcraftmod.datagen;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftBlockStateProvider extends BlockStateProvider {
    public HexcraftBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, HexcraftMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(HexcraftBlocks.VILE_DIRT);
        simpleBlockWithItem(HexcraftBlocks.VAMPIRE_ORCHID.get(),
                models().cross(blockTexture(HexcraftBlocks.VAMPIRE_ORCHID.get()).getPath(),blockTexture(HexcraftBlocks.VAMPIRE_ORCHID.get())).renderType("cutout"));
        simpleBlockWithItem(HexcraftBlocks.BLOODY_ROSE.get(),
                models().cross(blockTexture(HexcraftBlocks.BLOODY_ROSE.get()).getPath(),blockTexture(HexcraftBlocks.BLOODY_ROSE.get())).renderType("cutout"));
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
        blockWithItem(HexcraftBlocks.BUDDING_MAGIC_CRYSTAL);
        simpleBlockWithItem(HexcraftBlocks.MAGIC_CRYSTAL_CLUSTER.get(),
                models().cross(blockTexture(HexcraftBlocks.MAGIC_CRYSTAL_CLUSTER.get()).getPath(),blockTexture(HexcraftBlocks.MAGIC_CRYSTAL_CLUSTER.get())).renderType("cutout"));
        simpleBlockWithItem(HexcraftBlocks.LARGE_MAGIC_CRYSTAL_BUD.get(),
                models().cross(blockTexture(HexcraftBlocks.LARGE_MAGIC_CRYSTAL_BUD.get()).getPath(),blockTexture(HexcraftBlocks.LARGE_MAGIC_CRYSTAL_BUD.get())).renderType("cutout"));
        simpleBlockWithItem(HexcraftBlocks.MEDIUM_MAGIC_CRYSTAL_BUD.get(),
                models().cross(blockTexture(HexcraftBlocks.MEDIUM_MAGIC_CRYSTAL_BUD.get()).getPath(),blockTexture(HexcraftBlocks.MEDIUM_MAGIC_CRYSTAL_BUD.get())).renderType("cutout"));
        simpleBlockWithItem(HexcraftBlocks.SMALL_MAGIC_CRYSTAL_BUD.get(),
                models().cross(blockTexture(HexcraftBlocks.SMALL_MAGIC_CRYSTAL_BUD.get()).getPath(),blockTexture(HexcraftBlocks.SMALL_MAGIC_CRYSTAL_BUD.get())).renderType("cutout"));
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

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
