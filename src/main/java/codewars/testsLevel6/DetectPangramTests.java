package codewars.testsLevel6;

import codewars.level6.DetectPangram;
import org.junit.Test;

import static org.junit.Assert.*;

public class DetectPangramTests {

    @Test
    public void testCheck() {

        DetectPangram test = new DetectPangram();

        assertTrue(test.check("The quick brown fox jumps over the lazy dog. All alphabet letters!"));
        assertFalse(test.check("Not all alphabet letters!"));
    }
}
