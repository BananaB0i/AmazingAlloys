package me.bananab0i.amazingalloys.registry;

import me.bananab0i.amazingalloys.AmazingAlloys;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AlloyBlocks {

    public static final Block TITANIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES,3).requiresTool().strength(3.5f, 3.5f).sounds(BlockSoundGroup.STONE));
    public static final Block DEEPSLATE_TITANIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES,3).requiresTool().strength(5f, 3.5f).sounds(BlockSoundGroup.STONE));
    public static final Block RAW_TITANIUM_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool().strength(3f,5f).sounds(BlockSoundGroup.STONE));
    public static final Block TITANIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool().strength(5.5f,6.5f).sounds(BlockSoundGroup.METAL));
    public static final Block ENDERITE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 3).requiresTool().strength(60f,1300f).sounds(BlockSoundGroup.NETHERITE));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(AmazingAlloys.MOD_ID, "titanium_ore"), TITANIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(AmazingAlloys.MOD_ID, "deepslate_titanium_ore"), DEEPSLATE_TITANIUM_ORE);
        Registry.register(Registry.BLOCK, new Identifier(AmazingAlloys.MOD_ID, "raw_titanium_block"), RAW_TITANIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(AmazingAlloys.MOD_ID, "titanium_block"), TITANIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(AmazingAlloys.MOD_ID, "enderite_block"), ENDERITE_BLOCK);
    }
}
