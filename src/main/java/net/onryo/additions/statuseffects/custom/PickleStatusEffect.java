package net.onryo.additions.statuseffects.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import net.onryo.additions.entity.damage.ModDamageSource;

public class PickleStatusEffect extends StatusEffect {
    public PickleStatusEffect() {
        super(StatusEffectCategory.NEUTRAL, 0x98D982);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;
            if (player.getEntityName().contains("Player")) {
                player.damage(new ModDamageSource("pickle"), 100f);
            }
        }
    }
}
