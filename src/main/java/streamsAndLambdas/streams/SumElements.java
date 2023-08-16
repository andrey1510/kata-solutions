package streamsAndLambdas.streams;

import java.util.List;

public class SumElements {

    public static int summarize(List<Integer> numbers) {
        return numbers.stream()
                .reduce(Integer::sum)
                .orElse(0);
    }   //(a,b) -> a+b

    public static int multiply(List<Integer> numbers) {
        return numbers.stream()
                .reduce((a,b) -> a*b)
                .orElse(0);
    }

}

