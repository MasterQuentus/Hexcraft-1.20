package net.masterquentus.hexcraftmod.compat;

import org.jetbrains.annotations.Nullable;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.recipe.WitchesCauldronRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class WitchesCauldronCategory implements IRecipeCategory<WitchesCauldronRecipe> {
	public static final ResourceLocation UID = new ResourceLocation(HexcraftMod.MOD_ID, "witches_cauldron");
	public static final ResourceLocation TEXTURE = new ResourceLocation(HexcraftMod.MOD_ID,
			"textures/gui/witches_cauldron.png");

	public static final RecipeType<WitchesCauldronRecipe> WITCHES_CAULDRON_TYPE = new RecipeType<>(UID,
			WitchesCauldronRecipe.class);

	private final IDrawable background;
	private final IDrawable icon;

	public WitchesCauldronCategory(IGuiHelper helper) {
		// Needs updating
		this.background = helper.createDrawable(TEXTURE, 0, 0, 0, 0);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK,
				new ItemStack(HexcraftBlocks.WITCHES_CAULDRON.get()));
	}

	@Override
	public RecipeType<WitchesCauldronRecipe> getRecipeType() {
		return WITCHES_CAULDRON_TYPE;
	}

	@Override
	public Component getTitle() {
		return Component.translatable("block.hexcraftmod.witches_cauldron");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public @Nullable IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, WitchesCauldronRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 57, 17).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 83, 53).addIngredients(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.INPUT, 118, 53).addIngredients(recipe.getIngredients().get(2));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 114, 17).addItemStack(recipe.getResultItem(null));
	}
}
