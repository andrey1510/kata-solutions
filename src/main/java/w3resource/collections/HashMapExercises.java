package w3resource.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class HashMapExercises {

    // https://www.w3resource.com/java-exercises/collection/java-collection-hash-map-exercise-2.php
    public static int countSize(Map<Integer, String> map) {
        return map.size();
    }

    // https://www.w3resource.com/java-exercises/collection/java-collection-hash-map-exercise-3.php
    public static Map<Integer, String> copyAllMappings(Map<Integer, String> map) {
        // HashMap<Integer, String> newMap = new HashMap<>(map);
        Map<Integer, String> newMap = new HashMap<>();
        newMap.putAll(map);
        return newMap;
    }

    // https://www.w3resource.com/java-exercises/collection/java-collection-hash-map-exercise-4.php
    public static void removeAllElements(Map<Integer, String> map) {
        map.clear();
    }

    // https://www.w3resource.com/java-exercises/collection/java-collection-hash-map-exercise-8.php
    public static boolean checkPresenceOfSpecificValue(Map<Integer, String> map, String value) {
        return map.containsValue(value);
    }

    // https://www.w3resource.com/java-exercises/collection/java-collection-hash-map-exercise-7.php
    public static boolean checkPresenceOfSpecificKey(Map<Integer, String> map, int key) {
        return map.containsKey(key);
    }

    // https://www.w3resource.com/java-exercises/collection/java-collection-hash-map-exercise-11.php
    public static Set<Integer> keyToSet(Map<Integer, String> map) {
        Set<Integer> set = new HashSet<>(map.keySet());
        return set;
    }

    // https://www.w3resource.com/java-exercises/collection/java-collection-hash-map-exercise-12.php
    public static List<String> collectValues(Map<Integer, String> map) {
        List<String> list = new ArrayList<>(map.values());
        return list;
    }
}

