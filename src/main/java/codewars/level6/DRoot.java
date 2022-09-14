package codewars.level6;

//https://www.codewars.com/kata/541c8630095125aba6000c00/train/java

import java.util.Arrays;
import java.util.stream.IntStream;

public class DRoot {
    public static int digital_root(int n) {
        int i = n;
        while (i > 9) {
            String s = String.valueOf(i);
            i = IntStream.of(Arrays.stream(s.split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray())
                    .sum();
        }
        return i;
    }
}
