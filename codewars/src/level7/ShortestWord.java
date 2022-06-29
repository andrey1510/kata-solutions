package level7;

//https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/java

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ShortestWord {

//////////////////// Variant 1 ////////////////////////////

    public static int findShort(String s) {
        List<String> arr = Arrays.asList(s.split(" "));
        String w = arr.stream()
                .min(Comparator.comparing(String::length))
                .orElseThrow(null);
        return w.length();
    }

//////////////////// Variant 2 ////////////////////////////

    public static int findShort2(String s2) {
        return Arrays.stream(s2.split(" "))
                .mapToInt(String::length)
                .min().orElseThrow(null);
    }
}
