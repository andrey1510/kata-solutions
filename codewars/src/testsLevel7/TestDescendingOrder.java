package testsLevel7;

import level7.DescendingOrder;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDescendingOrder {

    @Test
    public void testDescendingOrder1() {
        assertEquals(665432, DescendingOrder.sortDesc(564326));
    }

    @Test
    public void testDescendingOrder2() {
        assertEquals(665432, DescendingOrder.sortDesc2(564326));
    }

}
