package hackerrank;

import java.io.*;
import java.util.stream.*;



public class Prime {

    private static boolean isPrime(int number) {
        return IntStream.range(2, number).noneMatch(i -> number%i == 0);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        bufferedReader.close();

        System.out.println(isPrime(Integer.parseInt(n)) ? "prime" : "not prime" );

    }
}