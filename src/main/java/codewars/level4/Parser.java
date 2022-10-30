package codewars.level4;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Parser {

    private final static Map<String, String> dictionary = new HashMap<>();
    static {
//        dictionary.put("zero", "0");
//        dictionary.put("one", "1");
//        dictionary.put("two", "2");
//        dictionary.put("three", "3");
//        dictionary.put("four", "4");
//        dictionary.put("five", "5");
//        dictionary.put("six", "6");
//        dictionary.put("seven", "7");
//        dictionary.put("eight", "8");
//        dictionary.put("nine", "9");
//        dictionary.put("ten", "10");
//        dictionary.put("eleven", "11");
//        dictionary.put("twelve", "12");
//        dictionary.put("thirteen", "13");
//        dictionary.put("fourteen", "14");
//        dictionary.put("fifteen", "15");
//        dictionary.put("sixteen", "16");
//        dictionary.put("seventeen", "17");
//        dictionary.put("eighteen", "18");
//        dictionary.put("nineteen", "19");
//        dictionary.put("twenty", "20");
//        dictionary.put("thirty", "30");
//        dictionary.put("forty", "40");
//        dictionary.put("fifty", "50");
//        dictionary.put("sixty", "60");
//        dictionary.put("seventy", "70");
//        dictionary.put("eighty", "80");
//        dictionary.put("ninety", "90");
//        dictionary.put("hundred", "100");

        dictionary.put("0","zero");
        dictionary.put("1","one");
        dictionary.put("2","two");
        dictionary.put("3","three");
        dictionary.put("4","four");
        dictionary.put("5","five");
        dictionary.put("6","six");
        dictionary.put("7","seven");
        dictionary.put("8","eight");
        dictionary.put("9","nine");
        dictionary.put("10","ten");
        dictionary.put("11","eleven");
        dictionary.put("12","twelve");
        dictionary.put("13","thirteen");
        dictionary.put("14","fourteen");
        dictionary.put("15","fifteen");
        dictionary.put("16","sixteen");
        dictionary.put("17","seventeen");
        dictionary.put("18","eighteen");
        dictionary.put("19","nineteen");
        dictionary.put("20","twenty");
        dictionary.put("30","thirty");
        dictionary.put("40","forty");
        dictionary.put("50","fifty");
        dictionary.put("60","sixty");
        dictionary.put("70","seventy");
        dictionary.put("80","eighty");
        dictionary.put("90","ninety");
        dictionary.put("100","hundred");

    }

    public static int parseInt(String numStr) {

        if (numStr.contains("illion")) return 1000000;

        String cleanNumStr = numStr
                .replaceAll(" and ", " ")
                .replaceAll("-", " ")
                .toLowerCase();

        String thousandToMillionPart = "0";
        String zeroToThousandPart = cleanNumStr;

        if (cleanNumStr.contains("thousand")) {
            thousandToMillionPart = cleanNumStr.substring(0, cleanNumStr.indexOf("thousand"));
            zeroToThousandPart = cleanNumStr.contains("thousand ") ? cleanNumStr.substring(cleanNumStr.indexOf("thousand") + 9) : "0";
        }

        return sumPart(thousandToMillionPart)*1000 + sumPart(zeroToThousandPart);
    }

    private static int sumPart(String part) {

        if (part.equals("0")) return 0;

        List<String> verbalNumbers = Arrays.stream(part.split(" "))
                .collect(Collectors.toList());

        verbalNumbers.forEach(value -> {
            String mapKey = dictionary.entrySet()
                    .stream()
                    .filter(entry -> Objects.equals(entry.getValue(), value))
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElseThrow();
            int index = verbalNumbers.indexOf(value);
            verbalNumbers.set(index, mapKey);
        });

        List<Integer> digitalNnumbers = verbalNumbers.stream()
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

class SolutionTest {

    @Test
    public void parserTests() {
        assertEquals(0 , Parser.parseInt("zero"));
        assertEquals(3 , Parser.parseInt("three"));
        assertEquals(60 , Parser.parseInt("sixty"));
        assertEquals(100 , Parser.parseInt("one hundred"));
        assertEquals(425 , Parser.parseInt("four hundred twenty-five"));
        assertEquals(425 , Parser.parseInt("Four Hundred Twenty-Five"));
        assertEquals(425 , Parser.parseInt("four hundred and twenty-five"));
        assertEquals(200000 , Parser.parseInt("two hundred thousand"));
        assertEquals(915743 , Parser.parseInt("nine hundred fifteen thousand seven hundred forty-three"));
        assertEquals(801500 , Parser.parseInt("eight hundred one thousand five hundred"));
        assertEquals(1000000 , Parser.parseInt("one million"));
    }
}



//ToDo - to samples

//        for (Map.Entry<String,String> e: dictionary.entrySet()) {
//            filteredNumStr = filteredNumStr.replace(e.getKey(), e.getValue());
//        }


//                        .map ((v) -> {
//                                if (v.equals(100)) {
//                                v = 100 * 1000000;
//                                }
//                                return v;
//                                })

