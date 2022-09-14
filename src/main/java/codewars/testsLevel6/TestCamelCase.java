package codewars.testsLevel6;

import codewars.level6.CamelCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCamelCase {

    /////////////// Variant 1 test ///////////////

    @Test
    public void testCamelCaseVar1() {
        assertEquals("tttDddAcd", CamelCase.toCamelCase("ttt-Ddd-Acd"));
        assertEquals("tttDddAcd", CamelCase.toCamelCase("ttt_Ddd_Acd"));
        assertEquals("TttDddAcd", CamelCase.toCamelCase("Ttt-Ddd-Acd"));
        assertEquals("TttDddACD", CamelCase.toCamelCase("Ttt_Ddd_ACD"));
    }

    /////////////// Variant 2 test ///////////////

    @Test
    public void testCamelCaseVar2() {
        assertEquals("tttDddAcd", CamelCase.toCamelCase2("ttt-Ddd-Acd"));
        assertEquals("tttDddAcd", CamelCase.toCamelCase2("ttt_Ddd_Acd"));
        assertEquals("TttDddAcd", CamelCase.toCamelCase2("Ttt-Ddd-Acd"));
        assertEquals("TttDddACD", CamelCase.toCamelCase2("Ttt_Ddd_ACD"));
    }

}
