package codewars.level6;

import static java.util.Arrays.stream;

// https://www.codewars.com/kata/54da5a58ea159efa38000836

public class FindOdd {

    public static int findIt(int[] a) {

        int result = 0;

        for (int j : a) {
            result ^= j;
        }

        return result;

    }

    /////////////////////// community variant //////////////


    public static int findIt2(int[] arr) {
        return stream(arr).reduce(0, (x, y) -> x ^ y);
    }

}
