package other;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ThreeFiveSequence {

    public static void generateNumbers(int min, int max, int acceptingDivisor, int rejectingDivisor, int sum) {
        List<Integer> numbers = IntStream.range(min, max).boxed()
                .filter(i -> ( (i % acceptingDivisor == 0) && (i % rejectingDivisor != 0) && checkSum(i, sum) ))
                .collect(Collectors.toList());
        System.out.println(numbers);
    }

    private static boolean checkSum(int number, int sum) {
        return Stream.of(String.valueOf(number).split(""))
                .mapToInt(Integer::valueOf)
                .sum() < sum;
    }

    public static void main(String[] args) {
        generateNumbers(0, 1000, 3, 5, 10);
    }
}
