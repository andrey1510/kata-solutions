package streamsAndLambdas.streams;

import java.util.Comparator;
import java.util.List;

public class SecondElement {

    public static int getSecondMin(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(0);
    }

    public static int getSecondMax(List<Integer> numbers) {
        return numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
    }

}

