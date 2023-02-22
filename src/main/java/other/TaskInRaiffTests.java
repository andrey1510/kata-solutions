package other;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static other.TaskInRaiff.calculateWithDoubleFor;
import static other.TaskInRaiff.calculateWithDoubleForFirstPair;

class TaskInRaiffTests {

    int sum = 100;
    int[] arr = new int[]{1, 77, 12, 23, 99, 58, 2};

    @Test
    public void testCalculateDoubleFor() {
        Assertions.assertEquals(Arrays.asList("0 4", "1 3"), calculateWithDoubleFor(sum, arr));
    }

    @Test
    public void testCalculateDoubleForFirstPairOnly() {
        Assertions.assertEquals("0 4", calculateWithDoubleForFirstPair(sum, arr));
    }

}
