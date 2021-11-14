package me.bananab0i.amazingalloys.registry;

import me.bananab0i.amazingalloys.AmazingAlloys;
import me.bananab0i.amazingalloys.items.CustomAxeItem;
import me.bananab0i.amazingalloys.items.CustomHoeItem;
import me.bananab0i.amazingalloys.items.CustomPickaxeItem;
import me.bananab0i.amazingalloys.materials.EnderiteToolMaterial;
import me.bananab0i.amazingalloys.materials.TitaniumToolMaterial;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AlloyTools {
    //Titanium
    public static ToolItem TITANIUM_SWORD = new SwordItem(TitaniumToolMaterial.INSTANCE,4, -2.4f, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem TITANIUM_PICKAXE = new CustomPickaxeItem(TitaniumToolMaterial.INSTANCE, 2, -2.8f, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem TITANIUM_AXE = new CustomAxeItem(TitaniumToolMaterial.INSTANCE, 4, -3.0f, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem TITANIUM_SHOVEL = new ShovelItem(TitaniumToolMaterial.INSTANCE, 2.5f, -3.0f, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem TITANIUM_HOE = new CustomHoeItem(TitaniumToolMaterial.INSTANCE, -2, -3.0f, new Item.Settings().group(ItemGroup.TOOLS));

    //Enderite
    public static ToolItem ENDERITE_SWORD = new SwordItem(EnderiteToolMaterial.INSTANCE,5, -2.4f, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem ENDERITE_PICKAXE = new CustomPickaxeItem(EnderiteToolMaterial.INSTANCE, 3, -2.8f, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem ENDERITE_AXE = new CustomAxeItem(EnderiteToolMaterial.INSTANCE, 7, -3.0f, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem ENDERITE_SHOVEL = new ShovelItem(EnderiteToolMaterial.INSTANCE, 2.5f, -3.0f, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem ENDERITE_HOE = new CustomHoeItem(EnderiteToolMaterial.INSTANCE, -4, -3.0f, new Item.Settings().group(ItemGroup.TOOLS));

    public static void registerTools() {
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "titanium_sword"), TITANIUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "titanium_pickaxe"), TITANIUM_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "titanium_axe"), TITANIUM_AXE);
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "titanium_shovel"), TITANIUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "titanium_hoe"), TITANIUM_HOE);
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "enderite_sword"), ENDERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "enderite_pickaxe"), ENDERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "enderite_axe"), ENDERITE_AXE);
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "enderite_shovel"), ENDERITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "enderite_hoe"), ENDERITE_HOE);
    }
}
