package net.masterquentus.hexcraftmod;

import com.mojang.logging.LogUtils;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.block.entity.HexcraftBlockEntities;
import net.masterquentus.hexcraftmod.item.HexcraftCreativeModTabs;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.masterquentus.hexcraftmod.loot.HexcraftLootModifier;
import net.masterquentus.hexcraftmod.recipe.HexcraftRecipes;
import net.masterquentus.hexcraftmod.screen.HexcraftMenuTypes;
import net.masterquentus.hexcraftmod.screen.WitchesOvenScreen;
//import net.masterquentus.hexcraftmod.worldgen.biome.HexcraftTerrablenderAPI;
//import net.masterquentus.hexcraftmod.worldgen.biome.suface.HexcraftSurfaceRules;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
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
import org.slf4j.LoggerFactory;

import java.util.Random;

import static net.masterquentus.hexcraftmod.block.HexcraftBlocks.*;
import static net.masterquentus.hexcraftmod.item.HexcraftItems.*;
//import terrablender.api.SurfaceRuleManager;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(HexcraftMod.MOD_ID)
@Mod.EventBusSubscriber(modid=HexcraftMod.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD)
public class HexcraftMod {
    public static final String MOD_ID = "hexcraftmod";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_ID);
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final Random RANDOM = new Random();
    public static final RandomSource RANDOMSOURCE = RandomSource.create();


    public HexcraftMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        HexcraftCreativeModTabs.register(modEventBus);

        HexcraftItems.register(modEventBus);
        HexcraftBlocks.register(modEventBus);
        HexcraftBlockEntities.register(modEventBus);
        HexcraftMenuTypes.register(modEventBus);
        HexcraftRecipes.register(modEventBus);
        HexcraftLootModifier.register(modEventBus);

        //HexcraftTerrablenderAPI.registerRegions();
        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static String translationKey(String prefix, String suffix) {
        return String.format("%s.%s.%s", prefix, MOD_ID, suffix);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ComposterBlock.COMPOSTABLES.put(HexcraftItems.BLOOD_APPLE.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(HexcraftItems.JUNIPER_BERRIES.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(HexcraftItems.BLOOD_BERRIES.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(WATER_ARTICHOKE_SEEDS.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(WATER_ARTICHOKE.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(BELLADONNA_SEEDS.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(BELLADONNA.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(MANDRAKE_SEEDS.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(MANDRAKE_ROOT.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(WOLFSBANE_SEEDS.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(WOLFSBANE_FLOWER.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(AERPINE.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(AERPINE_SEEDS.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(HELLEBORE.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(HELLEBORE_SEEDS.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(IRENIAL.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(IRENIAL_SEEDS.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(MIRA.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(MIRA_SEEDS.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(PERENNIA.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(PERENNIA_SEEDS.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(SAGE.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(SAGE_SEEDS.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(SENIA.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(SENIA_SEEDS.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(VERVAIN.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(VERVAIN_SEEDS.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(XERIFAE.get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(XERIFAE_SEEDS.get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(GARLIC.get(), 0.45F);
            ComposterBlock.COMPOSTABLES.put(VAMPIRE_ORCHID.get(), 0.45F);
            ComposterBlock.COMPOSTABLES.put(BLOODY_ROSE.get(), 0.45F);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.VAMPIRE_ORCHID.getId(), HexcraftBlocks.POTTED_VAMPIRE_ORCHID);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.BLOODY_ROSE.getId(), HexcraftBlocks.POTTED_BLOODY_ROSE);

            //SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, HexcraftSurfaceRules.makeRules());
        });


    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {

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

            MenuScreens.register(HexcraftMenuTypes.WITCHES_OVEN_MENU.get(), WitchesOvenScreen::new);

        }
    }
}