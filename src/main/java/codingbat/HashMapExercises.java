package codingbat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapExercises {

    // https://codingbat.com/prob/p125327
    public static Map<String, Integer> calculateWordLength(List<String> words){
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, word.length());
        }
        return map;
    }
    public static Map<String, Integer> calculateWordLengthAlt(List<String> words){
        return words.stream()
                .collect(Collectors.toMap(str -> str, String::length));      // str -> str.length()
    }

    // https://codingbat.com/prob/p126332
    public static Map<String, String> firstAndLastCharsToMap(List<String> words){
        Map<String, String> charMap = new HashMap<>();
        for (String word : words) {
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length() - 1);
            charMap.put(String.valueOf(firstChar), String.valueOf(lastChar));
        }
        return charMap;
    }

    public static Map<String, String> firstAndLastCharsToMapAlt(List<String> words){
        return words.stream()
                .collect(Collectors.toMap(str -> String.valueOf(str.charAt(0)), str -> String.valueOf(str.charAt(str.length() - 1))));
    }

}

