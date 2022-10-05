package codewars.level7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfNumbers {

    public int getSum(int a, int b) {
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(a, b)).stream()
                .sorted()
                .collect(Collectors.toList());
        return IntStream.rangeClosed(numbersList.get(0), numbersList.get(1)).sum();
    }

    /////////////////////////// Community variant ////////////////////////////////////

    public int getSum2(int a, int b) {
        return IntStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();
    }

}
