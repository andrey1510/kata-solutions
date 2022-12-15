package hackerrank;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        return Arrays.stream(a.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.joining()).equals(Arrays.stream(b.toLowerCase().split(""))
                        .sorted()
                        .collect(Collectors.joining()));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
