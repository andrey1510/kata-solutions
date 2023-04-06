package codewars.testsLevel6;

import codewars.level6.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderTests {

    @Test
    public void testCleanString() {
        assertEquals(Order.order("is2 Thi1s T4est 3a"), ("Thi1s is2 3a T4est"));
    }

}
