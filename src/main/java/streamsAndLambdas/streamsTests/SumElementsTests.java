package streamsAndLambdas.streamsTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import streamsAndLambdas.streams.SumElements;
import java.util.Arrays;
import java.util.List;

public class SumElementsTests {

    @Test
    public void testSummarize() {
        Assertions.assertEquals(8, SumElements.summarize(Arrays.asList(4, 2, 2)));
        Assertions.assertEquals(-8, SumElements.summarize(Arrays.asList(-2, -6)));
        Assertions.assertEquals(1, SumElements.summarize(List.of(1)));
        Assertions.assertEquals(0, SumElements.summarize(Arrays.asList(0, 0, 0, 0)));
        Assertions.assertEquals(0, SumElements.summarize(List.of()));
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(16, SumElements.multiply(Arrays.asList(4, 2, 2)));
        Assertions.assertEquals(12, SumElements.multiply(Arrays.asList(-2, -6)));
        Assertions.assertEquals(1, SumElements.multiply(List.of(1)));
        Assertions.assertEquals(0, SumElements.multiply(Arrays.asList(0, 0, 0, 0)));
        Assertions.assertEquals(0, SumElements.multiply(List.of()));
    }

}
