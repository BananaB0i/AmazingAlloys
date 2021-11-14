package me.bananab0i.amazingalloys.registry;


import me.bananab0i.amazingalloys.items.EnderiteBootsItem;
import me.bananab0i.amazingalloys.items.EnderiteChestItem;
import me.bananab0i.amazingalloys.items.EnderiteHelmetItem;
import me.bananab0i.amazingalloys.items.EnderiteLegsItem;
import me.bananab0i.amazingalloys.materials.EnderiteArmorMaterial;
import me.bananab0i.amazingalloys.materials.TitaniumArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AlloyArmor {
    // Armor Materials
    public static final ArmorMaterial ENDERITE_ARMOR_MATERIAL = new EnderiteArmorMaterial();
    public static final ArmorMaterial TITANIUM_ARMOR_MATERIAL = new TitaniumArmorMaterial();

    // Armor Items
    public static final ArmorItem ENDERITE_HELMET = new EnderiteHelmetItem(ENDERITE_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().fireproof().group(ItemGroup.COMBAT));
    public static final ArmorItem ENDERITE_CHESTPLATE = new EnderiteChestItem(ENDERITE_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().fireproof().group(ItemGroup.COMBAT));
    public static final ArmorItem ENDERITE_LEGGINGS = new EnderiteLegsItem(ENDERITE_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().fireproof().group(ItemGroup.COMBAT));
    public static final ArmorItem ENDERITE_BOOTS = new EnderiteBootsItem(ENDERITE_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().fireproof().group(ItemGroup.COMBAT));
    public static final ArmorItem TITANIUM_HELMET = new ArmorItem(TITANIUM_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem TITANIUM_CHESTPLATE = new ArmorItem(TITANIUM_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem TITANIUM_LEGGINGS = new ArmorItem(TITANIUM_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ArmorItem TITANIUM_BOOTS = new ArmorItem(TITANIUM_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static void registerArmor() {
        Registry.register(Registry.ITEM, new Identifier("amazingalloys", "enderite_helmet"), ENDERITE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("amazingalloys", "enderite_chestplate"), ENDERITE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("amazingalloys", "enderite_leggings"), ENDERITE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("amazingalloys", "enderite_boots"), ENDERITE_BOOTS);
        Registry.register(Registry.ITEM, new Identifier("amazingalloys", "titanium_helmet"), TITANIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier("amazingalloys", "titanium_chestplate"), TITANIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("amazingalloys", "titanium_leggings"), TITANIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("amazingalloys", "titanium_boots"), TITANIUM_BOOTS);
    }
}
