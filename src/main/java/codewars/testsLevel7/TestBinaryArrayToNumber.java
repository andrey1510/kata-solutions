package codewars.testsLevel7;

import codewars.level7.BinaryArrayToNumber;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestBinaryArrayToNumber {

    //////////////////////////// Variant 1 ////////////////////////
    @Test
    public void testBinaryArrayToNumberVar1() {
        assertEquals(1, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
    }

    //////////////////////////// Variant 2 ////////////////////////
    @Test
    public void testBinaryArrayToNumberVar2() {
        assertEquals(1, BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))));
    }
}
