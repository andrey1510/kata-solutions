package level7;

//https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

    // Variant 1

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) return null;    // phrase.equals("0")
        String[] arr = phrase.split(" ");
        StringBuilder result = new StringBuilder();
        for(String e:arr ){
            String capital = e.substring(0,1);
            String other = e.substring(1);
            result.append(capital.toUpperCase()).append(other).append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        return String.valueOf(result);
    }

    // Variant 2

    public String toJadenCase2(String phrase2) {
        try {
            return Arrays.stream(phrase2.split(" "))
                    .map(e -> e.substring(0, 1).toUpperCase() + e.substring(1))
                    .collect(Collectors.joining(" "));
        } catch (StringIndexOutOfBoundsException | NullPointerException e) {
            return null;
        }
    }
}
