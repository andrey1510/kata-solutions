package codewars.level7

class DontGiveMeFiveKotlin {
    companion object {
        fun dontGiveMeFive2(start: Int, end: Int): Int {
            return (start..end).count { !it.toString().contains("5") }
        }
    }
}