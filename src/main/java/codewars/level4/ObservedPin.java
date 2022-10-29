package codewars.level4;

import java.util.*;

public class ObservedPin {

    private static final Map<String, List<String>> pinsCombinations = new HashMap<>();
    static {
        pinsCombinations.put("1", new ArrayList<>(Arrays.asList("1", "2", "4")));
        pinsCombinations.put("2", new ArrayList<>(Arrays.asList("1", "2", "3", "5")));
        pinsCombinations.put("3", new ArrayList<>(Arrays.asList("2", "3", "6")));
        pinsCombinations.put("4", new ArrayList<>(Arrays.asList("1", "4", "5", "7")));
        pinsCombinations.put("5", new ArrayList<>(Arrays.asList("2", "4", "5", "6", "8")));
        pinsCombinations.put("6", new ArrayList<>(Arrays.asList("3", "5", "6", "9")));
        pinsCombinations.put("7", new ArrayList<>(Arrays.asList("4", "7", "8")));
        pinsCombinations.put("8", new ArrayList<>(Arrays.asList("5", "7", "8", "9", "0")));
        pinsCombinations.put("9", new ArrayList<>(Arrays.asList("6", "8", "9")));
        pinsCombinations.put("0", new ArrayList<>(Arrays.asList("0", "8")));
    }

    public static List<String> getPINs(String observed) {
        List<String> pinsObserved = new ArrayList<>(Arrays.asList(observed.split("")));
        List<String> result =  new ArrayList<>(Collections.singleton(""));

        for (String digitObserved : pinsObserved) {
            List<String> pinsCollector = new ArrayList<>();
            for (String digitCombination : pinsCombinations.get(digitObserved)) {
                for (String pinVariant : result) {
                    pinsCollector.add(pinVariant + digitCombination);
                }
            }
           result = pinsCollector;
        }

        return result;
    }
}
