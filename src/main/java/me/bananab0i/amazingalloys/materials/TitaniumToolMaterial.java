package me.bananab0i.amazingalloys.materials;

import me.bananab0i.amazingalloys.registry.AlloyItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TitaniumToolMaterial implements ToolMaterial {
    public static final TitaniumToolMaterial INSTANCE = new TitaniumToolMaterial();
    @Override
    public int getDurability() {
        return 1800;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.5f;
    }

    @Override
    public float getAttackDamage() {
        return 3f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 13;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(AlloyItems.TITANIUM_INGOT);
    }
}
