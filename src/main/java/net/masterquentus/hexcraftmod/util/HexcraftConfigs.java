package net.masterquentus.hexcraftmod.util;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = HexcraftMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class HexcraftConfigs {
	private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

	private static final ForgeConfigSpec.ConfigValue<List<? extends String>> WHITELISTED_ITEMS = BUILDER
			.comment("A list of whitelisted items to prevent from getting cleared when a wrong input is added. "
					+ "Preferably used for rare or one time items. Example: Dragon Egg")
			.defineList("items", () -> List.of("minecraft:dragon_egg"), HexcraftConfigs::validateItemName);

	public static final ForgeConfigSpec SPEC = BUILDER.build();

	public static Set<Item> whitelistedItems;

	private static boolean validateItemName(final Object obj) {
		return obj instanceof final String itemName
				&& ForgeRegistries.ITEMS.containsKey(new ResourceLocation(itemName));
	}

	@SubscribeEvent
	public static void onLoad(final ModConfigEvent event) {
		whitelistedItems = WHITELISTED_ITEMS.get().stream()
				.map(itemName -> ForgeRegistries.ITEMS.getValue(new ResourceLocation(itemName)))
				.collect(Collectors.toSet());
	}
}
