package codewars.testsLevel7;

import codewars.level7.TwoToOne;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestTwoToOne {

    @Test
    public void testTwoToOne() {
        assertEquals("abcdfx", TwoToOne.longest("bca","fxd"));
        assertEquals("abcdfx", TwoToOne.longest("bcaaa","fxddd"));
        assertEquals("abcdfx", TwoToOne.longest("bcaf","fxdb"));
    }

}
