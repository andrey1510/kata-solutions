package codewars.testsLevel6

import codewars.level6.FindUniqueKotlin
import junit.framework.TestCase.assertEquals
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FindUniqueKotlinTests {

    private val precision = 0.0000000000001

    @Test
    fun findUniqTest() {
        Assertions.assertEquals(1.0, FindUniqueKotlin.findUniq(doubleArrayOf(0.0, 1.0, 0.0)), precision)
        Assertions.assertEquals(2.0, FindUniqueKotlin.findUniq(doubleArrayOf(1.0, 1.0, 1.0, 2.0, 1.0, 1.0)), precision)
    }


}