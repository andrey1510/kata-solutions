package w3resource.lambda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static w3resource.lambda.LambdaExercises.checkWordPresenceInList;
import static w3resource.lambda.LambdaExercises.concatenateStrings;
import static w3resource.lambda.LambdaExercises.countWords;
import static w3resource.lambda.LambdaExercises.findAverageLength;
import static w3resource.lambda.LambdaExercises.findLengthOfLongestAndSmallestStringInList;
import static w3resource.lambda.LambdaExercises.findSecondLargestAndSmallest;
import static w3resource.lambda.LambdaExercises.removeDuplicates;
import static w3resource.lambda.LambdaExercises.sortList;

class LambdaExercisesTests {

    @Test
    public void testSortList() {
        List<String> colorsListSorted = new ArrayList<>(Arrays.asList("Blue", "Green", "Red", "Yellow"));
        List<String> colorsList = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Yellow"));

        Assertions.assertEquals(colorsListSorted, sortList(colorsList));
    }

    @Test
    public void testRemoveDuplicates() {
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 10, 10, 13));
        List<Integer> numbersNoDublicates = new ArrayList<>(Arrays.asList(1, 2, 3, 10, 13));

        Assertions.assertEquals(numbersNoDublicates, removeDuplicates(numbersList));
    }

    @Test
    public void testConcatenateStrings() {
        Assertions.assertEquals("hello world", concatenateStrings("hello ", "world"));
    }

    @Test
    public void testCountWords() {
        List<String> colorsList = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Yellow"));

        Assertions.assertEquals(4, countWords("Red Blue Green Yellow"));
    }

    @Test
    public void testCheckWordPresence() {
        List<String> colorsList = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Yellow"));

        Assertions.assertTrue(checkWordPresenceInList(colorsList, "Green"));
        Assertions.assertFalse(checkWordPresenceInList(colorsList, "Purple"));
    }

    @Test
    public void testFindLengthOfLongestAndSmallestStringInList() {
        List<String> colorsList = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Yellow"));

        Assertions.assertEquals(new ArrayList<>(Arrays.asList(6, 3)), findLengthOfLongestAndSmallestStringInList(colorsList));
    }

    @Test
    public void testFindSecondLargestAndSmallest() {
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 10, 10, 13));

        Assertions.assertEquals(new ArrayList<>(Arrays.asList(2, 10)), findSecondLargestAndSmallest(numbersList));
    }


    @Test
    public void testFindAverageLength() {
        List<String> colorsList = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Yellow"));

        Assertions.assertEquals(4.5, findAverageLength(colorsList));
    }


}
