package leetcode.easy;

//https://leetcode.com/problems/majority-element/

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums).forEach(num -> map.put(num, map.getOrDefault(num, 0) + 1));
        return map.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).orElseThrow().getKey();
    }

}
