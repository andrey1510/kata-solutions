package codewars.testsLevel7;

import codewars.level7.TriangleTester;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestTriangleTester {

    @Test
    public void testTriangleTester() {
        assertTrue(TriangleTester.isTriangle(4,2,3));
        assertTrue(TriangleTester.isTriangle(4,4,4));
        assertFalse(TriangleTester.isTriangle(4,1,2));
        assertFalse(TriangleTester.isTriangle(4,2,-1));
        assertFalse(TriangleTester.isTriangle(4,2,0));
    }
}
