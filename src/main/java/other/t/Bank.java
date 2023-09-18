package other.t;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<Integer> banknotes = new ArrayList<>();
        for (int i = 0; i < m; i++)  banknotes.add(scanner.nextInt());

        List<Integer> stolenBanknotes = new ArrayList<>();
        if (robBank(n, banknotes, stolenBanknotes)) {
            System.out.println(stolenBanknotes.size());
            for (int banknote : stolenBanknotes) {
                System.out.print(banknote + " ");
            }
        } else {
            System.out.println(-1);
        }
    }

    private static boolean robBank(int targetSum, List<Integer> banknotes, List<Integer> stolenBanknotes) {
        if (targetSum == 0) {
            return true;
        }

        if (targetSum < 0 || banknotes.isEmpty()) {
            return false;
        }

        int banknote = banknotes.get(0);
        List<Integer> remainingBanknotes = banknotes.subList(1, banknotes.size());

        stolenBanknotes.add(banknote);
        if (robBank(targetSum - banknote, remainingBanknotes, stolenBanknotes)) {
            return true;
        }
        stolenBanknotes.remove(stolenBanknotes.size() - 1);

        return robBank(targetSum, remainingBanknotes, stolenBanknotes);
    }
}
