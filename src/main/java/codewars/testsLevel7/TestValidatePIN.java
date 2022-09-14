package codewars.testsLevel7;

import codewars.level7.ValidatePIN;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestValidatePIN {
    @Test
    public void testValidatePIN() {
        assertTrue(ValidatePIN.validatePin("0239"));
        assertTrue(ValidatePIN.validatePin("123456"));
        assertFalse(ValidatePIN.validatePin("123"));
        assertFalse(ValidatePIN.validatePin("12345"));
        assertFalse(ValidatePIN.validatePin("x234"));
        assertFalse(ValidatePIN.validatePin("-134"));
    }


}
