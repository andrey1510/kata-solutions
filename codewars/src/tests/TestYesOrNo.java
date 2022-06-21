package tests;

import level8.YesOrNo;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestYesOrNo {

    @Test
    public void testYesOrNo1 () {
        assertEquals("Yes", YesOrNo.boolToWord(true));
        assertEquals("No", YesOrNo.boolToWord(false));
    }

    @Test
    public void testYesOrNo2 () {
        assertEquals("Yes", YesOrNo.boolToWord2(true));
        assertEquals("No", YesOrNo.boolToWord2(false));
    }

}
