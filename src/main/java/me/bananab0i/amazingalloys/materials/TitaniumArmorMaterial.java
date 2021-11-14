package me.bananab0i.amazingalloys.materials;

import me.bananab0i.amazingalloys.registry.AlloyItems;
import me.bananab0i.amazingalloys.registry.AlloySounds;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class TitaniumArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[] {3, 6, 8, 3};
    private static final int DURABILITY_MULTIPLIER = 35;
    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * DURABILITY_MULTIPLIER;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 13;
    }

    @Override
    public SoundEvent getEquipSound() {
        return AlloySounds.TITANIUM_EQUIPPED;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(AlloyItems.TITANIUM_INGOT);
    }

    @Override
    public String getName() {
        return "titanium";
    }

    @Override
    public float getToughness() {
        return 2.5f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.1f;
    }
}
