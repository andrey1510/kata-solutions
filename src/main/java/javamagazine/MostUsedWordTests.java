package javamagazine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MostUsedWordTests {

    @Test
    public void findWordTest() {
        Assertions.assertEquals("abc", MostUsedWord.findWord(new ArrayList<>(Arrays.asList("abc", "ttt", "ddd", "abc"))));
    }

}
