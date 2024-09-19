package codewars.level7

class SpoonerKotlin {

    fun spoonerize(words: String): String {
        val wordsList = words.split(" ")
        return if (wordsList.size < 2) {
            words // Return original if less than 2 words
        } else {
            // Swap the first letters of the first two words
            val firstWord = wordsList[0]
            val secondWord = wordsList[1]
            "${secondWord[0]}${firstWord.substring(1)} ${firstWord[0]}${secondWord.substring(1)}" +
                    wordsList.drop(2).joinToString(" ")
        }
    }

}