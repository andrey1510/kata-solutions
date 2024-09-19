package codewars.level7

import java.util.*

class FormMinimumKotlin {

    companion object {
        fun minValue(values: IntArray): Int {
            return values.distinct()
                .sorted()
                .joinToString("") { it.toString() }
                .toInt()
        }

        fun minValue2(values: IntArray): Int {
            return values.distinct()
                .sorted()
                .fold(0) { acc, value -> acc * 10 + value }
        }
    }

}