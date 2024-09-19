package codewars.level7

class MinMaxKotlin {
    companion object {
        @JvmStatic
        fun minMax(arr: IntArray): IntArray {
            val min = arr.minOrNull() ?: 0
            val max = arr.maxOrNull() ?: 0
            return intArrayOf(min, max)
        }
    }
}