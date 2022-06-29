package testsLevel7;

import level7.ListFiltering;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class TestListFiltering {

    @Test
    public void testListFiltering() {
        assertEquals(List.of(0, 8, 111), ListFiltering.filterList(List.of("d", "tt", "5", -2, 0, 8, 111)));
    }
}
