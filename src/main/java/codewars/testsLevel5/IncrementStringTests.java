package codewars.testsLevel5;

import codewars.level5.IncrementString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncrementStringTests {

    @Test
    public void incrementStringTest() {
        assertEquals("foobar001", IncrementString.incrementString("foobar000"));
        assertEquals("foo1", IncrementString.incrementString("foo"));
        assertEquals("foobar002", IncrementString.incrementString("foobar001"));
        assertEquals("foobar100", IncrementString.incrementString("foobar99"));
        assertEquals("foobar0100", IncrementString.incrementString("foobar0099"));
        assertEquals("1", IncrementString.incrementString(""));
        assertEquals("10", IncrementString.incrementString("9"));
    }
}
