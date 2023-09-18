package other.t;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sheriff {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        System.out.println(getMaxWords(s));
    }

    public static int getMaxWords(String s) {
        Map<Character, Integer> charCounts = new HashMap<>(Map.of('s', 0, 'h', 0, 'e', 0, 'r', 0, 'i', 0, 'f', 0));

        for (char c : s.toCharArray()) {
            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            }
        }
        int minCount = Integer.MAX_VALUE;
        for (char c : charCounts.keySet()) {
            int count = charCounts.get(c);
            if (c == 'i' || c == 's' || c == 'h' || c == 'e' || c == 'r') {
                minCount = Math.min(minCount, count);
            } else if (c == 'f') {
                minCount = Math.min(minCount, count / 2);
            }
        }
        return minCount;
    }

}
