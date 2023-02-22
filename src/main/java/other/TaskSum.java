package other;

import java.util.*;

public class TaskSum {

    public static List<String> calculateWithDoubleFor(int sum, int[] arr) {

        List<String> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    result.add(i + " " + j);
                }
            }
        }

        return result;
    }

    public static String calculateWithDoubleForFirstPair(int sum, int[] arr) {

        String result = null;

        End:
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    result = i + " " + j;
                    break End;
                }
            }
        }

        return result;
    }


}


