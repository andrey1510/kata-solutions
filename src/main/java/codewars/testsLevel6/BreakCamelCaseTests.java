package codewars.testsLevel6;

import codewars.level6.BreakCamelCase;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class BreakCamelCaseTests {
    @Test
    public void tests() {
        assertEquals("Incorrect", "camel Casing", BreakCamelCase.camelCase("camelCasing"));
        assertEquals("Incorrect", "camel Casing Test", BreakCamelCase.camelCase("camelCasingTest"));
        assertEquals("Incorrect", "camelcasingtest", BreakCamelCase.camelCase("camelcasingtest"));
    }
}
