package w3resource.streamsTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import w3resource.streams.StringsCase;
import java.util.Arrays;
import java.util.List;

public class StringsCaseTests {

    @Test
    public void testConvertToUppercase() {
        Assertions.assertEquals(Arrays.asList("ONE", "TWO", "THREE"), StringsCase.convertToUppercase(Arrays.asList("one", "two", "three")));
        Assertions.assertLinesMatch(Arrays.asList("ONE", "TWO", "THREE"), StringsCase.convertToUppercase(Arrays.asList("One", "Two", "Three")));
        Assertions.assertLinesMatch(Arrays.asList("ONE", "=", "33"), StringsCase.convertToUppercase(Arrays.asList("One", "=", "33")));
        Assertions.assertLinesMatch(List.of(), StringsCase.convertToUppercase(List.of()));
    }

    @Test
    public void testConvertToLowercase() {
        Assertions.assertEquals(Arrays.asList("one", "two", "three"), StringsCase.convertToLowercase(Arrays.asList("ONE", "TWO", "THREE")));
        Assertions.assertLinesMatch(Arrays.asList("one", "two", "three"), StringsCase.convertToLowercase(Arrays.asList("One", "Two", "Three")));
        Assertions.assertLinesMatch(Arrays.asList("one", "=", "33"), StringsCase.convertToLowercase(Arrays.asList("One", "=", "33")));
        Assertions.assertLinesMatch(List.of(), StringsCase.convertToLowercase(List.of()));
    }
}
