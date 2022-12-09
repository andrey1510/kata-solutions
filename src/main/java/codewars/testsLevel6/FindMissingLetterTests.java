package codewars.testsLevel6;

import org.junit.jupiter.api.Test;
import static codewars.level6.FindMissingLetter.findMissingLetter;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMissingLetterTests {

    @Test
    public void exampleTests() {
        assertEquals('e', findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'}));
        assertEquals('P', findMissingLetter(new char[]{'O', 'Q', 'R', 'S'}));
    }

}
