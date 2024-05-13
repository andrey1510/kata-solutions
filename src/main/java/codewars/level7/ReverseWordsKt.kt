package codewars.level7

import java.util.*
import java.util.stream.Collectors

class ReverseWordsKt {


    companion object {
        @JvmStatic
        fun reverseWords(original: String): String? {
            return if (original.trim { it <= ' ' }.isEmpty()) {
                original
            } else {
                Arrays.stream(original.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray())
                    .map { e: String? ->
                        StringBuilder(
                            e
                        ).reverse()
                    }
                    .collect(Collectors.joining(" "))
            }
        }
    }




}