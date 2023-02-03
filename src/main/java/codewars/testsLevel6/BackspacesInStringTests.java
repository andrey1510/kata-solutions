package codewars.testsLevel6;

import codewars.level6.BackspacesInString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackspacesInStringTests {

    BackspacesInString t = new BackspacesInString();

    @Test
    public void testCleanString() {
        assertEquals("", t.cleanString("###"));
        assertEquals("", t.cleanString("v###"));
        assertEquals("v", t.cleanString("###v"));
        assertEquals("vd", t.cleanString("###vv#tt#t##d"));
    }
}
