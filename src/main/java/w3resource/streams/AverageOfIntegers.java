package w3resource.streams;

import java.util.List;

public class AverageOfIntegers {

    public static double getAverage(List<Integer> numbers) {
        return numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.00);
    }



}

