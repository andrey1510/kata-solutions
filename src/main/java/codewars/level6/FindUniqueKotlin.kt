package codewars.level6

class FindUniqueKotlin {

    companion object {
        @JvmStatic
        fun findUniq(arr: DoubleArray): Double {
            return arr.asList()
                .groupBy { it }
                .filter { it.value.size == 1 }
                .keys
                .firstOrNull() ?: 0.0
        }
    }

}

