package net.onryo.additions.world.feature;

import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.onryo.additions.OnryoAdditionsMod;
import net.onryo.additions.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ConfiguredFeature<TreeFeatureConfig, ?> SAKURA_TREE =
            register("sakura", Feature.TREE.configure(new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.SAKURA_LOG),
                new ForkingTrunkPlacer(3, 3, 4),
                BlockStateProvider.of(ModBlocks.SAKURA_LEAVES),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 0, 2)).build()));

    public static final ConfiguredFeature<RandomFeatureConfig, ?> SAKURA_TREE_RANDOM =
            register("sakura_feature",
                    Feature.RANDOM_SELECTOR.configure(new RandomFeatureConfig(List.of(new RandomFeatureEntry(
                            SAKURA_TREE.withWouldSurviveFilter(ModBlocks.SAKURA_SAPLING), 0.1f)),
                            SAKURA_TREE.withWouldSurviveFilter(ModBlocks.SAKURA_SAPLING))));

    public static <FC extends FeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(OnryoAdditionsMod.MOD_ID, name), configuredFeature);
    }

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + OnryoAdditionsMod.MOD_ID);
    }
}
