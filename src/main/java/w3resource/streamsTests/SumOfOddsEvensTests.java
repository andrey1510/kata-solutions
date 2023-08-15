package w3resource.streamsTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import w3resource.streams.SumOfOddsEvens;

import java.util.Arrays;
import java.util.List;

public class SumOfOddsEvensTests {

    @Test
    public void testSumOdds() {
        Assertions.assertEquals(4, SumOfOddsEvens.sumOdds(Arrays.asList(4, 2, 1, 3)));
        Assertions.assertEquals(-5, SumOfOddsEvens.sumOdds(Arrays.asList(-2, -6, 1, -3, -3)));
        Assertions.assertEquals(1, SumOfOddsEvens.sumOdds(List.of(1)));
        Assertions.assertEquals(0, SumOfOddsEvens.sumOdds(Arrays.asList(0, 0, 0, 0)));
        Assertions.assertEquals(0, SumOfOddsEvens.sumOdds(List.of()));
    }

    @Test
    public void testSumEvens() {
        Assertions.assertEquals(6, SumOfOddsEvens.sumEvens(Arrays.asList(4, 2, 1, 3)));
        Assertions.assertEquals(-6, SumOfOddsEvens.sumEvens(Arrays.asList(-2, -6, 2, -3, -3)));
        Assertions.assertEquals(2, SumOfOddsEvens.sumEvens(List.of(2)));
        Assertions.assertEquals(0, SumOfOddsEvens.sumEvens(Arrays.asList(0, 0, 0, 0)));
        Assertions.assertEquals(0, SumOfOddsEvens.sumEvens(List.of()));
    }

}
