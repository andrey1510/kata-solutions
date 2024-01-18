package w3resource.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static w3resource.collections.HashMapExercises.checkPresenceOfSpecificKey;
import static w3resource.collections.HashMapExercises.checkPresenceOfSpecificValue;
import static w3resource.collections.HashMapExercises.collectValues;
import static w3resource.collections.HashMapExercises.countSize;
import static w3resource.collections.HashMapExercises.keyToSet;
import static w3resource.collections.HashMapExercises.removeAllElements;

public class HashMapExercisesTests {

    private static Map<Integer, String> createTestMap() {
        Map<Integer, String> testmap = new HashMap<>();
        testmap.put(1, "Green");
        testmap.put(2, "Yellow");
        testmap.put(3, "Red");
        testmap.put(4, "Orange");
        testmap.put(5, "White");
        testmap.put(6, "White");
        return testmap;
    }

    @Test
    public void countSizeTest() {
        Assertions.assertEquals(6, countSize(createTestMap()));
    }

    @Test
    public void copyAllMappings() {
        Assertions.assertEquals(createTestMap(), HashMapExercises.copyAllMappings(createTestMap()));
    }

    @Test
    public void removeAllElementsTest() {
        Map<Integer, String> testmap = createTestMap();
        removeAllElements(testmap);
        Assertions.assertEquals(0, testmap.size());
    }

    @Test
    public void checkPresenceOfSpecificValueTest() {
        Assertions.assertTrue(checkPresenceOfSpecificValue(createTestMap(), "Green"));
        Assertions.assertFalse(checkPresenceOfSpecificValue(createTestMap(), "Purple"));
    }

    @Test
    public void checkPresenceOfSpecificKeyTest() {
        Assertions.assertTrue(checkPresenceOfSpecificKey(createTestMap(), 1));
        Assertions.assertFalse(checkPresenceOfSpecificKey(createTestMap(), 1000));
    }

    @Test
    public void keyToSetTest() {
        System.out.println(keyToSet(createTestMap()));
    }

    @Test
    public void collectValuesTests() {
        System.out.println(collectValues(createTestMap()));
    }

}
