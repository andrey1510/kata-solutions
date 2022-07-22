//https://www.codewars.com/kata/55c6126177c9441a570000cc

package level5;

import java.util.Arrays;
import java.util.List;

public class WeightSort {

    public static String orderWeight(String strng) {
        List<String> list = Arrays.asList(strng.split(" "));
        list.sort((o1, o2) -> {
            int comp = summarize(o1) - summarize(o2);
             if (comp == 0) {
                return o1.compareTo(o2);
            } else {
                if (comp < 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        return String.join(" ", list);
    }

    private static int summarize(String list) {
        String[] word = list.split("");
        int j = 0;
        for (String s : word) {
            j += Integer.parseInt(s);
        }
        return j;
    }


}
