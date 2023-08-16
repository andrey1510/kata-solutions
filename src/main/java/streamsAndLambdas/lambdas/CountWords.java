package streamsAndLambdas.lambdas;

public class CountWords {
    public static int countW(String sentence) {
        CountWordsFuncInterface countWords = s -> s.split(" ").length;
        return countWords.count(sentence);
    }
}

