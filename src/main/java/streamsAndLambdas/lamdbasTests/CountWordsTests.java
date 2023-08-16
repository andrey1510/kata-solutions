package streamsAndLambdas.lamdbasTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import streamsAndLambdas.lambdas.CountWords;

public class CountWordsTests {

    @Test
    public void testSummarizeInts() {
        Assertions.assertEquals(3, CountWords.countW("one two three"));
    }
}
