package codewars.level7;

//https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9

import java.util.List;

public class LineNumbering {

    public static List<String> number(List<String> lines) {
        lines.replaceAll(e -> ((lines.indexOf(e)+1) + ": " + e));
        return lines;
    }

}
