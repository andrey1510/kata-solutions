package codewars.level7;

public class DoubleValueEveryNextCall {
    static int value = 1;
    public static int getNumber() {
        int result = value;
        value = value*2;
        return result;
    }
}
