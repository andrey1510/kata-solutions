// https://www.codewars.com/kata/529eef7a9194e0cbc1000255

package codewars.level7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramDetection {
    public static boolean isAnagram(String test, String original) {
        List<String> testSorted = Arrays.stream(test.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.toList());
        List<String> originalSorted = Arrays.stream(original.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.toList());

        if (test.equals(original)) {
            return false;
        } else return testSorted.equals(originalSorted);

    }

    /////////////// Community variant //////////////
// Does not check whether test and original are the same

    public static boolean isAnagram2(String test, String original) {
        return Stream.of(test.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.joining())
                .equals(
                        Stream.of(original.toLowerCase()
                                .split(""))
                                .sorted()
                                .collect(Collectors.joining()));
    }

}
