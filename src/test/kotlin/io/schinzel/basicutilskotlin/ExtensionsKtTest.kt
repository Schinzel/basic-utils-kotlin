package io.schinzel.basicutilskotlin

import io.schinzel.basicutils.RandomUtil
import org.assertj.core.api.Assertions.*

import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream


/**
 * @author Schinzel
 */
class ExtensionsKtTest {

    @Test
    fun println_randomString_RandomStringAppearsInStandardOut() {
        val outContent = ByteArrayOutputStream()
        val originalOut = System.out
        System.setOut(PrintStream(outContent))
        val randomString = RandomUtil.getRandomString(10)
        randomString.println()
        val output = outContent.toString("UTF-8")
        assertThat(output)
                .isEqualTo(randomString + System.getProperty("line.separator"))
        System.setOut(originalOut)
    }


    @Test
    fun print_randomString_RandomStringAppearsInStandardOut() {
        val outContent = ByteArrayOutputStream()
        val originalOut = System.out
        System.setOut(PrintStream(outContent))
        val randomString = RandomUtil.getRandomString(10)
        randomString.print()
        val output = outContent.toString("UTF-8")
        assertThat(output).isEqualTo(randomString)
        System.setOut(originalOut)
    }


    @Test
    fun equalsIgnoreCase_DifferentString_false() {
        val result: Boolean = "any_string".equalsIgnoreCase("other_string")
        assertThat(result).isFalse()
    }


    @Test
    fun equalsIgnoreCase_SameStringDifferentCase_true() {
        val result: Boolean = "any_string".equalsIgnoreCase("ANY_STRING")
        assertThat(result).isTrue()
    }

}