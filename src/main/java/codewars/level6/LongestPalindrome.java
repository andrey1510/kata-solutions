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

class LongestPalindromeTests {
    @Test
    public void basicTests() {
        doTest("a", 1);
        doTest("aa", 2);
        doTest("baa", 2);
        doTest("aab", 2);
        doTest("zyabyz", 1);
        doTest("baabcd", 4);
        doTest("baablkj12345432133d", 9);
        doTest("I like racecars that go fast", 7);
    }
    private void doTest(final String s, int expected) {
        assertEquals(expected, LongestPalindrome.longestPalindrome(s));
    }
}