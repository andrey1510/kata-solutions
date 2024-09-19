package codewars.level7

class LineNumberingKotlin {

    companion object{
        @JvmStatic
        fun number(lines: List<String>): List<String> {
            return lines.mapIndexed { index, value -> "${index + 1}: $value" }
        }
    }
}