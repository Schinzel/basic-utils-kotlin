package io.schinzel.basicutilskotlin

/**
 * Give all objects the function println so that println can be chained
 * Example "monkey".println()
 * @return This for chaining
 */
fun <R> R.println(): R = this.apply { println(this) }

/**
 * Give all objects the function print so that print can be chained
 * Example "monkey".print()
 * @return This for chaining
 */
fun <R> R.print(): R = this.apply { print(this) }


/**
 * @param other String to compare to this
 * @return True if this string matches case insensitive the argument string. Else false.
 */
fun String.equalsIgnoreCase(other: String): Boolean =
        this.equals(other, ignoreCase = true)
