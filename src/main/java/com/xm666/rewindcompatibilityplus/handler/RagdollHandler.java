package com.xm666.rewindcompatibilityplus.handler;

import com.raiiiden.ragdollified.client.ClientRagdollManager;

public class RagdollHandler {
    public static void clear() {
        ClientRagdollManager.onWorldUnload();
    }
}
