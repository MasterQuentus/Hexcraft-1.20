package net.masterquentus.hexcraftmod.block;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.custom.CuredSoilBlock;
import net.masterquentus.hexcraftmod.block.custom.CursedSoilBlock;
import net.masterquentus.hexcraftmod.block.custom.FertilizedDirtBlock;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class HexcraftBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, HexcraftMod.MOD_ID);

    public static final RegistryObject<Block> VILE_GRASS_BLOCK = registerBlock("vile_grass_block",
            () -> new GrassBlock(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK)
                    .strength(0.6F).randomTicks().sound(SoundType.GRASS)));

    public static final RegistryObject<Block> VILE_DIRT = registerBlock("vile_dirt",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)
                    .strength(0.5F)));

    public static final RegistryObject <Block> CURSED_SOIL = registerBlock("cursed_soil",
            () -> new CursedSoilBlock(BlockBehaviour.Properties.copy(Blocks.MOSS_BLOCK).strength(0.6F).sound(SoundType.SOUL_SAND)));

    public static final RegistryObject <Block> CURED_SOIL = registerBlock("cured_soil",
            () -> new CuredSoilBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(0.6F).sound(SoundType.SOUL_SOIL)));

    public static final RegistryObject <Block> FERTILIZED_DIRT = registerBlock("fertilized_dirt",
            () -> new FertilizedDirtBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(0.6F).sound(SoundType.GRAVEL)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return HexcraftItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}