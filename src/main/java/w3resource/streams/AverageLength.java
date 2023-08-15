package w3resource.streams;

import java.util.List;

public class AverageLength {

    public static double calculateAverageLength(List<String> words) {
        return words.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0);
    }

}
