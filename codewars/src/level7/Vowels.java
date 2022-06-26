package level7;

//https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java

import java.util.Arrays;

public class Vowels {
    public static int getCount(String str) {
        long vowels = Arrays.stream(str.split(""))
                .filter(e -> (e.equals("a") || e.equals("e") || e.equals("i") || e.equals("o") || e.equals("u")))
                .count();
        return (int) vowels;
    }
}
