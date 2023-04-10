package other;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {
        doClassicFizzBuzz(31);
        doStreamFizzBuzz();
    }

    public static void doClassicFizzBuzz(int n) {
        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) {    //
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void doStreamFizzBuzz() {
        List<String> list = IntStream.rangeClosed(1, 100).mapToObj(
                n -> n % 15 == 0 ? "FizzBuzz"
                        : n % 3 == 0 ? "Fizz"
                        : n % 5 == 0 ? "Buzz"
                        : Integer.toString(n)).collect(
                Collectors.toList());
        System.out.println(list);
    }



}

