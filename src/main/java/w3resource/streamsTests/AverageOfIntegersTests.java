package w3resource.streamsTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import w3resource.streams.AverageOfIntegers;
import java.util.Arrays;
import java.util.List;

public class AverageOfIntegersTests {
    @Test
    public void testGetAverage() {
        Assertions.assertEquals(7.25, AverageOfIntegers.getAverage(Arrays.asList(4, 2, 8, 15)), 2);
        Assertions.assertEquals(-1.75, AverageOfIntegers.getAverage(Arrays.asList(-2, -6, 1, 0)), 2);
        Assertions.assertEquals(1.00, AverageOfIntegers.getAverage(List.of(1)), 2);
        Assertions.assertEquals(0.00, AverageOfIntegers.getAverage(Arrays.asList(0, 0, 0, 0)), 2);
        Assertions.assertEquals(0.00, AverageOfIntegers.getAverage(List.of()), 2);
    }
}
