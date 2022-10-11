//https://www.codewars.com/kata/5ba38ba180824a86850000f7/

package codewars.level7;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RemoveDuplicates {

    //ToDo

    public static int [] solve(int [] arr){
        int[] lastElement = new int[]{arr[arr.length-1]};
        int [] sortedArray = Arrays.stream(arr)
                .limit(arr.length-2)
                .distinct()
                .toArray();
        return Stream.of(sortedArray,lastElement).flatMapToInt(IntStream::of)
                .toArray();
    }

}
