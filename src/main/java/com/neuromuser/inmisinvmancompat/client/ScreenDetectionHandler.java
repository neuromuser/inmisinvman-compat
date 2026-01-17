package com.neuromuser.inmisinvmancompat.client;

import me.roundaround.inventorymanagement.client.InventoryButtonsManager;
import net.minecraft.screen.ScreenHandler;

public class ScreenDetectionHandler {
    public static void register() {
        try {
            Class<?> backpackScreenHandlerClass = Class.forName("draylar.inmis.ui.BackpackScreenHandler");

            if (ScreenHandler.class.isAssignableFrom(backpackScreenHandlerClass)) {
                @SuppressWarnings("unchecked")
                Class<? extends ScreenHandler> handlerClass =
                        (Class<? extends ScreenHandler>) backpackScreenHandlerClass;

                InventoryButtonsManager.INSTANCE.registerSimpleInventorySortableHandler(handlerClass);
                InventoryButtonsManager.INSTANCE.registerSimpleInventoryTransferableHandler(handlerClass);
            }
        } catch (ClassNotFoundException e) {
            // Inmis not installed - this is fine
        }
    }
}