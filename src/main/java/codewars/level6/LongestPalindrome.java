package codewars.level6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindrome {

    public static int longestPalindrome(final String s) {

        if (s.length() == 0) return 0;

        int longestSubstr = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                int currentSubstr = j - i + 1;
                if (currentSubstr > longestSubstr && checkPalindrome(s.substring(i, j + 1))) {
                    longestSubstr = currentSubstr;
                }
            }
        }
        return longestSubstr;
    }

    public static boolean checkPalindrome(String s) {

        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

