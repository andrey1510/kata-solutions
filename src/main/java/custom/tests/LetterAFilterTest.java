package custom.tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static custom.LetterAFilter.filterStrings;

public class LetterAFilterTest {

    @Test
    public void test() {

        List<String> strings = new ArrayList<>(Arrays.asList("aaa", "ddd", "a bc", "s5gf yh"));
        List<String> filteredStrings = new ArrayList<>(Arrays.asList("ddd", "s5gf yh"));

        Assertions.assertEquals(filteredStrings, filterStrings(strings));
    }
}
