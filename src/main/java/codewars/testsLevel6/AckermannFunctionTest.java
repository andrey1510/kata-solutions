package codewars.testsLevel6;

import codewars.level6.AckermannFunction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AckermannFunctionTest {

    @Test
    public void test() {
        Assertions.assertEquals(0, AckermannFunction.Ackermann(-1, -1), 0);
        Assertions.assertEquals(3, AckermannFunction.Ackermann(1, 1), 0);
        Assertions.assertEquals(13, AckermannFunction.Ackermann(4, 0), 0);
    }

}
