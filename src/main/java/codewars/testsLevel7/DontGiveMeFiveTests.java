package codewars.testsLevel7;

import org.junit.jupiter.api.Test;
import codewars.level7.DontGiveMeFiveKotlin;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DontGiveMeFiveTests {
    @Test
    public void exampleTests() {
        assertEquals(8, DontGiveMeFiveKotlin.Companion.dontGiveMeFive2(1,9));
        assertEquals(12, DontGiveMeFiveKotlin.Companion.dontGiveMeFive2(4,17));
    }

}
