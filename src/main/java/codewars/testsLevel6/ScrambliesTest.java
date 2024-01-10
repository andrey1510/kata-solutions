package codewars.testsLevel6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static codewars.level6.Scramblies.scramble;

public class ScrambliesTest {

    @Test
    public void test() {
        Assertions.assertFalse(scramble("scriptjavx", "javascript"));
        Assertions.assertFalse(scramble("javscripts", "javascript"));
        Assertions.assertTrue(scramble("scriptingjava", "javascript"));
        Assertions.assertTrue(scramble("scriptsjava", "javascripts"));
        Assertions.assertTrue(scramble("aabbcamaomsccdd", "commas"));
        Assertions.assertTrue(scramble("commas", "commas"));
    }
}
