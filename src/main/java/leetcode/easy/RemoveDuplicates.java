package leetcode.easy;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        LinkedHashSet<Integer> numsSet = new LinkedHashSet<>();

        for (int num : nums) numsSet.add(num);

        int i = 0;

        for(int num : numsSet) nums[i++] = num;

        return numsSet.size();

    }

}
