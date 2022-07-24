package testsLevel5;

import level5.PigLatin;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PigLatinTest {


    /////////////////  Var 1 /////////////////////
    @Test
    public void testPunctuation1() {
        assertEquals("uestionQay: igpay atinlay, siay tiay oolcay? oNay, tiay sn'tiay!", PigLatin.pigIt("Question: pig latin, is it cool? No, it isn't!"));
    }

    @Test
    public void testNoPunctuation1() {
        assertEquals("uestionQay : igpay atinlay , siay tiay oolcay ? oNay , tiay sn'tiay !", PigLatin.pigIt("Question : pig latin , is it cool ? No , it isn't !"));
    }

    /////////////// Community variant ///////////////
    @Test
    public void testPunctuation2() {
        assertEquals("uestionQay: igpay atinlay, siay tiay oolcay? oNay, tiay sn'tiay!", PigLatin.pigIt("Question: pig latin, is it cool? No, it isn't!"));
    }

    @Test
    public void testNoPunctuation2() {
        assertEquals("uestionQay : igpay atinlay , siay tiay oolcay ? oNay , tiay sn'tiay !", PigLatin.pigIt("Question : pig latin , is it cool ? No , it isn't !"));
    }

}
