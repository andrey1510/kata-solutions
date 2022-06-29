package level7;

//https://www.codewars.com/kata/53dbd5315a3c69eed20002dd

import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(e -> e instanceof Integer)
                .filter(e -> (int) e >= 0)
                .collect(Collectors.toList());
    }
}
