package w3resource.lamdbasTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import w3resource.lambdas.SumTwoIntegers;

public class SumTwoIntegersTests {

    @Test
    public void testSummarizeInts() {
        Assertions.assertEquals(3, SumTwoIntegers.summarizeInts(1, 2));
    }

}
