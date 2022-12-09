package codewars.level6;

// https://www.codewars.com/kata/5839edaa6754d6fec10000a2

import java.util.stream.IntStream;

public class FindMissingLetter {

    public static char findMissingLetter(char[] array) {
        int numericalChar = 0;
        int alphabet = IntStream.rangeClosed(array[0], array[array.length-1]).sum();
        for (char c : array) numericalChar = numericalChar + c;
        return (char) (alphabet - numericalChar);
    }

}

