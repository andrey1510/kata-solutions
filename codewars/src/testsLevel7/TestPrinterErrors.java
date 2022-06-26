package testsLevel7;

import level7.PrinterErrors;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinterErrors {

    ///////////////////////// Variant 1 test ///////////////////////////////////

    @Test
    public void testPrinterErrors1() {
        assertEquals("3/10", PrinterErrors.printerError("meabcdnxvc"));
    }

    ///////////////////////// Variant 2 test ///////////////////////////////////

    @Test
    public void testPrinterErrors2() {
        assertEquals("3/10", PrinterErrors.printerError2("meabcdnxvc"));
    }

}
