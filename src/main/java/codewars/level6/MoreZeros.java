package codewars.level6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoreZeros {

    public static char[] moreZeros(String s) {

        char[] chars = s.toCharArray();
        List<String> filteredChars = new ArrayList<>();

        for (char aChar : chars) {
            List<String> binary = Arrays.asList(Integer.toBinaryString(aChar).split(""));
            if (binary.get(0).equals("0")) binary.remove(0);
            if ( binary.stream().filter(e -> e.equals("0")).count() > binary.stream().filter(e1 -> e1.equals("1")).count())  {
                filteredChars.add(String.valueOf(aChar));
            }
        }
        return filteredChars.stream().distinct().collect(Collectors.joining("")).toCharArray();
    }
}

class MoreZerosTests {
    @Test
    void basicTests() {
        assertArrayEquals(new char[] {'a','b','d','h','p','A','B','C','D','E','F','H','I','J','L','P','Q','R','T','X','0'}, MoreZeros.moreZeros("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890_"));
        assertArrayEquals(new char[] {'D', 'I', 'E', 'T'}, MoreZeros.moreZeros("DIGEST"));
        assertArrayEquals(new char[] {'a','b','d'}, MoreZeros.moreZeros("abcde"));
        assertArrayEquals(new char[] {'h', 'b', 'p', 'a', 'd'}, MoreZeros.moreZeros("thequickbrownfoxjumpsoverthelazydog"));
        assertArrayEquals(new char[] {'T','H','E','Q','I','C','B','R','F','X','J','P','L', 'A','D'}, MoreZeros.moreZeros("THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG"));

    }
}

