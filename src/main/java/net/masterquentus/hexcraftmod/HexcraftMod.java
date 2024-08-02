package net.masterquentus.hexcraftmod;

import com.mojang.logging.LogUtils;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.item.HexcraftCreativeModTabs;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(HexcraftMod.MOD_ID)
public class HexcraftMod {
    public static final String MOD_ID = "hexcraftmod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public HexcraftMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        HexcraftCreativeModTabs.register(modEventBus);

        HexcraftItems.register(modEventBus);
        HexcraftBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(HexcraftItems.INFUSED_FABRIC);
            event.accept(HexcraftItems.BOUND_LEATHER);
            event.accept(HexcraftItems.TANNED_LEATHER);
            event.accept(HexcraftItems.BONE_NEEDLE);
            event.accept(HexcraftItems.TAGLOCK_KIT);
            event.accept(HexcraftItems.UNFIRED_CLAY_POT);
            event.accept(HexcraftItems.CLAY_POT);
            event.accept(HexcraftItems.LILITH_CONTRACT);
            event.accept(HexcraftItems.LILITH_SOUL);
            event.accept(HexcraftItems.MAGIC_CRYSTAL);
            event.accept(HexcraftItems.BLANK_RUNE);
            event.accept(HexcraftItems.AIR_RUNE);
            event.accept(HexcraftItems.EARTH_RUNE);
            event.accept(HexcraftItems.FIRE_RUNE);
            event.accept(HexcraftItems.WATER_RUNE);
            event.accept(HexcraftItems.RED_RUNE);
            event.accept(HexcraftItems.BLACK_RUNE);
            event.accept(HexcraftItems.BLUE_RUNE);
            event.accept(HexcraftItems.GREEN_RUNE);
            event.accept(HexcraftItems.ORANGE_RUNE);
            event.accept(HexcraftItems.PURPLE_RUNE);
            event.accept(HexcraftItems.WHITE_RUNE);
            event.accept(HexcraftItems.YELLOW_RUNE);
            event.accept(HexcraftItems.ROPE);
            event.accept(HexcraftItems.MOONSTONE);
            event.accept(HexcraftItems.RAW_SILVER);
            event.accept(HexcraftItems.SILVER_INGOT);
            event.accept(HexcraftItems.SILVER_NUGGET);
            event.accept(HexcraftItems.VAMPIRIC_GEM);
            event.accept(HexcraftItems.CORRUPTED_NETHER_STAR);
            event.accept(HexcraftItems.CORRUPTED_NETHER_STAR);
            event.accept(HexcraftItems.CORRUPTED_STEEL);
            event.accept(HexcraftItems.CORRUPTED_STEEL_NUGGET);
            event.accept(HexcraftItems.DARK_CRYSTAL_SHARDS);
            event.accept(HexcraftItems.DARK_STEEL);
            event.accept(HexcraftItems.DARK_STEEL_NUGGET);
            event.accept(HexcraftItems.RAW_BLOODY_NYKIUM);
            event.accept(HexcraftItems.BLOODY_NYKIUM);
            event.accept(HexcraftItems.BLOODY_NYKIUM_NUGGET);
            event.accept(HexcraftItems.RAW_CUROGEN);
            event.accept(HexcraftItems.CUROGEN);
            event.accept(HexcraftItems.CUROGEN_NUGGET);
            event.accept(HexcraftItems.RAW_JORMIUM);
            event.accept(HexcraftItems.ENHANCED_JORMIUM_INGOT);
            event.accept(HexcraftItems.JORMIUM_INGOT);
            event.accept(HexcraftItems.JORMIUM_NUGGET);
            event.accept(HexcraftItems.STEEL_POWDER);
            event.accept(HexcraftItems.STEEL_INGOT);
            event.accept(HexcraftItems.WHITE_OAK_ASH);
            event.accept(HexcraftItems.SALT);
            event.accept(HexcraftItems.NECROMANTIC_STONE);
            event.accept(HexcraftItems.ATTUNED_STONE);
            event.accept(HexcraftItems.ATTUNED_STONE_CHARGED);

                    if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
                        event.accept(HexcraftItems.JUNIPER_BERRIES);

                    if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
                        event.accept(HexcraftBlocks.AMETHYST_CHIMES);
                        event.accept(HexcraftBlocks.MOONSTONE_BLOCK);
                        event.accept(HexcraftBlocks.SILVER_BLOCK);
                        event.accept(HexcraftBlocks.VAMPIRIC_BLOCK);


                    if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
                        event.accept(HexcraftBlocks.VILE_GRASS_BLOCK);
                        event.accept(HexcraftBlocks.VILE_DIRT);
                        event.accept(HexcraftBlocks.CURSED_SOIL);
                        event.accept(HexcraftBlocks.CURED_SOIL);
                        event.accept(HexcraftBlocks.FERTILIZED_DIRT);
                        event.accept(HexcraftBlocks.BLACK_OBSIDIAN);

                        event.accept(HexcraftBlocks.MOONSTONE_ORE);
                        event.accept(HexcraftBlocks.END_MOONSTONE_ORE);
                        event.accept(HexcraftBlocks.NETHER_MOONSTONE_ORE);
                        event.accept(HexcraftBlocks.DEEPSLATE_MOONSTONE_ORE);
                        event.accept(HexcraftBlocks.SILVER_ORE);
                        event.accept(HexcraftBlocks.END_SILVER_ORE);
                        event.accept(HexcraftBlocks.NETHER_SILVER_ORE);
                        event.accept(HexcraftBlocks.DEEPSLATE_SILVER_ORE);
                        event.accept(HexcraftBlocks.VAMPIRIC_ORE);
                        event.accept(HexcraftBlocks.END_VAMPIRIC_ORE);
                        event.accept(HexcraftBlocks.NETHER_VAMPIRIC_ORE);
                        event.accept(HexcraftBlocks.DEEPSLATE_VAMPIRIC_ORE);
                        event.accept(HexcraftBlocks.NYKIUM_ORE);
                        event.accept(HexcraftBlocks.TRENOGEN_ORE);
                        event.accept(HexcraftBlocks.DEEPSLATE_TRENOGEN_ORE);
                        event.accept(HexcraftBlocks.JORMUIM_ORE);

                    }
                }
            }
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}