package testsLevel7;

import level7.GetMiddle;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestGetMiddle {

    @Test
    public void testGetMiddleSingle() {
        System.out.println("Output: " + GetMiddle.getMiddle("V"));
        assertEquals("V", GetMiddle.getMiddle("V"));
        }
    @Test
    public void testGetMiddleOdd() {
        System.out.println("Output: " + GetMiddle.getMiddle("aMc"));
        assertEquals("M", GetMiddle.getMiddle("aMc"));
    }
    @Test
    public void testGetMiddleEven() {
        System.out.println("Output: " + GetMiddle.getMiddle("wVtm"));
        assertEquals("Vt", GetMiddle.getMiddle("wVtm"));
    }



}
