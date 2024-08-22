package net.masterquentus.hexcraftmod.block.entity;

import java.util.List;
import java.util.Optional;

import com.google.common.collect.Lists;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.masterquentus.hexcraftmod.block.custom.WitchesOven;
import net.masterquentus.hexcraftmod.recipe.HexcraftRecipeTypes;
import net.masterquentus.hexcraftmod.recipe.WitchesOvenRecipe;
import net.masterquentus.hexcraftmod.screen.WitchesOvenMenu;
import net.masterquentus.hexcraftmod.util.ITickableBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.Containers;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class WitchesOvenBlockEntity extends BlockEntity implements ITickableBlockEntity, MenuProvider {
	protected static final int INPUT_SLOT = 0;
	protected static final int FUEL_SLOT = 1;
	protected static final int ACCESSORY_SLOT = 2;
	protected static final int RESULT_SLOT = 3;
	protected static final int EXCESS_RESULT_SLOT = 4;
	private final RecipeType<? extends WitchesOvenRecipe> recipeType;
	protected NonNullList<ItemStack> items = NonNullList.withSize(5, ItemStack.EMPTY);
	protected final ContainerData data;
	private int bakeProgress = 0;
	private int bakeMaxProgress = 200;
	private int litTime;
	private int litMaxTime;
	private final ItemStackHandler itemHandler = new ItemStackHandler(5);
	private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

	private final Object2IntOpenHashMap<ResourceLocation> recipesUsed = new Object2IntOpenHashMap<>();

	public WitchesOvenBlockEntity(BlockPos pPos, BlockState pBlockState) {
		super(HexcraftBlockEntities.WITCHES_OVEN_BLOCK_ENTITY.get(), pPos, pBlockState);
		this.recipeType = HexcraftRecipeTypes.WITCHES_OVEN.get();
		this.data = new ContainerData() {
			public int get(int pIndex) {
				return switch (pIndex) {
				case 0 -> WitchesOvenBlockEntity.this.bakeProgress;
				case 1 -> WitchesOvenBlockEntity.this.bakeMaxProgress;
				case 2 -> WitchesOvenBlockEntity.this.litTime;
				case 3 -> WitchesOvenBlockEntity.this.litMaxTime;
				default -> 0;
				};
			};

			public void set(int pIndex, int pValue) {
				switch (pIndex) {
				case 0 -> WitchesOvenBlockEntity.this.bakeProgress = pValue;
				case 1 -> WitchesOvenBlockEntity.this.bakeMaxProgress = pValue;
				case 2 -> WitchesOvenBlockEntity.this.litTime = pValue;
				case 3 -> WitchesOvenBlockEntity.this.litMaxTime = pValue;
				}
			};

			public int getCount() {
				return 4;
			};
		};
	}

	@Override
	public <T> LazyOptional<T> getCapability(Capability<T> capability, Direction facing) {
		if (capability == ForgeCapabilities.ITEM_HANDLER)
			return lazyItemHandler.cast();
		return super.getCapability(capability, facing);
	}

	@Override
	public void onLoad() {
		super.onLoad();
		lazyItemHandler = LazyOptional.of(() -> itemHandler);
	}

	@Override
	public void invalidateCaps() {
		super.invalidateCaps();
		lazyItemHandler.invalidate();
	}

	@Override
	protected void saveAdditional(CompoundTag pTag) {
		pTag.put("WitchesOven.Inventory", itemHandler.serializeNBT());
		pTag.putInt("WitchesOven.BakeProgress", this.bakeProgress);
		pTag.putInt("WitchesOven.MaxBakeProgress", this.bakeMaxProgress);
		pTag.putInt("WitchesOven.LitTime", this.litTime);
		super.saveAdditional(pTag);
	}

	@Override
	public void load(CompoundTag pTag) {
		super.load(pTag);
		itemHandler.deserializeNBT(pTag.getCompound("WitchesOven.Inventory"));
		this.bakeProgress = pTag.getInt("WitchesOven.BakeProgress");
		this.bakeMaxProgress = pTag.getInt("WitchesOven.MaxBakeProgress");
		this.litTime = pTag.getInt("WitchesOven.LitTime");
		this.litMaxTime = this.getBurnDuration(this.itemHandler.getStackInSlot(FUEL_SLOT));
	}

	@Override
	public Component getDisplayName() {
		return Component.translatable("block.hexcraftmod.witches_oven");
	}

	@Override
	public AbstractContainerMenu createMenu(int pContainerId, Inventory pInventory, Player player) {
		return new WitchesOvenMenu(pContainerId, pInventory, this, this.data);
	}

	@Override
	public void tick() {
		boolean isLit = this.isLit();
		boolean needsUpdating = false;

		if (this.isLit()) {
			--this.litTime;

			if (this.hasRecipe()) {
				this.incrementProgress();

				if (this.isProgressFinished()) {
					this.makeResult();
					this.reset();
					needsUpdating = true;
				}
			}
		}

		ItemStack fuelStack = this.itemHandler.getStackInSlot(FUEL_SLOT);
		boolean isEmptyInput = !this.itemHandler.getStackInSlot(INPUT_SLOT).isEmpty();
		boolean isEmptyAccessoryInput = !this.itemHandler.getStackInSlot(ACCESSORY_SLOT).isEmpty();
		boolean isEmptyStack = !fuelStack.isEmpty();

		if (this.isLit() || isEmptyStack && isEmptyInput && isEmptyAccessoryInput) {
			if (!this.isLit() && this.hasRecipe() && this.isValidFuel(fuelStack)) {
				if (!fuelStack.isEmpty() && this.isValidFuel(fuelStack) && this.hasRecipe()) {
					this.litTime = this.getBurnDuration(fuelStack);
					this.litMaxTime = this.litTime;
					if (this.isLit()) {
						this.setLit();
						needsUpdating = true;
						if (fuelStack.hasCraftingRemainingItem())
							this.itemHandler.setStackInSlot(FUEL_SLOT, fuelStack);
						else if (isEmptyStack) {
							fuelStack.shrink(1);
							if (fuelStack.isEmpty()) {
								this.itemHandler.setStackInSlot(1, fuelStack.getCraftingRemainingItem());
							}
						}
					}
				}

				/*
				 * if (this.isLit() && this.isValidFuel(fuelStack) && this.hasRecipe()) {
				 * this.incrementProgress(); if (this.isProgressFinished()) { this.makeResult();
				 * this.reset(); needsUpdating = true; } } else { this.reset(); }
				 */
			} else if (!this.isLit() && this.bakeProgress > 0) {
				this.bakeProgress = Mth.clamp(this.bakeProgress - 2, 0, this.bakeMaxProgress);
			}

			if (isLit != this.isLit()) {
				needsUpdating = true;
				this.setLit();
			}

			if (needsUpdating)
				setChanged(this.level, this.worldPosition, this.getBlockState());
		}

		if (!this.isLit() && this.bakeProgress > 0) {
			this.bakeProgress = Mth.clamp(this.bakeProgress - 2, 0, this.bakeMaxProgress);
		}

		if (needsUpdating)
			setChanged(this.level, this.worldPosition, this.getBlockState());
	}

	private boolean isLit() {
		return this.litTime > 0;
	}

	private void incrementProgress() {
		this.bakeProgress++;
	}

	private boolean isProgressFinished() {
		return this.bakeProgress >= this.bakeMaxProgress;
	}

	private void reset() {
		this.bakeProgress = 0;
	}

	private void setLit() {
		BlockState state = this.getBlockState();
		state.setValue(WitchesOven.LIT, Boolean.valueOf(this.isLit()));
		this.level.setBlock(this.worldPosition, state, 3);
	}

	private boolean isValidFuel(ItemStack stack) {
		return !stack.isEmpty() && this.getBurnDuration(stack) > 0;
	}

	private Optional<WitchesOvenRecipe> getRecipe() {
		SimpleContainer inventory = new SimpleContainer(this.itemHandler.getSlots());
		for (int i = 0; i < this.itemHandler.getSlots(); i++) {
			inventory.setItem(i, this.itemHandler.getStackInSlot(i));
		}

		return this.level.getRecipeManager().getRecipeFor(WitchesOvenRecipe.Type.INSTANCE, inventory, this.level);
	}

	private boolean hasRecipe() {
		Optional<WitchesOvenRecipe> recipe = this.getRecipe();
		if (recipe.isEmpty())
			return false;

		ItemStack result = recipe.get().getResultItem(null);
		ItemStack excessResult = recipe.get().getExcessResultItem(null);
		return this.hasSpaceToInsert(result.getCount(), excessResult.getCount())
				&& this.canInputItems(result.getItem(), excessResult.getItem());
	}

	private void makeResult() {
		Optional<WitchesOvenRecipe> recipe = this.getRecipe();
		ItemStack result = recipe.get().getResultItem(null);
		ItemStack excessResult = recipe.get().getExcessResultItem(null);

		this.itemHandler.extractItem(INPUT_SLOT, 1, false);
		this.itemHandler.extractItem(ACCESSORY_SLOT, 1, false);

		this.itemHandler.setStackInSlot(RESULT_SLOT, new ItemStack(result.getItem(),
				this.itemHandler.getStackInSlot(RESULT_SLOT).getCount() + result.getCount()));

		this.itemHandler.setStackInSlot(EXCESS_RESULT_SLOT, new ItemStack(excessResult.getItem(),
				this.itemHandler.getStackInSlot(EXCESS_RESULT_SLOT).getCount() + excessResult.getCount()));
	}

	private boolean hasSpaceToInsert(int outputSlotCount, int excessOutputSlotCount) {
		boolean outputCount = this.itemHandler.getStackInSlot(RESULT_SLOT).getCount()
				+ outputSlotCount <= this.itemHandler.getStackInSlot(RESULT_SLOT).getMaxStackSize();
		boolean excessOutputCount = this.itemHandler.getStackInSlot(EXCESS_RESULT_SLOT).getCount()
				+ excessOutputSlotCount <= this.itemHandler.getStackInSlot(EXCESS_RESULT_SLOT).getMaxStackSize();
		return outputCount && excessOutputCount;
	}

	private boolean canInputItems(Item outputItem, Item excessOutputItem) {
		boolean outputFlag = this.itemHandler.getStackInSlot(RESULT_SLOT).isEmpty()
				|| this.itemHandler.getStackInSlot(RESULT_SLOT).is(outputItem);
		boolean excessOutputFlag = this.itemHandler.getStackInSlot(EXCESS_RESULT_SLOT).isEmpty()
				|| this.itemHandler.getStackInSlot(EXCESS_RESULT_SLOT).is(excessOutputItem);

		return outputFlag && excessOutputFlag;
	}

	public void drops() {
		SimpleContainer inventory = new SimpleContainer(itemHandler.getSlots());
		for (int i = 0; i < itemHandler.getSlots(); i++) {
			inventory.setItem(i, itemHandler.getStackInSlot(i));
		}
		Containers.dropContents(this.level, this.worldPosition, inventory);
	}

	public void awardUsedRecipesAndPopExperience(ServerPlayer pPlayer) {
		List<Recipe<?>> list = this.getRecipesToAwardAndPopExperience(pPlayer.serverLevel(), pPlayer.position());
		pPlayer.awardRecipes(list);

		for (Recipe<?> recipe : list) {
			if (recipe != null) {
				pPlayer.triggerRecipeCrafted(recipe, this.items);
			}
		}

		this.recipesUsed.clear();
	}

	private List<Recipe<?>> getRecipesToAwardAndPopExperience(ServerLevel pLevel, Vec3 pPopVec) {
		List<Recipe<?>> list = Lists.newArrayList();

		for (Object2IntMap.Entry<ResourceLocation> entry : this.recipesUsed.object2IntEntrySet()) {
			pLevel.getRecipeManager().byKey(entry.getKey()).ifPresent((p_155023_) -> {
				list.add(p_155023_);
				createExperience(pLevel, pPopVec, entry.getIntValue(),
						((AbstractCookingRecipe) p_155023_).getExperience());
			});
		}

		return list;
	}

	private static void createExperience(ServerLevel pLevel, Vec3 pPopVec, int pRecipeIndex, float pExperience) {
		int i = Mth.floor((float) pRecipeIndex * pExperience);
		float f = Mth.frac((float) pRecipeIndex * pExperience);
		if (f != 0.0F && Math.random() < (double) f) {
			++i;
		}

		ExperienceOrb.award(pLevel, pPopVec, i);
	}

	protected int getBurnDuration(ItemStack pFuel) {
		if (pFuel.isEmpty()) {
			return 0;
		} else {
			return ForgeHooks.getBurnTime(pFuel, this.recipeType);
		}
	}
}
