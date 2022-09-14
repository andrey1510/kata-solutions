package other;

import java.util.*;
import java.util.stream.Collectors;

public class CountWords {

    private static final String statement = "aaa xg hcf aaa bbb ihh bbb bbb";

    public static void main(String[] args) {

        String[] words = statement.split(" ");

        var result = Arrays.stream(words).collect(Collectors.groupingBy(e -> e, Collectors.counting() ));
        System.out.println("Unsorted map printed: " + result);

        Comparator<Map.Entry<String, Long>> sortByValue = Map.Entry.comparingByValue();
        //Comparator<Map.Entry<String, Long>> sortByValue = Comparator.comparing(e -> e.getValue());   // alternative

        List<Map.Entry<String, Long>> list = result.entrySet().stream()
                .sorted(sortByValue.reversed())
                .collect(Collectors.toList());

        Map<Object, Object> sortedMap = new LinkedHashMap<>();
        list.forEach(e -> sortedMap.put(e.getKey(), e.getValue()));
        System.out.println("Sorted map printed: " + sortedMap);

    }




}
