package w3resource.streamsTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import w3resource.streams.SecondElement;

import java.util.Arrays;
import java.util.List;

public class SecondElementTests {

    @Test
    public void testGetSecondMax() {
        Assertions.assertEquals(8, SecondElement.getSecondMax(Arrays.asList(4, 2, 8, 15)));
        Assertions.assertEquals(-3, SecondElement.getSecondMax(Arrays.asList(-2, -6, -3)));
        Assertions.assertEquals(0, SecondElement.getSecondMax(List.of(1)), 2);
        Assertions.assertEquals(0, SecondElement.getSecondMax(Arrays.asList(0, 0, 0, 0)));
        Assertions.assertEquals(0, SecondElement.getSecondMax(List.of()));
    }

    @Test
    public void testGetSecondMin() {
        Assertions.assertEquals(4, SecondElement.getSecondMin(Arrays.asList(4, 2, 8, 15)));
        Assertions.assertEquals(-2, SecondElement.getSecondMin(Arrays.asList(-2, -6, 1, 0)));
        Assertions.assertEquals(0, SecondElement.getSecondMin(List.of(1)));
        Assertions.assertEquals(0, SecondElement.getSecondMin(Arrays.asList(0, 0, 0, 0)));
        Assertions.assertEquals(0, SecondElement.getSecondMin(List.of()));
    }

}
