package codewars.testsLevel6;

import codewars.level6.WhoLikesIt;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestWhoLikesIt {

    ///////////////// Variant 1 /////////////////////

    @Test
    public void testWhoLikesIt() {
        assertEquals("no one likes this", WhoLikesIt.whoLikesIt());
        assertEquals("A likes this", WhoLikesIt.whoLikesIt("A"));
        assertEquals("A and B like this", WhoLikesIt.whoLikesIt("A", "B"));
        assertEquals("A, B and C like this", WhoLikesIt.whoLikesIt("A", "B", "C"));
        assertEquals("A, B and 3 others like this", WhoLikesIt.whoLikesIt("A", "B", "C", "D", "E"));
    }

    ///////////////// Variant 1+ /////////////////////

    @Test
    public void testWhoLikesIt2() {
        assertEquals("no one likes this", WhoLikesIt.whoLikesIt2());
        assertEquals("A likes this", WhoLikesIt.whoLikesIt2("A"));
        assertEquals("A and B like this", WhoLikesIt.whoLikesIt2("A", "B"));
        assertEquals("A, B and C like this", WhoLikesIt.whoLikesIt2("A", "B", "C"));
        assertEquals("A, B and 3 others like this", WhoLikesIt.whoLikesIt2("A", "B", "C", "D", "E"));
    }
}
