package codewars.level4;

import java.util.*;
import java.util.stream.Collectors;

public class Parser {

    private final static Map<String, String> dictionary = new HashMap<>();
    static {
        dictionary.put("zero", "0");
        dictionary.put("one", "1");
        dictionary.put("two", "2");
        dictionary.put("three", "3");
        dictionary.put("four", "4");
        dictionary.put("five", "5");
        dictionary.put("six", "6");
        dictionary.put("eight", "8");
        dictionary.put("nine", "9");
        dictionary.put("ten", "10");
        dictionary.put("eleven", "11");
        dictionary.put("twelve","12");
        dictionary.put("thirteen","13");
        dictionary.put("fourteen","14");
        dictionary.put("fifteen","15");
        dictionary.put("sixteen", "16");
        dictionary.put("seventeen", "17");
        dictionary.put("eighteen", "18");
        dictionary.put("nineteen", "19");
        dictionary.put("twenty", "20");
        dictionary.put("thirty", "30");
        dictionary.put("forty", "40");
        dictionary.put("fifty", "50");
        dictionary.put("sixty", "60");
        dictionary.put("seventy", "70");
        dictionary.put("eighty", "80");
        dictionary.put("ninety", "90");
        dictionary.put("hundred", "100");
        dictionary.put("thousand", "1000");
    }

    public static int parseInt(String numStr) {

        String filteredNumStr = numStr.replaceAll(" and ", " ").replaceAll("-", " ").toLowerCase();

        if (filteredNumStr.contains("million")) {
            return 1000000;
        } else if (filteredNumStr.equals("zero")) {
            return 0;
        }

        for (Map.Entry<String,String> e: dictionary.entrySet()) {
            filteredNumStr = filteredNumStr.replace(e.getKey(), e.getValue());
        }

        System.out.println(filteredNumStr); //////////////////////////////////////////////////////// peek

        List<String> words = Arrays.stream(filteredNumStr.split(" ")).collect(Collectors.toList());

        System.out.println(words); ////////////////////////////////////////////////////////////////// peek




        return 0;
    }


}
