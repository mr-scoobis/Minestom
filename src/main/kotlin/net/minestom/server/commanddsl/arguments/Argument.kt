package net.minestom.server.commanddsl.arguments

import net.minestom.server.commanddsl.CommandSender

abstract class Argument<T> {
    var description: String = ""
    var autocomplete: Boolean = false

    abstract fun parse(input: String): T
    abstract fun suggest(sender: CommandSender, currentInput: String): List<String>
}