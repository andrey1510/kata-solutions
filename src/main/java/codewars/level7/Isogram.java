package codewars.level7;

// https://www.codewars.com/kata/54ba84be607a92aa900000f1

public class Isogram {
    public static boolean  isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
