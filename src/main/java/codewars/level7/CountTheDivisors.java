// https://www.codewars.com/kata/542c0f198e077084c0000c2e

package codewars.level7;

import java.util.stream.IntStream;

public class CountTheDivisors {
    public long numberOfDivisors(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(i -> (n % i == 0))
                .count();
    }
}
