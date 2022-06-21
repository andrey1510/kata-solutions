package tests;

import level7.Maskify;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMaskify {

    @Test
    public void testMaskify() {
        assertEquals("###########3k i", Maskify.maskify("3ds4fcxdg4d3k i"));
        assertEquals("####x3ki", Maskify.maskify("34dcx3ki"));
        assertEquals("##xc16", Maskify.maskify("d6xc16"));
        assertEquals("4d3", Maskify.maskify("4d3"));
        assertEquals("43", Maskify.maskify("43"));
        assertEquals("s", Maskify.maskify("s"));
        assertEquals("", Maskify.maskify(""));
    }

}
