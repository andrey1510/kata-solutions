package codewars.testsLevel5;

import codewars.level5.ValidParentheses;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void testTrue() {
        assertTrue(ValidParentheses.validParentheses(" "));
        assertTrue(ValidParentheses.validParentheses("dddd"));
        assertTrue(ValidParentheses.validParentheses("dd () dd"));
        assertTrue(ValidParentheses.validParentheses("dd(()(()))dd"));
    }

    @Test
    public void testFalse() {
        assertFalse(ValidParentheses.validParentheses("(sss"));
        assertFalse(ValidParentheses.validParentheses(")sss"));
        assertFalse(ValidParentheses.validParentheses("vv())vv"));
        assertFalse(ValidParentheses.validParentheses("vv ())()(()  vv"));
        assertFalse(ValidParentheses.validParentheses("vv ( ))) ((( )  vv"));
    }

}
