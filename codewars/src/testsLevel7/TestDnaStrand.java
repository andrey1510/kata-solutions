package testsLevel7;

import level7.DnaStrand;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestDnaStrand {

    @Test
    public void testDnaStrand() {
        assertEquals("TTAACCGG", DnaStrand.makeComplement("AATTGGCC"));
    }

}
