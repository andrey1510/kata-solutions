package codewars.level6;

// https://www.codewars.com/kata/54b42f9314d9229fd6000d9c

public class DuplicateEncoder {
    public static String encode(String word) {

        StringBuilder sb = new StringBuilder();
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {

            char letter = word.charAt(i);

            if (word.indexOf(letter) == word.lastIndexOf(letter)) {
                sb.append("(");
            } else {
                sb.append(")");
            }
        }

        return sb.toString();
    }
}
