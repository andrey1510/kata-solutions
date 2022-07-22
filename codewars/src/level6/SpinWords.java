package level6;

//https://www.codewars.com/kata/5264d2b162488dc400000001/train/java

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {

    ////////////////////////////// Variant 1 ///////////////////////////

    public String spinWords(String sentence) {
        String[] sArr = String.valueOf(sentence).split(" ");
        for(int i = 0; i < sArr.length; i++) {
            if (sArr[i].length() > 4) {
                sArr[i] = new StringBuilder(sArr[i]).reverse().toString();
            }
        }
        return String.join(" ", sArr); // better than:   Arrays.toString(sArr).replaceAll(",", "").replaceAll("\\[", "").replaceAll("]", "");
    }

    ////////////////////////////// Community variant ///////////////////////////

    public String spinWords2(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(e -> e.length() > 4 ? new StringBuilder(e).reverse().toString() : e)
                .collect(Collectors.joining(" "));
    }
}
