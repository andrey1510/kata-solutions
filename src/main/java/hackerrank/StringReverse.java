// https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true

package hackerrank;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        String s = new StringBuilder(A).reverse().toString();
        System.out.println(A.equals(s) ? "Yes" : "No");
    }
}
