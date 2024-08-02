package net.masterquentus.hexcraftmod.datagen;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
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
        simpleItem(HexcraftItems.JUNIPER_BERRIES);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HexcraftMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
