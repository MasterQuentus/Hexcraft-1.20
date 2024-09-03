package net.masterquentus.hexcraftmod.block.entity.client;

import java.util.Map;
import java.util.stream.Stream;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.masterquentus.hexcraftmod.block.entity.boats.HexcraftBoatEntity;
import net.masterquentus.hexcraftmod.block.entity.boats.HexcraftChestBoatEntity;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.model.ListModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;

public class HexcraftBoatRenderer extends BoatRenderer {
	private final Map<HexcraftBoatEntity.Type, Pair<ResourceLocation, ListModel<Boat>>> boatResources;

	public HexcraftBoatRenderer(EntityRendererProvider.Context pContext, boolean pChestBoat) {
		super(pContext, pChestBoat);
		this.boatResources = Stream.of(HexcraftBoatEntity.Type.values())
				.collect(ImmutableMap.toImmutableMap((type) -> type,
						(type) -> Pair.of(
								new ResourceLocation(HexcraftMod.MOD_ID, getTextureLocation(type, pChestBoat)),
								this.createBoatModel(pContext, type, pChestBoat))));
	}

	private static String getTextureLocation(HexcraftBoatEntity.Type pType, boolean pChestBoat) {
		return pChestBoat ? "textures/entity/chest_boat/" + pType.getName() + ".png"
				: "textures/entity/boat/" + pType.getName() + ".png";
	}

	private ListModel<Boat> createBoatModel(EntityRendererProvider.Context pContext, HexcraftBoatEntity.Type pType,
			boolean pChestBoat) {
		ModelLayerLocation modellayerlocation = pChestBoat ? HexcraftBoatRenderer.createChestBoatModelName(pType)
				: HexcraftBoatRenderer.createBoatModelName(pType);
		ModelPart modelpart = pContext.bakeLayer(modellayerlocation);
		return pChestBoat ? new ChestBoatModel(modelpart) : new BoatModel(modelpart);
	}

	public static ModelLayerLocation createBoatModelName(HexcraftBoatEntity.Type pType) {
		return createLocation("boat/" + pType.getName(), "main");
	}

	public static ModelLayerLocation createChestBoatModelName(HexcraftBoatEntity.Type pType) {
		return createLocation("chest_boat/" + pType.getName(), "main");
	}

	private static ModelLayerLocation createLocation(String pPath, String pModel) {
		return new ModelLayerLocation(new ResourceLocation(HexcraftMod.MOD_ID, pPath), pModel);
	}

	public Pair<ResourceLocation, ListModel<Boat>> getModelWithLocation(Boat boat) {
		if (boat instanceof HexcraftBoatEntity modBoat) {
			return this.boatResources.get(modBoat.getModVariant());
		} else if (boat instanceof HexcraftChestBoatEntity modChestBoatEntity) {
			return this.boatResources.get(modChestBoatEntity.getModVariant());
		} else {
			return null;
		}
	}
}
