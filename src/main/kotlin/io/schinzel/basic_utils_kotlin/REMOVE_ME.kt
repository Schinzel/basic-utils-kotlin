package io.schinzel.basic_utils_kotlin

private infix fun <T> Boolean.then(param: T): T? = if (this) param else null
private infix fun <T> Boolean.q(param: T): T? = if (this) param else null
private infix fun <T> Boolean.t(param: T): T? = if (this) param else null
private infix fun <T> Boolean.l(param: T): T? = if (this) param else null
private infix fun <T> Boolean.I(param: T): T? = if (this) param else null

fun main(args: Array<String>) {
    val apa1 = (5 > 6) then "yes" ?: "no"
    val apa2 = (5 < 4) q "yes" ?: "no"
    val apa3 = (5 < 4) l "yes" ?: "no"
    val apa4 = (5 < 4) t "yes" ?: "no"
    val apa5 = (5 < 4) I "yes" ?: "no"
    val apa = if (5 < 4) "yes" else "no"

    println(apa2)
}

fun I(){

}

