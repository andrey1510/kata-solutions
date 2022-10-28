// https://www.codewars.com/kata/5324945e2ece5e1f32000370

package codewars.level4;

public class SumStringsAsNumbers {

    public static String sumStrings(String a, String b) {

        StringBuilder stringBuilder = new StringBuilder();
        int counter1 = a.length()-1;
        int counter2 = b.length()-1;
        int digit = 0;

        while (counter1 >= 0 || counter2 >= 0) {
            int c1 = counter1 >= 0 ? a.charAt(counter1) - '0' : 0;
            int c2 = counter2 >= 0 ? b.charAt(counter2) - '0' : 0;
            int s = c1 + c2 + digit;
            stringBuilder.append(s % 10);
            counter1--;
            counter2--;
            digit = s / 10;
        }

        stringBuilder.append(digit);

        while(stringBuilder.charAt(stringBuilder.length()-1) == '0') {
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }

        return stringBuilder.reverse().toString();
    }

}
