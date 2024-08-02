package net.masterquentus.hexcraftmod.datagen;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
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

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
