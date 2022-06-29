package testsLevel6;

import level6.SpinWords;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestSpinWords {
    SpinWords test = new SpinWords();

    ///////////////////////////// Variant 1 ///////////////////////////////////

    @Test
    public void testSpinWordsVar1() {
        assertEquals("tacgnol will win!", test.spinWords("longcat will win!"));
    }

    ///////////////////////////// Variant 2 ///////////////////////////////////

    @Test
    public void testSpinWordsVar2() {
        assertEquals("tacgnol will win!", test.spinWords2("longcat will win!"));
    }
}
