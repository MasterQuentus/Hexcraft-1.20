package net.masterquentus.hexcraftmod.datagen;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HexcraftItemModelProvider extends ItemModelProvider {
	public HexcraftItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
		super(output, HexcraftMod.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		simpleItem(HexcraftItems.INFUSED_FABRIC);
		simpleItem(HexcraftItems.BOUND_LEATHER);
		simpleItem(HexcraftItems.TANNED_LEATHER);
		simpleItem(HexcraftItems.BONE_NEEDLE);
		simpleItem(HexcraftItems.TAGLOCK_KIT);
		simpleItem(HexcraftItems.TAGLOCK_KIT_FULL);
		simpleItem(HexcraftItems.UNFIRED_CLAY_POT);
		simpleItem(HexcraftItems.CLAY_POT);
		simpleItem(HexcraftItems.BLOOD_BOTTLE);
		simpleItem(HexcraftItems.LILITH_CONTRACT);
		simpleItem(HexcraftItems.LILITH_SOUL);
		simpleItem(HexcraftItems.MAGIC_CRYSTAL);
		simpleItem(HexcraftItems.BLANK_RUNE);
		simpleItem(HexcraftItems.AIR_RUNE);
		simpleItem(HexcraftItems.EARTH_RUNE);
		simpleItem(HexcraftItems.FIRE_RUNE);
		simpleItem(HexcraftItems.WATER_RUNE);
		simpleItem(HexcraftItems.RED_RUNE);
		simpleItem(HexcraftItems.BLACK_RUNE);
		simpleItem(HexcraftItems.BLUE_RUNE);
		simpleItem(HexcraftItems.GREEN_RUNE);
		simpleItem(HexcraftItems.ORANGE_RUNE);
		simpleItem(HexcraftItems.PURPLE_RUNE);
		simpleItem(HexcraftItems.WHITE_RUNE);
		simpleItem(HexcraftItems.YELLOW_RUNE);
		simpleItem(HexcraftItems.ROPE);
		simpleItem(HexcraftItems.BLOOD_DROP);
		simpleItem(HexcraftItems.MOONSTONE);
		simpleItem(HexcraftItems.RAW_SILVER);
		simpleItem(HexcraftItems.SILVER_INGOT);
		simpleItem(HexcraftItems.SILVER_NUGGET);
		simpleItem(HexcraftItems.VAMPIRIC_GEM);
		simpleItem(HexcraftItems.CORRUPTED_NETHER_STAR);
		simpleItem(HexcraftItems.CORRUPTED_STEEL);
		simpleItem(HexcraftItems.CORRUPTED_STEEL_NUGGET);
		simpleItem(HexcraftItems.DARK_CRYSTAL_SHARDS);
		simpleItem(HexcraftItems.DARK_STEEL);
		simpleItem(HexcraftItems.DARK_STEEL_NUGGET);
		simpleItem(HexcraftItems.RAW_BLOODY_NYKIUM);
		simpleItem(HexcraftItems.BLOODY_NYKIUM);
		simpleItem(HexcraftItems.BLOODY_NYKIUM_NUGGET);
		simpleItem(HexcraftItems.RAW_CUROGEN);
		simpleItem(HexcraftItems.CUROGEN);
		simpleItem(HexcraftItems.CUROGEN_NUGGET);
		simpleItem(HexcraftItems.RAW_JORMIUM);
		simpleItem(HexcraftItems.ENHANCED_JORMIUM_INGOT);
		simpleItem(HexcraftItems.JORMIUM_INGOT);
		simpleItem(HexcraftItems.JORMIUM_NUGGET);
		simpleItem(HexcraftItems.STEEL_POWDER);
		simpleItem(HexcraftItems.STEEL_INGOT);
		simpleItem(HexcraftItems.WHITE_OAK_ASH);
		simpleItem(HexcraftItems.SALT);
		simpleItem(HexcraftItems.NECROMANTIC_STONE);
		simpleItem(HexcraftItems.ATTUNED_STONE);
		simpleItem(HexcraftItems.ATTUNED_STONE_CHARGED);
		simpleToolItem(HexcraftItems.ARTHANA.get());
		simpleItem(HexcraftItems.BLOODED_WAYSTONE);
		simpleItem(HexcraftItems.BOUND_WAYSTONE);
		simpleItem(HexcraftItems.WOOD_ASH);
		simpleItem(HexcraftItems.BREATH_OF_THE_GODDESS);
		simpleItem(HexcraftItems.EXHALE_OF_THE_HORNED_ONE);
		//simpleItem(HexcraftItems.BREW_OF_LOVE);
		simpleItem(HexcraftItems.BREW_OF_SPROUTING);
		simpleItem(HexcraftItems.BREW_OF_THE_GROTESQUE);
		simpleItem(HexcraftItems.CONDENSED_FEAR);
		simpleItem(HexcraftItems.DIAMOND_VAPOUR);
		simpleItem(HexcraftItems.DROP_OF_LUCK);
		simpleItem(HexcraftItems.REEK_OF_MISFORTUNE);
		simpleItem(HexcraftItems.WOOL_OF_BAT);
		simpleItem(HexcraftItems.JUNIPER_BERRIES);
		simpleItem(HexcraftItems.ANOINTING_PASTE);
		simpleItem(HexcraftItems.MUTANDIS);
		simpleItem(HexcraftItems.MUTANDIS_EXTREMIS);
		saplingItem(HexcraftBlocks.EBONY_SAPLING);
		saplingItem(HexcraftBlocks.BLOOD_OAK_SAPLING);
		saplingItem(HexcraftBlocks.HELL_BARK_SAPLING);
		saplingItem(HexcraftBlocks.WHITE_OAK_SAPLING);
		saplingItem(HexcraftBlocks.ALDER_SAPLING);
		saplingItem(HexcraftBlocks.WITCH_HAZEL_SAPLING);
		saplingItem(HexcraftBlocks.WILLOW_SAPLING);
		saplingItem(HexcraftBlocks.HAWTHORN_SAPLING);
		saplingItem(HexcraftBlocks.CEDAR_SAPLING);
		saplingItem(HexcraftBlocks.DISTORTED_SAPLING);
		saplingItem(HexcraftBlocks.ELDER_SAPLING);
		saplingItem(HexcraftBlocks.JUNIPER_SAPLING);
		saplingItem(HexcraftBlocks.ROWAN_SAPLING);
		saplingItem(HexcraftBlocks.TWISTED_SAPLING);
		saplingItem(HexcraftBlocks.WITCH_WOOD_SAPLING);
		saplingItem(HexcraftBlocks.ECHO_WOOD_SAPLING);
		simpleItem(HexcraftItems.BLOOD_APPLE);
		simpleItem(HexcraftItems.BLOOD_BERRIES);
		simpleItem(HexcraftItems.WITCHES_LADDER_ITEM);
		//simpleItem(HexcraftItems.VILEVINE_ITEM);
		simpleItem(HexcraftItems.WITCHES_SATCHEL);
		simpleItem(HexcraftItems.MUTANDIS);
		simpleItem(HexcraftItems.MUTANDIS_EXTREMIS);
		simpleItem(HexcraftItems.POPPET);
		simpleItem(HexcraftItems.VOODOO_POPPET);
		simpleItem(HexcraftItems.VOODOO_PROTECTION_POPPET);
		simpleItem(HexcraftItems.FALL_PROTECTION_POPPET);
		simpleItem(HexcraftItems.EXPLOSION_PROTECTION_POPPET);
		simpleItem(HexcraftItems.PROJECTILE_PROTECTION_POPPET);
		simpleItem(HexcraftItems.HUNGER_PROTECTION_POPPET);
		simpleItem(HexcraftItems.POTION_PROTECTION_POPPET);
		//simpleItem(HexcraftItems.VOID_PROTECTION_POPPET);
		simpleItem(HexcraftItems.CURSE_PROTECTION_POPPET);
		simpleItem(HexcraftItems.VAMPIRIC_POPPET);
		simpleItem(HexcraftItems.DEATH_PROTECTION_POPPET);
		simpleItem(HexcraftItems.FIRE_PROTECTION_POPPET);
		simpleItem(HexcraftItems.WATER_PROTECTION_POPPET);
		simpleItem(HexcraftItems.WITHER_PROTECTION_POPPET);
		simpleItem(HexcraftItems.MANDRAKE_SEEDS);
		simpleItem(HexcraftItems.MANDRAKE_ROOT);
		simpleItem(HexcraftItems.GARLIC);
		simpleItem(HexcraftItems.VERVAIN_SEEDS);
		simpleItem(HexcraftItems.VERVAIN);
		simpleItem(HexcraftItems.WOLFSBANE_SEEDS);
		simpleItem(HexcraftItems.WOLFSBANE);
		simpleItem(HexcraftItems.IRENIAL_SEEDS);
		simpleItem(HexcraftItems.IRENIAL);
		simpleItem(HexcraftItems.MIRA_SEEDS);
		simpleItem(HexcraftItems.MIRA);
		simpleItem(HexcraftItems.XERIFAE_SEEDS);
		simpleItem(HexcraftItems.XERIFAE);
		simpleItem(HexcraftItems.SENIA_SEEDS);
		simpleItem(HexcraftItems.SENIA);
		simpleItem(HexcraftItems.AERPINE_SEEDS);
		simpleItem(HexcraftItems.AERPINE);
		simpleItem(HexcraftItems.PERENNIA_SEEDS);
		simpleItem(HexcraftItems.PERENNIA);
		simpleItem(HexcraftItems.BELLADONNA_SEEDS);
		simpleItem(HexcraftItems.BELLADONNA);
		simpleItem(HexcraftItems.HELLEBORE_SEEDS);
		simpleItem(HexcraftItems.HELLEBORE);
		simpleItem(HexcraftItems.SAGE_SEEDS);
		simpleItem(HexcraftItems.SAGE);
		simpleItem(HexcraftItems.WORMWOOD_SEEDS);
		simpleItem(HexcraftItems.WORMWOOD);
		simpleItem(HexcraftItems.WATER_ARTICHOKE_SEEDS);
		simpleItem(HexcraftItems.WATER_ARTICHOKE);
		wallItem(HexcraftBlocks.PEARL_STONE_WALL, HexcraftBlocks.PEARL_STONE);
		wallItem(HexcraftBlocks.CRIMSON_STONE_WALL, HexcraftBlocks.CRIMSON_STONE);
		wallItem(HexcraftBlocks.UNDER_WORLD_STONE_WALL, HexcraftBlocks.UNDER_WORLD_STONE);
		wallItem(HexcraftBlocks.CHARSTONE_WALL, HexcraftBlocks.CHARSTONE);
		evenSimplerBlockItem(HexcraftBlocks.PEARL_STONE_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.PEARL_STONE_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.PEARL_COBBLESTONE_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.PEARL_STONE_BRICKS_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.POLISHED_PEARL_STONE_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.CRIMSON_STONE_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.CRIMSON_COBBLESTONE_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.CRIMSON_STONE_BRICKS_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.POLISHED_CRIMSON_STONE_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.UNDER_WORLD_STONE_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.UNDER_WORLD_COBBLESTONE_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.POLISHED_UNDER_WORLD_STONE_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.CHARSTONE_STONE_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.CHARSTONE_COBBLESTONE_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.CHARSTONE_STONE_BRICKS_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.POLISHED_CHARSTONE_STONE_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.EBONY_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.BLOOD_OAK_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.HELL_BARK_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.WHITE_OAK_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.ALDER_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.WITCH_HAZEL_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.WILLOW_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.HAWTHORN_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.CEDAR_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.DISTORTED_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.ELDER_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.JUNIPER_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.ROWAN_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.TWISTED_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.WITCH_WOOD_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.ECHO_WOOD_STAIRS);
		evenSimplerBlockItem(HexcraftBlocks.PEARL_STONE_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.PEARL_COBBLESTONE_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.PEARL_STONE_BRICKS_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.POLISHED_PEARL_STONE_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.CRIMSON_STONE_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.CRIMSON_COBBLESTONE_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.CRIMSON_STONE_BRICKS_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.POLISHED_CRIMSON_STONE_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.UNDER_WORLD_STONE_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.UNDER_WORLD_COBBLESTONE_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.POLISHED_UNDER_WORLD_STONE_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.CHARSTONE_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.CHARSTONE_COBBLESTONE_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.CHARSTONE_BRICKS_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.POLISHED_CHARSTONE_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.EBONY_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.BLOOD_OAK_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.HELL_BARK_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.WHITE_OAK_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.ALDER_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.WITCH_HAZEL_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.WILLOW_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.HAWTHORN_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.CEDAR_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.DISTORTED_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.ELDER_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.JUNIPER_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.ROWAN_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.TWISTED_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.WITCH_WOOD_SLAB);
		evenSimplerBlockItem(HexcraftBlocks.ECHO_WOOD_SLAB);
		buttonItem(HexcraftBlocks.PEARL_STONE_BUTTON, HexcraftBlocks.PEARL_STONE);
		buttonItem(HexcraftBlocks.CRIMSON_STONE_BUTTON, HexcraftBlocks.CRIMSON_STONE);
		buttonItem(HexcraftBlocks.UNDER_WORLD_STONE_BUTTON, HexcraftBlocks.UNDER_WORLD_STONE);
		buttonItem(HexcraftBlocks.CHARSTONE_BUTTON, HexcraftBlocks.CHARSTONE);
		buttonItem(HexcraftBlocks.EBONY_BUTTON, HexcraftBlocks.EBONY_PLANKS);
		buttonItem(HexcraftBlocks.BLOOD_OAK_BUTTON, HexcraftBlocks.BLOOD_OAK_PLANKS);
		buttonItem(HexcraftBlocks.HELL_BARK_BUTTON, HexcraftBlocks.HELL_BARK_PLANKS);
		buttonItem(HexcraftBlocks.WHITE_OAK_BUTTON, HexcraftBlocks.WHITE_OAK_PLANKS);
		buttonItem(HexcraftBlocks.ALDER_BUTTON, HexcraftBlocks.ALDER_PLANKS);
		buttonItem(HexcraftBlocks.WITCH_HAZEL_BUTTON, HexcraftBlocks.WITCH_HAZEL_PLANKS);
		buttonItem(HexcraftBlocks.WILLOW_BUTTON, HexcraftBlocks.WILLOW_PLANKS);
		buttonItem(HexcraftBlocks.HAWTHORN_BUTTON, HexcraftBlocks.HAWTHORN_PLANKS);
		buttonItem(HexcraftBlocks.CEDAR_BUTTON, HexcraftBlocks.CEDAR_PLANKS);
		buttonItem(HexcraftBlocks.DISTORTED_BUTTON, HexcraftBlocks.DISTORTED_PLANKS);
		buttonItem(HexcraftBlocks.ELDER_BUTTON, HexcraftBlocks.ELDER_PLANKS);
		buttonItem(HexcraftBlocks.JUNIPER_BUTTON, HexcraftBlocks.JUNIPER_PLANKS);
		buttonItem(HexcraftBlocks.ROWAN_BUTTON, HexcraftBlocks.ROWAN_PLANKS);
		buttonItem(HexcraftBlocks.TWISTED_BUTTON, HexcraftBlocks.TWISTED_PLANKS);
		buttonItem(HexcraftBlocks.WITCH_WOOD_BUTTON, HexcraftBlocks.WITCH_HAZEL_PLANKS);
		buttonItem(HexcraftBlocks.ECHO_WOOD_BUTTON, HexcraftBlocks.ECHO_WOOD_PLANKS);
		fenceItem(HexcraftBlocks.EBONY_FENCE, HexcraftBlocks.EBONY_PLANKS);
		fenceItem(HexcraftBlocks.BLOOD_OAK_FENCE, HexcraftBlocks.BLOOD_OAK_PLANKS);
		fenceItem(HexcraftBlocks.HELL_BARK_FENCE, HexcraftBlocks.HELL_BARK_PLANKS);
		fenceItem(HexcraftBlocks.WHITE_OAK_FENCE, HexcraftBlocks.WHITE_OAK_PLANKS);
		fenceItem(HexcraftBlocks.ALDER_FENCE, HexcraftBlocks.ALDER_PLANKS);
		fenceItem(HexcraftBlocks.WITCH_HAZEL_FENCE, HexcraftBlocks.WITCH_HAZEL_PLANKS);
		fenceItem(HexcraftBlocks.WILLOW_FENCE, HexcraftBlocks.WILLOW_PLANKS);
		fenceItem(HexcraftBlocks.HAWTHORN_FENCE, HexcraftBlocks.HAWTHORN_PLANKS);
		fenceItem(HexcraftBlocks.CEDAR_FENCE, HexcraftBlocks.CEDAR_PLANKS);
		fenceItem(HexcraftBlocks.DISTORTED_FENCE, HexcraftBlocks.DISTORTED_PLANKS);
		fenceItem(HexcraftBlocks.ELDER_FENCE, HexcraftBlocks.ELDER_PLANKS);
		fenceItem(HexcraftBlocks.JUNIPER_FENCE, HexcraftBlocks.JUNIPER_PLANKS);
		fenceItem(HexcraftBlocks.ROWAN_FENCE, HexcraftBlocks.ROWAN_PLANKS);
		fenceItem(HexcraftBlocks.TWISTED_FENCE, HexcraftBlocks.TWISTED_PLANKS);
		fenceItem(HexcraftBlocks.WITCH_WOOD_FENCE, HexcraftBlocks.WITCH_HAZEL_PLANKS);
		fenceItem(HexcraftBlocks.ECHO_WOOD_FENCE, HexcraftBlocks.ECHO_WOOD_PLANKS);
		simpleBlockItem(HexcraftBlocks.EBONY_DOOR);
		simpleBlockItem(HexcraftBlocks.BLOOD_OAK_DOOR);
		simpleBlockItem(HexcraftBlocks.HELL_BARK_DOOR);
		simpleBlockItem(HexcraftBlocks.WHITE_OAK_DOOR);
		simpleBlockItem(HexcraftBlocks.ALDER_DOOR);
		simpleBlockItem(HexcraftBlocks.WITCH_HAZEL_DOOR);
		simpleBlockItem(HexcraftBlocks.WILLOW_DOOR);
		simpleBlockItem(HexcraftBlocks.HAWTHORN_DOOR);
		simpleBlockItem(HexcraftBlocks.CEDAR_DOOR);
		simpleBlockItem(HexcraftBlocks.DISTORTED_DOOR);
		simpleBlockItem(HexcraftBlocks.ELDER_DOOR);
		simpleBlockItem(HexcraftBlocks.JUNIPER_DOOR);
		simpleBlockItem(HexcraftBlocks.ROWAN_DOOR);
		simpleBlockItem(HexcraftBlocks.TWISTED_DOOR);
		simpleBlockItem(HexcraftBlocks.WITCH_WOOD_DOOR);
		simpleBlockItem(HexcraftBlocks.ECHO_WOOD_DOOR);
		simpleItem(HexcraftItems.BLOOD_BUCKET);
		simpleItem(HexcraftItems.EBONY_SIGN);
		//simpleItem(HexcraftItems.EBONY_HANGING_SIGN);
		simpleItem(HexcraftItems.BLOOD_OAK_SIGN);
		//simpleItem(HexcraftItems.BLOOD_OAK_HANGING_SIGN);
		simpleItem(HexcraftItems.HELL_BARK_SIGN);
		//simpleItem(HexcraftItems.HELL_BARK_HANGING_SIGN);
		simpleItem(HexcraftItems.WHITE_OAK_SIGN);
		//simpleItem(HexcraftItems.WHITE_OAK_HANGING_SIGN);
		simpleItem(HexcraftItems.ALDER_SIGN);
		//simpleItem(HexcraftItems.ALDER_HANGING_SIGN);
		simpleItem(HexcraftItems.WITCH_HAZEL_SIGN);
		//simpleItem(HexcraftItems.WITCH_HAZEL_HANGING_SIGN);
		simpleItem(HexcraftItems.WILLOW_SIGN);
		//simpleItem(HexcraftItems.WILLOW_HANGING_SIGN);
		simpleItem(HexcraftItems.HAWTHORN_SIGN);
		//simpleItem(HexcraftItems.HAWTHORN_HANGING_SIGN);
		simpleItem(HexcraftItems.CEDAR_SIGN);
		//simpleItem(HexcraftItems.CEDAR_HANGING_SIGN);
		simpleItem(HexcraftItems.DISTORTED_SIGN);
		//simpleItem(HexcraftItems.DISTORTED_HANGING_SIGN);
		simpleItem(HexcraftItems.ELDER_SIGN);
		//simpleItem(HexcraftItems.ELDER_HANGING_SIGN);
		simpleItem(HexcraftItems.JUNIPER_SIGN);
		//simpleItem(HexcraftItems.JUNIPER_HANGING_SIGN);
		simpleItem(HexcraftItems.ROWAN_SIGN);
		//simpleItem(HexcraftItems.ROWAN_HANGING_SIGN);
		simpleItem(HexcraftItems.TWISTED_SIGN);
		//simpleItem(HexcraftItems.TWISTED_HANGING_SIGN);
		simpleItem(HexcraftItems.WITCH_WOOD_SIGN);
		//simpleItem(HexcraftItems.WITCH_WOOD_HANGING_SIGN);
		simpleItem(HexcraftItems.ECHO_WOOD_SIGN);
		//simpleItem(HexcraftItems.ECHO_WOOD_HANGING_SIGN);
		//simpleItem(HexcraftItems.EBONY_BOAT);
		//simpleItem(HexcraftItems.EBONY_CHEST_BOAT);
		simpleItem(HexcraftItems.BLOOD_OAK_BOAT);
		//simpleItem(HexcraftItems.BLOOD_OAK_CHEST_BOAT);
		simpleItem(HexcraftItems.HELL_BARK_BOAT);
		//simpleItem(HexcraftItems.HELL_BARK_CHEST_BOAT);
		simpleItem(HexcraftItems.WHITE_OAK_BOAT);
		//simpleItem(HexcraftItems.WHITE_OAK_CHEST_BOAT);
		simpleItem(HexcraftItems.ALDER_BOAT);
		//simpleItem(HexcraftItems.ALDER_CHEST_BOAT);
		simpleItem(HexcraftItems.WITCH_HAZEL_BOAT);
		//simpleItem(HexcraftItems.WITCH_HAZEL_CHEST_BOAT);
		simpleItem(HexcraftItems.WILLOW_BOAT);
		//simpleItem(HexcraftItems.WILLOW_CHEST_BOAT);
		simpleItem(HexcraftItems.HAWTHORN_BOAT);
		//simpleItem(HexcraftItems.HAWTHORN_CHEST_BOAT);
		simpleItem(HexcraftItems.CEDAR_BOAT);
		//simpleItem(HexcraftItems.CEDAR_CHEST_BOAT);
		simpleItem(HexcraftItems.DISTORTED_BOAT);
		//simpleItem(HexcraftItems.DISTORTED_CHEST_BOAT);
		simpleItem(HexcraftItems.ELDER_BOAT);
		//simpleItem(HexcraftItems.ELDER_CHEST_BOAT);
		simpleItem(HexcraftItems.JUNIPER_BOAT);
		//simpleItem(HexcraftItems.JUNIPER_CHEST_BOAT);
		simpleItem(HexcraftItems.ROWAN_BOAT);
		//simpleItem(HexcraftItems.ROWAN_CHEST_BOAT);
		simpleItem(HexcraftItems.TWISTED_BOAT);
		//simpleItem(HexcraftItems.TWISTED_CHEST_BOAT);
		simpleItem(HexcraftItems.WITCH_WOOD_BOAT);
		//simpleItem(HexcraftItems.WITCH_WOOD_CHEST_BOAT);
		//simpleItem(HexcraftItems.ECHO_WOOD_BOAT);
		//simpleItem(HexcraftItems.ECHO_WOOD_CHEST_BOAT);

	}

	private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
		return withExistingParent(item.getId().getPath(),
				new ResourceLocation("item/generated")).texture("layer0",
				new ResourceLocation(HexcraftMod.MOD_ID,"block/" + item.getId().getPath()));
	}

	public void evenSimplerBlockItem(RegistryObject<Block> block) {
		this.withExistingParent(HexcraftMod.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
				modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
	}

	private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
		return withExistingParent(item.getId().getPath(),
				new ResourceLocation("item/generated")).texture("layer0",
				new ResourceLocation(HexcraftMod.MOD_ID, "item/" + item.getId().getPath()));
	}

	public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
		this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
				.texture("texture",  new ResourceLocation(HexcraftMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
	}

	public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
		this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
				.texture("texture",  new ResourceLocation(HexcraftMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
	}

	public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
		this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
				.texture("wall",  new ResourceLocation(HexcraftMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
	}

	private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
		return withExistingParent(item.getId().getPath(),
				new ResourceLocation("item/generated")).texture("layer0",
				new ResourceLocation(HexcraftMod.MOD_ID,"item/" + item.getId().getPath()));
	}

	private void simpleToolItem(Item item) {
		String name = ForgeRegistries.ITEMS.getKey(item).getPath();
		withExistingParent(ITEM_FOLDER + "/" + name, mcLoc(ITEM_FOLDER + "/handheld")).texture("layer0", ITEM_FOLDER + "/" + name);
	}
}
