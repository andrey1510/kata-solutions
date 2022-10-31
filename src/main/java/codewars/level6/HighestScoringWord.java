package codewars.level6;

import java.util.*;
import java.util.stream.Collectors;

public class HighestScoringWord {

    public static String high(String s) {

        List <String> words = Arrays.stream(s.split(" "))
                .collect(Collectors.toList());

        return words.get(words.stream()
                .map(e -> e.chars()
                        .mapToObj(x->(int)x).reduce(0, (a,b) -> (a) + (b) - 96)
                        )
                .collect(Collectors.toList()).indexOf(words.stream()
                        .map(e1 -> e1.chars()
                                .mapToObj(x1 ->(int) x1).reduce(0, (a1, b1) -> (a1) + (b1) - 96)
                                )
                        .collect(Collectors.toList()).stream()
                    .mapToInt(v -> v)
                    .max().orElse(0)));
    }

    ////////////////////////// Community Variant //////////////

    public static String high2(String s) {
        return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum()
                )).get();
    }

}

