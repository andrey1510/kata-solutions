package custom;

import java.util.List;
import java.util.stream.Collectors;


public class LetterAFilter {

    public static List<String> filterStrings (List<String> strings){
        return strings.stream()
                .filter(str -> !str.contains("a"))
                .collect(Collectors.toList());

    }

}

