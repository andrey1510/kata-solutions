package codewars.testsLevel7;

import codewars.level7.ReverseWords;
import codewars.level7.ReverseWordsKotlin;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseWordsTest {

    @Test
    public void testReverseWords() {
        assertEquals("cba !fed", ReverseWords.reverseWords("abc def!"));
        assertEquals("a b c", ReverseWords.reverseWords("a b c"));
        assertEquals("   ", ReverseWords.reverseWords("   "));
    }


    @Test
    public void testReverseWordsKt() {
        assertEquals("cba !fed", ReverseWordsKotlin.reverseWords("abc def!"));
        assertEquals("a b c", ReverseWordsKotlin.reverseWords("a b c"));
        assertEquals("   ", ReverseWordsKotlin.reverseWords("   "));
    }

}
