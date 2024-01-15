package codewars.testsLevel6;

import codewars.level6.LexOrder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LexOrderTests {
    @Test
    public void test1() {
        String str1[] = new String[]{"arp", "live", "strong"};
        String str2[] = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
        String result[] = new String[]{"arp", "live", "strong"};
        assertArrayEquals(result, LexOrder.inArray(str1, str2));
    }
}
