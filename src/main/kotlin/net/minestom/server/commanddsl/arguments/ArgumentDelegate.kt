package net.minestom.server.commanddsl.arguments

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class ArgumentDelegate<T> : ReadOnlyProperty<Arguments, T> {

    override fun getValue(thisRef: Arguments, property: KProperty<*>) =
        thisRef.context.get<T>(property.name)

}