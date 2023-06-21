package leetcode.easy;

//https://leetcode.com/problems/monotonic-array/

public class IsMonotonic {
    public boolean isMonotonic(int[] nums) {
        boolean incr = true;
        boolean decr = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) decr = false;
            else if (nums[i] < nums[i - 1]) incr = false;
        }
        return incr || decr;
    }
}
