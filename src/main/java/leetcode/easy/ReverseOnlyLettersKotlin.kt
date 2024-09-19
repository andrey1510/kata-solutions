package leetcode.easy

class ReverseOnlyLettersKotlin {
    fun reverseOnlyLetters(s: String): String {
        val chars = s.toCharArray()
        var left = 0
        var right = chars.size - 1

        while (left < right) {
            if (!chars[left].isLetter()) left++
            else if (!chars[right].isLetter()) right--
            else {
                val temp = chars[left]
                chars[left] = chars[right]
                chars[right] = temp
                left++
                right--
            }
        }
        return String(chars)
    }
}