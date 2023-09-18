package other.testAssignment;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountElements {

    public static Map<Integer, Long> countElements(List<Integer> list) {
        return list.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    }

}

