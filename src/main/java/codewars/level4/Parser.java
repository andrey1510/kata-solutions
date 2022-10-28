package codewars.level4;

import java.util.*;
import java.util.stream.Collectors;

public class Parser {

    public static int parseInt(String numStr) {

        Map<String, Integer> numbersTillHundred = new HashMap<>();
        {
            numbersTillHundred.put("zero", 0);
            numbersTillHundred.put("one", 1);
            numbersTillHundred.put("two", 2);
            numbersTillHundred.put("three", 3);
            numbersTillHundred.put("four", 4);
            numbersTillHundred.put("five", 5);
            numbersTillHundred.put("six", 6);
            numbersTillHundred.put("eight", 8);
            numbersTillHundred.put("nine", 9);
            numbersTillHundred.put("ten", 10);
            numbersTillHundred.put("eleven", 11);
            numbersTillHundred.put("twelve",12);
            numbersTillHundred.put("thirteen",13);
            numbersTillHundred.put("fourteen",14);
            numbersTillHundred.put("fifteen",15);
            numbersTillHundred.put("sixteen", 16);
            numbersTillHundred.put("seventeen", 17);
            numbersTillHundred.put("nineteen", 19);
            numbersTillHundred.put("thirty", 30);
            numbersTillHundred.put("forty", 40);
            numbersTillHundred.put("fifty", 50);
            numbersTillHundred.put("sixty", 60);
            numbersTillHundred.put("seventy", 70);
            numbersTillHundred.put("eighty", 80);
            numbersTillHundred.put("ninety", 90);
        }

        Map<String, Integer> numbersFromHundred = new HashMap<>();
        {
            numbersFromHundred.put("hundred", 100);
            numbersFromHundred.put("thousand", 1000);
            numbersFromHundred.put("million", 1000000);
        }

        List<String> words = Arrays.stream(numStr.replaceAll(" and ", " ").replaceAll("-", "")
                .split(""))
                .collect(Collectors.toList());


       // if ()



        return 0;
    }





}
