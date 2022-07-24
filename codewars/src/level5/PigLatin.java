package level5;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PigLatin {

    /////////////////////////// Variant 1 ///////////////////////////////

    public static String pigIt(String str) {

        List<String> list = new ArrayList<> (Arrays.asList(str.split(" ")));

        for (int i=0; i < list.size(); i++) {

            List<String> word = new ArrayList<> (Arrays.asList(list.get(i).split("")));

            if (!word.get(0).matches("[!?.,;:]") && word.get(word.size()-1).matches("[!?.,;:]") && word.size() > 1) {
                word.add(word.size()-1, (word.get(0)+ "ay") );
                word.set(word.size()-1, ( word.get(word.size()-1) + " ") );
                word.remove(0);
            } else if (!word.get(0).matches("[!?.,;:]") && !word.isEmpty()) {
                word.add(word.get(0) + "ay " );
                word.remove(0);
            }

            list.set(i, String.join("", word));

        }

        return String.join(" ", list).replaceAll("  ", " ").trim();
    }


    /////////////////////////// Community variant ///////////////////////////////
    // passes Codewars tests, but doesn't process  punctuation marks without spaces

    public static String pigIt2(String str) {
        return Arrays.stream(str.trim().split(" "))
                .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0, 1)).concat("ay") : v)
                .collect(Collectors.joining(" "));
    }


}
