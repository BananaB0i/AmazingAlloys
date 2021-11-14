package me.bananab0i.amazingalloys.materials;

import me.bananab0i.amazingalloys.registry.AlloyItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EnderiteToolMaterial implements ToolMaterial {
    public static final EnderiteToolMaterial INSTANCE = new EnderiteToolMaterial();
    @Override
    public int getDurability() {
        return 2400;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 11.0F;
    }

    @Override
    public float getAttackDamage() {
        return 5.0F;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(AlloyItems.ENDERITE_INGOT);
    }
}
