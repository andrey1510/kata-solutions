package codewars.level7

// https://www.codewars.com/kata/54ba84be607a92aa900000f1

class IsogramKotlin {

    companion object {
        @JvmStatic
        fun isIsogram(str: String): Boolean {
            return str.length.toLong() == str.lowercase().chars().distinct().count()
        }
    }

}