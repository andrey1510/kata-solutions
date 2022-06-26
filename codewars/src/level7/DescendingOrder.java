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

    public static int sortDesc2(final int num2) {
        String[] s = String.valueOf(num2).split("");
        Arrays.sort(s, Collections.reverseOrder());
        return Integer.parseInt(String.join("", s));
    }

}
