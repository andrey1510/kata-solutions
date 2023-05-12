package leetcode.easy;

//https://leetcode.com/problems/search-insert-position/description/

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        int result = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
                result = i;
                break;
            }
        }

        return result;
    }

}
