package codewars.level5;

// https://www.codewars.com/kata/54a91a4883a7de5d7800009c
public class IncrementString {
    public static String incrementString(String str) {
        StringBuilder result = new StringBuilder();
        String word = str.replaceAll("[0-9]", "");
        String numberEnding = str.replaceAll("[^0-9]", "");

        if (!numberEnding.isEmpty()) {
            int incrementedNumber = Integer.parseInt(numberEnding) + 1;
            result.append(word);
            if(numberEnding.charAt(0) == '0') {
                result.append(numberEnding, 0, numberEnding.length() - String.valueOf(incrementedNumber).length())
                        .append(incrementedNumber);
            } else {
                result.append(incrementedNumber);
            }
        } else {
            result.append(str).append("1");
        }

        return result.toString();
    }

}


