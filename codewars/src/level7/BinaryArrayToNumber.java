package level7;

//https://www.codewars.com/kata/578553c3a1b8d5c40300037c/train/java

import java.util.List;

public class BinaryArrayToNumber {

    ////////////////////////// Variant 1 /////////////////////

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return Integer.parseInt(
                String.valueOf(binary)
                        .replaceAll(", ", "")
                        .replaceAll("\\[", "")
                        .replaceAll("]", ""), 2
        );
    }

    ////////////////////////// Variant 2 /////////////////////

    // ToDo

    public static int ConvertBinaryArrayToInt2(List<Integer> binary2) {
        return binary2.stream().reduce((a, b) -> a*2+b).orElseThrow(null);
    }
}
