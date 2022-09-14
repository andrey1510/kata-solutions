package codewars.testsLevel7;

import codewars.level7.Chores;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;

public class TestChores {

    @Test
    public void printChores() {
        System.out.println(Arrays.toString(Chores.choreAssignments(new int[]{5, 1, 8, 4, 2, 9, 3, 10})));
    }

    @Test
    public void testChores() {
        assertArrayEquals(new int[]{9, 11, 11, 11}, Chores.choreAssignments(new int[]{5, 1, 8, 4, 2, 9, 3, 10}));
    }

}
