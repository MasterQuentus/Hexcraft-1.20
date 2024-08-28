package net.masterquentus.hexcraftmod.item;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
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


    //Plants
    public static final RegistryObject<Item> WITCHES_LADDER_ITEM = ITEMS.register("witches_ladder_item",
            () -> new BlockItem(HexcraftBlocks.WITCHES_LADDER.get(),
                    new Item.Properties()));

    public static final RegistryObject<Item> VILEVINE_ITEM = ITEMS.register("vilevine_item",
            () -> new BlockItem(HexcraftBlocks.VILEVINE.get(),
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

    public static final RegistryObject<Item> BLOOD_BUCKET = ITEMS.register("blood_bucket",
            () -> new BucketItem(HexcraftFluids.SOURCE_BLOOD, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));


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
