package codewars.testsLevel6;

import codewars.level6.CreatePhoneNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreatePhoneTests {
    @Test
    public void tests() {
        assertEquals("(532) 826-0143", CreatePhoneNumber.createPhoneNumber(new int[]{5, 3, 2, 8, 2, 6, 0, 1, 4, 3}));
    }
}
