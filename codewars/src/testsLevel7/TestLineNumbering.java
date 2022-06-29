package testsLevel7;

import level7.LineNumbering;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class TestLineNumbering {

    @Test
    public void basicTests() {

        System.out.println(LineNumbering.number(Arrays.asList("", "", "")));

        //assertEquals(Arrays.asList(), LineNumbering.number(Arrays.asList()));
        //assertEquals(Arrays.asList("1: a", "2: b", "3: c"), LineNumbering.number(Arrays.asList("a", "b", "c")));
        assertEquals(Arrays.asList("1: ", "2: ", "3: "), LineNumbering.number(Arrays.asList("", "", "")));
    }

    /////////////////////// Variant 2 ////////////////////

    @Test
    public void basicTests2() {
        assertEquals(Arrays.asList(), LineNumbering.number2(Arrays.asList()));
        assertEquals(Arrays.asList("1: a", "2: b", "3: c"), LineNumbering.number2(Arrays.asList("a", "b", "c")));
        assertEquals(Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: "), LineNumbering.number2(Arrays.asList("", "", "", "", "")));
    }

}
