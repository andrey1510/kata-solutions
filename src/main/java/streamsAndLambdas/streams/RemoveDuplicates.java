package streamsAndLambdas.streams;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static List<String> removeDuplicates(List<String> elements){
        return elements.stream()
                .distinct()
                .collect(Collectors.toList());
    }

}

