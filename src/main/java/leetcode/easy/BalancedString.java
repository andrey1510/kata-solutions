package leetcode.easy;

public class BalancedString {

    public int balancedStringSplit(String s) {
        int count = 0;
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == 'L') {
                balance++;
            } else if (c == 'R') {
                balance--;
            }
            if (balance == 0) {
                count++;
            }
        }

        return count;
    }
}
