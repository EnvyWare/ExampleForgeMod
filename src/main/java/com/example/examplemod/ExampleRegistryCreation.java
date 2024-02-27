package com.example.examplemod;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DataPackRegistryEvent;

@Mod.EventBusSubscriber(modid = ExampleMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExampleRegistryCreation {

    public static final ResourceKey<Registry<ExampleClass>> EXAMPLE_REGISTRY = ResourceKey.createRegistryKey(new ResourceLocation(ExampleMod.MODID + ":example"));

    @SubscribeEvent
    public static void onDatapackRegistry(DataPackRegistryEvent.NewRegistry event) {
        event.dataPackRegistry(EXAMPLE_REGISTRY, ExampleClass.CODEC, ExampleClass.CODEC);
    }
}
