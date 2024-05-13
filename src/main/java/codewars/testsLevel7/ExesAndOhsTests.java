package codewars.testsLevel7;

import codewars.level7.ExesAndOhsKt;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExesAndOhsTests {

    @Test
    public void testIsogramKt() {

        assertTrue(ExesAndOhsKt.Companion.getXO("ooxx"));
        assertTrue(ExesAndOhsKt.Companion.getXO("ooxXm"));
        assertFalse(ExesAndOhsKt.Companion.getXO("xooxx"));
        assertTrue(ExesAndOhsKt.Companion.getXO("zpzpzpp"));

    }
}
