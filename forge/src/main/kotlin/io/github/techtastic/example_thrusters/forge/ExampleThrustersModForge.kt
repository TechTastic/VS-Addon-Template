package io.github.techtastic.example_thrusters.forge

import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import io.github.techtastic.example_thrusters.ExampleThrustersMod
import io.github.techtastic.example_thrusters.ExampleThrustersMod.init
import io.github.techtastic.example_thrusters.ExampleThrustersMod.initClient
import thedarkcolour.kotlinforforge.forge.MOD_BUS

@Mod(ExampleThrustersMod.MOD_ID)
class ExampleThrustersModForge {
    init {
        MOD_BUS.addListener { event: FMLClientSetupEvent? ->
            clientSetup(
                event
            )
        }
        init()
    }

    private fun clientSetup(event: FMLClientSetupEvent?) {
        initClient()
    }

    companion object {
        fun getModBus(): IEventBus = MOD_BUS
    }
}
