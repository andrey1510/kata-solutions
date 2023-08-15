package w3resource.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StringsCase {

    public static List<String> convertToUppercase(List<String> words) {
        return words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static List<String> convertToLowercase(List<String> words) {
        return words.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

}

