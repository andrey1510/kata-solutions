package codewars.testsLevel7;

import codewars.level7.AnagramDetection;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramDetectionTests {

    @Test
    public void exampleTests() {
        assertTrue(AnagramDetection.isAnagram("abc", "bca"));
        assertTrue(AnagramDetection.isAnagram("Abc", "bCa"));
        assertFalse(AnagramDetection.isAnagram("same", "same"));
    }

}
