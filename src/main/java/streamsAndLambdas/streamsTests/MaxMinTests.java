package streamsAndLambdas.streamsTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import streamsAndLambdas.streams.MaxMin;
import java.util.Arrays;
import java.util.List;

public class MaxMinTests {

    @Test
    public void testGetMax() {
        Assertions.assertEquals(15, MaxMin.getMax(Arrays.asList(4, 2, 8, 15)));
        Assertions.assertEquals(-2, MaxMin.getMax(Arrays.asList(-2, -6, -3)));
        Assertions.assertEquals(2, MaxMin.getMax(List.of(1)), 2);
        Assertions.assertEquals(0.00, MaxMin.getMax(Arrays.asList(0, 0, 0, 0)));
        Assertions.assertEquals(0.00, MaxMin.getMax(List.of()));
    }

    @Test
    public void testGetMin() {
        Assertions.assertEquals(2, MaxMin.getMin(Arrays.asList(4, 2, 8, 15)));
        Assertions.assertEquals(-6, MaxMin.getMin(Arrays.asList(-2, -6, 1, 0)));
        Assertions.assertEquals(1, MaxMin.getMin(List.of(1)));
        Assertions.assertEquals(0.00, MaxMin.getMin(Arrays.asList(0, 0, 0, 0)));
        Assertions.assertEquals(0.00, MaxMin.getMin(List.of()));
    }

}
