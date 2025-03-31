package net.minestom.server.commanddsl

import net.minestom.server.commanddsl.arguments.Arguments

class CommandBuilder<A: Arguments>(private val arguments: A) {
    lateinit var name: String
    lateinit var aliases: String
    lateinit var description: String

    fun execute(block: A.(CommandSender) -> Unit) {
        TODO()
    }

    fun build() = Command()
}