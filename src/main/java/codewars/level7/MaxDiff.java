package codewars.level7;

import static java.util.Arrays.stream;

public class MaxDiff {
    public static int maxDiff(int[] lst) {
        int min = stream(lst).min().orElse(0);
        int max = stream(lst).max().orElse(0);
        return max - min;
    }
}
