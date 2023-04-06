package codewars.level6;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {

        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        int[] result = new int[listA.size()];

        listA.removeAll(listB);

        for (int i=0; i < listA.size(); i++) {
            result[i] = listA.get(i);
        }

        return result;

    }

    public static void main(String[] args) {

        arrayDiff(new int [] {1,2,2}, new int[] {});

    }

}
