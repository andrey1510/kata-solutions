package codewars.testsLevel7;

import codewars.level7.ShortestWord;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestShortestWord {

    ////////////////////////// Variant 1 ////////////////////

    @Test
    public void testShortestWord() {
        assertEquals(4, ShortestWord.findShort("drfd ghrfs ght, 4dfg M'jh6gfd"));
    }

    ////////////////////////// Variant 2 ////////////////////

    @Test
    public void testShortestWord2() {
        assertEquals(4, ShortestWord.findShort2("drfd ghrfs ght, 4dfg M'jh6gfd"));
    }

}


