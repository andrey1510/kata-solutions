package streamsAndLambdas.streamsTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import streamsAndLambdas.streams.AverageLength;
import java.util.Arrays;
import java.util.List;

public class AverageLengthTests {

    @Test
    public void testCountElementsOnLetter() {
        Assertions.assertEquals(3, AverageLength.calculateAverageLength(Arrays.asList("ab", "abc", "dddd")));
        Assertions.assertEquals(1, AverageLength.calculateAverageLength(List.of("a")));
        Assertions.assertEquals(0, AverageLength.calculateAverageLength(List.of()));
    }

}
