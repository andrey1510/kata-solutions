package leetcode.easy;

//https://leetcode.com/problems/summary-ranges/solutions


import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {

        List<String> list = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {

            if(i < nums.length-1 && (nums[i+1] - nums[i] == 1)) counter++;
            else {
                if(counter == 0) {
                    list.add(String.valueOf(nums[i]));
                } else {
                    list.add(nums[i-counter] + "->" + nums[i]);
                    counter = 0;
                }
            }

        }

        return list;
    }

}
