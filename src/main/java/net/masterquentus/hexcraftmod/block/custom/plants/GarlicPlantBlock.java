package net.masterquentus.hexcraftmod.block.custom.plants;

import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class GarlicPlantBlock extends CropBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_2;
    public GarlicPlantBlock(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxAge() {
        return 2;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return HexcraftItems.GARLIC.get();
    }
}