package leetcode.easy;

//https://leetcode.com/problems/excel-sheet-column-title/

public class ConvertToTitle {

    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0){
            columnNumber--;
            sb.insert(0, (char)('A' + columnNumber % 26));
            columnNumber = columnNumber / 26;
        }

        return sb.toString();
    }
}
