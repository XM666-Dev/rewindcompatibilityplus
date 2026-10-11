package com.xm666.rewindcompatibilityplus;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(RewindCompatibility.MODID)
public class RewindCompatibility {
    public static final String MODID = "rewindcompatibilityplus";
    public static final Logger LOGGER = LogUtils.getLogger();

    public RewindCompatibility(FMLJavaModLoadingContext context) {
        this(context.getModEventBus(), context.getContainer());
    }

    public RewindCompatibility(IEventBus modEventBus, ModContainer modContainer) {
    }
}
