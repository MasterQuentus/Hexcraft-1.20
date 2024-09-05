package net.masterquentus.hexcraftmod.item;

import net.masterquentus.hexcraftmod.HexcraftMod;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.function.Supplier;

import java.util.EnumMap;

public enum HexcraftArmorMaterials implements ArmorMaterial {
    STEEL("steel", 24, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266655_) -> {
        p_266655_.put(ArmorItem.Type.BOOTS, 4);
        p_266655_.put(ArmorItem.Type.LEGGINGS, 5);
        p_266655_.put(ArmorItem.Type.CHESTPLATE, 7);
        p_266655_.put(ArmorItem.Type.HELMET, 5);
    }), 15, SoundEvents.ARMOR_EQUIP_IRON, 3.0F, 0.1F, () -> Ingredient.of(HexcraftItems.STEEL_INGOT.get())),

    DARKSTEEL("darksteel", 34, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266655_) -> {
        p_266655_.put(ArmorItem.Type.BOOTS, 4);
        p_266655_.put(ArmorItem.Type.LEGGINGS, 5);
        p_266655_.put(ArmorItem.Type.CHESTPLATE, 7);
        p_266655_.put(ArmorItem.Type.HELMET, 5);
    }), 15, SoundEvents.ARMOR_EQUIP_IRON, 3.0F, 0.1F, () -> Ingredient.of(HexcraftItems.DARK_STEEL.get())),

    BLOODYNYKIUM("bloodynykium", 35, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266655_) -> {
        p_266655_.put(ArmorItem.Type.BOOTS, 4);
        p_266655_.put(ArmorItem.Type.LEGGINGS, 5);
        p_266655_.put(ArmorItem.Type.CHESTPLATE, 7);
        p_266655_.put(ArmorItem.Type.HELMET, 5);
    }), 15, SoundEvents.ARMOR_EQUIP_IRON, 3.0F, 0.1F, () -> Ingredient.of(HexcraftItems.BLOODY_NYKIUM.get())),

    JORMIUM("jormium", 35, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266655_) -> {
        p_266655_.put(ArmorItem.Type.BOOTS, 4);
        p_266655_.put(ArmorItem.Type.LEGGINGS, 5);
        p_266655_.put(ArmorItem.Type.CHESTPLATE, 7);
        p_266655_.put(ArmorItem.Type.HELMET, 5);
    }), 15, SoundEvents.ARMOR_EQUIP_IRON, 3.0F, 0.1F, () -> Ingredient.of(HexcraftItems.JORMIUM_INGOT.get())),

    CUROGEN("curogen", 34, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266655_) -> {
        p_266655_.put(ArmorItem.Type.BOOTS, 4);
        p_266655_.put(ArmorItem.Type.LEGGINGS, 5);
        p_266655_.put(ArmorItem.Type.CHESTPLATE, 7);
        p_266655_.put(ArmorItem.Type.HELMET, 5);
    }), 15, SoundEvents.ARMOR_EQUIP_IRON, 3.0F, 0.1F, () -> Ingredient.of(HexcraftItems.CUROGEN.get())),

    SILVER("silver", 34, Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266655_) -> {
        p_266655_.put(ArmorItem.Type.BOOTS, 4);
        p_266655_.put(ArmorItem.Type.LEGGINGS, 5);
        p_266655_.put(ArmorItem.Type.CHESTPLATE, 7);
        p_266655_.put(ArmorItem.Type.HELMET, 5);
    }), 15, SoundEvents.ARMOR_EQUIP_IRON, 3.0F, 0.1F, () -> Ingredient.of(HexcraftItems.SILVER_INGOT.get()));

    public static final StringRepresentable.EnumCodec<ArmorMaterials> CODEC = StringRepresentable.fromEnum(ArmorMaterials::values);
    private static final EnumMap<ArmorItem.Type, Integer> HEALTH_FUNCTION_FOR_TYPE = Util.make(new EnumMap<>(ArmorItem.Type.class), (p_266653_) -> {
        p_266653_.put(ArmorItem.Type.BOOTS, 13);
        p_266653_.put(ArmorItem.Type.LEGGINGS, 15);
        p_266653_.put(ArmorItem.Type.CHESTPLATE, 16);
        p_266653_.put(ArmorItem.Type.HELMET, 11);
    });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    HexcraftArmorMaterials(String name, int durabilityMultiplier, EnumMap<ArmorItem.Type, Integer> protectionTypeMap,
                      int enchantmentValue, SoundEvent soundEvent, float toughness, float knockbackRes, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionFunctionForType = protectionTypeMap;
        this.enchantmentValue = enchantmentValue;
        this.sound = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackRes;
        this.repairIngredient = repairMaterial;
    }

    public int getDurabilityForType(ArmorItem.Type p_266745_) {
        return HEALTH_FUNCTION_FOR_TYPE.get(p_266745_) * this.durabilityMultiplier;
    }

    public int getDefenseForType(ArmorItem.Type p_266752_) {
        return this.protectionFunctionForType.get(p_266752_);
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return HexcraftMod.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    /**
     * Gets the percentage of knockback resistance provided by armor of the material.
     */
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public String getSerializedName() {
        return HexcraftMod.MOD_ID + ":" + this.name;
    }
}