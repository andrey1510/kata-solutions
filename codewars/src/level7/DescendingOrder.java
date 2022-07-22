// https://www.codewars.com/kata/5467e4d82edf8bbf40000155

package level7;

import java.util.*;
import java.util.stream.Collectors;

public class DescendingOrder {

    /////////////////////// Variant 1 ////////////////////////

    public static int sortDesc(final int num) {
        String s = String.valueOf(num);
        int[] i = Arrays.stream(s.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();
        List<Integer> l = Arrays.stream(i)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        String result = l.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(""));
        return Integer.parseInt(result);
    }

    ///////////////////// Variant 2 //////////////////////////

    public static int sortDesc2(final int num) {
        String[] s = String.valueOf(num).split("");
        Arrays.sort(s, Collections.reverseOrder());
        return Integer.parseInt(String.join("", s));
    }

    ///////////////////// Community variant //////////////////////////

    public static int sortDesc3(final int num) {
        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }

}
