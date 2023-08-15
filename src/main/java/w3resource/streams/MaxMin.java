package w3resource.streams;

import java.util.List;

public class MaxMin {

    public static int getMax(List<Integer> numbers) {
        return numbers.stream()
                .max(Integer::compareTo)
                .orElse(0);
    }

    public static int getMin(List<Integer> numbers) {
        return numbers.stream()
                .reduce(Integer::min)
                .orElse(0);
    }
}

