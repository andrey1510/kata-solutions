package other;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedElement {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] a = new int[n];
        System.out.println("Enter array elements: ");
        String s = sc.nextLine();
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        sc.close();


        //////////

        Map<Integer, Long> numbersMap = Arrays.stream(a)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())
        );
        System.out.println(Collections.max(numbersMap.entrySet(), Map.Entry.comparingByValue()).getKey());

    //////// Alternative:

//        Map<Integer, Integer> numbersMap = new HashMap<>();
//        int lastCount = 0;
//        int result = 0;
//        for (int number : a) {
//            int count = numbersMap.getOrDefault(number, 0) + 1;
//            numbersMap.put(number, count);
//            if (count > lastCount) {
//                lastCount = count;
//                result = number;
//            }
//        }
//
//          System.out.println(result);
    }

}
