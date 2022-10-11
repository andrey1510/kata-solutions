// https://www.codewars.com/kata/58fa273ca6d84c158e000052/

package codewars.level7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NumberOfDecimalDigits {
    public static int Digits(long n) {
        return (int) Arrays.stream(Long.toString(n).split(""))
                .count();

    }

}
