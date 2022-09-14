package codewars.level7;

//https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java

import java.util.Arrays;

public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        int[] arrNumbers = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int min = Arrays.stream(arrNumbers).min().orElse(0);
        int max = Arrays.stream(arrNumbers).max().orElse(0);
        return (max + " " + min);
    }
}
