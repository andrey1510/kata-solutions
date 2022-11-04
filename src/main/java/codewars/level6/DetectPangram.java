// https://www.codewars.com/kata/545cedaa9943f7fe7b000048

package codewars.level6;

import java.util.stream.Stream;

public class DetectPangram {

    public boolean check(String sentence){
        return Stream.of(sentence.toLowerCase().split(""))
                .distinct()
                .filter(e  -> String.valueOf(e).matches("[a-z]"))
                .count() == 26;
    }

    /////////////// Community variant ///////////

    boolean check2(final String sentence) {
        return sentence.chars()
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .distinct()
                .count() == 26;
    }
}
