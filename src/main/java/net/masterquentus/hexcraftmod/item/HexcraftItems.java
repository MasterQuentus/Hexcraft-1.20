package net.masterquentus.hexcraftmod.item;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.block.entity.boats.HexcraftBoatEntity;
import net.masterquentus.hexcraftmod.fluid.HexcraftFluids;
import net.masterquentus.hexcraftmod.item.custom.*;
import net.masterquentus.hexcraftmod.util.HexcraftTags;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.ComposterBlock;
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

    public static final RegistryObject<Item> BLOOD_BOTTLE = ITEMS.register("blood_bottle",
            () -> new BloodBottleItem(new Item.Properties().stacksTo(16)));

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

    public static final RegistryObject<Item> BLOOD_DROP = ITEMS.register("blood_drop",
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
            () -> new SimpleFoiledItem(new Item.Properties()));

    public static final RegistryObject<Item> BLOODED_WAYSTONE = ITEMS.register("blooded_waystone",
            () -> new BloodedWaystoneItem(new Item.Properties()));

    public static final RegistryObject<Item> BOUND_WAYSTONE = ITEMS.register("bound_waystone",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WOOD_ASH = ITEMS.register("wood_ash",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BREATH_OF_THE_GODDESS = ITEMS.register("breath_of_the_goddess",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EXHALE_OF_THE_HORNED_ONE = ITEMS.register("exhale_of_the_horned_one",
            () -> new Item(new Item.Properties()));

    //public static final RegistryObject<Item> BREW_OF_LOVE = ITEMS.register("brew_of_love",
    //() -> new BrewOfLoveItem(new Item.Properties()));

    public static final RegistryObject<Item> BREW_OF_SPROUTING = ITEMS.register("brew_of_sprouting",
            () -> new Item(new Item.Properties()));

    //public static final Supplier<SimpleEffectBrewItem> BREW_OF_THE_DEPTHS = registerBrew("brew_of_the_depths",
    //MobEffects.WATER_BREATHING, 6000, 0);

    public static final RegistryObject<Item> BREW_OF_THE_GROTESQUE = ITEMS.register("brew_of_the_grotesque",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CONDENSED_FEAR = ITEMS.register("condensed_fear",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_VAPOUR = ITEMS.register("diamond_vapour",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DROP_OF_LUCK = ITEMS.register("drop_of_luck",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> REEK_OF_MISFORTUNE = ITEMS.register("reek_of_misfortune",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WOOL_OF_BAT = ITEMS.register("wool_of_bat",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ARTHANA = ITEMS.register("arthana",
            () -> new SwordItem(HexcraftToolTiers.ARTHANA , 3, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> ANOINTING_PASTE = ITEMS.register("anointing_paste",
            () -> new AnointingPasteItem(new Item.Properties()));

    public static final RegistryObject<Item> MUTANDIS = ITEMS.register("mutandis",
            () -> new MutandisItem(HexcraftTags.Blocks.MUTANDIS_PLANTS));

    public static final RegistryObject<Item> MUTANDIS_EXTREMIS = ITEMS.register("mutandis_extremis",
            () -> new MutandisItem(HexcraftTags.Blocks.MUTANDIS_EXTREMIS_PLANTS));

    public static final RegistryObject<Item> POPPET = ITEMS.register("poppet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VOODOO_POPPET = ITEMS.register("voodoo_poppet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VOODOO_PROTECTION_POPPET = ITEMS.register("voodoo_protection_poppet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FALL_PROTECTION_POPPET = ITEMS.register("fall_protection_poppet",
            () -> new Item(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> EXPLOSION_PROTECTION_POPPET = ITEMS.register("explosion_protection_poppet",
            () -> new Item(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> PROJECTILE_PROTECTION_POPPET = ITEMS
            .register("projectile_protection_poppet", () -> new Item(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> HUNGER_PROTECTION_POPPET = ITEMS.register("hunger_protection_poppet",
            () -> new Item(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> POTION_PROTECTION_POPPET = ITEMS.register("potion_protection_poppet",
            () -> new Item(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> VOID_PROTECTION_POPPET = ITEMS.register("void_protection_poppet",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> CURSE_PROTECTION_POPPET = ITEMS.register("curse_protection_poppet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VAMPIRIC_POPPET = ITEMS.register("vampiric_poppet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DEATH_PROTECTION_POPPET = ITEMS.register("death_protection_poppet",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> FIRE_PROTECTION_POPPET = ITEMS.register("fire_protection_poppet",
            () -> new Item(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> WATER_PROTECTION_POPPET = ITEMS.register("water_protection_poppet",
            () -> new Item(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> WITHER_PROTECTION_POPPET = ITEMS.register("wither_protection_poppet",
            () -> new Item(new Item.Properties().durability(256)));

    public static final RegistryObject<Item> ARMOR_PROTECTION_POPPET = ITEMS.register("armor_protection_poppet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOOL_PROTECTION_POPPET = ITEMS.register("tool_protection_poppet",
            () -> new Item(new Item.Properties()));


    //Tools
    public static final RegistryObject<Item> VAMPIRIC_STAFF = ITEMS.register("vampiric_staff",
            () -> new VampiricStaffItem(new Item.Properties().durability(324)));

    public static final RegistryObject<Item> VAMPIRIC_STAFF_PROJECTILE = ITEMS.register("vampiric_staff_projectile",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(HexcraftToolTiers.STEEL, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(HexcraftToolTiers.STEEL, 1, 2, new Item.Properties()));

    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(HexcraftToolTiers.STEEL, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(HexcraftToolTiers.STEEL, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(HexcraftToolTiers.STEEL, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> STEEL_PAXEL = ITEMS.register("steel_paxel",
            () -> new PaxelItem(HexcraftToolTiers.STEEL, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> DARK_STEEL_SWORD = ITEMS.register("dark_steel_sword",
            () -> new SwordItem(HexcraftToolTiers.DARKSTEEL, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> DARK_STEEL_PICKAXE = ITEMS.register("dark_steel_pickaxe",
            () -> new PickaxeItem(HexcraftToolTiers.DARKSTEEL, 1, 2, new Item.Properties()));

    public static final RegistryObject<Item> DARK_STEEL_SHOVEL = ITEMS.register("dark_steel_shovel",
            () -> new ShovelItem(HexcraftToolTiers.DARKSTEEL, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> DARK_STEEL_AXE = ITEMS.register("dark_steel_axe",
            () -> new AxeItem(HexcraftToolTiers.DARKSTEEL, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> DARK_STEEL_HOE = ITEMS.register("dark_steel_hoe",
            () -> new HoeItem(HexcraftToolTiers.DARKSTEEL, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> DARK_STEEL_PAXEL = ITEMS.register("dark_steel_paxel",
            () -> new PaxelItem(HexcraftToolTiers.DARKSTEEL, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> BLOODY_NYKIUM_SWORD = ITEMS.register("bloody_nykium_sword",
            () -> new SwordItem(HexcraftToolTiers.BLOODYNYKIUM, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> BLOODY_NYKIUM_PICKAXE = ITEMS.register("bloody_nykium_pickaxe",
            () -> new PickaxeItem(HexcraftToolTiers.BLOODYNYKIUM, 1, 2, new Item.Properties()));

    public static final RegistryObject<Item> BLOODY_NYKIUM_SHOVEL = ITEMS.register("bloody_nykium_shovel",
            () -> new ShovelItem(HexcraftToolTiers.BLOODYNYKIUM, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> BLOODY_NYKIUM_AXE = ITEMS.register("bloody_nykium_axe",
            () -> new AxeItem(HexcraftToolTiers.BLOODYNYKIUM, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> BLOODY_NYKIUM_HOE = ITEMS.register("bloody_nykium_hoe",
            () -> new HoeItem(HexcraftToolTiers.BLOODYNYKIUM, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> BLOODY_NYKIUM_PAXEL = ITEMS.register("bloody_nykium_paxel",
            () -> new PaxelItem(HexcraftToolTiers.BLOODYNYKIUM, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> JORMIUM_SWORD = ITEMS.register("jormuim_sword",
            () -> new SwordItem(HexcraftToolTiers.JORMIUM, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> JORMIUM_PICKAXE = ITEMS.register("jormuim_pickaxe",
            () -> new PickaxeItem(HexcraftToolTiers.JORMIUM, 1, 2, new Item.Properties()));

    public static final RegistryObject<Item> JORMIUM_SHOVEL = ITEMS.register("jormuim_shovel",
            () -> new ShovelItem(HexcraftToolTiers.JORMIUM, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> JORMIUM_AXE = ITEMS.register("jormuim_axe",
            () -> new AxeItem(HexcraftToolTiers.JORMIUM, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> JORMIUM_HOE = ITEMS.register("jormuim_hoe",
            () -> new HoeItem(HexcraftToolTiers.JORMIUM, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> JORMIUM_PAXEL = ITEMS.register("jormium_paxel",
            () -> new PaxelItem(HexcraftToolTiers.JORMIUM, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> CUROGEN_SWORD = ITEMS.register("curogen_sword",
            () -> new SwordItem(HexcraftToolTiers.CUROGEN, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> CUROGEN_PICKAXE = ITEMS.register("curogen_pickaxe",
            () -> new PickaxeItem(HexcraftToolTiers.CUROGEN, 1, 2, new Item.Properties()));

    public static final RegistryObject<Item> CUROGEN_SHOVEL = ITEMS.register("curogen_shovel",
            () -> new ShovelItem(HexcraftToolTiers.CUROGEN, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> CUROGEN_AXE = ITEMS.register("curogen_axe",
            () -> new AxeItem(HexcraftToolTiers.CUROGEN, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> CUROGEN_HOE = ITEMS.register("curogen_hoe",
            () -> new HoeItem(HexcraftToolTiers.CUROGEN, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> CUROGEN_PAXEL = ITEMS.register("curogen_paxel",
            () -> new PaxelItem(HexcraftToolTiers.CUROGEN, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword",
            () -> new SwordItem(HexcraftToolTiers.SILVER, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(HexcraftToolTiers.SILVER, 1, 2, new Item.Properties()));

    public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new ShovelItem(HexcraftToolTiers.SILVER, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(HexcraftToolTiers.SILVER, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new HoeItem(HexcraftToolTiers.SILVER, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> SILVER_PAXEL = ITEMS.register("silver_paxel",
            () -> new PaxelItem(HexcraftToolTiers.STEEL, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> VAMPIRIC_SWORD = ITEMS.register("vampiric_sword",
            () -> new SwordItem(HexcraftToolTiers.VAMPIRIC, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> VAMPIRIC_PICKAXE = ITEMS.register("vampiric_pickaxe",
            () -> new PickaxeItem(HexcraftToolTiers.VAMPIRIC, 1, 2, new Item.Properties()));

    public static final RegistryObject<Item> VAMPIRIC_SHOVEL = ITEMS.register("vampiric_shovel",
            () -> new ShovelItem(HexcraftToolTiers.VAMPIRIC, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> VAMPIRIC_AXE = ITEMS.register("vampiric_axe",
            () -> new AxeItem(HexcraftToolTiers.VAMPIRIC, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> VAMPIRIC_HOE = ITEMS.register("vampiric_hoe",
            () -> new HoeItem(HexcraftToolTiers.VAMPIRIC, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> VAMPIRIC_PAXEL = ITEMS.register("vampiric_paxel",
            () -> new PaxelItem(HexcraftToolTiers.STEEL, 2, 3, new Item.Properties()));

    //Bows
    public static final RegistryObject<Item> STEEL_BOW = ITEMS.register("steel_bow",
            () -> new BowItem(new Item.Properties().durability(384)));

    public static final RegistryObject<Item> DARK_STEEL_BOW = ITEMS.register("dark_steel_bow",
            () -> new BowItem(new Item.Properties().durability(384)));

    public static final RegistryObject<Item> BLOODY_NYKIUM_BOW = ITEMS.register("bloody_nykium_bow",
            () -> new BowItem(new Item.Properties().durability(384)));

    public static final RegistryObject<Item> JORMIUM_BOW = ITEMS.register("jormium_bow",
            () -> new BowItem(new Item.Properties().durability(384)));

    public static final RegistryObject<Item> CUROGEN_BOW = ITEMS.register("curogen_bow",
            () -> new BowItem(new Item.Properties().durability(384)));

    //Armor
    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(HexcraftArmorMaterials.STEEL, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(HexcraftArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> STEEL_LEGGING = ITEMS.register("steel_leggings",
            () -> new ArmorItem(HexcraftArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(HexcraftArmorMaterials.STEEL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> DARK_STEEL_HELMET = ITEMS.register("dark_steel_helmet",
            () -> new ArmorItem(HexcraftArmorMaterials.DARKSTEEL, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> DARK_STEEL_CHESTPLATE = ITEMS.register("dark_steel_chestplate",
            () -> new ArmorItem(HexcraftArmorMaterials.DARKSTEEL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> DARK_STEEL_LEGGING = ITEMS.register("dark_steel_leggings",
            () -> new ArmorItem(HexcraftArmorMaterials.DARKSTEEL, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> DARK_STEEL_BOOTS = ITEMS.register("dark_steel_boots",
            () -> new ArmorItem(HexcraftArmorMaterials.DARKSTEEL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> BLOODY_NYKIUM_HELMET = ITEMS.register("bloody_nykium_helmet",
            () -> new ArmorItem(HexcraftArmorMaterials.BLOODYNYKIUM, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> BLOODY_NYKIUM_CHESTPLATE = ITEMS.register("bloody_nykium_chestplate",
            () -> new ArmorItem(HexcraftArmorMaterials.BLOODYNYKIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> BLOODY_NYKIUM_LEGGING = ITEMS.register("bloody_nykium_leggings",
            () -> new ArmorItem(HexcraftArmorMaterials.BLOODYNYKIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> BLOODY_NYKIUM_BOOTS = ITEMS.register("bloody_nykium_boots",
            () -> new ArmorItem(HexcraftArmorMaterials.BLOODYNYKIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> JORMIUM_HELMET = ITEMS.register("jormium_helmet",
            () -> new ArmorItem(HexcraftArmorMaterials.JORMIUM, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> JORMIUM_CHESTPLATE = ITEMS.register("jormium_chestplate",
            () -> new ArmorItem(HexcraftArmorMaterials.JORMIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> JORMIUM_LEGGING = ITEMS.register("jormium_leggings",
            () -> new ArmorItem(HexcraftArmorMaterials.JORMIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> JORMIUM_BOOTS = ITEMS.register("jormium_boots",
            () -> new ArmorItem(HexcraftArmorMaterials.JORMIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CUROGEN_HELMET = ITEMS.register("curogen_helmet",
            () -> new ArmorItem(HexcraftArmorMaterials.CUROGEN, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> CUROGEN_CHESTPLATE = ITEMS.register("curogen_chestplate",
            () -> new ArmorItem(HexcraftArmorMaterials.CUROGEN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> CUROGEN_LEGGING = ITEMS.register("curogen_leggings",
            () -> new ArmorItem(HexcraftArmorMaterials.CUROGEN, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> CUROGEN_BOOTS = ITEMS.register("curogen_boots",
            () -> new ArmorItem(HexcraftArmorMaterials.CUROGEN, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new ArmorItem(HexcraftArmorMaterials.SILVER, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new ArmorItem(HexcraftArmorMaterials.SILVER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> SILVER_LEGGING = ITEMS.register("silver_leggings",
            () -> new ArmorItem(HexcraftArmorMaterials.SILVER, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new ArmorItem(HexcraftArmorMaterials.SILVER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> VAMPIRIC_HELMET = ITEMS.register("vampiric_helmet",
            () -> new ArmorItem(HexcraftArmorMaterials.VAMPIRIC, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> VAMPIRIC_CHESTPLATE = ITEMS.register("vampiric_chestplate",
            () -> new ArmorItem(HexcraftArmorMaterials.VAMPIRIC, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> VAMPIRIC_LEGGING = ITEMS.register("vampiric_leggings",
            () -> new ArmorItem(HexcraftArmorMaterials.VAMPIRIC, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> VAMPIRIC_BOOTS = ITEMS.register("vampiric_boots",
            () -> new ArmorItem(HexcraftArmorMaterials.VAMPIRIC, ArmorItem.Type.BOOTS, new Item.Properties()));


    //Plants
    public static final RegistryObject<Item> WITCHES_LADDER_ITEM = ITEMS.register("witches_ladder_item",
            () -> new BlockItem(HexcraftBlocks.WITCHES_LADDER.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> VILEVINE_ITEM = ITEMS.register("vilevine_item",
            () -> new BlockItem(HexcraftBlocks.VILEVINE.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> LIVING_KELP_ITEM = ITEMS.register("living_kelp_item",
            () -> new BlockItem(HexcraftBlocks.LIVING_KELP_PLANT.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> MANDRAKE_SEEDS = ITEMS.register("mandrake_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.MANDRAKE_FLOWER.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> MANDRAKE_ROOT = ITEMS.register("mandrake_root",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic",
            () -> new ItemNameBlockItem(HexcraftBlocks.GARLIC_PLANT.get(),
                    new Item.Properties().food(Foods.CARROT).food(Foods.CARROT)));

    public static final RegistryObject<Item> VERVAIN_SEEDS = ITEMS.register("vervain_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.VERVAIN_FLOWER.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> VERVAIN = ITEMS.register("vervain",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WOLFSBANE_SEEDS = ITEMS.register("wolfsbane_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.WOLFSBANE_FLOWER.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> WOLFSBANE = ITEMS.register("wolfsbane",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRENIAL_SEEDS = ITEMS.register("irenial_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.IRENIAL_FLOWER.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> IRENIAL = ITEMS.register("irenial",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MIRA_SEEDS = ITEMS.register("mira_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.MIRA_FLOWER.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> MIRA = ITEMS.register("mira",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> XERIFAE_SEEDS = ITEMS.register("xerifae_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.XERIFAE_FLOWER.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> XERIFAE = ITEMS.register("xerifae",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SENIA_SEEDS = ITEMS.register("senia_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.SENIA_FLOWER.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> SENIA = ITEMS.register("senia",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AERPINE_SEEDS = ITEMS.register("aerpine_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.AERPINE_FLOWER.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> AERPINE = ITEMS.register("aerpine",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PERENNIA_SEEDS = ITEMS.register("perennia_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.PERENNIA_FLOWER.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> PERENNIA = ITEMS.register("perennia",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BELLADONNA_SEEDS = ITEMS.register("belladonna_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.BELLADONNA_PLANT.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> BELLADONNA = ITEMS.register("belladonna",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HELLEBORE_SEEDS = ITEMS.register("hellebore_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.HELLEBORE_PLANT.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> HELLEBORE = ITEMS.register("hellebore",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SAGE_SEEDS = ITEMS.register("sage_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.SAGE_PLANT.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> SAGE = ITEMS.register("sage",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WORMWOOD_SEEDS = ITEMS.register("wormwood_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.WORMWOOD_PLANT.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> WORMWOOD = ITEMS.register("wormwood",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WATER_ARTICHOKE_SEEDS = ITEMS.register("water_artichoke_seeds",
            () -> new ItemNameBlockItem(HexcraftBlocks.WATER_ARTICHOKE_PLANT.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> WATER_ARTICHOKE = ITEMS.register("water_artichoke",
            () -> new Item(new Item.Properties()));

    //Foods
    public static final RegistryObject<Item> JUNIPER_BERRIES = ITEMS.register("juniper_berries",
            () -> new Item(new Item.Properties().food(HexcraftFoods.JUNIPER_BERRIES)));

    public static final RegistryObject<Item> BLOOD_BERRIES = ITEMS.register("blood_berries",
            () -> new ItemNameBlockItem(HexcraftBlocks.BLOOD_BERRIES_PLANT.get(),
                    new Item.Properties().food(HexcraftFoods.BLOOD_BERRIES)));

    public static final RegistryObject<Item> BLOOD_APPLE = ITEMS.register("blood_apple",
            () -> new Item(new Item.Properties().food(HexcraftFoods.BLOOD_APPLE)));

    public static final RegistryObject<Item> FAIRY_DUST = ITEMS.register("fairy_dust",
            () -> new Item(new Item.Properties().food(Foods.SUSPICIOUS_STEW)));

    public static final RegistryObject<Item> PIXIE_DUST = ITEMS.register("pixie_dust",
            () -> new Item(new Item.Properties().food(Foods.SUSPICIOUS_STEW)));


    //Liquids
    public static final RegistryObject<Item> BLOOD_BUCKET = ITEMS.register("blood_bucket",
            () -> new BucketItem(HexcraftFluids.SOURCE_BLOOD, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));


    //Signs
    public static final RegistryObject<Item> EBONY_SIGN = ITEMS.register("ebony_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), HexcraftBlocks.EBONY_SIGN.get(), HexcraftBlocks.EBONY_WALL_SIGN.get()));

    public static final RegistryObject<Item> BLOOD_OAK_SIGN = ITEMS.register("blood_oak_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), HexcraftBlocks.BLOOD_OAK_SIGN.get(), HexcraftBlocks.BLOOD_OAK_WALL_SIGN.get()));

    public static final RegistryObject<Item> HELL_BARK_SIGN = ITEMS.register("hell_bark_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), HexcraftBlocks.HELL_BARK_SIGN.get(), HexcraftBlocks.HELL_BARK_WALL_SIGN.get()));

    public static final RegistryObject<Item> WHITE_OAK_SIGN = ITEMS.register("white_oak_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), HexcraftBlocks.WHITE_OAK_SIGN.get(), HexcraftBlocks.WHITE_OAK_WALL_SIGN.get()));

    public static final RegistryObject<Item> ALDER_SIGN = ITEMS.register("alder_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), HexcraftBlocks.ALDER_SIGN.get(), HexcraftBlocks.ALDER_WALL_SIGN.get()));

    public static final RegistryObject<Item> WITCH_HAZEL_SIGN = ITEMS.register("witch_hazel_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), HexcraftBlocks.WITCH_HAZEL_SIGN.get(), HexcraftBlocks.WITCH_WOOD_WALL_SIGN.get()));

    public static final RegistryObject<Item> WILLOW_SIGN = ITEMS.register("willow_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), HexcraftBlocks.WILLOW_SIGN.get(), HexcraftBlocks.WILLOW_WALL_SIGN.get()));

    public static final RegistryObject<Item> HAWTHORN_SIGN = ITEMS.register("hawthorn_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), HexcraftBlocks.HAWTHORN_SIGN.get(), HexcraftBlocks.HAWTHORN_WALL_SIGN.get()));

    public static final RegistryObject<Item> CEDAR_SIGN = ITEMS.register("cedar_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), HexcraftBlocks.CEDAR_SIGN.get(), HexcraftBlocks.CEDAR_WALL_SIGN.get()));

    public static final RegistryObject<Item> DISTORTED_SIGN = ITEMS.register("distorted_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), HexcraftBlocks.DISTORTED_SIGN.get(), HexcraftBlocks.DISTORTED_WALL_SIGN.get()));

    public static final RegistryObject<Item> ELDER_SIGN = ITEMS.register("elder_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), HexcraftBlocks.ELDER_SIGN.get(), HexcraftBlocks.ELDER_WALL_SIGN.get()));

    public static final RegistryObject<Item> JUNIPER_SIGN = ITEMS.register("juniper_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), HexcraftBlocks.JUNIPER_SIGN.get(), HexcraftBlocks.JUNIPER_WALL_SIGN.get()));

    public static final RegistryObject<Item> ROWAN_SIGN = ITEMS.register("rowan_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), HexcraftBlocks.ROWAN_SIGN.get(), HexcraftBlocks.ROWAN_WALL_SIGN.get()));

    public static final RegistryObject<Item> TWISTED_SIGN = ITEMS.register("twisted_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), HexcraftBlocks.TWISTED_SIGN.get(), HexcraftBlocks.TWISTED_WALL_SIGN.get()));

    public static final RegistryObject<Item> WITCH_WOOD_SIGN = ITEMS.register("witch_wood_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), HexcraftBlocks.WITCH_WOOD_SIGN.get(), HexcraftBlocks.WITCH_WOOD_WALL_SIGN.get()));

    public static final RegistryObject<Item> ECHO_WOOD_SIGN = ITEMS.register("echo_wood_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), HexcraftBlocks.ECHO_WOOD_SIGN.get(), HexcraftBlocks.ECHO_WOOD_WALL_SIGN.get()));

    public static final RegistryObject<Item> EBONY_HANGING_SIGN = ITEMS.register("ebony_hanging_sign",
            () ->  new HangingSignItem(HexcraftBlocks.EBONY_HANGING_SIGN.get(), HexcraftBlocks.EBONY_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> BLOOD_OAK_HANGING_SIGN = ITEMS.register("blood_oak_hanging_sign",
            () ->  new HangingSignItem(HexcraftBlocks.BLOOD_OAK_HANGING_SIGN.get(), HexcraftBlocks.BLOOD_OAK_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> HELL_BARK_HANGING_SIGN = ITEMS.register("hell_bark_hanging_sign",
            () ->  new HangingSignItem(HexcraftBlocks.HELL_BARK_HANGING_SIGN.get(), HexcraftBlocks.HELL_BARK_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> WHITE_OAK_HANGING_SIGN = ITEMS.register("white_oak_hanging_sign",
            () ->  new HangingSignItem(HexcraftBlocks.WHITE_OAK_HANGING_SIGN.get(), HexcraftBlocks.WHITE_OAK_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ALDER_HANGING_SIGN = ITEMS.register("alder_hanging_ign",
            () ->  new HangingSignItem(HexcraftBlocks.ALDER_HANGING_SIGN.get(), HexcraftBlocks.ALDER_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> WITCH_HAZEL_HANGING_SIGN = ITEMS.register("witch_hazel_hanging_sign",
            () ->  new HangingSignItem(HexcraftBlocks.WITCH_HAZEL_HANGING_SIGN.get(), HexcraftBlocks.WITCH_HAZEL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> WILLOW_HANGING_SIGN = ITEMS.register("willow_hanging_sign",
            () ->  new HangingSignItem(HexcraftBlocks.WILLOW_HANGING_SIGN.get(), HexcraftBlocks.WILLOW_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> HAWTHORN_HANGING_SIGN = ITEMS.register("hawthorn_hanging_sign",
            () ->  new HangingSignItem(HexcraftBlocks.HAWTHORN_HANGING_SIGN.get(), HexcraftBlocks.HAWTHORN_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> CEDAR_HANGING_SIGN = ITEMS.register("cedar_hanging_sign",
            () ->  new HangingSignItem(HexcraftBlocks.CEDAR_HANGING_SIGN.get(), HexcraftBlocks.CEDAR_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> DISTORTED_HANGING_SIGN = ITEMS.register("distorted_hanging_sign",
            () ->  new HangingSignItem(HexcraftBlocks.DISTORTED_HANGING_SIGN.get(), HexcraftBlocks.DISTORTED_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ELDER_HANGING_SIGN = ITEMS.register("elder_hanging_sign",
            () ->  new HangingSignItem(HexcraftBlocks.ELDER_HANGING_SIGN.get(), HexcraftBlocks.ELDER_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> JUNIPER_HANGING_SIGN = ITEMS.register("juniper_hanging_sign",
            () ->  new HangingSignItem(HexcraftBlocks.JUNIPER_HANGING_SIGN.get(), HexcraftBlocks.JUNIPER_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ROWAN_HANGING_SIGN = ITEMS.register("rowan_hanging_sign",
            () ->  new HangingSignItem(HexcraftBlocks.ROWAN_HANGING_SIGN.get(), HexcraftBlocks.ROWAN_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> TWISTED_HANGING_SIGN = ITEMS.register("twisted_hanging_sign",
            () ->  new HangingSignItem(HexcraftBlocks.TWISTED_HANGING_SIGN.get(), HexcraftBlocks.TWISTED_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> WITCH_WOOD_HANGING_SIGN = ITEMS.register("witch_wood_hanging_sign",
            () ->  new HangingSignItem(HexcraftBlocks.WITCH_WOOD_HANGING_SIGN.get(), HexcraftBlocks.WITCH_WOOD_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ECHO_WOOD_HANGING_SIGN = ITEMS.register("echo_wood_hanging_sign",
            () ->  new HangingSignItem(HexcraftBlocks.ECHO_WOOD_HANGING_SIGN.get(), HexcraftBlocks.ECHO_WOOD_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    //Boats
    public static final RegistryObject<Item> EBONY_BOAT = ITEMS.register("ebony_boat",
            () -> new HexcraftBoatItem(false, HexcraftBoatEntity.Type.EBONY, new Item.Properties()));
    
    public static final RegistryObject<Item> EBONY_CHEST_BOAT = ITEMS.register("ebony_chest_boat",
            () -> new HexcraftBoatItem(true, HexcraftBoatEntity.Type.EBONY, new Item.Properties()));

    public static final RegistryObject<Item> BLOOD_OAK_BOAT = ITEMS.register("blood_oak_boat",
            () -> new HexcraftBoatItem(false, HexcraftBoatEntity.Type.BLOOD_OAK, new Item.Properties()));

    public static final RegistryObject<Item> BLOOD_OAK_CHEST_BOAT = ITEMS.register("blood_oak_chest_boat",
            () -> new HexcraftBoatItem(true, HexcraftBoatEntity.Type.BLOOD_OAK, new Item.Properties()));

    public static final RegistryObject<Item> HELL_BARK_BOAT = ITEMS.register("hell_bark_boat",
            () -> new HexcraftBoatItem(false, HexcraftBoatEntity.Type.HELL_BARK, new Item.Properties()));

    public static final RegistryObject<Item> HELL_BARK_CHEST_BOAT = ITEMS.register("hell_bark_chest_boat",
            () -> new HexcraftBoatItem(true, HexcraftBoatEntity.Type.HELL_BARK, new Item.Properties()));

    public static final RegistryObject<Item> WHITE_OAK_BOAT = ITEMS.register("white_oak_boat",
            () -> new HexcraftBoatItem(false, HexcraftBoatEntity.Type.WHITE_OAK, new Item.Properties()));

    public static final RegistryObject<Item> WHITE_OAK_CHEST_BOAT = ITEMS.register("white_oak_chest_boat",
            () -> new HexcraftBoatItem(true, HexcraftBoatEntity.Type.WHITE_OAK, new Item.Properties()));

    public static final RegistryObject<Item> ALDER_BOAT = ITEMS.register("alder_boat",
            () -> new HexcraftBoatItem(false, HexcraftBoatEntity.Type.ALDER, new Item.Properties()));

    public static final RegistryObject<Item> ALDER_CHEST_BOAT = ITEMS.register("alder_chest_boat",
            () -> new HexcraftBoatItem(true, HexcraftBoatEntity.Type.ALDER, new Item.Properties()));

    public static final RegistryObject<Item> WITCH_HAZEL_BOAT = ITEMS.register("witch_hazel_boat",
            () -> new HexcraftBoatItem(false, HexcraftBoatEntity.Type.WITCH_HAZEL, new Item.Properties()));

    public static final RegistryObject<Item> WITCH_HAZEL_CHEST_BOAT = ITEMS.register("witch_hazel_chest_boat",
            () -> new HexcraftBoatItem(true, HexcraftBoatEntity.Type.WITCH_HAZEL, new Item.Properties()));

    public static final RegistryObject<Item> WILLOW_BOAT = ITEMS.register("willow_boat",
            () -> new HexcraftBoatItem(false, HexcraftBoatEntity.Type.WILLOW, new Item.Properties()));

    public static final RegistryObject<Item>WILLOW_CHEST_BOAT = ITEMS.register("willow_chest_boat",
            () -> new HexcraftBoatItem(true, HexcraftBoatEntity.Type.WILLOW, new Item.Properties()));

    public static final RegistryObject<Item> HAWTHORN_BOAT = ITEMS.register("hawthorn_boat",
            () -> new HexcraftBoatItem(false, HexcraftBoatEntity.Type.HAWTHORN, new Item.Properties()));

    public static final RegistryObject<Item> HAWTHORN_CHEST_BOAT = ITEMS.register("hawthorn_chest_boat",
            () -> new HexcraftBoatItem(true, HexcraftBoatEntity.Type.HAWTHORN, new Item.Properties()));

    public static final RegistryObject<Item> CEDAR_BOAT = ITEMS.register("cedar_boat",
            () -> new HexcraftBoatItem(false, HexcraftBoatEntity.Type.CEDAR, new Item.Properties()));

    public static final RegistryObject<Item> CEDAR_CHEST_BOAT = ITEMS.register("cedar_chest_boat",
            () -> new HexcraftBoatItem(true, HexcraftBoatEntity.Type.CEDAR, new Item.Properties()));

    public static final RegistryObject<Item> DISTORTED_BOAT = ITEMS.register("distorted_boat",
            () -> new HexcraftBoatItem(false, HexcraftBoatEntity.Type.DISTORTED, new Item.Properties()));

    public static final RegistryObject<Item> DISTORTED_CHEST_BOAT = ITEMS.register("distorted_chest_boat",
            () -> new HexcraftBoatItem(true, HexcraftBoatEntity.Type.DISTORTED, new Item.Properties()));

    public static final RegistryObject<Item> ELDER_BOAT = ITEMS.register("elder_boat",
            () -> new HexcraftBoatItem(false, HexcraftBoatEntity.Type.ELDER, new Item.Properties()));

    public static final RegistryObject<Item> ELDER_CHEST_BOAT = ITEMS.register("elder_chest_boat",
            () -> new HexcraftBoatItem(true, HexcraftBoatEntity.Type.ELDER, new Item.Properties()));

    public static final RegistryObject<Item> JUNIPER_BOAT = ITEMS.register("juniper_boat",
            () -> new HexcraftBoatItem(false, HexcraftBoatEntity.Type.JUNIPER, new Item.Properties()));

    public static final RegistryObject<Item> JUNIPER_CHEST_BOAT = ITEMS.register("juniper_chest_boat",
            () -> new HexcraftBoatItem(true, HexcraftBoatEntity.Type.JUNIPER, new Item.Properties()));

    public static final RegistryObject<Item> ROWAN_BOAT = ITEMS.register("rowan_boat",
            () -> new HexcraftBoatItem(false, HexcraftBoatEntity.Type.ROWAN, new Item.Properties()));

    public static final RegistryObject<Item> ROWAN_CHEST_BOAT = ITEMS.register("rowan_chest_boat",
            () -> new HexcraftBoatItem(true, HexcraftBoatEntity.Type.ROWAN, new Item.Properties()));

    public static final RegistryObject<Item> TWISTED_BOAT = ITEMS.register("twisted_boat",
            () -> new HexcraftBoatItem(false, HexcraftBoatEntity.Type.TWISTED, new Item.Properties()));

    public static final RegistryObject<Item> TWISTED_CHEST_BOAT = ITEMS.register("twisted_chest_boat",
            () -> new HexcraftBoatItem(true, HexcraftBoatEntity.Type.TWISTED, new Item.Properties()));

    public static final RegistryObject<Item> WITCH_WOOD_BOAT = ITEMS.register("witch_wood_boat",
            () -> new HexcraftBoatItem(false, HexcraftBoatEntity.Type.WITCH_WOOD, new Item.Properties()));

    public static final RegistryObject<Item> WITCH_WOOD_CHEST_BOAT = ITEMS.register("witch_wood_chest_boat",
            () -> new HexcraftBoatItem(true, HexcraftBoatEntity.Type.WITCH_WOOD, new Item.Properties()));

    public static final RegistryObject<Item> ECHO_WOOD_BOAT = ITEMS.register("echo_wood_boat",
            () -> new HexcraftBoatItem(false, HexcraftBoatEntity.Type.ECHO_WOOD, new Item.Properties()));

    public static final RegistryObject<Item> ECHO_WOOD_CHEST_BOAT = ITEMS.register("echo_wood_chest_boat",
            () -> new HexcraftBoatItem(true, HexcraftBoatEntity.Type.ECHO_WOOD, new Item.Properties()));

    //Chest



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static void registerCompostables() {
        ComposterBlock.COMPOSTABLES.put(BLOOD_APPLE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(JUNIPER_BERRIES.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BLOOD_BERRIES.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(WATER_ARTICHOKE_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(WATER_ARTICHOKE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(JUNIPER_BERRIES.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(WORMWOOD_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(WORMWOOD.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(SAGE_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(SAGE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(HELLEBORE_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(HELLEBORE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(PERENNIA_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(PERENNIA.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(AERPINE_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(AERPINE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(SENIA_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(SENIA.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(XERIFAE_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(XERIFAE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(MIRA_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(MIRA.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(IRENIAL_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(IRENIAL.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(VERVAIN_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(VERVAIN.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(BELLADONNA_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(BELLADONNA.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(MANDRAKE_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(MANDRAKE_ROOT.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(WOLFSBANE_SEEDS.get(), 0.3F);
        ComposterBlock.COMPOSTABLES.put(WOLFSBANE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(GARLIC.get(), 0.45F);
        ComposterBlock.COMPOSTABLES.put(WITCHES_LADDER_ITEM.get(), 0.5F);
    }

}
