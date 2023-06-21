package leetcode.easy;

//https://leetcode.com/problems/lemonade-change/

public class LemonadeChange {

    public boolean lemonadeChange(int[] bills) {
        int countFives = 0;
        int countTens = 0;
        for (int bill : bills) {
            if (bill == 5) {
                countFives++;
            } else if (bill == 10) {
                if (countFives == 0) {
                    return false;
                }
                countFives--;
                countTens++;
            } else {
                if (countTens > 0 && countFives > 0) {
                    countTens--;
                    countFives--;
                } else if (countFives >= 3) {
                    countFives -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
