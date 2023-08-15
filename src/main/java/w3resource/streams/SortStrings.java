package w3resource.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStrings {

    public static List<String> sortStringAsc(List<String> words) {
        return words.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<String> sortStringDesc(List<String> words) {
        return words.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

}

