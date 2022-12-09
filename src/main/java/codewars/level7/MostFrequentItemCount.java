// https://www.codewars.com/kata/56582133c932d8239900002e

package codewars.level7;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentItemCount {
    public static int mostFrequentItemCount(int[] collection) {
        return Arrays.stream(collection)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .mapToInt(Math::toIntExact)
                .max().orElse(0);
    }

}

