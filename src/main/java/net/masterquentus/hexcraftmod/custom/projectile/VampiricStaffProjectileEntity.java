package net.masterquentus.hexcraftmod.custom.projectile;

import net.masterquentus.hexcraftmod.entity.custom.HexcraftEntities;
import net.masterquentus.hexcraftmod.item.HexcraftItems;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.damagesource.DamageSource;
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
        Entity entity = pResult.getEntity();
        if (entity instanceof LivingEntity living && living.getMobType() == MobType.UNDEAD)
            return;

        boolean entityHurt = entity.hurt(DamageSource.thrown(this, this.getOwner()), 3);
        if (entityHurt && this.getOwner() instanceof LivingEntity) {
            ((LivingEntity) this.getOwner()).heal(3);
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