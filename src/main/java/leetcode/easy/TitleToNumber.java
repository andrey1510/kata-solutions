package leetcode.easy;

//https://leetcode.com/problems/excel-sheet-column-number/description/

public class TitleToNumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char letter = columnTitle.charAt(i);
            int digit = letter - 'A' + 1;
            result = (result * 26) + digit;
        }
        return result;
    }

}
