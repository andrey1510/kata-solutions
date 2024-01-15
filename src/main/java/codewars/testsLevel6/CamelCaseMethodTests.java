package codewars.testsLevel6;

import codewars.level6.CamelCaseMethod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CamelCaseMethodTests {

    @Test
    public void testTwoWords() {
        assertEquals("TestCase", CamelCaseMethod.camelCase("test case"));
        assertEquals("CamelCaseMethod", CamelCaseMethod.camelCase("camel case method"));
        assertEquals("Z", CamelCaseMethod.camelCase("z"));
        assertEquals("AbC", CamelCaseMethod.camelCase("ab  c"));
        assertEquals("", CamelCaseMethod.camelCase(""));
    }

    @Test
    public void testTwoWords2() {
        assertEquals("TestCase", CamelCaseMethod.camelCase2("test case"));
        assertEquals("CamelCaseMethod", CamelCaseMethod.camelCase2("camel case method"));
        assertEquals("Z", CamelCaseMethod.camelCase2("z"));
        assertEquals("AbC", CamelCaseMethod.camelCase2("ab  c"));
        assertEquals("", CamelCaseMethod.camelCase2(""));
    }
}
