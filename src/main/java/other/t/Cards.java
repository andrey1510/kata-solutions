package other.t;

import java.util.Scanner;

public class Cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
        for (int i = 0; i < n; i++) b[i] = scanner.nextInt();
        scanner.close();

        boolean result = checkWinningSequence(a, b);

        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static boolean checkWinningSequence(int[] a, int[] b) {
        int start = -1;
        int end = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                start = i;
                break;
            }
        }

        if (start == -1) return true;

        for (int i = a.length - 1; i >= start; i--) {
            if (a[i] != b[i]) {
                end = i;
                break;
            }
        }

        for (int i = start; i < end; i++) {
            if (b[i] > b[i + 1]) {
                return false;
            }
        }

        return true;
    }
}

