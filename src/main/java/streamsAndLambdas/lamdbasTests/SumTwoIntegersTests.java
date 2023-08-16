package streamsAndLambdas.lamdbasTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import streamsAndLambdas.lambdas.SumTwoIntegers;

public class SumTwoIntegersTests {

    @Test
    public void testSummarizeInts() {
        Assertions.assertEquals(3, SumTwoIntegers.summarizeInts(1, 2));
    }

}
