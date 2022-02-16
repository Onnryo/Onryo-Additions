package net.onryo.additions.statuseffects.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.LiteralText;
import net.minecraft.text.TranslatableText;
import net.onryo.additions.entity.damage.ModDamageSource;
import net.onryo.additions.sound.ModSounds;
import net.onryo.additions.statuseffects.ModStatusEffects;

public class PickleStatusEffect extends StatusEffect {
    private int count = 0;
    public PickleStatusEffect() {
        super(StatusEffectCategory.NEUTRAL, 0x98D982);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) { return true; }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;
            if (player.getEntityName().contains("Playera")) {
                if (count == 0)
                    player.world.playSound(null, player.getBlockPos(), ModSounds.VOMIT, SoundCategory.PLAYERS, 1f, 1f);
                else if (count == 20) {
                    player.removeStatusEffect(new StatusEffectInstance(ModStatusEffects.PICKLE).getEffectType());
                    player.damage(new ModDamageSource("pickle"), 100f);
                    count = -1;
                }
                count++;
            }
        }
    }
}
