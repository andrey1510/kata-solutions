package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DuplicateZeros {

    public static int[] duplicateZeros(int[] arr) {
        String str = Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining())
                .replace("0", "00")
                .substring(0, arr.length);
        return Arrays.stream(str.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

