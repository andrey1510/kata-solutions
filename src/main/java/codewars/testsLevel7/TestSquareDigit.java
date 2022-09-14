package codewars.testsLevel7;

import codewars.level7.SquareDigit;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestSquareDigit {
    SquareDigit t = new SquareDigit();

    /////////////////////// Variant 1 //////////////////////////

    @Test
    public void testSquareDigit() {
        assertEquals(1625, t.squareDigits(45));
    }

    /////////////////////// Variant 2 //////////////////////////

    @Test
    public void testSquareDigit2() {
        assertEquals(1625, t.squareDigits2(45));
    }

}
