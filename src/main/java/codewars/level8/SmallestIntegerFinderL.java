package codewars.level8;

import java.util.Arrays;

public class SmallestIntegerFinderL {

    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[]{6, 4, 22, 15}));
    }
}
