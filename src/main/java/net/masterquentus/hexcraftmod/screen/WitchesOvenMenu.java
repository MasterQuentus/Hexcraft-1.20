package net.masterquentus.hexcraftmod.screen;

import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.masterquentus.hexcraftmod.block.entity.WitchesOvenBlockEntity;
import net.masterquentus.hexcraftmod.util.AbstractModMenu;
import net.masterquentus.hexcraftmod.util.FuelSlot;
import net.masterquentus.hexcraftmod.util.ModResultSlot;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.SimpleContainerData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.SlotItemHandler;

public class WitchesOvenMenu extends AbstractModMenu {
	public final WitchesOvenBlockEntity blockEntity;
	private Level level;
	private final ContainerData data;

	// Client Constructor
	public WitchesOvenMenu(int containerId, Inventory inventory, FriendlyByteBuf extraData) {
		this(containerId, inventory, inventory.player.level().getBlockEntity(extraData.readBlockPos()),
				new SimpleContainerData(5));
	}

	// Server Constructor
	public WitchesOvenMenu(int containerId, Inventory inventory, BlockEntity blockEntity,
			ContainerData simpleContainer) {
		super(HexcraftMenuTypes.WITCHES_OVEN_MENU.get(), containerId, 5);
		checkContainerSize(inventory, containerId);
		this.blockEntity = ((WitchesOvenBlockEntity) blockEntity);
		this.level = inventory.player.level();
		this.data = simpleContainer;

		this.addPlayerInventory(inventory);
		this.addPlayerHotbar(inventory);

		this.blockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(handler -> {
			this.addSlot(new SlotItemHandler(handler, 0, 56, 17));
			this.addSlot(new FuelSlot(handler, 1, 56, 53));
			this.addSlot(new SlotItemHandler(handler, 2, 83, 53));
			this.addSlot(new ModResultSlot(inventory.player, handler, 3, 118, 53));
			// Operations center output
			this.addSlot(new ModResultSlot(inventory.player, handler, 4, 114 + (8 / 2), 17 + (8 / 2)));
		});

		this.addDataSlots(this.data);
	}

	@Override
	public boolean stillValid(Player pPlayer) {
		return stillValid(ContainerLevelAccess.create(this.level, this.blockEntity.getBlockPos()), pPlayer,
				HexcraftBlocks.WITCHES_OVEN.get());
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		return super.quickMoveStack(playerIn, index);
	}

	public boolean isLit() {
		return data.get(2) > 0;
	}

	public int getLitProgress() {
		int i = this.data.get(3);
		if (i == 0) {
			i = 200;
		}

		return this.data.get(2) * 13 / i;
	}

	public int getScaledProgress() {
		int progress = this.data.get(0); // Progress
		int maxProgress = this.data.get(1); // Max Progress
		int arrowProgressSize = 24;
		return maxProgress != 0 && progress != 0 ? progress * arrowProgressSize / maxProgress : 0;
	}
}
