// https://www.codewars.com/kata/5ac6932b2f317b96980000ca/

package codewars.level7;

import java.util.Arrays;

public class FormMinimum {

    public static int minValue(int[] values){
        return Integer.parseInt(Arrays.stream(Arrays.stream(values).distinct().sorted().toArray())
                .mapToObj(Integer::toString)
                .reduce("", String::concat));
    }
}

