package codewars.level6


class FindOutlierKotlin {

    private fun evenOrOdd(number: Int): Boolean {
        return number % 2 == 0
    }

    fun find(integers: Array<Int>): Int {
        val evenArr = (evenOrOdd(integers[0]) && evenOrOdd(integers[1]))
                || (evenOrOdd(integers[1]) && evenOrOdd(integers[2]))

        var outlier = 0

        if (evenArr) {
            for (integer in integers) {
                if (!evenOrOdd(integer)) outlier = integer
            }
        } else {
            for (integer in integers) {
                if (evenOrOdd(integer)) outlier = integer
            }
        }

        return outlier
    }

    fun find2(integers: Array<Int>): Int {
        val isFirstEven = evenOrOdd(integers[0])
        val isSecondEven = evenOrOdd(integers[1])
        val isThirdEven = evenOrOdd(integers[2])
        val isMajorityEven = (isFirstEven && isSecondEven) || (isSecondEven && isThirdEven)
        return integers.first { evenOrOdd(it) != isMajorityEven }
    }

}