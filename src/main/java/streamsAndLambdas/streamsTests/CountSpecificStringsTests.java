package streamsAndLambdas.streamsTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import streamsAndLambdas.streams.CountSpecificStrings;

import java.util.Arrays;
import java.util.List;

public class CountSpecificStringsTests {

    @Test
    public void testCountElementsOnLetter() {
        Assertions.assertEquals(2, CountSpecificStrings.countElementsOnLetter(Arrays.asList("abc", "abc", "ddd"), "a"));
        Assertions.assertEquals(2, CountSpecificStrings.countElementsOnLetter(Arrays.asList("abc", "Abc", "ddd"), "a"));
        Assertions.assertEquals(0, CountSpecificStrings.countElementsOnLetter(List.of("bac"), "a"));
        Assertions.assertEquals(0, CountSpecificStrings.countElementsOnLetter(List.of(), "a"));
    }

}
