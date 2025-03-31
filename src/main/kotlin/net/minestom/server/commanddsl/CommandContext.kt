package net.minestom.server.commanddsl

data class CommandContext(val context: HashMap<String, Any>) {

    fun <T> get(key: String) =
        context[key] as T

}