package net.masterquentus.hexcraftmod.item.custom;

import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;
import java.util.UUID;

public class TagLockKitFilled extends Item {

    public TagLockKitFilled() {
        super(new Properties());
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level pLevel, List<Component> tooltip, TooltipFlag flag) {
        if(stack.hasTag()) {
            tooltip.add(Component.literal(stack.getTag().getString("entityName")).withStyle(ChatFormatting.GRAY));
        }
        super.appendHoverText(stack, pLevel, tooltip, flag);
    }

    @Override
    public Rarity getRarity(ItemStack pStack) {
        return Rarity.EPIC;
    }

    public static UUID getUUID(ItemStack stack) {
        if(stack.getItem() == HexcraftItems.TAGLOCK_KIT_FULL.get() && stack.hasTag()) {
            return NbtUtils.loadUUID(stack.getTag().get("entity"));
        }
        return null;
    }

    @Override
    public int getUseDuration(ItemStack item) {
        return 32;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack item) {
        return UseAnim.DRINK;
    }
}
