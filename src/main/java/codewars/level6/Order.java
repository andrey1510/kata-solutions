package codewars.level6;

import java.util.*;

public class Order {

    public static String order(String words) {

        if (words.isEmpty()) return "";

        List<String> wordsList = new ArrayList<>(Arrays.asList(words.split(" ")));

        Map<Integer, String> wordsMap = new TreeMap<>();

        for (String s : wordsList) {
            wordsMap.put(Integer.parseInt(s.replaceAll("[^0-9]", "")) - 1, s);
        }

        return String.join(" ", wordsMap.values());
    }

    ////////////////////// community variant //////////////

    public static String order2(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .reduce((a, b) -> a + " " + b).get();
    }

}

