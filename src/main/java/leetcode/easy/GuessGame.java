package leetcode.easy;

//https://leetcode.com/problems/guess-number-higher-or-lower/

public class GuessGame {
    public int guessNumber(int n) {

        int lower = 1;
        int higher = n;
        int middle = 0;

        while (lower <= higher) {
            middle = lower + (higher - lower) / 2;
            //if (guess(middle) == 0)  return middle;
           // else if (guess(middle) == 1) lower = middle + 1;
           // else higher = middle - 1;
        }
        return - 1;
    }
}
