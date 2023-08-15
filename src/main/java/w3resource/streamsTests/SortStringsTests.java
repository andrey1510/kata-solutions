package w3resource.streamsTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import w3resource.streams.SortStrings;
import java.util.Arrays;
import java.util.List;

public class SortStringsTests {

    @Test
    public void testSortStringAsc() {
        Assertions.assertEquals(Arrays.asList("a", "b", "c"), SortStrings.sortStringAsc(Arrays.asList("b", "c", "a")));
        Assertions.assertLinesMatch(List.of(), SortStrings.sortStringAsc(List.of()));
    }

    @Test
    public void testSortStringDesc() {
        Assertions.assertEquals(Arrays.asList("c", "b", "a"), SortStrings.sortStringDesc(Arrays.asList("b", "a", "c")));
        Assertions.assertLinesMatch(List.of(), SortStrings.sortStringDesc(List.of()));
    }

}
