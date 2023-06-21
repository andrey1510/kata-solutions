package leetcode.easy;

//https://leetcode.com/problems/contains-duplicate-ii


import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i]) && (i - map.get(nums[i]) <= k)) return true;
            map.put(nums[i], i);
        }
        return false;
    }
}
