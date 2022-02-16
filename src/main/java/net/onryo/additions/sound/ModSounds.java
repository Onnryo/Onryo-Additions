package net.onryo.additions.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.onryo.additions.OnryoAdditionsMod;

public class ModSounds {
    public static SoundEvent VOMIT = registerSoundEvent("vomit");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(OnryoAdditionsMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
