package testsLevel5;

import level5.PaginationHelper;
import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PaginationHelperTest {

    PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f','j','k'), 3);

    @Test
    public void itemCountTest() {
        assertEquals(8, helper.itemCount());
    }

    @Test
    public void pageCountTest() {
        assertEquals(3, helper.pageCount());
    }

    @Test
    public void pageItemCountTest() {
        assertEquals(3, helper.pageItemCount(0));
        assertEquals(3, helper.pageItemCount(1));
        assertEquals(2, helper.pageItemCount(2));
        assertEquals(-1, helper.pageItemCount(3));
        assertEquals(-1, helper.pageItemCount(-2));
    }

    @Test
    public void pageIndexTest() {
        assertEquals(0, helper.pageIndex(0));
        assertEquals(2, helper.pageIndex(7));
        assertEquals(-1, helper.pageIndex(-1));
        assertEquals(-1, helper.pageIndex(10));

    }
}
