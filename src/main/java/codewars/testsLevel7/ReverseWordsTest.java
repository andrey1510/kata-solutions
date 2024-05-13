package codewars.testsLevel7;

import codewars.level7.ReverseWords;
import codewars.level7.ReverseWordsKt;
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
        assertEquals("cba !fed", ReverseWordsKt.reverseWords("abc def!"));
        assertEquals("a b c", ReverseWordsKt.reverseWords("a b c"));
        assertEquals("   ", ReverseWordsKt.reverseWords("   "));
    }

}
