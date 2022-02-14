package net.onryo.additions.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.onryo.additions.statuseffects.ModStatusEffects;

public class ModFoodComponents {
    public static FoodComponent STRAWBERRIES = new FoodComponent.Builder().hunger(2).statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 200), 1f).saturationModifier(.3f).build();
    public static FoodComponent BLUEBERRIES = new FoodComponent.Builder().hunger(2).statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 200), 1f).saturationModifier(.3f).build();
    public static FoodComponent CUCUMBERS = new FoodComponent.Builder().hunger(3).saturationModifier(.2f).build();
    public static FoodComponent PICKLES = new FoodComponent.Builder().hunger(5).statusEffect(new StatusEffectInstance(ModStatusEffects.PICKLE, 200), 1f).saturationModifier(.4f).build();
}
