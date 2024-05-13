package codewars.testsLevel7;

import codewars.level7.IsogramKt;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsogramTests {

    @Test
    public void testIsogramKt() {
        assertTrue(IsogramKt.isIsogram("Dermatoglyphics"));
        assertFalse(IsogramKt.isIsogram("aba"));
        assertFalse(IsogramKt.isIsogram("moOse"));
    }

}
