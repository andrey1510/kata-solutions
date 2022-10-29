package codewars.level4;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

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

                    System.out.println("pinsCollector = " + pinsCollector);
                }
            }
           result = pinsCollector;
            System.out.println("result = " + result);
        }
        System.out.println("final result = " + result);
        return result;
    }

}

class TestObservedPin {

    public static HashMap<String, String[]> expectations = new HashMap<String, String[]>() {
        {
          //  put("8", new String[]{"5", "7", "8", "9", "0"});
            put("11", new String[]{"11", "21", "41", "12", "22", "42", "14", "24", "44"});
            put("369", new String[]{"236", "238", "239", "256", "258", "259", "266", "268", "269", "296", "298", "299", "336", "338", "339", "356", "358", "359", "366", "368", "369", "396", "398", "399", "636", "638", "639", "656", "658", "659", "666", "668", "669", "696", "698", "699"});
        }
    };
    private final static Comparator<String> comp = (s1, s2) -> s1.compareTo(s2);

    @Test
    public void testPins() {
        for (String entered : expectations.keySet()) {
            test(entered, Arrays.asList(expectations.get(entered)), ObservedPin.getPINs(entered));
        }
    } // testPins

    private void test(String entered, List<String> expected, List<String> result) {
        result.sort(comp);
        expected.sort(comp);
        Assert.assertEquals("For observed PIN " + entered, expected, result);
    }

} // Test Class

