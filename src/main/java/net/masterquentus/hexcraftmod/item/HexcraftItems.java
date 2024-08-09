package net.masterquentus.hexcraftmod.item;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.item.custom.TagLockKitFilled;
import net.masterquentus.hexcraftmod.item.custom.TagLockKitItem;
import net.masterquentus.hexcraftmod.item.custom.WitchesSatchelItem;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HexcraftMod.MOD_ID);

    public static final RegistryObject<Item> INFUSED_FABRIC = ITEMS.register("infused_fabric",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BOUND_LEATHER = ITEMS.register("bound_leather",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TANNED_LEATHER = ITEMS.register("tanned_leather",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BONE_NEEDLE = ITEMS.register("bone_needle",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TAGLOCK_KIT = ITEMS.register("taglock_kit",
            () -> new TagLockKitItem(new Item.Properties()));

    public static final RegistryObject<Item> TAGLOCK_KIT_FULL = ITEMS.register("taglock_kit_full",
            () -> new TagLockKitFilled(new Item.Properties()));

    public static final RegistryObject<Item> WITCHES_SATCHEL = ITEMS.register("witches_satchel",
            () -> new WitchesSatchelItem(new Item.Properties()));

    public static final RegistryObject<Item> UNFIRED_CLAY_POT = ITEMS.register("unfired_clay_pot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CLAY_POT = ITEMS.register("clay_pot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LILITH_CONTRACT = ITEMS.register("lilith_contract",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LILITH_SOUL = ITEMS.register("lilith_soul",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MAGIC_CRYSTAL = ITEMS.register("magic_crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLANK_RUNE = ITEMS.register("blank_rune",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AIR_RUNE = ITEMS.register("air_rune",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EARTH_RUNE = ITEMS.register("earth_rune",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FIRE_RUNE = ITEMS.register("fire_rune",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WATER_RUNE = ITEMS.register("water_rune",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RED_RUNE = ITEMS.register("red_rune",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLACK_RUNE = ITEMS.register("black_rune",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLUE_RUNE = ITEMS.register("blue_rune",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GREEN_RUNE = ITEMS.register("green_rune",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ORANGE_RUNE = ITEMS.register("orange_rune",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PURPLE_RUNE = ITEMS.register("purple_rune",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WHITE_RUNE = ITEMS.register("white_rune",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> YELLOW_RUNE = ITEMS.register("yellow_rune",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ROPE = ITEMS.register("rope",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MOONSTONE = ITEMS.register("moonstone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VAMPIRIC_GEM = ITEMS.register("vampiric_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CORRUPTED_NETHER_STAR = ITEMS.register("corrupted_nether_star",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CORRUPTED_STEEL = ITEMS.register("corrupted_steel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CORRUPTED_STEEL_NUGGET = ITEMS.register("corrupted_steel_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DARK_CRYSTAL_SHARDS = ITEMS.register("dark_crystal_shards",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DARK_STEEL = ITEMS.register("dark_steel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DARK_STEEL_NUGGET = ITEMS.register("dark_steel_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_BLOODY_NYKIUM = ITEMS.register("raw_bloody_nykium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLOODY_NYKIUM = ITEMS.register("bloody_nykium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLOODY_NYKIUM_NUGGET = ITEMS.register("bloody_nykium_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_CUROGEN = ITEMS.register("raw_curogen",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CUROGEN = ITEMS.register("curogen",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CUROGEN_NUGGET = ITEMS.register("curogen_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_JORMIUM = ITEMS.register("raw_jormium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ENHANCED_JORMIUM_INGOT = ITEMS.register("enhanced_jormium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JORMIUM_INGOT = ITEMS.register("jormium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> JORMIUM_NUGGET = ITEMS.register("jormium_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_POWDER = ITEMS.register("steel_powder",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WHITE_OAK_ASH = ITEMS.register("white_oak_ash",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NECROMANTIC_STONE = ITEMS.register("necromantic_stone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ATTUNED_STONE = ITEMS.register("attuned_stone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ATTUNED_STONE_CHARGED = ITEMS.register("attuned_stone_charged",
            () -> new Item(new Item.Properties()));

    //Plants
    public static final RegistryObject<Item> WITCHES_LADDER_ITEM = ITEMS.register("witches_ladder_item",
            () -> new BlockItem(HexcraftBlocks.WITCHES_LADDER.get(),
                    new Item.Properties()));

    //Foods
    public static final RegistryObject<Item> JUNIPER_BERRIES = ITEMS.register("juniper_berries",
            () -> new Item(new Item.Properties().food(HexcraftFoods.JUNIPER_BERRIES)));

    public static final RegistryObject<Item> BLOOD_BERRIES = ITEMS.register("blood_berries",
            () -> new ItemNameBlockItem(HexcraftBlocks.BLOOD_BERRIES_PLANT.get(),
                    new Item.Properties().food(HexcraftFoods.BLOOD_BERRIES)));

    public static final RegistryObject<Item> BLOOD_APPLE = ITEMS.register("blood_apple",
            () -> new Item(new Item.Properties().food(HexcraftFoods.BLOOD_APPLE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
