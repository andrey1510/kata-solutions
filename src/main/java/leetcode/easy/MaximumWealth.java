package leetcode.easy;

//https://leetcode.com/problems/richest-customer-wealth/

public class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int result= 0;
        for (int[] customer: accounts) {
            int sumCustomer = 0;
            for (int bank : customer) {
                sumCustomer += bank;
            }
            if (result <= sumCustomer) result = sumCustomer;
        }
        return result;
    }
}
