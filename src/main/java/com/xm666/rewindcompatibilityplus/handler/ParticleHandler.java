package com.xm666.rewindcompatibilityplus.handler;

import net.minecraft.client.Minecraft;

public class ParticleHandler {
    public static void clear() {
        var mc = Minecraft.getInstance();
        mc.particleEngine.clearParticles();
    }
}
