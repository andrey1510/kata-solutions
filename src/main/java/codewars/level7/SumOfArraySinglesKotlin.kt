package codewars.level7

// https://www.codewars.com/kata/59f11118a5e129e591000134/train/kotlin

class SumOfArraySinglesKotlin {

    companion object{
        @JvmStatic
        fun repeats(arr: IntArray): Int {
            return arr.filter { arr.count {e -> e == it} == 1 }.sum()
        }

    }


}