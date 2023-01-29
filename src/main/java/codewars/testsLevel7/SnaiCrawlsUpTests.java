package codewars.testsLevel7;

import codewars.level7.SnaiCrawlsUp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SnaiCrawlsUpTests {
    @Test
    public void test() {
        assertEquals(4, SnaiCrawlsUp.snail(6, 3, 2));
    }
}
