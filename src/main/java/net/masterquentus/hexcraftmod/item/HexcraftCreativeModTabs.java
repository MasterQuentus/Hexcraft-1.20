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
                        output.accept(HexcraftBlocks.CURSED_SOIL.get());
                        output.accept(HexcraftBlocks.CURED_SOIL.get());
                        output.accept(HexcraftBlocks.FERTILIZED_DIRT.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}