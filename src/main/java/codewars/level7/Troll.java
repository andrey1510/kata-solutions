// https://www.codewars.com/kata/52fba66badcd10859f00097e

package codewars.level7;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Troll {
    public static String disemvowel(String str) {
        final String s = "AEIOUaeiou";
        return Stream.of(str.split(""))
                .filter(e -> !s.contains(e))
                .collect(Collectors.joining());
    }

    ////////////////////////////// Community variant /////////////////////

    public static String disemvowel2(String str) {
        return str.replaceAll("[aAeEiIoOuU]", "");
    }

}
