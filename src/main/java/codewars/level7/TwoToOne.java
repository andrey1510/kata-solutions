package codewars.level7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        return new ArrayList<>(Arrays.asList((s1 + s2).split(""))).stream()
                .distinct()
                .sorted()
                .collect(Collectors.joining(""));
    }

    ////////////////// Community variant /////////////

    public static String longest2 (String s1, String s2) {
        return Stream.of(s1.concat(s2).split(""))
                .sorted()
                .distinct()
                .collect(Collectors.joining());
    }

}
