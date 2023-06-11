package leetcode.easy;

//https://leetcode.com/problems/add-binary/solutions/

import java.math.BigInteger;

public class AddBinary {

    public String addBinary(String a, String b) {
        BigInteger aInt = new BigInteger(a, 2);
        BigInteger bInt = new BigInteger(b, 2);
        return aInt.add(bInt).toString(2);
    }

    // for lesser numbers:

    public String addBinary2(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }

}
