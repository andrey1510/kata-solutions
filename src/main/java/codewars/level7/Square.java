package codewars.level7;

//https://www.codewars.com/kata/54c27a33fb7da0db0100040e/java

public class Square {
    public static boolean isSquare(int n) {
        double d = Math.sqrt(n);
        int i = (int)d;
        return n >= 0 && (d - (double) i) == 0;   // return (n >= 0 && (d - (double)i) == 0) ? true : false;
    }
}
