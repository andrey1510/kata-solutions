package codewars.testsLevel7;

import codewars.level7.GetMiddle;
import codewars.level7.GetMiddleKotlin;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GetMiddleTests {

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

    ////// Kotlin ///////

    @Test
    public void testGetMiddleKotlinSingle() {
        System.out.println("Output: " + GetMiddleKotlin.getMiddle("V"));
        assertEquals("V", GetMiddleKotlin.getMiddle("V"));
    }

    @Test
    public void testGetMiddleKotlinOdd() {
        System.out.println("Output: " + GetMiddleKotlin.getMiddle("aMc"));
        assertEquals("M", GetMiddleKotlin.getMiddle("aMc"));
    }
    @Test
    public void testGetMiddleKotlinEven() {
        System.out.println("Output: " + GetMiddleKotlin.getMiddle("wVtm"));
        assertEquals("Vt", GetMiddleKotlin.getMiddle("wVtm"));
    }

}
