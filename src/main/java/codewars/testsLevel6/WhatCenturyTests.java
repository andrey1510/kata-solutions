package codewars.testsLevel6;

import codewars.level6.WhatCentury;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhatCenturyTests {
    @Test
    public void TestWhatCentury() {
        assertEquals("20th", WhatCentury.whatCentury(1999));
        assertEquals("21st", WhatCentury.whatCentury(2011));
        assertEquals("22nd", WhatCentury.whatCentury(2154));
        assertEquals("23rd", WhatCentury.whatCentury(2259));
    }

}
