package com.xm666.rewindcompatibilityplus;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(RewindCompatibility.MODID)
public class RewindCompatibility {
    public static final String MODID = "rewindcompatibilityplus";
    public static final Logger LOGGER = LogUtils.getLogger();

    public RewindCompatibility(IEventBus modEventBus, ModContainer modContainer) {
    }
}
