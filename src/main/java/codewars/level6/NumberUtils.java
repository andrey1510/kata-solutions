package codewars.level6;

// https://www.codewars.com/kata/5287e858c6b5a9678200083c

import java.util.Arrays;

public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        return number == (int) Arrays.stream(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .mapToDouble(e -> Math.pow(e, String.valueOf(number).length()))
                .sum();
    }

}
