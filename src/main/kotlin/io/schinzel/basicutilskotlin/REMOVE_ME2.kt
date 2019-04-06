package io.schinzel.basicutilskotlin

import com.google.common.base.CaseFormat
import java.lang.RuntimeException
import java.util.*

enum class MyEnum { ONE_THING, OTHER_THING }

fun String.bapp(): String {
    return "$this bapp"
}


fun <T : Enum<T>> T.asLowerCaseString(): String =
        this.name.toLowerCase(Locale.US)


fun <T : Enum<T>> T.asCamelCaseString(): String =
        CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, this.name) ?: throw RuntimeException()

/*
fun <T> Enum.getSomething(): T{

}*/

fun main() {

    MyEnum.ONE_THING.asLowerCaseString().println()
    MyEnum.ONE_THING.asCamelCaseString().println()
}