package other;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JewelsTests {

    @Test
    public void countJewelsTest() {
        Assertions.assertEquals(4, Jewels.countJewels("ab", "aabbccd"));
        Assertions.assertEquals(4, Jewels.countJewelsAlt("ab", "aabbccd"));
    }

}
