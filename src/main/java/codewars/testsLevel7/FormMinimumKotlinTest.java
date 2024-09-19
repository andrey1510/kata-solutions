package codewars.testsLevel7;

import codewars.level7.FormMinimumKotlin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormMinimumKotlinTest {

    @Test
    public void testSomething() {
        assertEquals(13, FormMinimumKotlin.Companion.minValue(new int[] {1,3,1}));
        assertEquals(457, FormMinimumKotlin.Companion.minValue(new int[] {4, 7, 5, 7}));
        assertEquals(148, FormMinimumKotlin.Companion.minValue(new int[] {4, 8, 1, 4}));
        assertEquals(579, FormMinimumKotlin.Companion.minValue(new int[] {5, 7, 9, 5, 7}));
        assertEquals(678, FormMinimumKotlin.Companion.minValue(new int[] {6, 7, 8, 7, 6, 6}));
    }

}
