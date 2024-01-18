package io.github.techtastic.vs_addon_template.forge

import net.minecraftforge.eventbus.api.IEventBus
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent
import io.github.techtastic.vs_addon_template.VSAddonTemplateMod
import io.github.techtastic.vs_addon_template.VSAddonTemplateMod.init
import io.github.techtastic.vs_addon_template.VSAddonTemplateMod.initClient
import thedarkcolour.kotlinforforge.forge.MOD_BUS

@Mod(VSAddonTemplateMod.MOD_ID)
class VSAddonTemplateModForge {
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
