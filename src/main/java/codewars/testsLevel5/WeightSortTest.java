package codewars.testsLevel5;

import codewars.level5.WeightSort;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WeightSortTest {

    @Test
    public void test() {
       assertEquals("100 180 90 56 65 74 68 86 99", WeightSort.orderWeight("56 65 74 100 99 68 86 180 90"));
    }

}
