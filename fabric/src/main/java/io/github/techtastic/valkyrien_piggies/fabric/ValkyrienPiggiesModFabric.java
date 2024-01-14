package io.github.techtastic.valkyrien_piggies.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import io.github.techtastic.valkyrien_piggies.ValkyrienPiggiesMod;
import org.valkyrienskies.mod.fabric.common.ValkyrienSkiesModFabric;

public class ValkyrienPiggiesModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // force VS2 to load before eureka
        new ValkyrienSkiesModFabric().onInitialize();

        ValkyrienPiggiesMod.init();
    }

    @Environment(EnvType.CLIENT)
    public static class Client implements ClientModInitializer {

        @Override
        public void onInitializeClient() {
            ValkyrienPiggiesMod.initClient();
        }
    }
}
