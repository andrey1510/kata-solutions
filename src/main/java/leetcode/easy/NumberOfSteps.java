package leetcode.easy;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class NumberOfSteps {

    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            steps += 1;
            if (num%2 == 0) num = num/2;
            else num = num - 1;
        }
        return steps;
    }

}
