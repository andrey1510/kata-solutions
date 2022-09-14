//https://www.codewars.com/kata/517abf86da9663f1d2000003
package codewars.level6;

import java.util.Arrays;

public class CamelCase {

    //////////////////////// Variant 1 ////////////////////////////////

    public static String toCamelCase(String s){
        String[] arr = s.split("[-_]");
        for(int i=1; i < arr.length; i++){
            arr[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1);
        }
        return String.join("", arr);
    }

    //////////////////////// Community variant ////////////////////////////////

    public static String toCamelCase2(String s){
        String[] arr = s.split("[-_]");
        return Arrays.stream(arr, 1, arr.length)
                .map(e -> e.substring(0, 1).toUpperCase() + e.substring(1))
                .reduce(arr[0], String::concat);
    }
}



