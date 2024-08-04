package net.masterquentus.hexcraftmod.datagen;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class HexcraftRecipeProvider extends RecipeProvider implements IConditionBuilder {


    private static final List<ItemLike> SILVER_SMELTABLES = List.of(HexcraftItems.RAW_SILVER.get(),
            HexcraftBlocks.SILVER_ORE.get(), HexcraftBlocks.DEEPSLATE_SILVER_ORE.get(),
            HexcraftBlocks.NETHER_SILVER_ORE.get(), HexcraftBlocks.END_SILVER_ORE.get());

    private static final List<ItemLike> MOONSTONE_SMELTABLES = List.of(HexcraftBlocks.MOONSTONE_ORE.get(), HexcraftBlocks.DEEPSLATE_MOONSTONE_ORE.get(),
            HexcraftBlocks.NETHER_MOONSTONE_ORE.get(), HexcraftBlocks.END_MOONSTONE_ORE.get());

    private static final List<ItemLike> VAMPIRIC_SMELTABLES = List.of(HexcraftBlocks.VAMPIRIC_ORE.get(), HexcraftBlocks.DEEPSLATE_VAMPIRIC_ORE.get(),
            HexcraftBlocks.NETHER_VAMPIRIC_ORE.get(), HexcraftBlocks.END_VAMPIRIC_ORE.get());

    private static final List<ItemLike> NYKIUM_SMELTABLES = List.of(HexcraftItems.RAW_BLOODY_NYKIUM.get(), HexcraftBlocks.NYKIUM_ORE.get());

    private static final List<ItemLike> TRENOGEN_SMELTABLES = List.of(HexcraftItems.RAW_CUROGEN.get(), HexcraftBlocks.TRENOGEN_ORE.get(), HexcraftBlocks.DEEPSLATE_TRENOGEN_ORE.get());

    private static final List<ItemLike> JORMUIM_SMELTABLES = List.of(HexcraftItems.RAW_JORMIUM.get(), HexcraftBlocks.JORMUIM_ORE.get());

    private static final List<ItemLike> LEATHER_SMELTABLES = List.of(Items.ROTTEN_FLESH);

    private static final List<ItemLike> CLAY_SMELTABLES = List.of(HexcraftItems.UNFIRED_CLAY_POT.get());

    private static final List<ItemLike> TANNED_LEATHER_SMELTABLES = List.of(HexcraftItems.BOUND_LEATHER.get());

    private static final List<ItemLike> PEARL_STONE_SMELTABLES = List.of(HexcraftBlocks.PEARL_COBBLESTONE.get());

    private static final List<ItemLike> PEARL_STONE_BRICKS_SMELTABLES = List.of(HexcraftBlocks.PEARL_STONE_BRICKS.get());

    private static final List<ItemLike> CRIMSON_STONE_SMELTABLES = List.of(HexcraftBlocks.CRIMSON_COBBLESTONE.get());

    private static final List<ItemLike> CRIMSON_STONE_BRICKS_SMELTABLES = List.of(HexcraftBlocks.CRIMSON_STONE_BRICKS.get());

    private static final List<ItemLike> UNDER_WORLD_STONE_SMELTABLES = List.of(HexcraftBlocks.UNDER_WORLD_COBBLESTONE.get());

    private static final List<ItemLike> UNDER_WORLD_STONE_BRICKS_SMELTABLES = List.of(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get());

    private static final List<ItemLike> CHARD_STONE_SMELTABLES = List.of(HexcraftBlocks.CHARSTONE_COBBLESTONE.get());

    private static final List<ItemLike> CHARD_STONE_BRICKS_SMELTABLES = List.of(HexcraftBlocks.CHARSTONE_BRICKS.get());


    public HexcraftRecipeProvider(PackOutput pOutput) {
        super(pOutput);

    }



    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, HexcraftItems.SILVER_INGOT.get(), 0.7f, 200, "silver_ingot");
        oreBlasting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, HexcraftItems.SILVER_INGOT.get(), 0.7f, 100, "silver_ingot");
        oreSmelting(pWriter, MOONSTONE_SMELTABLES, RecipeCategory.MISC, HexcraftItems.MOONSTONE.get(), 0.7f, 200, "moonstone");
        oreBlasting(pWriter, MOONSTONE_SMELTABLES, RecipeCategory.MISC, HexcraftItems.MOONSTONE.get(), 0.7f, 100, "moonstone");
        oreSmelting(pWriter, VAMPIRIC_SMELTABLES, RecipeCategory.MISC, HexcraftItems.VAMPIRIC_GEM.get(), 0.7f, 200, "vampiric_gem");
        oreBlasting(pWriter, VAMPIRIC_SMELTABLES, RecipeCategory.MISC, HexcraftItems.VAMPIRIC_GEM.get(), 0.7f, 100, "vampiric_gem");
        oreSmelting(pWriter, NYKIUM_SMELTABLES, RecipeCategory.MISC, HexcraftItems.BLOODY_NYKIUM.get(), 0.7f, 200, "bloody_nykium");
        oreBlasting(pWriter, NYKIUM_SMELTABLES, RecipeCategory.MISC, HexcraftItems.BLOODY_NYKIUM.get(), 0.7f, 100, "bloody_nykium");
        oreSmelting(pWriter, TRENOGEN_SMELTABLES, RecipeCategory.MISC, HexcraftItems.CUROGEN.get(), 0.7f, 200, "curogen");
        oreBlasting(pWriter, TRENOGEN_SMELTABLES, RecipeCategory.MISC, HexcraftItems.CUROGEN.get(), 0.7f, 100, "curogen");
        oreSmelting(pWriter, JORMUIM_SMELTABLES, RecipeCategory.MISC, HexcraftItems.JORMIUM_INGOT.get(), 0.7f, 200, "jormium_ingot");
        oreBlasting(pWriter, JORMUIM_SMELTABLES, RecipeCategory.MISC, HexcraftItems.JORMIUM_INGOT.get(), 0.7f, 100, "jormium_ingot");
        oreSmelting(pWriter, LEATHER_SMELTABLES, RecipeCategory.MISC, Items.LEATHER, 0.7f, 200, "leather");
        oreBlasting(pWriter, LEATHER_SMELTABLES, RecipeCategory.MISC, Items.LEATHER, 0.7f, 100, "leather");
        oreSmelting(pWriter, CLAY_SMELTABLES, RecipeCategory.MISC, HexcraftItems.CLAY_POT.get(), 0.2f, 200, "clay_pot");
        oreSmelting(pWriter, TANNED_LEATHER_SMELTABLES, RecipeCategory.MISC, HexcraftItems.TANNED_LEATHER.get(), 0.2f, 200, "tanned_leather");
        oreBlasting(pWriter, TANNED_LEATHER_SMELTABLES, RecipeCategory.MISC, HexcraftItems.TANNED_LEATHER.get(), 0.2f, 100, "tanned_leather");
        oreSmelting(pWriter, PEARL_STONE_SMELTABLES, RecipeCategory.MISC, HexcraftBlocks.PEARL_STONE.get(), 0.2f, 200, "pearl_stone");
        oreSmelting(pWriter, PEARL_STONE_BRICKS_SMELTABLES, RecipeCategory.MISC, HexcraftBlocks.CRACKED_PEARL_STONE.get(), 0.2f, 200, "cracked_pearl_stone");
        oreSmelting(pWriter, CRIMSON_STONE_SMELTABLES, RecipeCategory.MISC, HexcraftBlocks.CRIMSON_STONE.get(), 0.2f, 200, "crimson_stone");
        oreSmelting(pWriter, CRIMSON_STONE_BRICKS_SMELTABLES, RecipeCategory.MISC, HexcraftBlocks.CRACKED_CRIMSON_STONE.get(), 0.2f, 200, "cracked_crimson_stone");
        oreSmelting(pWriter, UNDER_WORLD_STONE_SMELTABLES, RecipeCategory.MISC, HexcraftBlocks.UNDER_WORLD_STONE.get(), 0.2f, 200, "under_world_stone");
        oreSmelting(pWriter, UNDER_WORLD_STONE_BRICKS_SMELTABLES, RecipeCategory.MISC, HexcraftBlocks.CRACKED_UNDER_WORLD_STONE.get(), 0.2f, 200, "cracked_under_world_stone");
        oreSmelting(pWriter, CHARD_STONE_SMELTABLES, RecipeCategory.MISC, HexcraftBlocks.CHARSTONE.get(), 0.2f, 200, "charstone");
        oreSmelting(pWriter, CHARD_STONE_BRICKS_SMELTABLES, RecipeCategory.MISC, HexcraftBlocks.CRACKED_CHARSTONE.get(), 0.2f, 200, "cracked_charstone");



        //Shaped
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftItems.AIR_RUNE.get())
                .pattern("BBB")
                .pattern("BFB")
                .pattern("BBB")
                .define('B', HexcraftItems.BLANK_RUNE.get())
                .define('F', Items.FEATHER)
                .unlockedBy(getHasName(HexcraftItems.BLANK_RUNE.get()), has(HexcraftItems.BLANK_RUNE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftItems.BLACK_RUNE.get())
                .pattern("BBB")
                .pattern("BDB")
                .pattern("BBB")
                .define('B', HexcraftItems.BLANK_RUNE.get())
                .define('D', Items.BLACK_DYE)
                .unlockedBy(getHasName(HexcraftItems.BLANK_RUNE.get()), has(HexcraftItems.BLANK_RUNE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftItems.BLANK_RUNE.get())
                .pattern(" C ")
                .pattern("CCC")
                .pattern("CC ")
                .define('C', Items.COBBLESTONE)
                .unlockedBy(getHasName(HexcraftItems.BLANK_RUNE.get()), has(HexcraftItems.BLANK_RUNE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftItems.BLUE_RUNE.get())
                .pattern("BBB")
                .pattern("BDB")
                .pattern("BBB")
                .define('B', HexcraftItems.BLANK_RUNE.get())
                .define('D', Items.BLUE_DYE)
                .unlockedBy(getHasName(HexcraftItems.BLANK_RUNE.get()), has(HexcraftItems.BLANK_RUNE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftItems.EARTH_RUNE.get())
                .pattern("BBB")
                .pattern("BVB")
                .pattern("BBB")
                .define('B', HexcraftItems.BLANK_RUNE.get())
                .define('V', Items.VINE)
                .unlockedBy(getHasName(HexcraftItems.BLANK_RUNE.get()), has(HexcraftItems.BLANK_RUNE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftItems.FIRE_RUNE.get())
                .pattern("BBB")
                .pattern("BLB")
                .pattern("BBB")
                .define('B', HexcraftItems.BLANK_RUNE.get())
                .define('L', Items.LAVA_BUCKET)
                .unlockedBy(getHasName(HexcraftItems.BLANK_RUNE.get()), has(HexcraftItems.BLANK_RUNE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftItems.ORANGE_RUNE.get())
                .pattern("BBB")
                .pattern("BOB")
                .pattern("BBB")
                .define('B', HexcraftItems.BLANK_RUNE.get())
                .define('O', Items.ORANGE_DYE)
                .unlockedBy(getHasName(HexcraftItems.BLANK_RUNE.get()), has(HexcraftItems.BLANK_RUNE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftItems.PURPLE_RUNE.get())
                .pattern("BBB")
                .pattern("BPB")
                .pattern("BBB")
                .define('B', HexcraftItems.BLANK_RUNE.get())
                .define('P', Items.PURPLE_DYE)
                .unlockedBy(getHasName(HexcraftItems.BLANK_RUNE.get()), has(HexcraftItems.BLANK_RUNE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftItems.RED_RUNE.get())
                .pattern("BBB")
                .pattern("BRB")
                .pattern("BBB")
                .define('B', HexcraftItems.BLANK_RUNE.get())
                .define('R', Items.RED_DYE)
                .unlockedBy(getHasName(HexcraftItems.BLANK_RUNE.get()), has(HexcraftItems.BLANK_RUNE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftItems.WATER_RUNE.get())
                .pattern("BBB")
                .pattern("BWB")
                .pattern("BBB")
                .define('B', HexcraftItems.BLANK_RUNE.get())
                .define('W', Items.WATER_BUCKET)
                .unlockedBy(getHasName(HexcraftItems.BLANK_RUNE.get()), has(HexcraftItems.BLANK_RUNE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftItems.WHITE_RUNE.get())
                .pattern("BBB")
                .pattern("BWB")
                .pattern("BBB")
                .define('B', HexcraftItems.BLANK_RUNE.get())
                .define('W', Items.WHITE_DYE)
                .unlockedBy(getHasName(HexcraftItems.BLANK_RUNE.get()), has(HexcraftItems.BLANK_RUNE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftItems.YELLOW_RUNE.get())
                .pattern("BBB")
                .pattern("BYB")
                .pattern("BBB")
                .define('B', HexcraftItems.BLANK_RUNE.get())
                .define('Y', Items.YELLOW_DYE)
                .unlockedBy(getHasName(HexcraftItems.BLANK_RUNE.get()), has(HexcraftItems.BLANK_RUNE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftItems.BLOODY_NYKIUM.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', HexcraftItems.BLOODY_NYKIUM_NUGGET.get())
                .unlockedBy(getHasName(HexcraftItems.BLOODY_NYKIUM.get()), has(HexcraftItems.BLOODY_NYKIUM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftItems.CORRUPTED_STEEL.get())
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', HexcraftItems.CORRUPTED_STEEL_NUGGET.get())
                .unlockedBy(getHasName(HexcraftItems.CORRUPTED_STEEL.get()), has(HexcraftItems.CORRUPTED_STEEL.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftItems.CUROGEN.get())
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', HexcraftItems.CUROGEN_NUGGET.get())
                .unlockedBy(getHasName(HexcraftItems.CUROGEN.get()), has(HexcraftItems.CUROGEN.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftItems.DARK_STEEL.get())
                .pattern("DDD")
                .pattern("DDD")
                .pattern("DDD")
                .define('D', HexcraftItems.DARK_STEEL_NUGGET.get())
                .unlockedBy(getHasName(HexcraftItems.DARK_STEEL.get()), has(HexcraftItems.DARK_STEEL.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftItems.JORMIUM_INGOT.get())
                .pattern("JJJ")
                .pattern("JJJ")
                .pattern("JJJ")
                .define('J', HexcraftItems.JORMIUM_NUGGET.get())
                .unlockedBy(getHasName(HexcraftItems.JORMIUM_INGOT.get()), has(HexcraftItems.JORMIUM_INGOT.get()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftItems.BOUND_LEATHER.get())
                .pattern("SSS")
                .pattern("LSL")
                .pattern("SSS")
                .define('S', Items.STRING)
                .define('L', Items.LEATHER)
                .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftItems.ROPE.get())
                .pattern("SV ")
                .pattern("VS ")
                .pattern("SV ")
                .define('S', Items.STRING)
                .define('V', Items.VINE)
                .unlockedBy(getHasName(Items.VINE), has(Items.VINE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftItems.UNFIRED_CLAY_POT.get())
                .pattern(" C ")
                .pattern("CCC")
                .pattern("   ")
                .define('C', Items.CLAY_BALL)
                .unlockedBy(getHasName(Items.CLAY_BALL), has(Items.CLAY_BALL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.MOONSTONE_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M', HexcraftItems.MOONSTONE.get())
                .unlockedBy(getHasName(HexcraftItems.MOONSTONE.get()), has(HexcraftItems.MOONSTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.SILVER_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', HexcraftItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(HexcraftItems.SILVER_INGOT.get()), has(HexcraftItems.SILVER_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.VAMPIRIC_BLOCK.get())
                .pattern("VVV")
                .pattern("VVV")
                .pattern("VVV")
                .define('V', HexcraftItems.VAMPIRIC_GEM.get())
                .unlockedBy(getHasName(HexcraftItems.VAMPIRIC_GEM.get()), has(HexcraftItems.VAMPIRIC_GEM.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, HexcraftBlocks.PEARL_STONE_BRICKS.get(),4)
                .pattern("PP ")
                .pattern("PP ")
                .define('P', HexcraftBlocks.PEARL_STONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.PEARL_STONE.get()), has(HexcraftBlocks.PEARL_STONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, HexcraftBlocks.POLISHED_PEARL_STONE.get(),4)
                .pattern("PP ")
                .pattern("PP ")
                .define('P', HexcraftBlocks.PEARL_STONE_BRICKS.get())
                .unlockedBy(getHasName(HexcraftBlocks.PEARL_STONE_BRICKS.get()), has(HexcraftBlocks.PEARL_STONE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, HexcraftBlocks.CHISELED_PEARL_STONE.get())
                .pattern(" P ")
                .pattern(" P ")
                .define('P', HexcraftBlocks.PEARL_STONE_SLAB.get())
                .unlockedBy(getHasName(HexcraftBlocks.PEARL_STONE_SLAB.get()), has(HexcraftBlocks.PEARL_STONE_SLAB.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, HexcraftBlocks.CRIMSON_STONE_BRICKS.get(),4)
                .pattern("CC ")
                .pattern("CC ")
                .define('C', HexcraftBlocks.CRIMSON_STONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.CRIMSON_STONE.get()), has(HexcraftBlocks.CRIMSON_STONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, HexcraftBlocks.POLISHED_CRIMSON_STONE.get(),4)
                .pattern("CC ")
                .pattern("CC ")
                .define('C', HexcraftBlocks.CRIMSON_STONE_BRICKS.get())
                .unlockedBy(getHasName(HexcraftBlocks.CRIMSON_STONE_BRICKS.get()), has(HexcraftBlocks.CRIMSON_STONE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, HexcraftBlocks.CHISELED_CRIMSON_STONE.get())
                .pattern(" C ")
                .pattern(" C ")
                .define('C', HexcraftBlocks.CRIMSON_STONE_SLAB.get())
                .unlockedBy(getHasName(HexcraftBlocks.CRIMSON_STONE_SLAB.get()), has(HexcraftBlocks.CRIMSON_STONE_SLAB.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get(),4)
                .pattern("UU ")
                .pattern("UU ")
                .define('U', HexcraftBlocks.UNDER_WORLD_STONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.UNDER_WORLD_STONE.get()), has(HexcraftBlocks.UNDER_WORLD_STONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, HexcraftBlocks.POLISHED_UNDER_WORLD_STONE.get(),4)
                .pattern("UU ")
                .pattern("UU ")
                .define('U', HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get())
                .unlockedBy(getHasName(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get()), has(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, HexcraftBlocks.CHISELED_UNDER_WORLD_STONE.get())
                .pattern(" U ")
                .pattern(" U ")
                .define('U', HexcraftBlocks.UNDER_WORLD_STONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.UNDER_WORLD_STONE_SLAB.get()), has(HexcraftBlocks.UNDER_WORLD_STONE_SLAB.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, HexcraftBlocks.CHARSTONE_BRICKS.get(),4)
                .pattern("CC ")
                .pattern("CC ")
                .define('C', HexcraftBlocks.CHARSTONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.CHARSTONE.get()), has(HexcraftBlocks.CHARSTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, HexcraftBlocks.POLISHED_CHARSTONE.get(),4)
                .pattern("CC ")
                .pattern("CC ")
                .define('C', HexcraftBlocks.CHARSTONE_BRICKS.get())
                .unlockedBy(getHasName(HexcraftBlocks.CHARSTONE_BRICKS.get()), has(HexcraftBlocks.CHARSTONE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, HexcraftBlocks.CHISELED_CHARSTONE.get())
                .pattern(" C ")
                .pattern(" C ")
                .define('C', HexcraftBlocks.CHARSTONE_SLAB.get())
                .unlockedBy(getHasName(HexcraftBlocks.CHARSTONE_SLAB.get()), has(HexcraftBlocks.CHARSTONE_SLAB.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, HexcraftBlocks.PEARL_STONE_STAIRS.get(),4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .define('P', HexcraftBlocks.PEARL_STONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.PEARL_STONE.get()), has(HexcraftBlocks.PEARL_STONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, HexcraftBlocks.PEARL_COBBLESTONE_STAIRS.get(),4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .define('P', HexcraftBlocks.PEARL_COBBLESTONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.PEARL_COBBLESTONE.get()), has(HexcraftBlocks.PEARL_COBBLESTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, HexcraftBlocks.PEARL_STONE_BRICKS_STAIRS.get(),4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .define('P', HexcraftBlocks.PEARL_STONE_BRICKS.get())
                .unlockedBy(getHasName(HexcraftBlocks.PEARL_STONE_BRICKS.get()), has(HexcraftBlocks.PEARL_STONE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.POLISHED_PEARL_STONE_STAIRS.get(),4)
                .pattern("P  ")
                .pattern("PP ")
                .pattern("PPP")
                .define('P', HexcraftBlocks.POLISHED_PEARL_STONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.POLISHED_PEARL_STONE.get()), has(HexcraftBlocks.POLISHED_PEARL_STONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.CRIMSON_STONE_STAIRS.get(),4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .define('C', HexcraftBlocks.CRIMSON_STONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.CRIMSON_STONE.get()), has(HexcraftBlocks.CRIMSON_STONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.CRIMSON_COBBLESTONE_STAIRS.get(),4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .define('C', HexcraftBlocks.CRIMSON_COBBLESTONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.CRIMSON_COBBLESTONE.get()), has(HexcraftBlocks.CRIMSON_COBBLESTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.CRIMSON_STONE_BRICKS_STAIRS.get(),4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .define('C', HexcraftBlocks.CRIMSON_STONE_BRICKS.get())
                .unlockedBy(getHasName(HexcraftBlocks.CRIMSON_STONE_BRICKS.get()), has(HexcraftBlocks.CRIMSON_STONE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.POLISHED_CRIMSON_STONE_STAIRS.get(),4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .define('C', HexcraftBlocks.POLISHED_CRIMSON_STONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.POLISHED_CRIMSON_STONE.get()), has(HexcraftBlocks.POLISHED_CRIMSON_STONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.UNDER_WORLD_STONE_STAIRS.get(),4)
                .pattern("U  ")
                .pattern("UU ")
                .pattern("UUU")
                .define('U', HexcraftBlocks.UNDER_WORLD_STONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.UNDER_WORLD_STONE.get()), has(HexcraftBlocks.UNDER_WORLD_STONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.UNDER_WORLD_COBBLESTONE_STAIRS.get(),4)
                .pattern("U  ")
                .pattern("UU ")
                .pattern("UUU")
                .define('U', HexcraftBlocks.UNDER_WORLD_COBBLESTONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.UNDER_WORLD_COBBLESTONE.get()), has(HexcraftBlocks.UNDER_WORLD_COBBLESTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.UNDER_WORLD_STONE_BRICKS_STAIRS.get(),4)
                .pattern("U  ")
                .pattern("UU ")
                .pattern("UUU")
                .define('U', HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get())
                .unlockedBy(getHasName(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get()), has(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.POLISHED_UNDER_WORLD_STONE_STAIRS.get(),4)
                .pattern("U  ")
                .pattern("UU ")
                .pattern("UUU")
                .define('U', HexcraftBlocks.POLISHED_UNDER_WORLD_STONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.POLISHED_UNDER_WORLD_STONE.get()), has(HexcraftBlocks.POLISHED_UNDER_WORLD_STONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.CHARSTONE_STONE_STAIRS.get(),4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .define('C', HexcraftBlocks.CHARSTONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.CHARSTONE.get()), has(HexcraftBlocks.CHARSTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.CHARSTONE_COBBLESTONE_STAIRS.get(),4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .define('C', HexcraftBlocks.CHARSTONE_COBBLESTONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.CHARSTONE_COBBLESTONE.get()), has(HexcraftBlocks.CHARSTONE_COBBLESTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.CHARSTONE_STONE_BRICKS_STAIRS.get(),4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .define('C', HexcraftBlocks.CHARSTONE_BRICKS.get())
                .unlockedBy(getHasName(HexcraftBlocks.CHARSTONE_BRICKS.get()), has(HexcraftBlocks.CHARSTONE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.POLISHED_CHARSTONE_STONE_STAIRS.get(),4)
                .pattern("C  ")
                .pattern("CC ")
                .pattern("CCC")
                .define('C', HexcraftBlocks.POLISHED_CHARSTONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.POLISHED_CHARSTONE.get()), has(HexcraftBlocks.POLISHED_CHARSTONE.get()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, HexcraftBlocks.PEARL_STONE_SLAB.get(),6)
                .pattern("PPP")
                .define('P', HexcraftBlocks.PEARL_STONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.PEARL_STONE.get()), has(HexcraftBlocks.PEARL_STONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, HexcraftBlocks.PEARL_COBBLESTONE_SLAB.get(),6)
                .pattern("PPP")
                .define('P', HexcraftBlocks.PEARL_COBBLESTONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.PEARL_COBBLESTONE.get()), has(HexcraftBlocks.PEARL_COBBLESTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, HexcraftBlocks.PEARL_STONE_BRICKS_SLAB.get(),6)
                .pattern("PPP")
                .define('P', HexcraftBlocks.PEARL_STONE_BRICKS.get())
                .unlockedBy(getHasName(HexcraftBlocks.PEARL_STONE_BRICKS.get()), has(HexcraftBlocks.PEARL_STONE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.POLISHED_PEARL_STONE_SLAB.get(),6)
                .pattern("PPP")
                .define('P', HexcraftBlocks.POLISHED_PEARL_STONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.POLISHED_PEARL_STONE.get()), has(HexcraftBlocks.POLISHED_PEARL_STONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.CRIMSON_STONE_SLAB.get(),6)
                .pattern("CCC")
                .define('C', HexcraftBlocks.CRIMSON_STONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.CRIMSON_STONE.get()), has(HexcraftBlocks.CRIMSON_STONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.CRIMSON_COBBLESTONE_SLAB.get(),6)
                .pattern("CCC")
                .define('C', HexcraftBlocks.CRIMSON_COBBLESTONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.CRIMSON_COBBLESTONE.get()), has(HexcraftBlocks.CRIMSON_COBBLESTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.CRIMSON_STONE_BRICKS_SLAB.get(),6)
                .pattern("CCC")
                .define('C', HexcraftBlocks.CRIMSON_STONE_BRICKS.get())
                .unlockedBy(getHasName(HexcraftBlocks.CRIMSON_STONE_BRICKS.get()), has(HexcraftBlocks.CRIMSON_STONE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.POLISHED_CRIMSON_STONE_SLAB.get(),6)
                .pattern("CCC")
                .define('C', HexcraftBlocks.POLISHED_CRIMSON_STONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.POLISHED_CRIMSON_STONE.get()), has(HexcraftBlocks.POLISHED_CRIMSON_STONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.UNDER_WORLD_STONE_SLAB.get(),6)
                .pattern("UUU")
                .define('U', HexcraftBlocks.UNDER_WORLD_STONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.UNDER_WORLD_STONE.get()), has(HexcraftBlocks.UNDER_WORLD_STONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.UNDER_WORLD_COBBLESTONE_SLAB.get(),6)
                .pattern("UUU")
                .define('U', HexcraftBlocks.UNDER_WORLD_COBBLESTONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.UNDER_WORLD_COBBLESTONE.get()), has(HexcraftBlocks.UNDER_WORLD_COBBLESTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.UNDER_WORLD_STONE_BRICKS_SLAB.get(),6)
                .pattern("UUU")
                .define('U', HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get())
                .unlockedBy(getHasName(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get()), has(HexcraftBlocks.UNDER_WORLD_STONE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.POLISHED_UNDER_WORLD_STONE_SLAB.get(),6)
                .pattern("UUU")
                .define('U', HexcraftBlocks.POLISHED_UNDER_WORLD_STONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.POLISHED_UNDER_WORLD_STONE.get()), has(HexcraftBlocks.POLISHED_UNDER_WORLD_STONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.CHARSTONE_SLAB.get(), 6)
                .pattern("CCC")
                .define('C', HexcraftBlocks.CHARSTONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.CHARSTONE.get()), has(HexcraftBlocks.CHARSTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.CHARSTONE_COBBLESTONE_SLAB.get(),6)
                .pattern("CCC")
                .define('C', HexcraftBlocks.CHARSTONE_COBBLESTONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.CHARSTONE_COBBLESTONE.get()), has(HexcraftBlocks.CHARSTONE_COBBLESTONE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.CHARSTONE_BRICKS_SLAB.get(),6)
                .pattern("CCC")
                .define('C', HexcraftBlocks.CHARSTONE_BRICKS.get())
                .unlockedBy(getHasName(HexcraftBlocks.CHARSTONE_BRICKS.get()), has(HexcraftBlocks.CHARSTONE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HexcraftBlocks.POLISHED_CHARSTONE_SLAB.get(), 6)
                .pattern("CCC")
                .define('C', HexcraftBlocks.POLISHED_CHARSTONE.get())
                .unlockedBy(getHasName(HexcraftBlocks.POLISHED_CHARSTONE.get()), has(HexcraftBlocks.POLISHED_CHARSTONE.get()))
                .save(pWriter);











//Shapeless
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, HexcraftItems.BLOODY_NYKIUM_NUGGET.get(), 9)
                .requires(HexcraftItems.BLOODY_NYKIUM.get())
                .unlockedBy(getHasName(HexcraftItems.BLOODY_NYKIUM.get()), has(HexcraftItems.BLOODY_NYKIUM.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, HexcraftItems.CORRUPTED_STEEL_NUGGET.get(), 9)
                .requires(HexcraftItems.CORRUPTED_STEEL.get())
                .unlockedBy(getHasName(HexcraftItems.CORRUPTED_STEEL.get()), has(HexcraftItems.BLOODY_NYKIUM.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, HexcraftItems.CUROGEN_NUGGET.get(), 9)
                .requires(HexcraftItems.CUROGEN.get())
                .unlockedBy(getHasName(HexcraftItems.CUROGEN.get()), has(HexcraftItems.CUROGEN.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, HexcraftItems.DARK_STEEL_NUGGET.get(), 9)
                .requires(HexcraftItems.DARK_STEEL.get())
                .unlockedBy(getHasName(HexcraftItems.DARK_STEEL.get()), has(HexcraftItems.DARK_STEEL.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, HexcraftItems.JORMIUM_NUGGET.get(), 9)
                .requires(HexcraftItems.JORMIUM_INGOT.get())
                .unlockedBy(getHasName(HexcraftItems.JORMIUM_INGOT.get()), has(HexcraftItems.JORMIUM_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, HexcraftItems.SILVER_NUGGET.get(), 9)
                .requires(HexcraftItems.SILVER_INGOT.get())
                .unlockedBy(getHasName(HexcraftItems.STEEL_INGOT.get()), has(HexcraftItems.STEEL_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, HexcraftItems.SILVER_INGOT.get(), 9)
                .requires(HexcraftBlocks.SILVER_BLOCK.get())
                .unlockedBy(getHasName(HexcraftItems.SILVER_INGOT.get()), has(HexcraftItems.SILVER_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, HexcraftItems.VAMPIRIC_GEM.get(), 9)
                .requires(HexcraftBlocks.VAMPIRIC_BLOCK.get())
                .unlockedBy(getHasName(HexcraftItems.VAMPIRIC_GEM.get()), has(HexcraftItems.VAMPIRIC_GEM.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, HexcraftItems.MOONSTONE.get(), 9)
                .requires(HexcraftBlocks.MOONSTONE_BLOCK.get())
                .unlockedBy(getHasName(HexcraftItems.MOONSTONE.get()), has(HexcraftItems.MOONSTONE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, HexcraftItems.BONE_NEEDLE.get(), 1)
                .requires(Items.BONE)
                .requires(Items.FLINT)
                .unlockedBy(getHasName(Items.BONE), has(Items.BONE))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, HexcraftItems.TAGLOCK_KIT.get(), 1)
                .requires(HexcraftItems.BONE_NEEDLE.get())
                .requires(Items.GLASS_BOTTLE)
                .unlockedBy(getHasName(Items.GLASS_BOTTLE), has(Items.GLASS_BOTTLE))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, HexcraftItems.STEEL_POWDER.get(), 1)
                .requires(Items.IRON_NUGGET)
                .requires(Items.COAL)
                .requires(Items.IRON_NUGGET)
                .unlockedBy(getHasName(Items.GLASS_BOTTLE), has(Items.GLASS_BOTTLE))
                .save(pWriter);

    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, HexcraftMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }

}
