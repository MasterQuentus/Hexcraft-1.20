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
                        output.accept(HexcraftItems.ARTHANA.get());
                        output.accept(HexcraftItems.BLOODED_WAYSTONE.get());
                        output.accept(HexcraftItems.BOUND_WAYSTONE.get());
                        output.accept(HexcraftItems.WOOD_ASH.get());
                        output.accept(HexcraftItems.BREATH_OF_THE_GODDESS.get());
                        output.accept(HexcraftItems.EXHALE_OF_THE_HORNED_ONE.get());
                        //output.accept(HexcraftItems.BREW_OF_LOVE.get());
                        output.accept(HexcraftItems.BREW_OF_SPROUTING.get());
                        output.accept(HexcraftItems.BREW_OF_THE_GROTESQUE.get());
                        output.accept(HexcraftItems.CONDENSED_FEAR.get());
                        output.accept(HexcraftItems.DIAMOND_VAPOUR.get());
                        output.accept(HexcraftItems.ANOINTING_PASTE.get());
                        output.accept(HexcraftItems.MUTANDIS.get());
                        output.accept(HexcraftItems.MUTANDIS_EXTREMIS.get());
                        output.accept(HexcraftItems.POPPET.get());
                        output.accept(HexcraftItems.VOODOO_POPPET.get());
                        output.accept(HexcraftItems.VOODOO_PROTECTION_POPPET.get());
                        output.accept(HexcraftItems.FALL_PROTECTION_POPPET.get());
                        output.accept(HexcraftItems.EXPLOSION_PROTECTION_POPPET.get());
                        output.accept(HexcraftItems.PROJECTILE_PROTECTION_POPPET.get());
                        output.accept(HexcraftItems.HUNGER_PROTECTION_POPPET.get());
                        output.accept(HexcraftItems.POTION_PROTECTION_POPPET.get());
                        output.accept(HexcraftItems.VOID_PROTECTION_POPPET.get());
                        output.accept(HexcraftItems.CURSE_PROTECTION_POPPET.get());
                        output.accept(HexcraftItems.VAMPIRIC_POPPET.get());
                        output.accept(HexcraftItems.DEATH_PROTECTION_POPPET.get());
                        output.accept(HexcraftItems.FIRE_PROTECTION_POPPET.get());
                        output.accept(HexcraftItems.WATER_PROTECTION_POPPET.get());
                        output.accept(HexcraftItems.WITHER_PROTECTION_POPPET.get());
                        output.accept(HexcraftItems.ARMOR_PROTECTION_POPPET.get());
                        output.accept(HexcraftItems.TOOL_PROTECTION_POPPET.get());

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

                        //Saplings
                        output.accept(HexcraftBlocks.EBONY_SAPLING.get());
                        output.accept(HexcraftBlocks.BLOOD_OAK_SAPLING.get());
                        output.accept(HexcraftBlocks.HELL_BARK_SAPLING.get());
                        output.accept(HexcraftBlocks.WHITE_OAK_SAPLING.get());
                        output.accept(HexcraftBlocks.ALDER_SAPLING.get());
                        output.accept(HexcraftBlocks.WITCH_HAZEL_SAPLING.get());
                        output.accept(HexcraftBlocks.WILLOW_SAPLING.get());
                        output.accept(HexcraftBlocks.HAWTHORN_SAPLING.get());
                        output.accept(HexcraftBlocks.CEDAR_SAPLING.get());
                        output.accept(HexcraftBlocks.DISTORTED_SAPLING.get());
                        output.accept(HexcraftBlocks.ELDER_SAPLING.get());
                        output.accept(HexcraftBlocks.JUNIPER_SAPLING.get());
                        output.accept(HexcraftBlocks.ROWAN_SAPLING.get());
                        output.accept(HexcraftBlocks.TWISTED_SAPLING.get());
                        output.accept(HexcraftBlocks.WITCH_WOOD_SAPLING.get());
                        output.accept(HexcraftBlocks.ECHO_WOOD_SAPLING.get());

                        //Leaves
                        output.accept(HexcraftBlocks.EBONY_LEAVES.get());
                        output.accept(HexcraftBlocks.BLOOD_OAK_LEAVES.get());
                        output.accept(HexcraftBlocks.HELL_BARK_LEAVES.get());
                        output.accept(HexcraftBlocks.WHITE_OAK_LEAVES.get());
                        output.accept(HexcraftBlocks.ALDER_LEAVES.get());
                        output.accept(HexcraftBlocks.WITCH_HAZEL_LEAVES.get());
                        output.accept(HexcraftBlocks.WILLOW_LEAVES.get());
                        output.accept(HexcraftBlocks.HAWTHORN_LEAVES.get());
                        output.accept(HexcraftBlocks.CEDAR_LEAVES.get());
                        output.accept(HexcraftBlocks.DISTORTED_LEAVES.get());
                        output.accept(HexcraftBlocks.ELDER_LEAVES.get());
                        output.accept(HexcraftBlocks.JUNIPER_LEAVES.get());
                        output.accept(HexcraftBlocks.ROWAN_LEAVES.get());
                        output.accept(HexcraftBlocks.TWISTED_LEAVES.get());
                        output.accept(HexcraftBlocks.WITCH_WOOD_LEAVES.get());
                        output.accept(HexcraftBlocks.ECHO_WOOD_LEAVES.get());

                        //Leaves Pile
                        output.accept(HexcraftBlocks.EBONY_LEAVES_PILE.get());
                        output.accept(HexcraftBlocks.BLOOD_OAK_LEAVES_PILE.get());
                        output.accept(HexcraftBlocks.HELL_BARK_LEAVES_PILE.get());
                        output.accept(HexcraftBlocks.WHITE_OAK_LEAVES_PILE.get());
                        output.accept(HexcraftBlocks.ALDER_LEAVES_PILE.get());
                        output.accept(HexcraftBlocks.WITCH_HAZEL_LEAVES_PILE.get());
                        output.accept(HexcraftBlocks.WILLOW_LEAVES_PILE.get());
                        output.accept(HexcraftBlocks.HAWTHORN_LEAVES_PILE.get());
                        output.accept(HexcraftBlocks.CEDAR_LEAVES_PILE.get());
                        output.accept(HexcraftBlocks.DISTORTED_LEAVES_PILE.get());
                        output.accept(HexcraftBlocks.ELDER_LEAVES_PILE.get());
                        output.accept(HexcraftBlocks.JUNIPER_LEAVES_PILE.get());
                        output.accept(HexcraftBlocks.ROWAN_LEAVES_PILE.get());
                        output.accept(HexcraftBlocks.TWISTED_LEAVES_PILE.get());
                        output.accept(HexcraftBlocks.WITCH_WOOD_LEAVES_PILE.get());
                        output.accept(HexcraftBlocks.ECHO_WOOD_LEAVES_PILE.get());

                        //Logs
                        output.accept(HexcraftBlocks.EBONY_LOG.get());
                        output.accept(HexcraftBlocks.BLOOD_OAK_LOG.get());
                        output.accept(HexcraftBlocks.HELL_BARK_LOG.get());
                        output.accept(HexcraftBlocks.WHITE_OAK_LOG.get());
                        output.accept(HexcraftBlocks.ALDER_LOG.get());
                        output.accept(HexcraftBlocks.WITCH_HAZEL_LOG.get());
                        output.accept(HexcraftBlocks.WILLOW_LOG.get());
                        output.accept(HexcraftBlocks.HAWTHORN_LOG.get());
                        output.accept(HexcraftBlocks.CEDAR_LOG.get());
                        output.accept(HexcraftBlocks.DISTORTED_LOG.get());
                        output.accept(HexcraftBlocks.ELDER_LOG.get());
                        output.accept(HexcraftBlocks.JUNIPER_LOG.get());
                        output.accept(HexcraftBlocks.ROWAN_LOG.get());
                        output.accept(HexcraftBlocks.TWISTED_LOG.get());
                        output.accept(HexcraftBlocks.WITCH_WOOD_LOG.get());
                        output.accept(HexcraftBlocks.ECHO_WOOD_LOG.get());

                        //Striped Logs
                        output.accept(HexcraftBlocks.STRIPPED_EBONY_LOG.get());
                        output.accept(HexcraftBlocks.STRIPPED_BLOOD_OAK_LOG.get());
                        output.accept(HexcraftBlocks.STRIPPED_HELL_BARK_LOG.get());
                        output.accept(HexcraftBlocks.STRIPPED_WHITE_OAK_LOG.get());
                        output.accept(HexcraftBlocks.STRIPPED_ALDER_LOG.get());
                        output.accept(HexcraftBlocks.STRIPPED_WITCH_HAZEL_LOG.get());
                        output.accept(HexcraftBlocks.STRIPPED_WILLOW_LOG.get());
                        output.accept(HexcraftBlocks.STRIPPED_HAWTHORN_LOG.get());
                        output.accept(HexcraftBlocks.STRIPPED_CEDAR_LOG.get());
                        output.accept(HexcraftBlocks.STRIPPED_DISTORTED_LOG.get());
                        output.accept(HexcraftBlocks.STRIPPED_ELDER_LOG.get());
                        output.accept(HexcraftBlocks.STRIPPED_JUNIPER_LOG.get());
                        output.accept(HexcraftBlocks.STRIPPED_ROWAN_LOG.get());
                        output.accept(HexcraftBlocks.STRIPPED_TWISTED_LOG.get());
                        output.accept(HexcraftBlocks.STRIPPED_WITCH_WOOD_LOG.get());
                        output.accept(HexcraftBlocks.STRIPPED_ECHO_WOOD_LOG.get());

                        //Woods
                        output.accept(HexcraftBlocks.EBONY_WOOD.get());
                        output.accept(HexcraftBlocks.BLOOD_OAK_WOOD.get());
                        output.accept(HexcraftBlocks.HELL_BARK_WOOD.get());
                        output.accept(HexcraftBlocks.WHITE_OAK_WOOD.get());
                        output.accept(HexcraftBlocks.ALDER_WOOD.get());
                        output.accept(HexcraftBlocks.WITCH_HAZEL_WOOD.get());
                        output.accept(HexcraftBlocks.WILLOW_WOOD.get());
                        output.accept(HexcraftBlocks.HAWTHORN_WOOD.get());
                        output.accept(HexcraftBlocks.CEDAR_WOOD.get());
                        output.accept(HexcraftBlocks.DISTORTED_WOOD.get());
                        output.accept(HexcraftBlocks.ELDER_WOOD.get());
                        output.accept(HexcraftBlocks.JUNIPER_WOOD.get());
                        output.accept(HexcraftBlocks.ROWAN_WOOD.get());
                        output.accept(HexcraftBlocks.TWISTED_WOOD.get());
                        output.accept(HexcraftBlocks.WITCH_WOOD_WOOD.get());
                        output.accept(HexcraftBlocks.ECHO_WOOD_WOOD.get());

                        //Striped Woods
                        output.accept(HexcraftBlocks.STRIPPED_EBONY_WOOD.get());
                        output.accept(HexcraftBlocks.STRIPPED_BLOOD_OAK_WOOD.get());
                        output.accept(HexcraftBlocks.STRIPPED_HELL_BARK_WOOD.get());
                        output.accept(HexcraftBlocks.STRIPPED_WHITE_OAK_WOOD.get());
                        output.accept(HexcraftBlocks.STRIPPED_ALDER_WOOD.get());
                        output.accept(HexcraftBlocks.STRIPPED_WITCH_HAZEL_WOOD.get());
                        output.accept(HexcraftBlocks.STRIPPED_WILLOW_WOOD.get());
                        output.accept(HexcraftBlocks.STRIPPED_HAWTHORN_WOOD.get());
                        output.accept(HexcraftBlocks.STRIPPED_CEDAR_WOOD.get());
                        output.accept(HexcraftBlocks.STRIPPED_DISTORTED_WOOD.get());
                        output.accept(HexcraftBlocks.STRIPPED_ELDER_WOOD.get());
                        output.accept(HexcraftBlocks.STRIPPED_JUNIPER_WOOD.get());
                        output.accept(HexcraftBlocks.STRIPPED_ROWAN_WOOD.get());
                        output.accept(HexcraftBlocks.STRIPPED_TWISTED_WOOD.get());
                        output.accept(HexcraftBlocks.STRIPPED_WITCH_WOOD_WOOD.get());
                        output.accept(HexcraftBlocks.STRIPPED_ECHO_WOOD_WOOD.get());

                        //Planks
                        output.accept(HexcraftBlocks.EBONY_PLANKS.get());
                        output.accept(HexcraftBlocks.BLOOD_OAK_PLANKS.get());
                        output.accept(HexcraftBlocks.HELL_BARK_PLANKS.get());
                        output.accept(HexcraftBlocks.WHITE_OAK_PLANKS.get());
                        output.accept(HexcraftBlocks.ALDER_PLANKS.get());
                        output.accept(HexcraftBlocks.WITCH_HAZEL_PLANKS.get());
                        output.accept(HexcraftBlocks.WILLOW_PLANKS.get());
                        output.accept(HexcraftBlocks.HAWTHORN_PLANKS.get());
                        output.accept(HexcraftBlocks.CEDAR_PLANKS.get());
                        output.accept(HexcraftBlocks.DISTORTED_PLANKS.get());
                        output.accept(HexcraftBlocks.ELDER_PLANKS.get());
                        output.accept(HexcraftBlocks.JUNIPER_PLANKS.get());
                        output.accept(HexcraftBlocks.ROWAN_PLANKS.get());
                        output.accept(HexcraftBlocks.TWISTED_PLANKS.get());
                        output.accept(HexcraftBlocks.WITCH_WOOD_PLANKS.get());
                        output.accept(HexcraftBlocks.ECHO_WOOD_PLANKS.get());

                        //Bookshelves
                        output.accept(HexcraftBlocks.EBONY_BOOKSHELF.get());
                        output.accept(HexcraftBlocks.BLOOD_OAK_BOOKSHELF.get());
                        output.accept(HexcraftBlocks.HELL_BARK_BOOKSHELF.get());
                        output.accept(HexcraftBlocks.WHITE_OAK_BOOKSHELF.get());
                        output.accept(HexcraftBlocks.ALDER_BOOKSHELF.get());
                        output.accept(HexcraftBlocks.WITCH_HAZEL_BOOKSHELF.get());
                        output.accept(HexcraftBlocks.WILLOW_BOOKSHELF.get());
                        output.accept(HexcraftBlocks.HAWTHORN_BOOKSHELF.get());
                        output.accept(HexcraftBlocks.CEDAR_BOOKSHELF.get());
                        output.accept(HexcraftBlocks.DISTORTED_BOOKSHELF.get());
                        output.accept(HexcraftBlocks.ELDER_BOOKSHELF.get());
                        output.accept(HexcraftBlocks.JUNIPER_BOOKSHELF.get());
                        output.accept(HexcraftBlocks.ROWAN_BOOKSHELF.get());
                        output.accept(HexcraftBlocks.TWISTED_BOOKSHELF.get());
                        output.accept(HexcraftBlocks.WITCH_WOOD_BOOKSHELF.get());
                        output.accept(HexcraftBlocks.ECHO_WOOD_BOOKSHELF.get());

                        //Plants
                        output.accept(HexcraftBlocks.DEMON_HEART.get());
                        output.accept(HexcraftItems.WITCHES_LADDER_ITEM.get());
                        output.accept(HexcraftBlocks.GLINT_WEED.get());
                        output.accept(HexcraftBlocks.SPANISH_MOSS.get());
                        output.accept(HexcraftItems.AERPINE.get());
                        output.accept(HexcraftItems.XERIFAE.get());
                        output.accept(HexcraftItems.BELLADONNA.get());
                        output.accept(HexcraftItems.GARLIC.get());
                        output.accept(HexcraftItems.HELLEBORE.get());
                        output.accept(HexcraftItems.IRENIAL.get());
                        output.accept(HexcraftItems.MANDRAKE_ROOT.get());
                        output.accept(HexcraftItems.MIRA.get());
                        output.accept(HexcraftItems.PERENNIA.get());
                        output.accept(HexcraftItems.SAGE.get());
                        output.accept(HexcraftItems.SENIA.get());
                        output.accept(HexcraftItems.VERVAIN.get());
                        output.accept(HexcraftItems.WATER_ARTICHOKE.get());
                        output.accept(HexcraftItems.WOLFSBANE.get());
                        output.accept(HexcraftItems.WORMWOOD.get());
                        output.accept(HexcraftItems.AERPINE_SEEDS.get());
                        output.accept(HexcraftItems.BELLADONNA_SEEDS.get());
                        output.accept(HexcraftItems.HELLEBORE_SEEDS.get());
                        output.accept(HexcraftItems.IRENIAL_SEEDS.get());
                        output.accept(HexcraftItems.MANDRAKE_SEEDS.get());
                        output.accept(HexcraftItems.MIRA_SEEDS.get());
                        output.accept(HexcraftItems.PERENNIA_SEEDS.get());
                        output.accept(HexcraftItems.SAGE_SEEDS.get());
                        output.accept(HexcraftItems.SENIA_SEEDS.get());
                        output.accept(HexcraftItems.VERVAIN_SEEDS.get());
                        output.accept(HexcraftItems.WATER_ARTICHOKE_SEEDS.get());
                        output.accept(HexcraftItems.WOLFSBANE_SEEDS.get());
                        output.accept(HexcraftItems.WORMWOOD_SEEDS.get());
                        output.accept(HexcraftItems.XERIFAE_SEEDS.get());



                        //Foods
                        output.accept(HexcraftItems.JUNIPER_BERRIES.get());
                        output.accept(HexcraftItems.BLOOD_BERRIES.get());
                        output.accept(HexcraftItems.BLOOD_APPLE.get());

                        //Building Blocks
                        output.accept(HexcraftBlocks.HELL_FUNGAL_LAMP.get());
                        output.accept(HexcraftBlocks.ECHO_FUNGAL_LAMP.get());
                        output.accept(HexcraftBlocks.AMETHYST_CHIMES.get());
                        output.accept(HexcraftBlocks.WITCHES_OVEN.get());
                        output.accept(HexcraftBlocks.WITCHES_CAULDRON.get());
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
