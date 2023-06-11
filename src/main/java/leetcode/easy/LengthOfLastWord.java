package leetcode.easy;

//https://leetcode.com/problems/length-of-last-word/description/

import java.util.Arrays;
import java.util.stream.Collectors;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        return Arrays.stream(s.strip().split(" "))
                .collect(Collectors.toList()).get((int) Arrays.stream(s.strip().split(" ")).count()-1).strip().length();
    }


}
