package codewars.testsLevel6;

import codewars.level6.PersistentBugger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersistentBuggerTest {

    @Test
    public void basicTests() {
        assertEquals(3, PersistentBugger.persistence( 39));
        assertEquals(0, PersistentBugger.persistence(  4));
        assertEquals(2, PersistentBugger.persistence( 25));
        assertEquals(4, PersistentBugger.persistence(999));
    }

}
