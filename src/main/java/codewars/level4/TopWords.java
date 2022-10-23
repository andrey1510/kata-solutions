// https://www.codewars.com/kata/51e056fe544cf36c410000fb

package codewars.level4;

import java.util.*;
import java.util.function.Function;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TopWords {

    public static List<String> top3(String s) {

        return Pattern.compile("[a-zA-Z]['a-zA-Z]*").matcher(s.toLowerCase())
                .results()
                .map(MatchResult::group)
                .collect(Collectors.toMap(Function.identity(), word -> 1, Integer::sum))
                .entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))   // Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder())
                    .limit(3)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());
    }


    ////////// The same, but ot inlined //////////////////

//    Map<String, Integer> allWords = Pattern.compile("[a-zA-Z]['a-zA-Z]*").matcher(s.toLowerCase())
//            .results()
//            .map(MatchResult::group)
//            .collect(Collectors.toMap(Function.identity(), word -> 1, Integer::sum));
//
//    List<String> mostUsedWords = allWords.entrySet().stream()
//            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))   // Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder())
//            .limit(3)
//            .map(Map.Entry::getKey)
//            .collect(Collectors.toList());
//
//        return mostUsedWords;
}
