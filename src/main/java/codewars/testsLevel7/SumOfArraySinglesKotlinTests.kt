package codewars.testsLevel7

import codewars.level7.SumOfArraySinglesKotlin
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumOfArraySinglesKotlinTests {
    @Test
    fun basicTests() {
        assertEquals(15, SumOfArraySinglesKotlin.repeats(intArrayOf(4, 5, 7, 5, 4, 8)).toLong())
        assertEquals(19, SumOfArraySinglesKotlin.repeats(intArrayOf(9, 10, 19, 13, 19, 13)).toLong())
        assertEquals(12, SumOfArraySinglesKotlin.repeats(intArrayOf(16, 0, 11, 4, 8, 16, 0, 11)).toLong())
    }
}