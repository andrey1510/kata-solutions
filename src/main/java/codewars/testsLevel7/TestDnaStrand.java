package codewars.testsLevel7;

import codewars.level7.DnaStrand;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDnaStrand {

    @Test
    public void testDnaStrand() {
        assertEquals("TTAACCGG", DnaStrand.makeComplement("AATTGGCC"));
    }

}
