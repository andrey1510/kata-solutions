package codewars.testsLevel7;

import codewars.level7.ExesAndOhs;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestExesAndOhs {

    @Test
    public void testExesAndOhs() {
        assertTrue(ExesAndOhs.getXO("xXoOrvdf dsdf0"));
        assertFalse(ExesAndOhs.getXO("xXxoOrvdf dsdf0"));
        assertTrue(ExesAndOhs.getXO("rvdf dsdf0"));
        assertTrue(ExesAndOhs.getXO(""));
    }
}
