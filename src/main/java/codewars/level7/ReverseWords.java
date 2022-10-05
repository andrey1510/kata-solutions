package codewars.level7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static String reverseWords(final String original) {
        if (original.trim().isEmpty()) {
            return original;
        } else {
            return Arrays.stream(original.split(" "))
                    .map(e -> new StringBuilder(e).reverse())
                    .collect(Collectors.joining(" "));
        }
    }
}
