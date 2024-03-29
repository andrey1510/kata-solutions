package codewars.level6;

import java.util.Arrays;

public class LexOrder {

    public static String[] inArray(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(str -> Arrays.stream(array2).anyMatch(s -> s.contains(str)))
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }
}

