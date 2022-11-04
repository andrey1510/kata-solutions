// https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/

package codewars.level6;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        return (int) Arrays.stream(text.toLowerCase().split(""))
                .collect(Collectors.toList()).stream()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .values().stream()
                        .filter(e-> e > 1)
                        .count();
    }
}
