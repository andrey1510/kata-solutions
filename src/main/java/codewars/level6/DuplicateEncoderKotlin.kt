package codewars.level6

class DuplicateEncoderKotlin {
    companion object {
        @JvmStatic
        fun encode(word: String): String {
            val sb = StringBuilder()
            val lowerCaseWord = word.lowercase()

            for (letter in lowerCaseWord) {
                if (lowerCaseWord.count { it == letter } == 1) sb.append("(");
                else sb.append(")");
            }
            return sb.toString()
        }
    }
}