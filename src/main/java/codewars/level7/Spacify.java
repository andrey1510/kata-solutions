// https://www.codewars.com/kata/57f8ee485cae443c4d000127

package codewars.level7;

import java.util.stream.Stream;

public class Spacify {

    //////////////// Variant 1 ////////////

    public static String spacify(String str){
        return Stream.of(str.split(""))
                .reduce("", (a, b) -> a + b + " ").trim();

    }

//////////////// Variant 2 ////////////

    public static String spacify2(String str){
        return Stream.of(str.split(""))
                .reduce("", (a, b) -> a.concat(" " + b)).trim();
    }

}
