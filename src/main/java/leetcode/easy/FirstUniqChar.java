package leetcode.easy;

//https://leetcode.com/problems/first-unique-character-in-a-string/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FirstUniqChar {

    public static int firstUniqChar(String s) {
        List<String> elements = Arrays.asList(s.split(""));
        String unique = elements.stream()
                .filter(element -> Collections.frequency(elements, element) == 1)
                .findFirst().orElse("none");
        if (unique.equals("none")) return -1;
        return elements.indexOf(unique);
    }

}
