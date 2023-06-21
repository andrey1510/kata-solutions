package leetcode.easy;

import java.util.Arrays;

//https://leetcode.com/problems/height-checker/
public class HeightChecker {
    public int heightChecker(int[] heights) {
        int result = 0;
        int[] expected = heights.clone();
        Arrays.sort(expected);
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) result++;
        }
        return result;
    }
}
