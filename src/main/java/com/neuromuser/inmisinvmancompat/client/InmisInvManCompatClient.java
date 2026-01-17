package com.neuromuser.inmisinvmancompat.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class InmisInvManCompatClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenDetectionHandler.register();
    }
}