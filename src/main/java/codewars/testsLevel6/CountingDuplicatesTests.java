package codewars.testsLevel6;

import codewars.level6.CountingDuplicates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountingDuplicatesTests {

    @Test
    public void duplicateCountTest() {
        assertEquals(0, CountingDuplicates.duplicateCount("abc"));
        assertEquals(1, CountingDuplicates.duplicateCount("aabc"));
        assertEquals(1, CountingDuplicates.duplicateCount("abac"));
        assertEquals(2, CountingDuplicates.duplicateCount("bAacB"));
        assertEquals(3, CountingDuplicates.duplicateCount("fcbABAc"));
    }
}
