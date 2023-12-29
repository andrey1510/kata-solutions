package codewars.level6;

import java.util.Map;
import java.util.stream.Collectors;

public class CountCharacters {
    public static Map<Character, Integer> count(String str) {
        return str.chars()
                .mapToObj(letter -> (char) letter)
                .collect(Collectors.toMap(
                        letter -> letter,
                        letter -> 1,
                        Integer::sum
                ));
    }

}
