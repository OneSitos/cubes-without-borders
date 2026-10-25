package dev.kirant.cwb;

import net.minecraft.client.Minecraft;

public interface FullscreenManager {
    static FullscreenManager getInstance() {
        //~ if >=1.15 '.window' -> '.getWindow()'
        return (FullscreenManager)(Object)Minecraft.getInstance().getWindow();
    }

    FullscreenMode getFullscreenMode();

    void setFullscreenMode(FullscreenMode fullscreenMode);

    default void refreshFullscreenMode() {
        FullscreenMode mode = this.getFullscreenMode();
        if (mode != FullscreenMode.OFF) {
            this.setFullscreenMode(FullscreenMode.OFF);
            this.setFullscreenMode(mode);
        }
    }
}
