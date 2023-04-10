package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class RLEencoding {

    public static int decodeRLE(String str) {

        List<String> elements = new ArrayList<>(Arrays.asList(str.split("(?=\\D{1})")));
        int result = 0;

        for (String element : elements) {
            if (element.length() == 1) {
                result += 1;
            } else {
                result += Integer.parseInt(element.replaceFirst("\\D", ""));
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        System.out.println(decodeRLE(str));
    }
}
