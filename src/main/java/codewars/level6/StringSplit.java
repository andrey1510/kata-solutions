package codewars.level6;

// https://www.codewars.com/kata/515de9ae9dcfc28eb6000001

public class StringSplit {

    public static String[] solution(String s) {

        if (s.length() % 2 != 0) s += "_";

        String[] pairs = new String[s.length() / 2];

        int index = 0;

        for (int i = 0; i < s.length(); i += 2) {
            pairs[index] = s.substring(i, i + 2);  // alternative:   pairs[index] = "" + s.charAt(i) + s.charAt(i+1);
            index++;
        }

        return pairs;
    }

}
