package testsLevel7;

import level7.MinMax;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestMinMax {

    @Test
    public void testMinMax() {
        assertArrayEquals(new int[]{2, 8}, MinMax.minMax(new int[]{5, 8, 2, 3}));
        assertArrayEquals(new int[]{2, 8}, MinMax.minMax(new int[]{8, 8, 2, 3}));
        assertArrayEquals(new int[]{0, 8}, MinMax.minMax(new int[]{5, 8, 0, 3}));
        assertArrayEquals(new int[]{-1, 8}, MinMax.minMax(new int[]{5, 8, -1, 3}));
    }
}
