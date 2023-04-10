package other;

import java.util.Scanner;

public class Sequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines: ");
        int n = sc.nextInt();
        int[] sessionStarts = new int[n];
        int[] sessionEnds = new int[n];
        System.out.println("Enter 2 digits in each line: ");
        for (int i = 0; i < n; i++) {
            sessionStarts[i] = sc.nextInt();
            sessionEnds[i] = sc.nextInt();
        }
        sc.close();

        int[] sessionsActive = new int[1000];
        for (int i = 0; i < n; i++) {
            sessionsActive[sessionStarts[i]]++;
            sessionsActive[sessionEnds[i]]--;
        }

        int currentActiveSessionsNumber = 0;
        int maxActiveSessionsNumber = 0;
        int result = 0;

        for (int i = 0; i < sessionsActive.length; i++) {
            currentActiveSessionsNumber += sessionsActive[i];
            if (currentActiveSessionsNumber > maxActiveSessionsNumber) {
                maxActiveSessionsNumber = currentActiveSessionsNumber;
                result = i;
            }
        }
        System.out.println(result);
    }

}
