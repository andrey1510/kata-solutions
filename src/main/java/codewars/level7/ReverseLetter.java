// https://www.codewars.com/kata/58b8c94b7df3f116eb00005b

package codewars.level7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseLetter {
    public static String reverseLetter(final String str) {
        return Arrays.stream(String.valueOf(new StringBuilder(str).reverse()).split(""))
                .filter(e  -> String.valueOf(e).matches("[a-z]"))
                .collect(Collectors.joining(""));
    }
}
