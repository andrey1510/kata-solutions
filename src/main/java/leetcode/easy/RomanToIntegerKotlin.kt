package leetcode.easy

class RomanToIntegerKotlin {
    fun romanToInt(s: String): Int {

        if (s.isEmpty()) return 0

        val dictionary: Map<Char, Int> = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000,
        )

        var result = dictionary[s.last()] ?: 0

        for (i in s.length-2 downTo 0) {
            val current = dictionary[s[i]] ?: 0
            val next = dictionary[s[i + 1]] ?: 0
            if (current < next) result -= current
            else result += current
        }

        return result
    }

}

