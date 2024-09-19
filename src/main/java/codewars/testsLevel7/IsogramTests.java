package codewars.testsLevel7;

import codewars.level7.IsogramKotlin;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsogramTests {

    @Test
    public void testIsogramKt() {
        assertTrue(IsogramKotlin.isIsogram("Dermatoglyphics"));
        assertFalse(IsogramKotlin.isIsogram("aba"));
        assertFalse(IsogramKotlin.isIsogram("moOse"));
    }

}
