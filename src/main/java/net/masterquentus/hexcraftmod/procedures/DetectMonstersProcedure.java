package net.masterquentus.hexcraftmod.procedures;

import java.util.Comparator;
import javax.annotation.Nullable;
import net.masterquentus.hexcraftmod.block.HexcraftBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class DetectMonstersProcedure {
    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        if (event.getHand() != event.getEntity().getUsedItemHand())
            return;
        execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        execute(null, world, x, y, z);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
        double y_block = 0;
        double z_block = 0;
        double profondita = 0;
        double lato_quadrato = 0;
        double start_x = 0;
        double lato_x = 0;
        double lato_y = 0;
        double lato_z = 0;
        double start_z = 0;
        double start_y = 0;
        double larghezza = 0;
        double x_block = 0;
        double altezza = 0;

        if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == HexcraftBlocks.AMETHYST_CHIMES.get()) {
            lato_quadrato = 51;
            larghezza = 0;
            profondita = 0;
            altezza = 0;
            if (lato_quadrato > 0) {
                start_x = Math.floor(lato_quadrato / 2) * (-1);
                start_z = Math.floor(lato_quadrato / 2) * (-1);
                start_y = Math.floor(lato_quadrato / 2) * (-1);
                lato_x = lato_quadrato;
                lato_z = lato_quadrato;
                lato_y = lato_quadrato;
            } else {
                start_x = Math.floor(larghezza / 2) * (-1);
                start_z = Math.floor(profondita / 2) * (-1);
                start_y = Math.floor(altezza / 2) * (-1);
                lato_x = larghezza;
                lato_z = profondita;
                lato_y = altezza;
            }
            x_block = start_x;
            z_block = start_z;
            y_block = start_y;
            for (int index0 = 0; index0 < (int) (lato_y); index0++) {
                for (int index1 = 0; index1 < (int) (lato_x); index1++) {
                    for (int index2 = 0; index2 < (int) (lato_z); index2++) {
                        if (((Entity) world.getEntitiesOfClass(Monster.class,
                                        AABB.ofSize(new Vec3((x + x_block), (y + y_block), (z + z_block)), 1, 1, 1), e -> true).stream().sorted(new Object() {
                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                                    }
                                }.compareDistOf((x + x_block), (y + y_block), (z + z_block))).findFirst()
                                .orElse(null)) instanceof LivingEntity _entity)
                            _entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 200, 1, (false), (false)));
                        z_block = z_block + 1;
                    }
                    x_block = x_block + 1;
                    z_block = start_z;
                }
                y_block = y_block + 1;
                x_block = start_x;
            }
        }
    }
}
