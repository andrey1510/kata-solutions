package codewars.testsLevel6;

import codewars.level6.MultipliesOfThreeOrFive;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTests {

    MultipliesOfThreeOrFive test = new MultipliesOfThreeOrFive();

    @Test
    public void test() {
        assertEquals(23, test.solution(10));
        assertEquals(0, test.solution(-3));
        assertEquals(0, test.solution(0));
    }
}
