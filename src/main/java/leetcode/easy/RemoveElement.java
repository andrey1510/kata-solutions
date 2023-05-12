package leetcode.easy;

//https://leetcode.com/problems/remove-element/

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        return (int) Arrays.stream(nums).boxed().collect(Collectors.toList())
                .stream().filter(e -> (e != val)).count();

    }

    public static void main(String[] args) {

        System.out.println(removeElement(new int[] {3, 2, 2, 3}, 2));

    }

}
