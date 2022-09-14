package codewars.level8;

//https://www.codewars.com/kata/544675c6f971f7399a000e79/train/java

public class StringToNumber {
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        System.out.println(stringToNumber("1234"));
    }
}
