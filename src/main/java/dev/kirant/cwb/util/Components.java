package dev.kirant.cwb.util;

import net.minecraft.network.chat.Component;

public final class Components {
    public static Component translatable(String key) {
        //~ if >=1.19 'new net.minecraft.network.chat.TranslatableComponent' -> 'Component.translatable'
        return Component.translatable(key);
    }

    public static Component literal(String value) {
        //~ if >=1.19 'new net.minecraft.network.chat.TextComponent' -> 'Component.literal'
        return Component.literal(value);
    }

    private Components() { }
}
