package codewars.level6;

//https://www.codewars.com/kata/587731fda577b3d1b0001196

import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCaseMethod {

    public static String camelCase(String str) {
        StringBuilder sb = new StringBuilder();
        boolean camelNextLetter = true;

        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                camelNextLetter = true;
            } else if (camelNextLetter) {
                sb.append(Character.toUpperCase(c));
                camelNextLetter = false;
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }

        return sb.toString();
    }

    /// Community variant

    public static String camelCase2(String str) {
        return Arrays.stream(str.split(" "))
                .filter(s -> !s.isEmpty())
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase())
                .collect(Collectors.joining());
    }
}

