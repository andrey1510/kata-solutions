package codewars.level7

class GetMiddleKotlin {
    companion object {
        @JvmStatic
        fun getMiddle(word: String): String {
            val length = word.length
            return when {
                length == 1 -> word
                length % 2 != 0 -> word[length / 2].toString()
                else -> word[(length / 2) - 1].toString() + word[length / 2]
            }
        }
    }
}