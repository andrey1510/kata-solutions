package codewars.level6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://www.codewars.com/kata/523f5d21c841566fde000009

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {

        List<Integer> aList = new ArrayList<>();
        Set<Integer> bSet = Arrays.stream(b).boxed().collect(Collectors.toSet());

        for (int n : a) {
            if (!bSet.contains(n)) {
                aList.add(n);
            }
        }

        return aList.stream().mapToInt(i->i).toArray();

    }

    /////// Community solution ///////////

    public static int[] arrayDiff2(int[] a, int[] b) {
        return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
    }

}
