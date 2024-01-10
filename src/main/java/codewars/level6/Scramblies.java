package codewars.level6;

// https://www.codewars.com/kata/55c04b4cc56a697bb0000048

import java.util.Map;
import java.util.stream.Collectors;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        return helper(str2).entrySet().stream()
            .allMatch(entry -> helper(str1).getOrDefault(entry.getKey(), 0L) >= entry.getValue());
    }

    public static Map<Character, Long> helper(String str){
        return str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }

}

