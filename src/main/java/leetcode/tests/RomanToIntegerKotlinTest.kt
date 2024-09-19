package leetcode.tests

import leetcode.easy.RomanToIntegerKotlin
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RomanToIntegerKotlinTest {

    private val romanConverter = RomanToIntegerKotlin()

    @Test
    fun testSingleRomanNumerals() {
        assertEquals(1, romanConverter.romanToInt("I"))
        assertEquals(5, romanConverter.romanToInt("V"))
        assertEquals(10, romanConverter.romanToInt("X"))
        assertEquals(50, romanConverter.romanToInt("L"))
        assertEquals(100, romanConverter.romanToInt("C"))
        assertEquals(500, romanConverter.romanToInt("D"))
        assertEquals(1000, romanConverter.romanToInt("M"))
    }

    @Test
    fun testSimpleCombinations() {
        assertEquals(2, romanConverter.romanToInt("II"))
        assertEquals(4, romanConverter.romanToInt("IV"))
        assertEquals(9, romanConverter.romanToInt("IX"))
        assertEquals(11, romanConverter.romanToInt("XI"))
        assertEquals(15, romanConverter.romanToInt("XV"))
        assertEquals(40, romanConverter.romanToInt("XL"))
        assertEquals(90, romanConverter.romanToInt("XC"))
        assertEquals(400, romanConverter.romanToInt("CD"))
        assertEquals(900, romanConverter.romanToInt("CM"))
    }

    @Test
    fun testComplexCombinations() {
        assertEquals(58, romanConverter.romanToInt("LVIII"))
        assertEquals(1994, romanConverter.romanToInt("MCMXCIV"))
        assertEquals(2023, romanConverter.romanToInt("MMXXIII"))
    }

    @Test
    fun testEmptyString() {
        assertEquals(0, romanConverter.romanToInt(""))
    }

}