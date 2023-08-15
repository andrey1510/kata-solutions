package w3resource.streamsTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import w3resource.streams.RemoveDuplicates;

import java.util.Arrays;
import java.util.List;

class RemoveDuplicatesTests {
    @Test
    public void testConvertToUppercase() {
        Assertions.assertLinesMatch(Arrays.asList("One", "Two", "Three"), RemoveDuplicates.removeDuplicates(Arrays.asList("One", "Two", "Three")));
        Assertions.assertLinesMatch(Arrays.asList("One", "Two", "Three"), RemoveDuplicates.removeDuplicates(Arrays.asList("One", "One", "Two", "Three")));
        Assertions.assertLinesMatch(List.of(), RemoveDuplicates.removeDuplicates(List.of()));
    }
}
