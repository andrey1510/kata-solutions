package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class Candies {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0;
        int bobTotal = 0;

        for (int size : aliceSizes) {
            aliceTotal += size;
        }

        for (int size : bobSizes) {
            bobTotal += size;
        }

        int difference = (aliceTotal - bobTotal) / 2;

        Set<Integer> bobSet = new HashSet<>();
        for (int size : bobSizes) {
            bobSet.add(size);
        }

        for (int size : aliceSizes) {
            if (bobSet.contains(size - difference)) {
                return new int[]{size, size - difference};
            }
        }

        return new int[]{0, 0};
    }
}
