package net.onryo.additions.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static FoodComponent STRAWBERRIES = new FoodComponent.Builder().hunger(2).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 200), 1f).saturationModifier(.3f).build();
    public static FoodComponent BLUEBERRIES = new FoodComponent.Builder().hunger(2).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 200), 1f).saturationModifier(.3f).build();
}
