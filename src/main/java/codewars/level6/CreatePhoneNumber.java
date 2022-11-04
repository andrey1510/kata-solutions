// https://www.codewars.com/kata/525f50e3b73515a6db000b83

package codewars.level6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        List<String> numbersStrings = Arrays.stream(numbers).boxed().collect(Collectors.toList()).stream()
                .map(Object::toString)
                .collect(Collectors.toList());
        numbersStrings.add(6,"-");
        numbersStrings.add(3," ");
        numbersStrings.add(3,")");
        numbersStrings.add(0,"(");
        return String.join("", numbersStrings);
    }

    ///////////////// Community variant ////////////////

    public static String createPhoneNumber2(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
    }

}
