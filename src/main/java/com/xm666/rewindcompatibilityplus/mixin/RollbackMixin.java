package com.xm666.rewindcompatibilityplus.mixin;

import cc.sighs.rewind.common.spi.RollbackOutcome;
import cc.sighs.rewind.server.NeoForgeRewindPlatform;
import com.xm666.rewindcompatibilityplus.handler.ParticleHandler;
import com.xm666.rewindcompatibilityplus.handler.RagdollHandler;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.fml.ModList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.nio.file.Path;

@OnlyIn(Dist.CLIENT)
public class RollbackMixin {
    @Mixin(NeoForgeRewindPlatform.class)
    private static abstract class NeoForgeRewindPlatformMixin {
        @Shadow
        public abstract boolean isDedicatedServer(Object server);

        @Inject(method = "rollbackInPlace", at = @At("TAIL"))
        private void onRollbackInPlace(Object server, Path worldRoot, String slot, CallbackInfoReturnable<RollbackOutcome> cir) {
            if (isDedicatedServer(server)) return;

            ParticleHandler.clear();
            if (!ModList.get().isLoaded("ragdollified")) return;

            RagdollHandler.clear();
        }
    }
}
