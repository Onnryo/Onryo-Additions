package net.onryo.additions.statuseffects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.onryo.additions.OnryoAdditionsMod;
import net.onryo.additions.statuseffects.custom.PickleStatusEffect;

public class ModStatusEffects {
    public static final StatusEffect PICKLE = registerStatusEffect("pickle", new PickleStatusEffect());

    private static StatusEffect registerStatusEffect(String name, StatusEffect effect) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(OnryoAdditionsMod.MOD_ID, name), effect);
    }

    public static void registerModStatusEffects() {
        System.out.println("Registering Mod Status Effects for " + OnryoAdditionsMod.MOD_ID);
    }
}
