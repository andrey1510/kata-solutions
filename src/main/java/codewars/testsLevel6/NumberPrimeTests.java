package codewars.testsLevel6;

import codewars.level6.NumberPrime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberPrimeTests {
    @Test
    public void test() {
        Assertions.assertTrue (NumberPrime.isPrime(2));
        Assertions.assertTrue (NumberPrime.isPrime(73));
        Assertions.assertFalse(NumberPrime.isPrime(75));
        Assertions.assertFalse(NumberPrime.isPrime(-1));
        Assertions.assertFalse(NumberPrime.isPrime(4));
        Assertions.assertFalse(NumberPrime.isPrime(6));
    }
}
