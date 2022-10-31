package codewars.testsLevel4;

import codewars.level4.Parser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParserTests {

    @Test
    public void parserTests() {
        assertEquals(0, Parser.parseInt("zero"));
        assertEquals(3, Parser.parseInt("three"));
        assertEquals(17, Parser.parseInt("seventeen"));
        assertEquals(18, Parser.parseInt("8teen"));
        assertEquals(19, Parser.parseInt("9een"));
        assertEquals(80, Parser.parseInt("eighty"));
        assertEquals(70, Parser.parseInt("7ty"));
        assertEquals(70000, Parser.parseInt("seventy thousand"));
        assertEquals(100, Parser.parseInt("one hundred"));
        assertEquals(425, Parser.parseInt("four hundred twenty-five"));
        assertEquals(425, Parser.parseInt("Four Hundred Twenty-Five"));
        assertEquals(425, Parser.parseInt("four hundred and twenty-five"));
        assertEquals(200000, Parser.parseInt("two hundred thousand"));
        assertEquals(915743, Parser.parseInt("nine hundred fifteen thousand seven hundred forty-three"));
        assertEquals(801500, Parser.parseInt("eight hundred one thousand five hundred"));
        assertEquals(833452, Parser.parseInt("eight hundred thirty three thousand four hundred fifty two"));
        assertEquals(200125, Parser.parseInt("two hundred thousand one hundred twenty-five"));
        assertEquals(1000000, Parser.parseInt("one million"));
    }
}
