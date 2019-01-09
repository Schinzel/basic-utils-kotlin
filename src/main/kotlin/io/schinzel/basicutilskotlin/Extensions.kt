package io.schinzel.basicutilskotlin

import io.schinzel.basicutils.file.FileWriter


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


/**
 * Write this string to a file. If file exists it is overwritten.
 * @param fileName Name of the file to write to
 * @return This for chaining
 */
fun String.writeToFile(fileName: String): String {
    FileWriter
            .writer()
            .content(this)
            .fileName(fileName)
            .write()
    return this
}


/**
 * Append this string to a file. If no file exists, one is created.
 * @param fileName Name of the file to write to
 * @return This for chaining
 */
fun String.appendToFile(fileName: String): String {
    FileWriter
            .appender()
            .content(this)
            .fileName(fileName)
            .append()
    return this
}


/**
 * Writes this string to a temporary file that is deleted when
 * the JVM exits.
 * @param fileName Optional argument. Name of destination file
 * @return Name of the temp file
 */
fun String.writeToTempFile(fileName: String = ""): String =
        FileWriter
                .tempFileWriter()
                .content(this)
                .fileName(fileName)
                .write()
