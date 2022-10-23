package codewars.testsLevel4;

import codewars.level4.TopWords;
import codewars.level6.DetectPangram;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static codewars.level4.TopWords.top3;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopWordsTests {

    @Test
    public void testTop3() {
        assertEquals(List.of("c", "b", "a"),    TopWords.top3("d a a b b b c c c c"));
        assertEquals(List.of("b", "a", "d"),    TopWords.top3("e d d a a b b b ccc"));
        assertEquals(List.of("a", "b", "c"),    TopWords.top3(" c b a "));
        assertEquals(List.of("a", "b"),    TopWords.top3("a b 33 55 22 "));
        assertEquals(List.of("cc", "bb", "aa"),    TopWords.top3("Aa Aa Bb Bb Cc Cc Dd ee"));
        assertEquals(List.of("dd", "cc", "bb"),    TopWords.top3("a Aa bb Bb cc Cc dd Dd ee"));
        assertEquals(List.of("a"),    TopWords.top3("a a . , ! @ # $ % "));
        assertEquals(List.of("rrr", "ggg", "fff"),    TopWords.top3("fff fff\n rrr rrr \n ggg ggg tt"));
        assertEquals(List.of(),    TopWords.top3(""));
        assertEquals(List.of("d'd", "cc", "aaa'"),    TopWords.top3("aaa' aaa' cc cc  bb bb' d'd d'd "));
        assertEquals(List.of("ff", "dd", "aa"),    TopWords.top3("aa, aa. aa! cc: cc, dd; dd? dd*  ff ff ff ff ff"));
    }


    @Test
    public void communityTests() {
        assertEquals(Arrays.asList("e", "d", "a"),    TopWords.top3("a a a  b  c c  d d d d  e e e e e"));
        assertEquals(Arrays.asList("e", "ddd", "aa"), TopWords.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
        assertEquals(Arrays.asList("won't", "wont"),  TopWords.top3("  //wont won't won't "));
        assertEquals(Arrays.asList("e"),              TopWords.top3("  , e   .. "));
        assertEquals(Arrays.asList(),                 TopWords.top3("  ...  "));
        assertEquals(Arrays.asList(),                 TopWords.top3("  '  "));
        assertEquals(Arrays.asList(),                 TopWords.top3("  '''  "));
        assertEquals(Arrays.asList("a", "of", "on"),  TopWords.top3(Stream
                .of("In a village of La Mancha, the name of which I have no desire to call to",
                        "mind, there lived not long since one of those gentlemen that keep a lance",
                        "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
                        "coursing. An olla of rather more beef than mutton, a salad on most",
                        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
                        "on Sundays, made away with three-quarters of his income.")
                .collect(Collectors.joining("\n")) ));
    }

}
