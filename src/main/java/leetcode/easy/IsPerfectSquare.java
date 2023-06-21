package leetcode.easy;

//https://leetcode.com/problems/valid-perfect-square/

public class IsPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}
