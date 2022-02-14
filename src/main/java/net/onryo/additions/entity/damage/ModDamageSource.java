package net.onryo.additions.entity.damage;

import net.minecraft.entity.damage.DamageSource;

public class ModDamageSource extends DamageSource {

    public ModDamageSource(String name) {
        super(name);
    }

    public static final ModDamageSource PICKLE = (ModDamageSource) (new ModDamageSource("pickle")).setBypassesArmor();
}
