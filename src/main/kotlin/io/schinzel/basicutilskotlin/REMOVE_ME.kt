package io.schinzel.basicutilskotlin

infix fun <T> Boolean.then(param: T): T? = if (this) param else null
infix fun <T> Boolean.q(param: T): T? = if (this) param else null

fun main(args: Array<String>) {
    val apa1 = (5>6) then "yes" ?: "no"
    val apa2 = (5>4) q "yes" ?: "no"
    println(apa2)
}