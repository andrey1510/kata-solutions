package streamsAndLambdas.streams;

import java.util.List;

public class SumOfOddsEvens {

    public static int sumEvens(List<Integer> numbers) {
        return numbers.stream()
                .filter(e -> e%2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static int sumOdds(List<Integer> numbers) {
        return numbers.stream()
                .filter(e -> e%2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

}

