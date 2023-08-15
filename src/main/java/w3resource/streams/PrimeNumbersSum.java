package w3resource.streams;

import java.util.stream.IntStream;

public class PrimeNumbersSum {

    public static int summarizePrimes(int startRange, int endRange) {
        return IntStream.rangeClosed(startRange, endRange)
                .filter(PrimeNumbersSum::checkPrimes)
                .sum();
    }

    public static boolean checkPrimes(int number) {
        return IntStream.range(2, number)
                .noneMatch(e -> number%e == 0);
    }

    ////////////////////////////////////

    public static int summarizePrimesV2(int startRange, int endRange) {     // inlined variant
        return IntStream.rangeClosed(startRange, endRange)
                .filter(number -> IntStream.range(2, number)
                        .noneMatch(e -> number%e == 0))
                .sum();
    }

    /////////////////////////////////

    public static int findLargestPrimeFactorOfNumber(int number) {
        return IntStream.range(2, number)
                .boxed()
                .filter(e -> number%e == 0)
                .max(Integer::compareTo)
                .orElse(0);
    }

}



