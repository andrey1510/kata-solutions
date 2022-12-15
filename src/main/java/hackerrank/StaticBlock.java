// https://www.hackerrank.com/challenges/java-static-initializer-block

package hackerrank;

import java.util.Scanner;

public class StaticBlock {

    static boolean flag;
    static int H;
    static int B;

    static {

        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        scan.nextLine();
        H = scan.nextInt();
        scan.close();

        if(B > 0 && H > 0){
            flag=true;
        }else{
            System.out.println ("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}

