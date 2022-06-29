package level7;

//https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java

import java.util.Arrays;

public class ExesAndOhs {

    public static boolean getXO (String str) {
        long xCount = Arrays.stream(str.split(""))
                .filter(e -> e.equals("x") || e.equals("X"))
                .count();
        long oCount = Arrays.stream(str.split(""))
                .filter(e -> e.equals("o") || e.equals("O"))
                .count();
        return xCount - oCount == 0;
    }
}
