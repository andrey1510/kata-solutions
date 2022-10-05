package codewars.testsLevel7;

import codewars.level7.ReverseWords;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseWordsTest {

    @Test
    public void exampleCases() {
        assertEquals("cba !fed", ReverseWords.reverseWords("abc def!"));
        assertEquals("a b c", ReverseWords.reverseWords("a b c"));
        assertEquals("   ", ReverseWords.reverseWords("   "));
    }

    public static void main(String[] args) {
        ReverseWords t = new ReverseWords();
    }

}
