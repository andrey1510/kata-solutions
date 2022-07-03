package level6;

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

    //////////////////////// Variant 2 ////////////////////////////////

    public static String toCamelCase2(String s2){
        String[] arr = s2.split("[-_]");
        return Arrays.stream(arr, 1, arr.length)
                .map(e -> e.substring(0, 1).toUpperCase() + e.substring(1))
                .reduce(arr[0], String::concat);
    }
}



