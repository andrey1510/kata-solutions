package streamsAndLambdas.streamsTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import streamsAndLambdas.streams.PrimeNumbersSum;

public class PrimeNumbersSumTests {

    @Test
    public void testSummarizePrimes() {
        Assertions.assertEquals(3167, PrimeNumbersSum.summarizePrimes(100, 200));
    }

    @Test
    public void testSummarizePrimesV2() {
        Assertions.assertEquals(3167, PrimeNumbersSum.summarizePrimesV2(100, 200));
    }

    @Test
    public void testFindLargestPrimeFactorOfNumber() {
        Assertions.assertEquals(11, PrimeNumbersSum.findLargestPrimeFactorOfNumber(176));
    }
}
