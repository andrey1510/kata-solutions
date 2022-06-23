package tests;

import level7.Square;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestSquare {

    @Test
    public void testSquare() {
        assertFalse("negative value error", Square.isSquare(-1));
        assertFalse("partial value error", Square.isSquare(37));

        assertTrue("null value error", Square.isSquare(0));
        assertTrue("square value error", Square.isSquare(36));
    }


}
