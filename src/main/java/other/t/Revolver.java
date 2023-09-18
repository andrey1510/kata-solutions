package other.t;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Revolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = Integer.parseInt(scanner.nextLine().split(" ")[1]);
        String prices = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(prices.split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
        scanner.close();
        int result = numbers.stream().filter(e -> e <= money).reduce(Integer::max).orElse(0);
        System.out.println(result);
    }

}
