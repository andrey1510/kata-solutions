package codewars.level7;

//https://www.codewars.com/kata/584dc1b7766c2bb158000226

import java.util.Arrays;

public class Chores {
    public static int[] choreAssignments(int[] chores) {
        Arrays.sort(chores);
        int n = chores.length-1;
        int[] result = new int[chores.length / 2];
        for (int i = 0; i < chores.length / 2; i++) {
            result[i] = chores[i]+chores[n];
            n--;
        }
        return Arrays.stream(result).sorted().toArray();
    }
}
