package codewars.testsLevel6;

import codewars.level6.HighestScoringWord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HighestScoringWordTest {
    @Test
    public void highTest() {
        assertEquals("zxy", HighestScoringWord.high("a b gfe zxy"));
        assertEquals("abc", HighestScoringWord.high("a b c abc cba"));
        assertEquals("b", HighestScoringWord.high("b aa"));
    }
}
