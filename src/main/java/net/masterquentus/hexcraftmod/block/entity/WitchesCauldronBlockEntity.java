package net.masterquentus.hexcraftmod.block.entity;

import java.util.Optional;
import java.util.Set;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.masterquentus.hexcraftmod.block.custom.WitchesCauldron;
import net.masterquentus.hexcraftmod.block.custom.WitchesCauldron.CauldronWaterColor;
import net.masterquentus.hexcraftmod.recipe.WitchesCauldronRecipe;
import net.masterquentus.hexcraftmod.util.HexcraftConfigs;
import net.masterquentus.hexcraftmod.util.ITickableBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.AABB;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class WitchesCauldronBlockEntity extends BlockEntity implements ITickableBlockEntity {
	protected static final int INPUT_SLOT_1 = 0;
	protected static final int INPUT_SLOT_2 = 1;
	protected static final int INPUT_SLOT_3 = 2;
	protected static final int OUTPUT_SLOT = 3;
	protected NonNullList<ItemStack> items = NonNullList.withSize(4, ItemStack.EMPTY);
	protected static final Set<Block> HEAT_SOURCES = Set.of(Blocks.FIRE, Blocks.CAMPFIRE, Blocks.SOUL_FIRE,
			Blocks.SOUL_CAMPFIRE, Blocks.LAVA);
	protected ContainerData data;
	private int brewTime = 0;
	private int maxBrewTime = 20;
	private final ItemStackHandler itemHandler = new ItemStackHandler(4);
	private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

	public WitchesCauldronBlockEntity(BlockPos pPos, BlockState pBlockState) {
		super(HexcraftBlockEntities.WITCHES_CAULDRON_BLOCK_ENTITY.get(), pPos, pBlockState);
		this.data = new ContainerData() {

			@Override
			public int get(int pIndex) {
				return switch (pIndex) {
				case 0 -> WitchesCauldronBlockEntity.this.brewTime;
				case 1 -> WitchesCauldronBlockEntity.this.maxBrewTime;
				default -> 0;
				};
			}

			@Override
			public void set(int pIndex, int pValue) {
				switch (pIndex) {
				case 0 -> WitchesCauldronBlockEntity.this.brewTime = pValue;
				case 1 -> WitchesCauldronBlockEntity.this.maxBrewTime = pValue;
				}
			}

			@Override
			public int getCount() {
				return 2;
			}
		};
	}

	@Override
	public <T> @NotNull LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
		if (cap == ForgeCapabilities.ITEM_HANDLER)
			return this.lazyItemHandler.cast();
		return super.getCapability(cap, side);
	}

	@Override
	public void onLoad() {
		super.onLoad();
		this.lazyItemHandler = LazyOptional.of(() -> this.itemHandler);
	}

	@Override
	public void invalidateCaps() {
		super.invalidateCaps();
		this.lazyItemHandler.invalidate();
	}

	@Override
	protected void saveAdditional(CompoundTag pTag) {
		pTag.put("WitchesCauldron.Inventory", this.itemHandler.serializeNBT());
		pTag.putInt("WitchesCauldron.BrewTime", this.brewTime);
		pTag.putInt("WitchesCauldron.MaxBrewProgress", this.maxBrewTime);
		super.saveAdditional(pTag);
	}

	@Override
	public void load(CompoundTag pTag) {
		super.load(pTag);
		this.itemHandler.deserializeNBT(pTag.getCompound("WitchesCauldron.Inventory"));
		this.brewTime = pTag.getInt("WitchesCauldron.BrewTime");
		this.maxBrewTime = pTag.getInt("WitchesCauldron.MaxBrewTime");
	}

	@Override
	public Packet<ClientGamePacketListener> getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt) {
		this.load(pkt.getTag());
	}

	@Override
	public CompoundTag getUpdateTag() {
		return this.saveWithoutMetadata();
	}

	@Override
	public void handleUpdateTag(CompoundTag tag) {
		this.load(tag);
	}

	@Override
	public void tick() {
		boolean needsUpdating = false;
		boolean hasHeatSourceBelow = this.hasHeatSourceBelow();

		if (!hasHeatSourceBelow) {
			this.setBubbleState(false);
			if (this.hasWater())
				return;
			this.defaultState();
			needsUpdating = true;
		} else {
			if (!this.hasWater()) {
				this.setBubbleState(false);
				needsUpdating = true;
				return;
			}

			this.setBubbleState(true);
			if (!this.isFilled()) {
				needsUpdating = true;
				return;
			}

			this.pickupItems();

			if (this.hasRecipe()) {
				this.incrementProgress();
				needsUpdating = true;

				if (this.hasBrewTime())
					this.setColorState(CauldronWaterColor.SUCCESS);
				else
					this.setColorState(CauldronWaterColor.DEFAULT);

				if (this.isProgressFinished()) {
					this.makeResult();
					this.outputResults();
					this.playSound(SoundEvents.BREWING_STAND_BREW);
					this.reset();
					this.setLevelState(0);
					needsUpdating = true;
				}

			} else if (!this.hasRecipe() && this.isSlotsFull() && !this.hasBrewTime()) {
				this.clearItems();
				this.playSound(SoundEvents.FIRE_EXTINGUISH, 0.65f, 1.0f);
				this.lowerLevel();
				this.setColorState(CauldronWaterColor.FAIL);
				needsUpdating = true;
			}
		}

		if (needsUpdating) {
			setChanged(this.level, this.worldPosition, this.getBlockState());
			level.sendBlockUpdated(this.worldPosition, getBlockState(), getBlockState(), 3);
			level.setBlock(this.worldPosition, this.getBlockState(), 3);
		}
	}

	private boolean hasHeatSourceBelow() {
		BlockPos posBelow = this.worldPosition.below();
		BlockState stateBelow = this.level.getBlockState(posBelow);
		return HEAT_SOURCES.contains(stateBelow.getBlock());
	}

	private void incrementProgress() {
		this.brewTime++;
	}

	private boolean isProgressFinished() {
		return this.brewTime >= this.maxBrewTime;
	}

	private boolean hasBrewTime() {
		return this.brewTime > 0;
	}

	private void reset() {
		this.brewTime = 0;
	}

	private boolean isFilled() {
		return this.getBlockState().getValue(WitchesCauldron.LEVEL) >= 3;
	}

	private boolean hasWater() {
		return this.getBlockState().getValue(WitchesCauldron.LEVEL) > 0;
	}

	private void pickupItems() {
		BlockPos abovePos = this.worldPosition.above();
		for (ItemEntity item : this.level.getEntitiesOfClass(ItemEntity.class, new AABB(abovePos))) {
			ItemStack stack = item.getItem();
			if (this.canFitInAnySlot(stack)) {
				this.itemHandler.insertItem(this.getFirstEmptySlot(), stack, false);
				this.level.playSound((ServerPlayer) null, this.worldPosition, SoundEvents.ITEM_PICKUP,
						SoundSource.BLOCKS);
				item.remove(RemovalReason.KILLED);
			}
		}
	}

	private boolean canFitInAnySlot(ItemStack stack) {
		for (int i = 0; i < this.itemHandler.getSlots(); i++) {
			ItemStack slotStack = this.itemHandler.getStackInSlot(i);
			if (slotStack.isEmpty()
					|| (ItemStack.isSameItem(stack, slotStack) && slotStack.getCount() < slotStack.getMaxDamage()))
				return true;

		}
		return false;
	}

	private int getFirstEmptySlot() {
		for (int i = 0; i < this.itemHandler.getSlots(); i++) {
			if (this.itemHandler.getStackInSlot(i).isEmpty())
				return i;
		}
		return -1;
	}

	private void clearItems() {
		for (int i = 0; i < this.itemHandler.getSlots(); i++) {
			ItemStack stack = this.itemHandler.getStackInSlot(i);
			if (stack.isEmpty())
				continue;

			if (!HexcraftConfigs.whitelistedItems.contains(stack.getItem()))
				this.itemHandler.setStackInSlot(i, ItemStack.EMPTY);
			else {
				this.outputWhitelistedItem();
			}
		}
	}

	private void defaultState() {
		this.setBubbleState(false);
		this.setColorState(CauldronWaterColor.DEFAULT);
		this.setLevelState(0);
		this.reset();
	}

	private void setBubbleState(boolean bubbling) {
		BlockState state = this.getBlockState().setValue(WitchesCauldron.BUBBLING, bubbling);
		this.level.setBlock(this.worldPosition, state, 3);
	}

	private void setColorState(CauldronWaterColor color) {
		BlockState state = this.getBlockState().setValue(WitchesCauldron.WATER_COLOR, color);
		this.level.setBlock(this.worldPosition, state, 3);
	}

	private void setLevelState(int level) {
		BlockState state = this.getBlockState().setValue(WitchesCauldron.LEVEL, level);
		this.level.setBlock(this.worldPosition, state, 3);
	}

	private void lowerLevel() {
		int currentLevel = this.getBlockState().getValue(WitchesCauldron.LEVEL);
		this.setLevelState(currentLevel == 0 ? currentLevel : currentLevel - 1);
	}

	protected void lowerLevel(int amount) {
		int currentLevel = this.getBlockState().getValue(WitchesCauldron.LEVEL);
		this.setLevelState(currentLevel == 0 || amount < 1 ? currentLevel : amount - 1);
	}

	private void playSound(SoundEvent sound) {
		this.level.playSound((ServerPlayer) null, this.worldPosition, sound, SoundSource.BLOCKS);
	}

	private void playSound(SoundEvent sound, float volume, float pitch) {
		this.level.playSound((ServerPlayer) null, this.worldPosition, sound, SoundSource.BLOCKS, volume, pitch);
	}

	private boolean isSlotsFull() {
		for (int i = INPUT_SLOT_1; i <= INPUT_SLOT_3; i++) {
			if (this.itemHandler.getStackInSlot(i).isEmpty())
				return false;
		}

		return true;
	}

	private Optional<WitchesCauldronRecipe> getRecipe() {
		SimpleContainer inventory = new SimpleContainer(this.itemHandler.getSlots());
		for (int i = 0; i < this.itemHandler.getSlots(); i++)
			inventory.setItem(i, this.itemHandler.getStackInSlot(i));
		return this.level.getRecipeManager().getRecipeFor(WitchesCauldronRecipe.Type.INSTANCE, inventory, this.level);
	}

	private boolean hasRecipe() {
		Optional<WitchesCauldronRecipe> recipe = this.getRecipe();
		if (recipe.isEmpty())
			return false;

		ItemStack result = recipe.get().getResultItem(null);
		return this.hasSpaceToInsert(result.getCount()) && this.canInputItems(result.getItem());
	}

	private void makeResult() {
		Optional<WitchesCauldronRecipe> recipe = this.getRecipe();
		ItemStack result = recipe.get().getResultItem(null);

		this.itemHandler.extractItem(INPUT_SLOT_1, 1, false);
		this.itemHandler.extractItem(INPUT_SLOT_2, 1, false);
		this.itemHandler.extractItem(INPUT_SLOT_3, 1, false);

		this.itemHandler.setStackInSlot(OUTPUT_SLOT, new ItemStack(result.getItem(),
				this.itemHandler.getStackInSlot(OUTPUT_SLOT).getCount() + result.getCount()));

		if (this.getBlockState().getBlock() instanceof WitchesCauldron witchesCauldron) {
			level.setBlockAndUpdate(this.worldPosition, witchesCauldron.updatedState(this.getBlockState(), -3));
			level.playSound((ServerPlayer) null, this.worldPosition, SoundEvents.BUCKET_EMPTY, SoundSource.BLOCKS);
			level.gameEvent((Entity) null, GameEvent.FLUID_PLACE, this.worldPosition);
		}
		this.setColorState(CauldronWaterColor.DEFAULT);
	}

	private void outputResults() {
		BlockPos abovePos = this.worldPosition.above();
		ItemStack stack = this.itemHandler.getStackInSlot(OUTPUT_SLOT);

		if (!stack.isEmpty()) {
			ItemEntity itemEntity = new ItemEntity(this.level, abovePos.getX() + 0.5f, abovePos.getY() + 0.5f,
					abovePos.getZ() + 0.5f, stack);

			itemEntity.setPickUpDelay(40);

			this.level.addFreshEntity(itemEntity);
			this.level.playSound((ServerPlayer) null, this.worldPosition, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS);
			this.itemHandler.setStackInSlot(OUTPUT_SLOT, ItemStack.EMPTY);
		}
	}

	private void outputWhitelistedItem() {
		BlockPos abovePos = this.worldPosition.above();
		for (int i = 0; i <= INPUT_SLOT_3; i++) {
			ItemStack stack = this.itemHandler.getStackInSlot(i);

			if (!stack.isEmpty() && HexcraftConfigs.whitelistedItems.contains(stack.getItem())) {
				ItemEntity itemEntity = new ItemEntity(this.level, abovePos.getX() + 0.5f, abovePos.getY() + 0.5f,
						abovePos.getZ() + 0.5f, stack);

				itemEntity.setPickUpDelay(40);

				this.level.addFreshEntity(itemEntity);
				this.level.playSound((ServerPlayer) null, this.worldPosition, SoundEvents.ITEM_FRAME_REMOVE_ITEM,
						SoundSource.BLOCKS);
				this.itemHandler.setStackInSlot(i, ItemStack.EMPTY);
			}
		}
	}

	private boolean hasSpaceToInsert(int outputSlotCount) {
		boolean outputCount = this.itemHandler.getStackInSlot(OUTPUT_SLOT).getCount()
				+ outputSlotCount <= this.itemHandler.getStackInSlot(OUTPUT_SLOT).getMaxStackSize();
		return outputCount;
	}

	private boolean canInputItems(Item outputItem) {
		boolean outputFlag = this.itemHandler.getStackInSlot(OUTPUT_SLOT).isEmpty()
				|| this.itemHandler.getStackInSlot(OUTPUT_SLOT).is(outputItem);
		return outputFlag;
	}
}
