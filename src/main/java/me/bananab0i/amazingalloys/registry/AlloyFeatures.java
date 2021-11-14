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
import net.minecraft.world.gen.decorator.RangeDecorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class AlloyFeatures {
    public static ConfiguredFeature<?, ?> ORE_TITANIUM = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    AlloyBlocks.TITANIUM_ORE.getDefaultState(),
                    2))
            .decorate(RangeDecorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(
                    YOffset.fixed(0),
                    YOffset.fixed(10)
            ))))
            .spreadHorizontally()
            .repeat(2);
    public static ConfiguredFeature<?, ?> ORE_TITANIUM_DEEPSLATE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES,
                    AlloyBlocks.DEEPSLATE_TITANIUM_ORE.getDefaultState(),
                    2))
            .decorate(RangeDecorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(
                    YOffset.fixed(-64),
                    YOffset.fixed(0)
            ))))
            .spreadHorizontally()
            .repeat(2);

    public static void registerFeatures() {
        RegistryKey<ConfiguredFeature<?, ?>> oreTitaniumOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(AmazingAlloys.MOD_ID, "ore_titanium_overworld"));
        RegistryKey<ConfiguredFeature<?, ?>> oreTitaniumDeepslate = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(AmazingAlloys.MOD_ID, "ore_titanium_deepslate"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTitaniumOverworld.getValue(), ORE_TITANIUM);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTitaniumDeepslate.getValue(), ORE_TITANIUM_DEEPSLATE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTitaniumOverworld);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTitaniumDeepslate);
    }
}
