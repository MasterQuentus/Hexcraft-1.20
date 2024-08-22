package net.masterquentus.hexcraftmod.screen;

import com.mojang.blaze3d.systems.RenderSystem;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class WitchesOvenScreen extends AbstractContainerScreen<WitchesOvenMenu> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(HexcraftMod.MOD_ID,
			"textures/gui/witches_oven.png");

	public WitchesOvenScreen(WitchesOvenMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
		super(pMenu, pPlayerInventory, pTitle);
	}

	@Override
	protected void init() {
		super.init();
	}

	@Override
	protected void renderBg(GuiGraphics pGuiGraphics, float pPartialTick, int pMouseX, int pMouseY) {
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
		RenderSystem.setShaderTexture(0, TEXTURE);
		int x = (this.width - this.imageWidth) / 2;
		int y = (this.height - this.imageHeight) / 2;

		pGuiGraphics.blit(TEXTURE, x, y, 0, 0, this.imageWidth, this.imageHeight);
		this.renderRecipeProgress(pGuiGraphics, x, y);
		this.renderLitProgress(pGuiGraphics, x, y);
	}

	@Override
	public void render(GuiGraphics pGuiGraphics, int pMouseX, int pMouseY, float pPartialTick) {
		this.renderBackground(pGuiGraphics);
		super.render(pGuiGraphics, pMouseX, pMouseY, pPartialTick);
		this.renderTooltip(pGuiGraphics, pMouseX, pMouseY);
	}

	private void renderRecipeProgress(GuiGraphics pGuiGraphics, int x, int y) {
		pGuiGraphics.blit(TEXTURE, x + 80, y + 21, 176, 14, this.menu.getScaledProgress(), 24);
	}

	protected void renderLitProgress(GuiGraphics pGuiGraphics, int x, int y) {
		int litProgress = this.menu.getLitProgress();
		if (this.menu.isLit())
			pGuiGraphics.blit(TEXTURE, x + 57, y + 36 + 13 - litProgress, 176, 12 - litProgress, 14, litProgress + 1);
	}
}
