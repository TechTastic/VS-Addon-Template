package io.github.techtastic.valkyrien_piggies.forge

import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import io.github.techtastic.valkyrien_piggies.ValkyrienPiggiesMod
import io.github.techtastic.valkyrien_piggies.ValkyrienPiggiesMod.init
import io.github.techtastic.valkyrien_piggies.ValkyrienPiggiesMod.initClient
import thedarkcolour.kotlinforforge.forge.MOD_BUS

@Mod(ValkyrienPiggiesMod.MOD_ID)
class ValkyrienPiggiesModForge {
    init {
        // Submit our event bus to let architectury register our content on the right time
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
