package codewars.testsLevel7;

import codewars.level7.HighestAndLowest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestHighestAndLowest {

    @Test
    public void testHighestAndLowest() {
        assertEquals("8 -3", HighestAndLowest.highAndLow("4 6 2 -3 8"));
    }

}
