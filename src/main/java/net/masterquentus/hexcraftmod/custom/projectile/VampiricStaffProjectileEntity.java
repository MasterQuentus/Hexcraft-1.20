package net.masterquentus.hexcraftmod.custom.projectile;

import net.masterquentus.hexcraftmod.entity.HexcraftEntities;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class VampiricStaffProjectileEntity extends ThrowableItemProjectile {

    public VampiricStaffProjectileEntity(EntityType<? extends VampiricStaffProjectileEntity> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public VampiricStaffProjectileEntity(Level pLevel, LivingEntity pShooter) {
        super((EntityType<? extends ThrowableItemProjectile>) HexcraftEntities.VAMPIRIC_STAFF_PROJECTILE.get(), pShooter, pLevel);
    }

    public VampiricStaffProjectileEntity(Level pLevel, double pX, double pY, double pZ) {
        super((EntityType<? extends ThrowableItemProjectile>) HexcraftEntities.VAMPIRIC_STAFF_PROJECTILE.get(), pX, pY, pZ, pLevel);
    }

    protected Item getDefaultItem() {
        return HexcraftItems.VAMPIRIC_STAFF_PROJECTILE.get();
    }

    private ParticleOptions getParticle() {
        return new ItemParticleOption(ParticleTypes.ITEM, HexcraftItems.VAMPIRIC_STAFF_PROJECTILE.get().getDefaultInstance());
    }

    /**
     * Handles an entity event fired from {@link net.minecraft.world.level.Level#broadcastEntityEvent}.
     */
    public void handleEntityEvent(byte pId) {
        if (pId == 3) {
            ParticleOptions particleoptions = this.getParticle();

            for(int i = 0; i < 8; ++i) {
                this.level().addParticle(particleoptions, this.getX(), this.getY(), this.getZ(), 0.0D, 0.0D, 0.0D);
            }
        }

    }

    /**
     * Called when the arrow hits an entity
     */
    protected void onHitEntity(EntityHitResult pResult) {
        super.onHitEntity(pResult);
        if (!this.level().isClientSide) {
            Entity entity = pResult.getEntity();
            Entity entity1 = this.getOwner();
            entity.hurt(this.damageSources().thrown(this, entity1), 6.0F);
            if (entity1 instanceof LivingEntity) {
                this.doEnchantDamageEffects((LivingEntity)entity1, entity);
            }
        }

    }

    /**
     * Called when this EntityFireball hits a block or entity.
     */
    protected void onHit(HitResult pResult) {
        super.onHit(pResult);
        if (!this.level().isClientSide) {
            this.level().broadcastEntityEvent(this, (byte)3);
            this.discard();
        }

    }
}