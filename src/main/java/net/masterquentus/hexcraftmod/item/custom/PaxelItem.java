package net.masterquentus.hexcraftmod.item.custom;
import net.masterquentus.hexcraftmod.util.HexcraftTags;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Vanishable;


public class PaxelItem extends DiggerItem implements Vanishable {
    public PaxelItem(Tier pTier, float pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pAttackDamageModifier, pAttackSpeedModifier, pTier, HexcraftTags.Blocks.PAXEL_MINEABLE, pProperties);
    }
}
