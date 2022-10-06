package codewars.level7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DontGiveMeFive {

    static String regex = "yourRegex";

    public static int dontGiveMeFive(int start, int end) {

        return (int) IntStream.rangeClosed(start, end).boxed().collect(Collectors.toList()).stream()
                .map(Object::toString)
                .filter(e -> (!e.contains("5")))
                .count();

        return IntStream.rangeClosed(start, end).filter(x -> !String.valueOf(x).matches(".*5.*")).count();


        e.matches(".*[0-9&&[^5]]")
        //


[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)

        @Test
        public void exampleTests() {
            assertEquals(8, Kata.dontGiveMeFive(1,9));
            assertEquals(12, Kata.dontGiveMeFive(4,17));

.*[^5]

       // String s =
       //         intStream
       //         .maptoString()
       //         .stream()
        //        .filter(e -> (e.matches("[5]"))).count()




    }
  //  e -> e.matches(regex)

}
