package codewars.level7;

import java.util.Arrays;

public class OddOrEven {
    public static String oddOrEven (int[] array) {
        return (Arrays.stream(array)
                .reduce(0, Integer::sum) %2 == 0) ? "even" : "odd";
    }
}
