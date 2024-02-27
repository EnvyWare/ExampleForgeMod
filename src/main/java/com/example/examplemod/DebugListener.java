package com.example.examplemod;

import net.minecraft.network.chat.Component;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ExampleMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class DebugListener {

    @SubscribeEvent
    public static void onPlayerJoin(PlayerEvent.PlayerLoggedInEvent event) {
        var registry = event.getEntity().level().registryAccess().registryOrThrow(ExampleRegistryCreation.EXAMPLE_REGISTRY);

        event.getEntity().sendSystemMessage(Component.literal("Registry Size: " + registry.size()));

        for (var entry : registry.entrySet()) {
            event.getEntity().sendSystemMessage(Component.literal(entry.getKey().toString() + " -> " + entry.getValue().toString()));
        }
    }
}
