package codewars.level7;

//https://www.codewars.com/kata/56747fd5cb988479af000028/java

import java.util.List;
import java.util.stream.Collectors;

public class GetMiddle {
    public static String getMiddle(String word) {
        List<Character> list = word.chars()
                .mapToObj(e -> (char)e)
                .collect(Collectors.toList());
        if (list.size() == 1) {
            return String.valueOf(list.get(0));
        } else if ((list.size() % 2) != 0 ) {
            return String.valueOf(list.get(list.size() / 2));
        } else {
            return String.valueOf(list.get((list.size() / 2) - 1)) + (list.get(list.size() / 2));
        }
    }
}
