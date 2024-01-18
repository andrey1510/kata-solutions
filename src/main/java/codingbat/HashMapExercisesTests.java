package codingbat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static codingbat.HashMapExercises.calculateWordLength;
import static codingbat.HashMapExercises.calculateWordLengthAlt;
import static codingbat.HashMapExercises.firstAndLastCharsToMap;
import static codingbat.HashMapExercises.firstAndLastCharsToMapAlt;

public class HashMapExercisesTests {

//    private static HashMap<Integer,String> createTestMap(){
//        HashMap<Integer, String> testmap = new HashMap<>();
//        testmap.put(1, "Green");
//        testmap.put(2, "Yellow");
//        testmap.put(3, "Red");
//        testmap.put(4, "Orange");
//        testmap.put(5, "White");
//        testmap.put(6, "White");
//        return testmap;
//    }

    @Test
    public void calculateWordLengthTests() {

        Map<String, Integer> testmap = new HashMap<>();
        testmap.put("Green", 5);
        testmap.put("Yellow", 6);
        testmap.put("Red", 3);

        List<String> testlist = new ArrayList<>(Arrays.asList("Green", "Yellow", "Red"));

        Assertions.assertEquals(testmap, calculateWordLength(testlist));
        Assertions.assertEquals(testmap, calculateWordLengthAlt(testlist));

    }

    @Test
    public void firstAndLastCharsToMapTest() {
        Map<String, String> testmap = new HashMap<>();
        testmap.put("G", "n");
        testmap.put("Y", "w");
        testmap.put("R", "d");

        List<String> testlist = new ArrayList<>(Arrays.asList("Green", "Yellow", "Red"));

        Assertions.assertEquals(testmap, firstAndLastCharsToMap(testlist));
        Assertions.assertEquals(testmap, firstAndLastCharsToMapAlt(testlist));
    }

}
