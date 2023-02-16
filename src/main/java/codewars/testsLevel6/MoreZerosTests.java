package codewars.testsLevel6;

import codewars.level6.MoreZeros;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoreZerosTests {
    @Test
    void basicTests() {
        assertArrayEquals(new char[]{'a', 'b', 'd', 'h', 'p', 'A', 'B', 'C', 'D', 'E', 'F', 'H', 'I', 'J', 'L', 'P', 'Q', 'R', 'T', 'X', '0'}, MoreZeros.moreZeros("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890_"));
        assertArrayEquals(new char[]{'D', 'I', 'E', 'T'}, MoreZeros.moreZeros("DIGEST"));
        assertArrayEquals(new char[]{'a', 'b', 'd'}, MoreZeros.moreZeros("abcde"));
        assertArrayEquals(new char[]{'h', 'b', 'p', 'a', 'd'}, MoreZeros.moreZeros("thequickbrownfoxjumpsoverthelazydog"));
        assertArrayEquals(new char[]{'T', 'H', 'E', 'Q', 'I', 'C', 'B', 'R', 'F', 'X', 'J', 'P', 'L', 'A', 'D'}, MoreZeros.moreZeros("THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG"));

    }
}
