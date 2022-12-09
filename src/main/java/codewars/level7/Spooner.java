// https://www.codewars.com/kata/56b8903933dbe5831e000c76

package codewars.level7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Spooner {
    public String spoonerize(String words) {
        List<String> wordsList = Arrays.stream(words.split(""))
                .collect(Collectors.toList());
        String letterTwo = wordsList.get(wordsList.indexOf(" ") + 1);
        wordsList.set(wordsList.indexOf(" ") + 1, wordsList.get(0));
        wordsList.set(0, letterTwo);
        return String.join("", wordsList);
    }
}
