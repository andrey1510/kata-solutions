package codewars.level7;

//https://www.codewars.com/kata/559590633066759614000063/java

import java.util.Arrays;

public class MinMax {
    public static int[] minMax(int[] arr) {
        int min = Arrays.stream(arr).min().orElse(0);
        int max = Arrays.stream(arr).max().orElse(0);
        return new int[] {min, max};
    }
}

