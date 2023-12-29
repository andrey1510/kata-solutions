package codewars.level6;

import java.util.stream.IntStream;

public class NumberPrime {

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        return IntStream.range(2, (int) Math.sqrt(num) + 1)
                .noneMatch(i -> num % i == 0);
    }

}
