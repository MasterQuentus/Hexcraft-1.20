package net.masterquentus.hexcraftmod.item.custom;

import net.masterquentus.hexcraftmod.util.HexcraftTags;
import net.minecraft.ChatFormatting;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.SlotAccess;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ClickAction;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.tooltip.BundleTooltip;
import net.minecraft.world.inventory.tooltip.TooltipComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class WitchesSatchelItem extends Item {
    public static final int MAX_WEIGHT = 576;

    public WitchesSatchelItem(Item.Properties p_150726_) {
        super(p_150726_);
    }

    public static float hasContent(ItemStack p_150767_) {
        return (getContentWeight(p_150767_) > 0) ? 1.0f : 0.0f;
    }

    public boolean overrideStackedOnOther(ItemStack itemStack, Slot slot, ClickAction clickAction, Player player) {
        if (clickAction != ClickAction.SECONDARY) {
            return false;
        } else {
            ItemStack itemStackToAdd = slot.getItem();
            if (itemStackToAdd.isEmpty()) {
                removeOne(itemStack).ifPresent((p_150740_) -> {
                    add(itemStack, slot.safeInsert(p_150740_));
                    this.playRemoveOneSound(player);
                });
            } else if (itemStackToAdd.getItem().canFitInsideContainerItems() && itemStackToAdd.is(HexcraftTags.Items.FIT_IN_WITCHES_SATCHEL)) {
                int i = (MAX_WEIGHT - getContentWeight(itemStack)) / getWeight(itemStackToAdd);
                int j = add(itemStack, itemStackToAdd);
                if (j > 0) {
                    slot.safeTake(itemStackToAdd.getCount(), i, player);
                    this.playInsertSound(player);
                }
            }

            return true;
        }
    }

    public boolean overrideOtherStackedOnMe(ItemStack itemStack, ItemStack itemStackAdd, Slot slot, ClickAction clickAction, Player player, SlotAccess slotAccess) {
        if (clickAction == ClickAction.SECONDARY && slot.allowModification(player)) {
            if (itemStackAdd.isEmpty()) {
                removeOne(itemStack).ifPresent((itemStack1) -> {
                    this.playRemoveOneSound(player);
                    slotAccess.set(itemStack1);
                });
            } else {
                int i = add(itemStack, itemStackAdd);
                if (i > 0) {
                    this.playInsertSound(player);
                    itemStackAdd.shrink(i);
                }
            }

            return true;
        } else {
            return false;
        }
    }

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (dropContents(itemstack, player)) {
            this.playDropContentsSound(player);
            player.awardStat(Stats.ITEM_USED.get(this));
            return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
        } else {
            return InteractionResultHolder.fail(itemstack);
        }
    }

    private static int add(ItemStack stack, ItemStack stackToAdd) {
        if (!stackToAdd.isEmpty() && stackToAdd.getItem().canFitInsideContainerItems()
                && stackToAdd.is(HexcraftTags.Items.FIT_IN_WITCHES_SATCHEL)) {
            CompoundTag compoundtag = stack.getOrCreateTag();
            if (!compoundtag.contains("Items")) {
                compoundtag.put("Items", new ListTag());
            }

            int contentWeight = getContentWeight(stack);
            int weight = getWeight(stackToAdd);
            int maxCountAddable = Math.min(stackToAdd.getCount(), (MAX_WEIGHT - contentWeight) / weight);
            if (maxCountAddable == 0) {
                return 0;
            } else {
                ListTag listtag = compoundtag.getList("Items", 10);
                Optional<CompoundTag> optional = getMatchingItem(stackToAdd, listtag);
                System.out.println("optional.isPresent() = " + optional.isPresent());
                if (optional.isPresent()) {
                    byte optionalCount = optional.get().getByte("Count");
                    System.out.println("optionalCount = " + optionalCount);
                    if (optionalCount < 64) {
                        maxCountAddable = Math.min(stackToAdd.getCount(), 64 - optionalCount);
                        System.out.println("maxCountAddable = " + maxCountAddable);
                        CompoundTag compoundtag1 = optional.get();
                        ItemStack itemstack = ItemStack.of(compoundtag1);
                        itemstack.grow(maxCountAddable);
                        itemstack.save(compoundtag1);
                        listtag.remove(compoundtag1);
                        listtag.add(0, compoundtag1);
                    } else {
                        return 0;
                    }
                } else {
                    ItemStack itemstack1 = stackToAdd.copy();
                    itemstack1.setCount(maxCountAddable);
                    CompoundTag compoundtag2 = new CompoundTag();
                    itemstack1.save(compoundtag2);
                    listtag.add(0, compoundtag2);
                }

                return maxCountAddable;
            }
        } else {
            return 0;
        }
    }

    private static Optional<CompoundTag> getMatchingItem(ItemStack p_150757_, ListTag p_150758_) {
        return p_150757_.is(Items.BUNDLE) ? Optional.empty() : p_150758_.stream().filter(CompoundTag.class::isInstance).map(CompoundTag.class::cast).filter((p_186350_) -> {
            return ItemStack.isSameItemSameTags(ItemStack.of(p_186350_), p_150757_);
        }).findFirst();
    }

    private static int getWeight(ItemStack p_150777_) {
        if ((p_150777_.is(Items.BEEHIVE) || p_150777_.is(Items.BEE_NEST)) && p_150777_.hasTag()) {
            CompoundTag compoundtag = BlockItem.getBlockEntityData(p_150777_);
            if (compoundtag != null && !compoundtag.getList("Bees", 10).isEmpty()) {
                return 64;
            }
        }

        return 64 / p_150777_.getMaxStackSize();
    }

    private static int getContentWeight(ItemStack p_150779_) {
        return getContents(p_150779_).mapToInt((p_186356_) -> {
            return getWeight(p_186356_) * p_186356_.getCount();
        }).sum();
    }

    private static Optional<ItemStack> removeOne(ItemStack p_150781_) {
        CompoundTag compoundtag = p_150781_.getOrCreateTag();
        if (!compoundtag.contains("Items")) {
            return Optional.empty();
        } else {
            ListTag listtag = compoundtag.getList("Items", 10);
            if (listtag.isEmpty()) {
                return Optional.empty();
            } else {
                int i = 0;
                CompoundTag compoundtag1 = listtag.getCompound(0);
                ItemStack itemstack = ItemStack.of(compoundtag1);
                listtag.remove(0);
                if (listtag.isEmpty()) {
                    p_150781_.removeTagKey("Items");
                }

                return Optional.of(itemstack);
            }
        }
    }

    private static boolean dropContents(ItemStack p_150730_, Player p_150731_) {
        CompoundTag compoundtag = p_150730_.getOrCreateTag();
        if (!compoundtag.contains("Items")) {
            return false;
        } else {
            if (p_150731_ instanceof ServerPlayer) {
                ListTag listtag = compoundtag.getList("Items", 10);

                for(int i = 0; i < listtag.size(); ++i) {
                    CompoundTag compoundtag1 = listtag.getCompound(i);
                    ItemStack itemstack = ItemStack.of(compoundtag1);
                    p_150731_.drop(itemstack, true);
                }
            }

            p_150730_.removeTagKey("Items");
            return true;
        }
    }

    private static Stream<ItemStack> getContents(ItemStack p_150783_) {
        CompoundTag compoundtag = p_150783_.getTag();
        if (compoundtag == null) {
            return Stream.empty();
        } else {
            ListTag listtag = compoundtag.getList("Items", 10);
            return listtag.stream().map(CompoundTag.class::cast).map(ItemStack::of);
        }
    }

    public Optional<TooltipComponent> getTooltipImage(ItemStack p_150775_) {
        NonNullList<ItemStack> nonnulllist = NonNullList.create();
        getContents(p_150775_).forEach(nonnulllist::add);
        return Optional.of(new BundleTooltip(nonnulllist, 0));
    }

    public void appendHoverText(ItemStack p_150749_, Level p_150750_, List<Component> p_150751_, TooltipFlag p_150752_) {
        p_150751_.add(Component.translatable("item.hexcraft.witches_satchel.description").withStyle(ChatFormatting.GRAY));
    }

    public void onDestroyed(ItemEntity p_150728_) {
        ItemUtils.onContainerDestroyed(p_150728_, getContents(p_150728_.getItem()));
    }

    private void playRemoveOneSound(Entity p_186343_) {
        p_186343_.playSound(SoundEvents.BUNDLE_REMOVE_ONE, 0.8F, 0.8F + p_186343_.level().getRandom().nextFloat() * 0.4F);
    }

    private void playInsertSound(Entity p_186352_) {
        p_186352_.playSound(SoundEvents.BUNDLE_INSERT, 0.8F, 0.8F + p_186352_.level().getRandom().nextFloat() * 0.4F);
    }

    private void playDropContentsSound(Entity playSound) {
        playSound.playSound(SoundEvents.BUNDLE_DROP_CONTENTS, 0.8F, 0.8F + playSound.level().getRandom().nextFloat() * 0.4F);
    }
}