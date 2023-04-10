package codewars.level6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MoreZeros {

    public static char[] moreZeros(String s) {

        char[] chars = s.toCharArray();
        List<String> filteredChars = new ArrayList<>();

        for (char aChar : chars) {
            List<String> binary = Arrays.asList(Integer.toBinaryString(aChar).split(""));
            if (binary.get(0).equals("0")) binary.remove(0);
            if ( binary.stream().filter(e -> e.equals("0")).count() > binary.stream().filter(e1 -> e1.equals("1")).count())  {
                filteredChars.add(String.valueOf(aChar));
            }
        }
        return filteredChars.stream().distinct().collect(Collectors.joining("")).toCharArray();
    }
}

