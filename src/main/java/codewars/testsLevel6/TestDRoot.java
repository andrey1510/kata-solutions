package codewars.testsLevel6;

import codewars.level6.DRoot;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDRoot {

    @Test
    public void testDRoot() {
        assertEquals(6, DRoot.digital_root(132189));
    }
}
