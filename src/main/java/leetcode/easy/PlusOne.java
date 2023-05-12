package leetcode.easy;

// https://leetcode.com/problems/plus-one/description/


public class PlusOne {

    public int[] plusOne(int[] digits) {

        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;

    }

    public int[] plusOne2(int[] digits) {

        int num = digits.length;

        for(int i = num - 1; i >= 0; i--) {
            digits[i]++;
            if(digits[i] == 10) {
                digits[i] = 0;
            } else {
                return digits;
            }
        }

        int[] res = new int[num + 1];
        res[0] = 1;

        return res;
    }




}
