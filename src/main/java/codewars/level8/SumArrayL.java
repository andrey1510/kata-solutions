package codewars.level8;

import java.util.Arrays;

public class SumArrayL {
    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }

    public static void main(String[] args) {
        System.out.println(sum(new double[]{1, 2, 3}));
        System.out.println(sum(new double[]{-1, 2, -3}));
        System.out.println(sum(new double[]{}));
    }
}
