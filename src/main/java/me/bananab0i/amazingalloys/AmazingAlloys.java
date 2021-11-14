package me.bananab0i.amazingalloys;

import me.bananab0i.amazingalloys.registry.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class AmazingAlloys implements ModInitializer {
    public static final String MOD_ID = "amazingalloys";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier(MOD_ID, "alloygroup")).icon(() -> new ItemStack(AlloyItems.TITANIUM_INGOT)).appendItems(stacks -> {
        stacks.add(new ItemStack(AlloyItems.RAW_TITANIUM));
        stacks.add(new ItemStack(AlloyItems.TITANIUM_INGOT));
        stacks.add(new ItemStack(AlloyItems.ENDERITE_SHARD));
        stacks.add(new ItemStack(AlloyItems.ENDERITE_INGOT));
        stacks.add(new ItemStack(AlloyItems.SOLAR_SHARD));
        stacks.add(new ItemStack(AlloyItems.LUNAR_SHARD));
        stacks.add(new ItemStack(AlloyItems.TITANIUM_ORE));
        stacks.add(new ItemStack(AlloyItems.DEEPSLATE_TITANIUM_ORE));
        stacks.add(new ItemStack(AlloyItems.RAW_TITANIUM_BLOCK));
        stacks.add(new ItemStack(AlloyItems.TITANIUM_BLOCK));
        stacks.add(new ItemStack(AlloyItems.ENDERITE_BLOCK));
        stacks.add(new ItemStack(AlloyTools.TITANIUM_SWORD));
        stacks.add(new ItemStack(AlloyTools.TITANIUM_PICKAXE));
        stacks.add(new ItemStack(AlloyTools.TITANIUM_AXE));
        stacks.add(new ItemStack(AlloyTools.TITANIUM_SHOVEL));
        stacks.add(new ItemStack(AlloyTools.TITANIUM_HOE));
        stacks.add(new ItemStack(AlloyArmor.TITANIUM_HELMET));
        stacks.add(new ItemStack(AlloyArmor.TITANIUM_CHESTPLATE));
        stacks.add(new ItemStack(AlloyArmor.TITANIUM_LEGGINGS));
        stacks.add(new ItemStack(AlloyArmor.TITANIUM_BOOTS));
        stacks.add(new ItemStack(AlloyTools.ENDERITE_SWORD));
        stacks.add(new ItemStack(AlloyTools.ENDERITE_PICKAXE));
        stacks.add(new ItemStack(AlloyTools.ENDERITE_AXE));
        stacks.add(new ItemStack(AlloyTools.ENDERITE_SHOVEL));
        stacks.add(new ItemStack(AlloyTools.ENDERITE_HOE));
        stacks.add(new ItemStack(AlloyArmor.ENDERITE_HELMET));
        stacks.add(new ItemStack(AlloyArmor.ENDERITE_CHESTPLATE));
        stacks.add(new ItemStack(AlloyArmor.ENDERITE_LEGGINGS));
        stacks.add(new ItemStack(AlloyArmor.ENDERITE_BOOTS));
    })
            .build();

    @Override
    public void onInitialize() {
        AlloyItems.registerItems();
        AlloyBlocks.registerBlocks();
        AlloyTools.registerTools();
        AlloySounds.registerSounds();
        AlloyArmor.registerArmor();
        AlloyFeatures.registerFeatures();
    }
}
