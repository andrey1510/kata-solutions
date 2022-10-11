//https://www.codewars.com/kata/57cc981a58da9e302a000214

package codewars.level7;

import java.util.Arrays;

public class SmallEnough {
    public static boolean smallEnough(int[] a, int limit) {
        return Arrays.stream(a).noneMatch(e -> e > limit);
    }
}
