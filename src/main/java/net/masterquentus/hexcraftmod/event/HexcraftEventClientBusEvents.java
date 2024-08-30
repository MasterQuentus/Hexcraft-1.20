package net.masterquentus.hexcraftmod.event;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.entity.HexcraftBlockEntities;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
@Mod.EventBusSubscriber(modid = HexcraftMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HexcraftEventClientBusEvents {

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {


        event.registerBlockEntityRenderer(HexcraftBlockEntities.Hexcraft_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(HexcraftBlockEntities.Hexcraft_HANGING_SIGN.get(), HangingSignRenderer::new);
    }
}
