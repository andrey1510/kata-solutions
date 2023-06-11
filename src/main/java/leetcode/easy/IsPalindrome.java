package leetcode.easy;

//https://leetcode.com/problems/valid-palindrome/description/

public class IsPalindrome {

    public boolean isPalindrome(String s) {

        if(s.equals(" ")) return true;
        StringBuilder sb = new StringBuilder();

        String strBasic = s.toLowerCase().replaceAll("[^a-z0-9]","");
        String strReversed = String.valueOf(sb.append(strBasic).reverse());

        return strBasic.equals(strReversed);

    }

}
