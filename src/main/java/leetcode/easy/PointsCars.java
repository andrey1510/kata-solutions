package leetcode.easy;

//https://leetcode.com/problems/points-that-intersect-with-cars/

import java.util.List;

public class PointsCars {

    public static int numberOfPoints(List<List<Integer>> nums) {

        int maxEnd = Integer.MIN_VALUE;
        int minStart = Integer.MAX_VALUE;
        int count = 0;

        for (List<Integer> car : nums) {
            minStart = Math.min(minStart, car.get(0));
            maxEnd = Math.max(maxEnd, car.get(1));
        }

        for (int i = minStart; i <= maxEnd; i++) {
            for (List<Integer> car : nums) {
                if (i >= car.get(0) && i <= car.get(1)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {
        List<List<Integer>> nums1 = List.of(
                List.of(3, 6),
                List.of(1, 5),
                List.of(4, 7)
        );
        List<List<Integer>> nums2 = List.of(
                List.of(1, 3),
                List.of(5, 8)
        );
    }

}
