package other.testAssignment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static other.testAssignment.CountElements.countElements;

class CountElementsTest {

    @Test
    public void countElementsTest() {
        Assertions.assertEquals(new HashMap<>(Map.of(1, (long) 2, 3, (long) 1, 4, (long) 2, 5, (long) 2)),
                countElements(new ArrayList<>(Arrays.asList(1, 3, 4, 5, 1, 5, 4))));
    }

}
