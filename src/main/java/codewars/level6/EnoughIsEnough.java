package codewars.level6;

// https://www.codewars.com/kata/554ca54ffa7d91b236000023/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int element : elements) {
            int count = occurrences.getOrDefault(element, 0);
            if (count < maxOccurrences) {
                result.add(element);
                occurrences.put(element, count + 1);
            }
        }

        int[] finalResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            finalResult[i] = result.get(i);
        }

        return finalResult;
    }

}
