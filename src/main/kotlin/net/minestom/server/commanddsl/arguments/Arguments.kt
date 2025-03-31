package net.minestom.server.commanddsl.arguments

import net.minestom.server.commanddsl.CommandContext

abstract class Arguments {
    lateinit var context: CommandContext
}