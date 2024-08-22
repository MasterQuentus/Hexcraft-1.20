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
		simpleItem(HexcraftItems.WITCHES_SATCHEL);
		simpleItem(HexcraftItems.MUTANDIS);
		simpleItem(HexcraftItems.MUTANDIS_EXTREMIS);
		simpleItem(HexcraftItems.POPPET);
		//simpleItem(HexcraftItems.VOODOO_POPPET);
		//simpleItem(HexcraftItems.VOODOO_PROTECTION_POPPET);
		//simpleItem(HexcraftItems.FALL_PROTECTION_POPPET);
		//simpleItem(HexcraftItems.EXPLOSION_PROTECTION_POPPET);
		//simpleItem(HexcraftItems.PROJECTILE_PROTECTION_POPPET);
		//simpleItem(HexcraftItems.HUNGER_PROTECTION_POPPET);
		//simpleItem(HexcraftItems.POTION_PROTECTION_POPPET);
		//simpleItem(HexcraftItems.VOID_PROTECTION_POPPET);
		//simpleItem(HexcraftItems.CURSE_PROTECTION_POPPET);
		//simpleItem(HexcraftItems.VAMPIRIC_POPPET);
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
