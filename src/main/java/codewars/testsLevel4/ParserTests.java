package codewars.testsLevel4;

import codewars.level4.Parser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParserTests {

    @Test
    public void parserTests() {
     //   assertEquals(4 , Parser.parseInt("four"));
     //   assertEquals(14 , Parser.parseInt("fourteen"));
     //   assertEquals(125 , Parser.parseInt("one hundred twenty-five"));
     //   assertEquals(10125 , Parser.parseInt("ten thousand one hundred twenty-five"));
        assertEquals(863452 , Parser.parseInt("eight hundred thirty three thousand four hundred fifty two"));
        assertEquals(200125 , Parser.parseInt("two hundred thousand one hundred twenty-five"));
        assertEquals(1000000 , Parser.parseInt("one million"));
        assertEquals(0 , Parser.parseInt("zero"));
    }

}
