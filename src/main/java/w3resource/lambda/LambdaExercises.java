package w3resource.lambda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExercises {

    // https://www.w3resource.com/java-exercises/lambda/java-lambda-exercise-5.php
    public static List<String> sortList(List<String> words) {
        ArrayList<String> sortedList = new ArrayList<>(words);
        // words.sort((word1, word2) -> word1.compareToIgnoreCase(word2));
        sortedList.sort(String::compareToIgnoreCase);
        return sortedList;
    }

    //https://www.w3resource.com/java-exercises/lambda/java-lambda-exercise-7.php
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    //https://www.w3resource.com/java-exercises/lambda/java-lambda-exercise-10.php
    public static String concatenateStrings(String word1, String word2) {
        BiFunction<String, String, String> concatenate = (str1, str2) -> str1 + str2;
        return concatenate.apply(word1, word2);
    }

    // https://www.w3resource.com/java-exercises/lambda/java-lambda-exercise-13.php
    public static int countWords(String sentence) {
        return Stream.of(sentence.split(" "))
                .map(word -> 1)
                .reduce(0, Integer::sum);         // .reduce(0, (a, b) -> a + b);
    }

    // https://www.w3resource.com/java-exercises/lambda/java-lambda-exercise-16.php
    public static boolean checkWordPresenceInList(List<String> words, String wordToFind) {

//        Predicate <String> containsWord = word -> word.equals(wordToFind);
//        return words.stream().anyMatch(containsWord);

        return words.stream().anyMatch(word -> word.equals(wordToFind));
    }

    // https://www.w3resource.com/java-exercises/lambda/java-lambda-exercise-17.php
    public static List<Integer> findLengthOfLongestAndSmallestStringInList(List<String> words) {
        int longest = words.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);
        int smallest = words.stream()
                .mapToInt(String::length)
                .min()
                .orElse(0);
        return new ArrayList<>(Arrays.asList(longest, smallest));
    }

    //https://www.w3resource.com/java-exercises/lambda/java-lambda-exercise-19.php
    public static List<Integer> findSecondLargestAndSmallest(List<Integer> numbers) {
        Integer secondSmallest = numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(0);
        Integer secondLargest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        return new ArrayList<>(Arrays.asList(secondSmallest, secondLargest));
    }

    // https://www.w3resource.com/java-exercises/lambda/java-lambda-exercise-23.php
    public static double findAverageLength(List<String> words) {
        return words.stream()
                .mapToInt(String::length)           // ( word -> word.length() )
                .average()
                .orElse(0);
    }

}

