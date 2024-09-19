package codewars.testsLevel7;

import codewars.level7.ExesAndOhsKotlin;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExesAndOhsTests {

    @Test
    public void testIsogramKt() {

        assertTrue(ExesAndOhsKotlin.Companion.getXO("ooxx"));
        assertTrue(ExesAndOhsKotlin.Companion.getXO("ooxXm"));
        assertFalse(ExesAndOhsKotlin.Companion.getXO("xooxx"));
        assertTrue(ExesAndOhsKotlin.Companion.getXO("zpzpzpp"));

    }
}
