package level7;

//https://www.codewars.com/kata/56606694ec01347ce800001b/train/java

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c){
        List<Integer> n = Stream.of(a, b, c)  // better than:    new ArrayList<>(Arrays.asList(a, b, c)).stream()
                .sorted()
                .collect(Collectors.toList());
        return n.get(0) + n.get(1) > n.get(2);
    }
}
