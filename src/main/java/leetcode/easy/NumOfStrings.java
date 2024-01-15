package leetcode.easy;

//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/

import java.util.Arrays;

public class NumOfStrings {
    public static int numOfStrings(String[] patterns, String word) {
        return (int) Arrays.stream(patterns)
                .filter(word::contains)
                .count();
    }

}
