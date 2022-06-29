package level7;

//https://www.codewars.com/kata/546e2562b03326a88e000020/train/java

import java.util.Arrays;
import java.util.stream.Collectors;

////////////////////////////// Variant 1 ///////////////////////////

public class SquareDigit {
    public int squareDigits(int n) {
        String s = String.valueOf(n);
        int[] i = Arrays.stream(s.split(""))
                .mapToInt(Integer::parseInt)
                .map(e -> e*e)
                .toArray();
        String w = Arrays.toString(i);
        return Integer.parseInt(w.replaceAll(", ", "").replaceAll("\\[", "").replaceAll("]", ""));
    }

///////////////////////////// Variant 2 ////////////////////////////////////

    public int squareDigits2(int n2) {
        return Integer.parseInt(String.valueOf(n2)
                .chars()
                .map(e -> Integer.parseInt(String.valueOf((char)e)))
                .map(e -> e*e)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));
    }
}
