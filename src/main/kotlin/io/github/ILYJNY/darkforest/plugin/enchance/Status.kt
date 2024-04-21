package io.github.ILYJNY.darkforest.plugin.enchance

import net.kyori.adventure.text.Component.text
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.Material


object Status {
    val Enchancenone= "☆☆☆☆☆☆☆☆☆☆"
    val Enchance1 = "★☆☆☆☆☆☆☆☆☆"
    val Enchance2 = "★★☆☆☆☆☆☆☆☆"
    val Enchance3 = "★★★☆☆☆☆☆☆☆"
    val Enchance4 = "★★★★☆☆☆☆☆☆"
    val Enchance5 = "★★★★★☆☆☆☆☆"
    val Enchance6 = "★★★★★★☆☆☆☆"
    val Enchance7 = "★★★★★★★☆☆☆"
    val Enchance8 = "★★★★★★★★☆☆"
    val Enchance9 = "★★★★★★★★★☆"
    val EnchanceMax = "★★★★★★★★★★"

    val StringStarlist = listOf(Enchancenone, Enchance1, Enchance2, Enchance3, Enchance4, Enchance5, Enchance6, Enchance7, Enchance8, Enchance9,
        EnchanceMax)
    var ItemEnchance: Int = 0

    var now_showingText = text().content(StringStarlist[ItemEnchance]).decoration(TextDecoration.ITALIC, false).decorate(TextDecoration.BOLD)
    .color(NamedTextColor.YELLOW)

}