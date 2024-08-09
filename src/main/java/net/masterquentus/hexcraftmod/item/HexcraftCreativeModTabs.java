package net.masterquentus.hexcraftmod.item;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HexcraftMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> HEXCRAFT_TAB = CREATIVE_MODE_TABS.register("hexcraft_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(HexcraftItems.INFUSED_FABRIC.get()))
                    .title(Component.translatable("creativetab.hexcraft_tab"))
                    .displayItems((itemDisplayParameters, output) ->  {
                        output.accept(HexcraftItems.INFUSED_FABRIC.get());
                        output.accept(HexcraftItems.BOUND_LEATHER.get());
                        output.accept(HexcraftItems.TANNED_LEATHER.get());
                        output.accept(HexcraftItems.BONE_NEEDLE.get());
                        output.accept(HexcraftItems.TAGLOCK_KIT.get());
                        output.accept(HexcraftItems.WITCHES_SATCHEL.get());
                        output.accept(HexcraftItems.UNFIRED_CLAY_POT.get());
                        output.accept(HexcraftItems.CLAY_POT.get());
                        output.accept(HexcraftItems.LILITH_CONTRACT.get());
                        output.accept(HexcraftItems.LILITH_SOUL.get());
                        output.accept(HexcraftItems.MAGIC_CRYSTAL.get());
                        output.accept(HexcraftItems.BLANK_RUNE.get());
                        output.accept(HexcraftItems.AIR_RUNE.get());
                        output.accept(HexcraftItems.EARTH_RUNE.get());
                        output.accept(HexcraftItems.FIRE_RUNE.get());
                        output.accept(HexcraftItems.WATER_RUNE.get());
                        output.accept(HexcraftItems.RED_RUNE.get());
                        output.accept(HexcraftItems.BLACK_RUNE.get());
                        output.accept(HexcraftItems.BLUE_RUNE.get());
                        output.accept(HexcraftItems.GREEN_RUNE.get());
                        output.accept(HexcraftItems.ORANGE_RUNE.get());
                        output.accept(HexcraftItems.PURPLE_RUNE.get());
                        output.accept(HexcraftItems.WHITE_RUNE.get());
                        output.accept(HexcraftItems.YELLOW_RUNE.get());
                        output.accept(HexcraftItems.ROPE.get());
                        output.accept(HexcraftItems.MOONSTONE.get());
                        output.accept(HexcraftItems.RAW_SILVER.get());
                        output.accept(HexcraftItems.SILVER_INGOT.get());
                        output.accept(HexcraftItems.SILVER_NUGGET.get());
                        output.accept(HexcraftItems.VAMPIRIC_GEM.get());
                        output.accept(HexcraftItems.CORRUPTED_NETHER_STAR.get());
                        output.accept(HexcraftItems.CORRUPTED_STEEL.get());
                        output.accept(HexcraftItems.CORRUPTED_STEEL_NUGGET.get());
                        output.accept(HexcraftItems.DARK_CRYSTAL_SHARDS.get());
                        output.accept(HexcraftItems.DARK_STEEL.get());
                        output.accept(HexcraftItems.DARK_STEEL_NUGGET.get());
                        output.accept(HexcraftItems.RAW_BLOODY_NYKIUM.get());
                        output.accept(HexcraftItems.BLOODY_NYKIUM.get());
                        output.accept(HexcraftItems.BLOODY_NYKIUM_NUGGET.get());
                        output.accept(HexcraftItems.RAW_CUROGEN.get());
                        output.accept(HexcraftItems.CUROGEN.get());
                        output.accept(HexcraftItems.CUROGEN_NUGGET.get());
                        output.accept(HexcraftItems.RAW_JORMIUM.get());
                        output.accept(HexcraftItems.ENHANCED_JORMIUM_INGOT.get());
                        output.accept(HexcraftItems.JORMIUM_INGOT.get());
                        output.accept(HexcraftItems.JORMIUM_NUGGET.get());
                        output.accept(HexcraftItems.STEEL_POWDER.get());
                        output.accept(HexcraftItems.STEEL_INGOT.get());
                        output.accept(HexcraftItems.SILVER_NUGGET.get());
                        output.accept(HexcraftItems.WHITE_OAK_ASH.get());
                        output.accept(HexcraftItems.SALT.get());
                        output.accept(HexcraftItems.NECROMANTIC_STONE.get());
                        output.accept(HexcraftItems.ATTUNED_STONE.get());
                        output.accept(HexcraftItems.ATTUNED_STONE_CHARGED.get());

                        //Blocks
                        output.accept(HexcraftBlocks.VILE_GRASS_BLOCK.get());
                        output.accept(HexcraftBlocks.VILE_DIRT.get());
                        output.accept(HexcraftBlocks.VAMPIRE_ORCHID.get());
                        output.accept(HexcraftBlocks.BLOODY_ROSE.get());
                        output.accept(HexcraftBlocks.CURSED_SOIL.get());
                        output.accept(HexcraftBlocks.CURED_SOIL.get());
                        output.accept(HexcraftBlocks.FERTILIZED_DIRT.get());
                        output.accept(HexcraftBlocks.BLACK_OBSIDIAN.get());
                        output.accept(HexcraftBlocks.PEARL_STONE.get());
                        output.accept(HexcraftBlocks.CRIMSON_STONE.get());
                        output.accept(HexcraftBlocks.UNDER_WORLD_STONE.get());
                        output.accept(HexcraftBlocks.CHARSTONE.get());


                        //Plants
                        output.accept(HexcraftItems.WITCHES_LADDER_ITEM.get());


                        //Foods
                        output.accept(HexcraftItems.JUNIPER_BERRIES.get());
                        output.accept(HexcraftItems.BLOOD_BERRIES.get());
                        output.accept(HexcraftItems.BLOOD_APPLE.get());

                        //Building Blocks
                        output.accept(HexcraftBlocks.AMETHYST_CHIMES.get());
                        output.accept(HexcraftBlocks.WITCHES_OVEN.get());
                        output.accept(HexcraftBlocks.MOONSTONE_BLOCK.get());
                        output.accept(HexcraftBlocks.SILVER_BLOCK.get());
                        output.accept(HexcraftBlocks.VAMPIRIC_BLOCK.get());
                        output.accept(HexcraftBlocks.PEARL_COBBLESTONE.get());
                        output.accept(HexcraftBlocks.PEARL_STONE_BRICKS.get());
                        output.accept(HexcraftBlocks.POLISHED_PEARL_STONE.get());
                        output.accept(HexcraftBlocks.CHISELED_PEARL_STONE.get());
                        output.accept(HexcraftBlocks.CRACKED_PEARL_STONE.get());
                        output.accept(HexcraftBlocks.CRIMSON_COBBLESTONE.get());
                        output.accept(HexcraftBlocks.CRIMSON_STONE_BRICKS.get());
                        output.accept(HexcraftBlocks.POLISHED_CRIMSON_STONE.get());
                        output.accept(HexcraftBlocks.CHISELED_CRIMSON_STONE.get());
                        output.accept(HexcraftBlocks.CRACKED_CRIMSON_STONE.get());
                        output.accept(HexcraftBlocks.UNDER_WORLD_COBBLESTONE.get());
                        output.accept(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get());
                        output.accept(HexcraftBlocks.POLISHED_UNDER_WORLD_STONE.get());
                        output.accept(HexcraftBlocks.CHISELED_UNDER_WORLD_STONE.get());
                        output.accept(HexcraftBlocks.CRACKED_UNDER_WORLD_STONE.get());
                        output.accept(HexcraftBlocks.CHARSTONE_COBBLESTONE.get());
                        output.accept(HexcraftBlocks.CHARSTONE_BRICKS.get());
                        output.accept(HexcraftBlocks.POLISHED_CHARSTONE.get());
                        output.accept(HexcraftBlocks.CHISELED_CHARSTONE.get());
                        output.accept(HexcraftBlocks.CRACKED_CHARSTONE.get());
                        output.accept(HexcraftBlocks.PEARL_STONE_STAIRS.get());
                        output.accept(HexcraftBlocks.PEARL_COBBLESTONE_STAIRS.get());
                        output.accept(HexcraftBlocks.PEARL_STONE_BRICKS_STAIRS.get());
                        output.accept(HexcraftBlocks.POLISHED_PEARL_STONE_STAIRS.get());
                        output.accept(HexcraftBlocks.CRIMSON_STONE_STAIRS.get());
                        output.accept(HexcraftBlocks.CRIMSON_COBBLESTONE_STAIRS.get());
                        output.accept(HexcraftBlocks.CRIMSON_STONE_BRICKS_STAIRS.get());
                        output.accept(HexcraftBlocks.POLISHED_CRIMSON_STONE_STAIRS.get());
                        output.accept(HexcraftBlocks.UNDER_WORLD_STONE_STAIRS.get());
                        output.accept(HexcraftBlocks.UNDER_WORLD_COBBLESTONE_STAIRS.get());
                        output.accept(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS_STAIRS.get());
                        output.accept(HexcraftBlocks.POLISHED_UNDER_WORLD_STONE_STAIRS.get());
                        output.accept(HexcraftBlocks.CHARSTONE_STONE_STAIRS.get());
                        output.accept(HexcraftBlocks.CHARSTONE_COBBLESTONE_STAIRS.get());
                        output.accept(HexcraftBlocks.CHARSTONE_STONE_BRICKS_STAIRS.get());
                        output.accept(HexcraftBlocks.POLISHED_CHARSTONE_STONE_STAIRS.get());
                        output.accept(HexcraftBlocks.PEARL_STONE_SLAB.get());
                        output.accept(HexcraftBlocks.PEARL_COBBLESTONE_SLAB.get());
                        output.accept(HexcraftBlocks.PEARL_STONE_BRICKS_SLAB.get());
                        output.accept(HexcraftBlocks.POLISHED_PEARL_STONE_SLAB.get());
                        output.accept(HexcraftBlocks.CRIMSON_STONE_SLAB.get());
                        output.accept(HexcraftBlocks.CRIMSON_COBBLESTONE_SLAB.get());
                        output.accept(HexcraftBlocks.CRIMSON_STONE_BRICKS_SLAB.get());
                        output.accept(HexcraftBlocks.POLISHED_CRIMSON_STONE_SLAB.get());
                        output.accept(HexcraftBlocks.UNDER_WORLD_STONE_SLAB.get());
                        output.accept(HexcraftBlocks.UNDER_WORLD_COBBLESTONE_SLAB.get());
                        output.accept(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS_SLAB.get());
                        output.accept(HexcraftBlocks.POLISHED_UNDER_WORLD_STONE_SLAB.get());
                        output.accept(HexcraftBlocks.CHARSTONE_SLAB.get());
                        output.accept(HexcraftBlocks.CHARSTONE_COBBLESTONE_SLAB.get());
                        output.accept(HexcraftBlocks.CHARSTONE_BRICKS_SLAB.get());
                        output.accept(HexcraftBlocks.POLISHED_CHARSTONE_SLAB.get());

                        //Ores
                        output.accept(HexcraftBlocks.MOONSTONE_ORE.get());
                        output.accept(HexcraftBlocks.END_MOONSTONE_ORE.get());
                        output.accept(HexcraftBlocks.NETHER_MOONSTONE_ORE.get());
                        output.accept(HexcraftBlocks.DEEPSLATE_MOONSTONE_ORE.get());
                        output.accept(HexcraftBlocks.SILVER_ORE.get());
                        output.accept(HexcraftBlocks.END_SILVER_ORE.get());
                        output.accept(HexcraftBlocks.NETHER_SILVER_ORE.get());
                        output.accept(HexcraftBlocks.DEEPSLATE_SILVER_ORE.get());
                        output.accept(HexcraftBlocks.VAMPIRIC_ORE.get());
                        output.accept(HexcraftBlocks.END_VAMPIRIC_ORE.get());
                        output.accept(HexcraftBlocks.NETHER_VAMPIRIC_ORE.get());
                        output.accept(HexcraftBlocks.DEEPSLATE_VAMPIRIC_ORE.get());
                        output.accept(HexcraftBlocks.NYKIUM_ORE.get());
                        output.accept(HexcraftBlocks.TRENOGEN_ORE.get());
                        output.accept(HexcraftBlocks.DEEPSLATE_TRENOGEN_ORE.get());
                        output.accept(HexcraftBlocks.JORMUIM_ORE.get());
                        output.accept(HexcraftBlocks.MAGIC_CRYSTAL_CLUSTER.get());
                        output.accept(HexcraftBlocks.BUDDING_MAGIC_CRYSTAL.get());
                        output.accept(HexcraftBlocks.MAGIC_CRYSTAL_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
