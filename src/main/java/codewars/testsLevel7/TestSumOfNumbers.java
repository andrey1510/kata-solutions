package codewars.testsLevel7;

import codewars.level7.SumOfNumbers;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestSumOfNumbers {
    SumOfNumbers t = new SumOfNumbers();

    @Test
    public void testSumOfNumbers() {
        assertEquals(3, t.getSum(1,2));
        assertEquals(-1, t.getSum(0,-1));
    }

}
