package w3resource.lambdas;

import java.util.function.BiFunction;

// https://www.w3resource.com/java-exercises/lambda/java-lambda-exercise-10.php

public class StringConcatenation {
    public static void main(String[] args) {
        // Define the concatenate lambda expression
        BiFunction<String, String, String> concatenate = (str1, str2) -> str1 + str2;

        // Concatenate two strings using the lambda expression
        String string1 = "Good ";
        String string2 = "Morning!";
        System.out.println("Original strings: " + string1 + ", " +string2);
        String result = concatenate.apply(string1, string2);

        // Print the concatenated string
        System.out.println("\nConcatenated string: " + result);
    }
}
