// https://www.codewars.com/kata/5813d19765d81c592200001a

package codewars.level7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DontGiveMeFive {

    public static int dontGiveMeFive(int start, int end) {
        return (int) IntStream.rangeClosed(start, end).boxed().collect(Collectors.toList()).stream()
                .map(Object::toString)
                .filter(e -> (!e.contains("5")))
                .count();
    }

    ////////////// Community Variant ////////////////////

    public static int dontGiveMeFive2(int start, int end) {
        return (int) IntStream.rangeClosed(start, end)
                .filter(x -> !String.valueOf(x).matches(".*5.*"))
                .count();
    }
}
