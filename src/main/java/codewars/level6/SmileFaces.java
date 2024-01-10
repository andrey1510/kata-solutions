package codewars.level6;

// https://www.codewars.com/kata/583203e6eb35d7980400002a

import java.util.List;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        return (int) arr.stream()
                .filter(s -> s.matches("[:;][-~]?[)D]"))
                .count();
    }

}
