package codewars.testsLevel6;

import codewars.level6.CountCharacters;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountCharactersTest {

    @Test
    public void testEmptyString() {
        Map<Character, Integer> data = new HashMap<>();
        assertEquals(data, CountCharacters.count(""));
    }

    @Test
    public void testCharacters() {
        Map<Character, Integer> data = new HashMap<>();
        data.put('a', 3);
        data.put('b', 3);
        data.put('c', 1);
        assertEquals(data, CountCharacters.count("aabbbac"));
    }

}

