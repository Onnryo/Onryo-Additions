package net.onryo.additions.world.feature;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.onryo.additions.OnryoAdditionsMod;


public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> SAKURA_PLACED_KEY = registerKey("sakura_placed");

    public static final PlacedFeature SAKURA_PLACED = registerPlacedFeatures("sakura_placed",
            ModConfiguredFeatures.SAKURA_TREE_RANDOM.withPlacement(VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(0, 0.01f, 1))));

    private static PlacedFeature registerPlacedFeatures(String name, PlacedFeature placedFeature) {
        return Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(OnryoAdditionsMod.MOD_ID, name), placedFeature);
    }

    private static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(OnryoAdditionsMod.MOD_ID, name));
    }
}
