package codewars.level4;

// https://www.codewars.com/kata/525c7c5ab6aecef16e0001a5

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
        dictionary.put("seven", "7");
        dictionary.put("eight", "8");
        dictionary.put("nine", "9");
        dictionary.put("ten", "10");
        dictionary.put("eleven", "11");
        dictionary.put("twelve", "12");
        dictionary.put("thirteen", "13");
        dictionary.put("fourteen", "14");
        dictionary.put("fifteen", "15");
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
        dictionary.put("3teen", "13");
        dictionary.put("4teen", "14");
        dictionary.put("5teen", "15");
        dictionary.put("6teen", "16");
        dictionary.put("7teen", "17");
        dictionary.put("8teen", "18");
        dictionary.put("9teen", "19");
        dictionary.put("3een", "13");
        dictionary.put("4een", "14");
        dictionary.put("5een", "15");
        dictionary.put("6een", "16");
        dictionary.put("7een", "17");
        dictionary.put("8een", "18");
        dictionary.put("9een", "19");
        dictionary.put("2ty", "20");
        dictionary.put("3ty", "30");
        dictionary.put("4ty", "40");
        dictionary.put("5ty", "50");
        dictionary.put("6ty", "60");
        dictionary.put("7ty", "70");
        dictionary.put("8ty", "80");
        dictionary.put("9ty", "90");
    }

    public static int parseInt(String numStr) {

        if (numStr.contains("illion")) return 1000000;

        String cleanNumStr = numStr
                .replaceAll(" and ", " ")
                .replaceAll("-", " ")
                .toLowerCase();

        String thousandToMillionPart = "zero";
        String zeroToThousandPart = cleanNumStr;

        if (cleanNumStr.contains("thousand")) {
            thousandToMillionPart = cleanNumStr.substring(0, cleanNumStr.indexOf("thousand"));
            zeroToThousandPart = cleanNumStr.contains("thousand ") ? cleanNumStr.substring(cleanNumStr.indexOf("thousand") + 9) : "zero";
        }

        return  sumPart(thousandToMillionPart)*1000 + sumPart(zeroToThousandPart);
    }


    private static int sumPart(String part) {

        if (part.equals("zero")) return 0;

        for (Map.Entry<String,String> e: dictionary.entrySet()) {
            part = part.replace(e.getKey(), e.getValue());
        }

        List<Integer> digitalNnumbers = Arrays.stream(part.split(" "))
                .collect(Collectors.toList()).stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        if (digitalNnumbers.size() > 1 && digitalNnumbers.get(1) == 100) {
            digitalNnumbers.set(1, digitalNnumbers.get(1) * digitalNnumbers.get(0));
            digitalNnumbers.remove(0);
        }

        return digitalNnumbers.stream()
                .reduce(0, Integer::sum);
    }
}


//ToDo - to samples

//        for (Map.Entry<String,String> e: dictionary.entrySet()) {
//        verbalNumbers1 = verbalNumbers1.replace(e.getKey(), e.getValue());
//        }


//                        .map ((v) -> {
//                                if (v.equals(100)) {
//                                v = 100 * 1000000;
//                                }
//                                return v;
//                                })

