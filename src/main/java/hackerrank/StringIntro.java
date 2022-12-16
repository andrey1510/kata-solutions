// https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true

package hackerrank;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringIntro {

    public static int sum(String s1, String s2) {
        return s1.length() + s2.length();
    }

    public static String compare(String s1, String s2) {
        return s1.compareTo(s2) > 0 ? "Yes" : "No";
    }

    public static String capitalize(String s) {
        return Stream.of(s)
                .map(e -> e.substring(0, 1).toUpperCase() + e.substring(1))
                .collect(Collectors.joining(""));
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(sum(A, B));
        System.out.println(compare(A, B));
        System.out.println(capitalize(A) + " " + capitalize(B));

    }
}
