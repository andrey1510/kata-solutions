package codewars.level6;

import java.util.Arrays;

public class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        int n = strarr.length;

        if (k <= 0 || k > n) return "";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n - k + 1; i++) {
            String str = Arrays.stream(strarr, i, i + k).reduce("", (s1, s2) -> s1 + s2);
            if (str.length() > result.length()) {
                result = new StringBuilder(str);
            }
        }

        return result.toString();
    }

}
