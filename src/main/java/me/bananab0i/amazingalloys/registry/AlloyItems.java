package me.bananab0i.amazingalloys.registry;

import me.bananab0i.amazingalloys.AmazingAlloys;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class AlloyItems {

    // Items
    public static final Item TITANIUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item RAW_TITANIUM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item ENDERITE_SHARD = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item ENDERITE_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS).fireproof());
    public static final Item SOLAR_SHARD = new Item(new Item.Settings().group(ItemGroup.MATERIALS).fireproof());
    public static final Item LUNAR_SHARD = new Item(new Item.Settings().group(ItemGroup.MATERIALS).fireproof());

    // Block Items
    public static final BlockItem TITANIUM_ORE = new BlockItem(AlloyBlocks.TITANIUM_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem DEEPSLATE_TITANIUM_ORE = new BlockItem(AlloyBlocks.DEEPSLATE_TITANIUM_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem RAW_TITANIUM_BLOCK = new BlockItem(AlloyBlocks.RAW_TITANIUM_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem TITANIUM_BLOCK = new BlockItem(AlloyBlocks.TITANIUM_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final BlockItem ENDERITE_BLOCK = new BlockItem(AlloyBlocks.ENDERITE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        //Items
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "titanium_ingot"), TITANIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "enderite_ingot"), ENDERITE_INGOT);
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "solar_shard"), SOLAR_SHARD);
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "lunar_shard"), LUNAR_SHARD);
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "raw_titanium"), RAW_TITANIUM);
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "enderite_shard"), ENDERITE_SHARD);

        //Block Items
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "titanium_ore"), TITANIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "deepslate_titanium_ore"), DEEPSLATE_TITANIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "raw_titanium_block"), RAW_TITANIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "titanium_block"), TITANIUM_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(AmazingAlloys.MOD_ID, "enderite_block"), ENDERITE_BLOCK);
    }
}
