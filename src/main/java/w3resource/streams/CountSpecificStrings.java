package w3resource.streams;

import java.util.List;

public class CountSpecificStrings {

    public static long countElementsOnLetter(List<String> elements, String letter){

        return elements.stream()
                .filter(e -> e.toLowerCase().startsWith(letter))
                .count();

    }

}

