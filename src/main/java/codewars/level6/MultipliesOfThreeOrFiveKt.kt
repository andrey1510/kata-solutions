package codewars.level6

// https://www.codewars.com/kata/514b92a657cdc65150000006

class MultipliesOfThreeOrFiveKt {
    fun solution(number: Int) = (1 until number).filter { it % 3 == 0 || it % 5 == 0 }.sum()
}

