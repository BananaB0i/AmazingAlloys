package me.bananab0i.amazingalloys.registry;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class AlloySounds {
    public static final Identifier TITANIUM_SOUND_ID = new Identifier("amazingalloys:titanium_armor_equipped");
    public static final SoundEvent TITANIUM_EQUIPPED = new SoundEvent(TITANIUM_SOUND_ID);
    public static final Identifier ENDERITE_SOUND_ID = new Identifier("amazingalloys:enderite_armor_equipped");
    public static final SoundEvent ENDERITE_EQUIPPED = new SoundEvent(ENDERITE_SOUND_ID);

    public static void registerSounds() {
        Registry.register(Registry.SOUND_EVENT, ENDERITE_SOUND_ID, ENDERITE_EQUIPPED);
        Registry.register(Registry.SOUND_EVENT, TITANIUM_SOUND_ID, TITANIUM_EQUIPPED);
    }
}
