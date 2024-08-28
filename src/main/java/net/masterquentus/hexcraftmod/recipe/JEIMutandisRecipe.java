package net.masterquentus.hexcraftmod.recipe;

import net.minecraft.core.HolderSet.Named;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;

public class JEIMutandisRecipe {
    private final List<ItemStack> inputs;
    private final Component description;

    private final ItemStack output;

    public JEIMutandisRecipe(TagKey<Block> inputs, ItemStack output, Component description) {
        Named<Block> tagContents = BuiltInRegistries.BLOCK.getTag(inputs).orElse(null);
        this.inputs = tagContents != null ? tagContents.stream().map(holder -> new ItemStack(holder.value())).toList() : new ArrayList<>();
        this.output = output;
        this.description = description;
    }

    public List<ItemStack> getInputs() {
        return inputs;
    }

    public ItemStack getOutput() {
        return output;
    }
    public String getDescription() {
        return this.description.getString();
    }
}