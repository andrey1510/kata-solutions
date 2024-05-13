package codewars.level7;

// https://www.codewars.com/kata/632408defa1507004aa4f2b5

public class DoubleValueEveryNextCall {
    static int value = 1;
    public static int getNumber() {
        int result = value;
        value = value*2;
        return result;
    }
}
