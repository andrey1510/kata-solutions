package testsLevel7;

import level7.Vowels;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestVowels {

    @Test
    public void testVowels() {
        assertEquals(6, Vowels.getCount("abcd fa jetwo lsiv pqyzxu"));
    }

}
