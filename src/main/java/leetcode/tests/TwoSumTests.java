package leetcode.tests;

import leetcode.easy.TwoSum;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TwoSumTests {

    @Test
    public void twoSumTest() {
        TwoSum t = new TwoSum();
        assertArrayEquals(new int[]{0, 1}, t.twoSum(new int[]{4, 4}, 8));
        assertArrayEquals(new int[]{1, 2}, t.twoSum(new int[]{1, 3, 3}, 6));
    }


}
