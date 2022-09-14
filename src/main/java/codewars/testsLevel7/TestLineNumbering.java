package codewars.testsLevel7;

import codewars.level7.LineNumbering;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class TestLineNumbering {

    @Test
    public void basicTests() {

        assertEquals(Arrays.asList(), LineNumbering.number(Arrays.asList()));
        assertEquals(Arrays.asList("1: a", "2: b", "3: c"), LineNumbering.number(Arrays.asList("a", "b", "c")));
        assertEquals(Arrays.asList("1: ", "2: ", "3: "), LineNumbering.number(Arrays.asList("", "", "")));
    }
}
