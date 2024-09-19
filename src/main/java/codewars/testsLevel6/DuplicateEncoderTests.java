package codewars.testsLevel6;

import org.junit.jupiter.api.Test;
import codewars.level6.DuplicateEncoderKotlin;
import codewars.level6.DuplicateEncoder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateEncoderTests {

    @Test
    public void encodeTest() {
        assertEquals(")()())()(()()(",
            DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }

    @Test
    public void encodeKotlinTest() {
        assertEquals(")()())()(()()(",
            DuplicateEncoderKotlin.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoderKotlin.encode("   ()(   "));
    }
}
