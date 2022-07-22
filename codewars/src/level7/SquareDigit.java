package level7;

//https://www.codewars.com/kata/546e2562b03326a88e000020/train/java

import java.util.Arrays;
import java.util.stream.Collectors;

////////////////////////////// Variant 1 ///////////////////////////

public class SquareDigit {
    public int squareDigits(int n) {
        int[] i = Arrays.stream(String.valueOf(n).split(""))
                .mapToInt(Integer::parseInt)
                .map(e -> e*e)
                .toArray();
        return Integer.parseInt(
                Arrays.toString(i)
                        .replaceAll(", ", "")
                        .replaceAll("\\[", "")
                        .replaceAll("]", "")
        );
    }

///////////////////////////// Community variant ////////////////////////////////////

    public int squareDigits2(int n) {
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(e -> Integer.parseInt(String.valueOf((char)e)))
                .map(e -> e*e)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));
    }
}
