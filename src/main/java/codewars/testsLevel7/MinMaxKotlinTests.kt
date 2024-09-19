package codewars.testsLevel7

import codewars.level7.MinMax
import codewars.level7.MinMaxKotlin
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test


class MinMaxKotlinTests {

    @Test
    fun minMaxTest() {
        assertArrayEquals(intArrayOf(1, 5), MinMaxKotlin.minMax(intArrayOf(1, 2, 3, 4, 5)))
        assertArrayEquals(intArrayOf(5, 2334454), MinMax.minMax(intArrayOf(2334454, 5)))
        assertArrayEquals(intArrayOf(1, 1), MinMax.minMax(intArrayOf(1)))
    }
}