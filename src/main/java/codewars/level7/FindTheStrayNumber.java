//https://www.codewars.com/kata/57f609022f4d534f05000024/

package codewars.level7;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheStrayNumber {

    static int stray(int[] numbers) {
        return Arrays.stream(numbers)
            .boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .filter(e -> e.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst()
            .orElse(0);
    }

    /////////////////// Community variant //////////////////

    static int stray2(int[] numbers) {
        return Arrays.stream(numbers)
                .reduce(0, (a, b) -> a ^ b);
    }
}
