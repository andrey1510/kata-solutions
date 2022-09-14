package codewars.testsLevel7;

import codewars.level7.JadenCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestJadenCase {
    JadenCase test = new JadenCase();

    //////////////////////////// Variant 1 ///////////////////////
    @Test
    public void testJadenCaseVar1() {
        assertEquals("Abc Vda R'sa, TfT", test.toJadenCase("abc vda r'sa, tfT"));
    }

    @Test
    public void testJadenCaseVar1Null() {
        assertNull(test.toJadenCase(null));
    }

    @Test
    public void testJadenCaseVar1Empty() {
        assertNull(test.toJadenCase(""));
    }

    //////////////////////////// Variant 2 ///////////////////////

    @Test
    public void testJadenCaseVar2() {
        assertEquals("Abc Vda R'sa, TfT", test.toJadenCase2("abc vda r'sa, tfT"));
    }

    @Test
    public void testJadenCaseVar2Null() {
        assertNull(test.toJadenCase2(null));
    }

    @Test
    public void testJadenCaseVar2Empty() {
        assertNull(test.toJadenCase2(""));
    }


}
