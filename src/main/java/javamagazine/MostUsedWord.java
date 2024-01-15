package javamagazine;

// https://blogs.oracle.com/javamagazine/post/java-quiz-collectors-comparators

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostUsedWord {

    public static String findWord (List<String> words) {
        return words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(Map.Entry::getKey)
                .findFirst().orElseThrow();

    }

}

