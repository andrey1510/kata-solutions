package leetcode.easy;

//https://leetcode.com/problems/running-sum-of-1d-array/

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int previous = 0;
        for(int i=1; i < nums.length; i++) {
            previous = nums[i - 1];
            nums[i] += previous;
        }
        return nums;
    }


}
