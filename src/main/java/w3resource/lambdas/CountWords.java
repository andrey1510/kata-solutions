package w3resource.lambdas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountWords {
    public static int countW(String sentence) {
        CountWordsFuncInterface countWords = s -> s.split(" ").length;
        return countWords.count(sentence);
    }
}

