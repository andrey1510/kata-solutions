package w3resource.lamdbasTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import w3resource.lambdas.CountWords;

public class CountWordsTests {

    @Test
    public void testSummarizeInts() {
        Assertions.assertEquals(3, CountWords.countW("one two three"));
    }
}
