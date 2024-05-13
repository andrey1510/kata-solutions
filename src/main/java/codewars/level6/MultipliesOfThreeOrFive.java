package codewars.level6;

// https://www.codewars.com/kata/514b92a657cdc65150000006

import java.util.stream.IntStream;

public class MultipliesOfThreeOrFive {

    public int solution(int number) {
        return (number <= 0) ? 0 : IntStream.range(1,number).filter(e -> e%3==0 || e%5==0).sum();
    }


}

