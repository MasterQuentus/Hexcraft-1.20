package net.masterquentus.hexcraftmod.compat;

import org.jetbrains.annotations.Nullable;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import mezz.jei.api.constants.ModIds;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableAnimated;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.recipe.WitchesOvenRecipe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class WitchesOvenCategory implements IRecipeCategory<WitchesOvenRecipe> {
	public static final ResourceLocation UID = new ResourceLocation(HexcraftMod.MOD_ID, "witches_oven");
	public static final ResourceLocation TEXTURE = new ResourceLocation(HexcraftMod.MOD_ID,
			"textures/gui/witches_oven.png");

	public static final RecipeType<WitchesOvenRecipe> WITCHES_OVEN_TYPE = new RecipeType<>(UID,
			WitchesOvenRecipe.class);

	private final IDrawable background;
	private final IDrawable icon;
	private final int regularCookTime;
	private final LoadingCache<Integer, IDrawableAnimated> cachedArrows;
	private final IDrawableStatic staticFlame;
	private final IDrawableAnimated animatedFlame;

	public WitchesOvenCategory(IGuiHelper helper, int regularCookTime) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 82);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK,
				new ItemStack(HexcraftBlocks.WITCHES_OVEN.get()));
		this.regularCookTime = regularCookTime;
		this.cachedArrows = CacheBuilder.newBuilder().maximumSize(25).build(new CacheLoader<>() {
			@Override
			public IDrawableAnimated load(Integer cookTime) {
				return helper.drawableBuilder(TEXTURE, 176, 14, 24, 17).buildAnimated(cookTime,
						IDrawableAnimated.StartDirection.LEFT, false);
			}
		});
		staticFlame = helper.createDrawable(new ResourceLocation(ModIds.JEI_ID, "textures/jei/gui/gui_vanilla.png"), 82,
				114, 14, 14);
		animatedFlame = helper.createAnimatedDrawable(staticFlame, 300, IDrawableAnimated.StartDirection.TOP, true);
	}

	@Override
	public RecipeType<WitchesOvenRecipe> getRecipeType() {
		return WITCHES_OVEN_TYPE;
	}

	@Override
	public Component getTitle() {
		return Component.translatable("block.hexcraftmod.witches_oven");
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
	public void draw(WitchesOvenRecipe recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX,
			double mouseY) {
		this.animatedFlame.draw(guiGraphics, 57, 37);

		IDrawableAnimated arrow = getArrow(recipe);
		arrow.draw(guiGraphics, 80, 21);

		drawExperience(recipe, guiGraphics, 6);
		drawCookTime(recipe, guiGraphics, 72);
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, WitchesOvenRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 56, 17).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 83, 53).addIngredients(recipe.getIngredients().get(1));

		builder.addSlot(RecipeIngredientRole.OUTPUT, 118, 53).addItemStack(recipe.getResultItem(null));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 114 + (8 / 2), 17 + (8 / 2))
				.addItemStack(recipe.getExcessResultItem(null));
	}

	protected IDrawableAnimated getArrow(WitchesOvenRecipe recipe) {
		int cookTime = recipe.getBakeTime();
		if (cookTime <= 0) {
			cookTime = this.regularCookTime;
		}
		return this.cachedArrows.getUnchecked(this.regularCookTime);
	}

	protected void drawExperience(WitchesOvenRecipe recipe, GuiGraphics guiGraphics, int y) {
		float experience = recipe.getExperience();
		if (experience > 0) {
			Component experienceString = Component.translatable("gui.jei.category.smelting.experience", experience);
			Minecraft minecraft = Minecraft.getInstance();
			Font fontRenderer = minecraft.font;
			int stringWidth = fontRenderer.width(experienceString);
			// w-sw
			guiGraphics.drawString(fontRenderer, experienceString, 126 + 2 - stringWidth / 2, y, 0xFF808080, false);
		}
	}

	protected void drawCookTime(WitchesOvenRecipe recipe, GuiGraphics guiGraphics, int y) {
		int cookTime = recipe.getBakeTime();
		if (cookTime > 0) {
			int cookTimeSeconds = cookTime / 20;
			Component timeString = Component.translatable("gui.jei.category.smelting.time.seconds", cookTimeSeconds);
			Minecraft minecraft = Minecraft.getInstance();
			Font fontRenderer = minecraft.font;
			int stringWidth = fontRenderer.width(timeString);
			// w -sw
			guiGraphics.drawString(fontRenderer, timeString, 126 + 1 - stringWidth / 2, y, 0xFF808080, false);
		}
	}
}
