package leetcode.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static leetcode.easy.DuplicateZeros.duplicateZeros;

class DuplicateZerosTests {

    @Test
    public void duplicateZerosTest() {
        Assertions.assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0}));
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, duplicateZeros(new int[]{1, 2, 3}));
    }

}
