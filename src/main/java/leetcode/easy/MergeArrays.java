package leetcode.easy;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/description/
public class MergeArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (n >= 0) System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);

    }
}
