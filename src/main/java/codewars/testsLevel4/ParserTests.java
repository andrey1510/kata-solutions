package codewars.testsLevel4;

import codewars.level4.Parser;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParserTests {



    @Test
    public void parserTests() {
        assertEquals(4 , Parser.parseInt("four"));
        assertEquals(14 , Parser.parseInt("fourteen"));
        assertEquals(125 , Parser.parseInt("one hundred twenty-five"));
        assertEquals(10125 , Parser.parseInt("ten thousand one hundred twenty-five"));
        assertEquals(200125 , Parser.parseInt("two hundred thousand one hundred twenty-five"));
        assertEquals(100125 , Parser.parseInt("one million two hundred thousand one hundred twenty-five"));
    }

}
