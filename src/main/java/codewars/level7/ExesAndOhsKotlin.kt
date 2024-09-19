package codewars.level7

class ExesAndOhsKotlin {

    companion object {
        fun getXO(str: String): Boolean {
            val countX = str.lowercase().chars().filter { x -> x.toChar() == 'x' }.count()
            val countO = str.lowercase().chars().filter { o -> o.toChar() == 'o' }.count()
            return countO == countX
        }
    }

}