package me.bananab0i.amazingalloys.registry;

import me.bananab0i.amazingalloys.AmazingAlloys;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;

public class AlloyFeatures {
    public static ConfiguredFeature<?,?> OVERWORLD_TITANIUM_ORE_CONFIGURED_FEATURE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreConfiguredFeatures.BASE_STONE_OVERWORLD,
                    AlloyBlocks.TITANIUM_ORE.getDefaultState(),
                    3));
    public static PlacedFeature OVERWORLD_TITANIUM_ORE_PLACED_FEATURE = OVERWORLD_TITANIUM_ORE_CONFIGURED_FEATURE.withPlacement(
            CountPlacementModifier.of(2),
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(5)));

    public static ConfiguredFeature<?,?> OVERWORLD_DEEPSLATE_TITANIUM_ORE_CONFIGURED_FEATURE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    AlloyBlocks.DEEPSLATE_TITANIUM_ORE.getDefaultState(),
                    3));
    public static PlacedFeature OVERWORLD_DEEPSLATE_TITANIUM_ORE_PLACED_FEATURE = OVERWORLD_DEEPSLATE_TITANIUM_ORE_CONFIGURED_FEATURE.withPlacement(
            CountPlacementModifier.of(2),
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(0)));

    public static void registerFeatures() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(AmazingAlloys.MOD_ID, "overworld_titanium_ore"), OVERWORLD_TITANIUM_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(AmazingAlloys.MOD_ID, "overworld_titanium_ore"), OVERWORLD_TITANIUM_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(AmazingAlloys.MOD_ID, "overworld_titanium_ore")));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(AmazingAlloys.MOD_ID, "overworld_deepslate_titanium_ore"), OVERWORLD_DEEPSLATE_TITANIUM_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(AmazingAlloys.MOD_ID, "overworld_deepslate_titanium_ore"), OVERWORLD_DEEPSLATE_TITANIUM_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(AmazingAlloys.MOD_ID, "overworld_deepslate_titanium_ore")));
    }
}
