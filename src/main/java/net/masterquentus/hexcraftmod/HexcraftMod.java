package net.masterquentus.hexcraftmod;

import java.util.Random;

import net.masterquentus.hexcraftmod.entity.HexcraftEntityTypes;
import net.masterquentus.hexcraftmod.worldgen.biome.HexcraftTerraBlenderAPI;
import net.masterquentus.hexcraftmod.worldgen.biome.suface.HexcraftSurfaceRules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mojang.logging.LogUtils;

import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.block.entity.HexcraftBlockEntities;
import net.masterquentus.hexcraftmod.item.HexcraftCreativeModTabs;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.masterquentus.hexcraftmod.loot.HexcraftLootModifier;
import net.masterquentus.hexcraftmod.recipe.HexcraftRecipeTypes;
import net.masterquentus.hexcraftmod.recipe.HexcraftRecipes;
import net.masterquentus.hexcraftmod.screen.HexcraftMenuTypes;
import net.masterquentus.hexcraftmod.screen.WitchesOvenScreen;
import net.masterquentus.hexcraftmod.util.HexcraftConfigs;
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
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import terrablender.api.SurfaceRuleManager;
// The value here should match an entry in the META-INF/mods.toml file
@Mod(HexcraftMod.MOD_ID)
@Mod.EventBusSubscriber(modid = HexcraftMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
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
		HexcraftRecipeTypes.register(modEventBus);
		HexcraftLootModifier.register(modEventBus);
		HexcraftEntityTypes.register(modEventBus);

		//HexcraftTerraBlenderAPI.registerRegions();
		modEventBus.addListener(this::commonSetup);

		MinecraftForge.EVENT_BUS.register(this);
		modEventBus.addListener(this::addCreative);
		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, HexcraftConfigs.SPEC);
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(MOD_ID, path);
	}

	public static String translationKey(String prefix, String suffix) {
		return String.format("%s.%s.%s", prefix, MOD_ID, suffix);
	}

	private void commonSetup(final FMLCommonSetupEvent event) {
		HexcraftItems.registerCompostables();
		event.enqueueWork(() -> {

			((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.VAMPIRE_ORCHID.getId(),
					HexcraftBlocks.POTTED_VAMPIRE_ORCHID);
			((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(HexcraftBlocks.BLOODY_ROSE.getId(),
					HexcraftBlocks.POTTED_BLOODY_ROSE);

			SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, HexcraftSurfaceRules.makeRules());
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

	// You can use EventBusSubscriber to automatically register all static methods
	// in the class annotated with @SubscribeEvent
	@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientModEvents {
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {
			MenuScreens.register(HexcraftMenuTypes.WITCHES_OVEN_MENU.get(), WitchesOvenScreen::new);
		}
	}
}