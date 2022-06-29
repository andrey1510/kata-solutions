package level7;

//https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9

import java.util.List;
import static java.util.stream.Collectors.toList;

//////////////////// Variant 1 //////////////////
//ToDo

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        return lines.stream()
                .peek(e -> System.out.print(e + " "))
                .map(e -> ((lines.indexOf(e)+1) + ": " + e))
                .peek(e -> System.out.print(e + " "))
                .collect(toList());
    }

//////////////////// Variant 2 //////////////////

    public static List<String> number2(List<String> lines2) {
        lines2.replaceAll(e -> ((lines2.indexOf(e)+1) + ": " + e));
        return lines2;
    }

}
