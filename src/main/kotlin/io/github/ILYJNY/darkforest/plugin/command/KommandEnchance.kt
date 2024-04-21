package io.github.ILYJNY.darkforest.plugin.command

import io.github.ILYJNY.darkforest.plugin.SamplePlugin
import io.github.monun.kommand.PluginKommand
import net.kyori.adventure.text.Component.text
import org.bukkit.plugin.PluginManager
import io.github.monun.invfx.InvFX
import kotlin.properties.ReadOnlyProperty
import io.github.monun.kommand.getValue

object KommandEnchance {
    private lateinit var plugin: SamplePlugin
    private lateinit var manager: PluginManager
    fun register(
        plugin: SamplePlugin,
        manager: PluginManager,
        kommand: PluginKommand,
        //it: ReadOnlyProperty<Nothing?, Int>
    ) {
        this.plugin = plugin
        this.manager = manager

        kommand.register("darkforest", "df") {
            requires { isPlayer }

            executes {
                sender.sendMessage(text("hi!"))
            }
            then("enchance") {
                InvFX.frame(5, text("강화하기")) {

                }
                then("enchancenum" to int()) {
                    requires { isOp }
                    val enchancenum: Int

                }

            }
            then("enchant") {

            }
        }
    }
}