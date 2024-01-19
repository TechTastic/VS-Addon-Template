package io.github.techtastic.example_thrusters.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import io.github.techtastic.example_thrusters.ExampleThrustersMod;
import org.valkyrienskies.mod.fabric.common.ValkyrienSkiesModFabric;

public class ExampleThrustersModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // force VS2 to load before eureka
        new ValkyrienSkiesModFabric().onInitialize();

        ExampleThrustersMod.init();
    }

    @Environment(EnvType.CLIENT)
    public static class Client implements ClientModInitializer {

        @Override
        public void onInitializeClient() {
            ExampleThrustersMod.initClient();
        }
    }
}
