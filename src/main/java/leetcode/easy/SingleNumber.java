package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/single-number/description/

public class SingleNumber {
    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.contains(num)) {
                list.remove((Integer) num);
            } else {
                list.add(num);
            }
        }
        return list.get(0);
    }
}
