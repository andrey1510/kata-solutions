package codewars.level6;

import java.util.stream.Stream;

public class PersistentBugger {

    public static int persistence(long num) {
        int count = 0;

        while (num >= 10) {
            num = Stream.of(String.valueOf(num).split(""))
                    .mapToInt(Integer::parseInt)
                    .reduce(1, (a, b) -> a * b);
            count++;
        }

        return count;
    }
}
