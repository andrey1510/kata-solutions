// https://www.codewars.com/kata/56e9e4f516bcaa8d4f001763/

package codewars.level7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SequenceSum {
    public static String showSequence(int value){
        if (value == 0) {
            return "0=0";
        } else if (value < 0) {
            return value + "<0";
        }

        int sum = IntStream.range(Math.min(0, value), Math.max(0, value) + 1).sum();

        return IntStream.rangeClosed(0, value)
                .boxed()
                .collect(Collectors.toList()).stream()
                        .map(String::valueOf)       // alternative:   e -> String.valueOf(e)
                        .collect(Collectors.joining("+", "", " = ")) + sum;
    }
}
