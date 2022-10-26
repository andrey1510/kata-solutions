package codewars.level4;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StripComments {

    /////////////// Variant 1 //////////////

    public static String stripComments(String text, String[] commentSymbols) {

        List<String> linesList = new java.util.ArrayList<>(List.of(text.split("\n")));

        for (int i = 0; i < linesList.size(); i++) {
            int cutPoint = linesList.get(i).length();

            for (String symbol : commentSymbols) {
                if (linesList.get(i).contains(symbol)) {
                    cutPoint = linesList.get(i).indexOf(symbol);
                }
            }

            linesList.set(i, linesList.get(i).substring(0, cutPoint).replaceFirst("\\s++$", ""));
        }

        return linesList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("\n"));
    }

        /////////////// Variant 2 (WIP) //////////////

        public static String stripComments2(String text, String[] commentSymbols) {
            String endSymbol = ("(?=\n|" + String.join("|", commentSymbols) + ")").replace("$", "\\$");
            Pattern pattern = Pattern.compile("(?<=^|\n)(.*?)"+endSymbol);

            return pattern.matcher(text)
                    .results()
                    .map(e -> e.group(1))
                    .map(e -> e.replaceFirst("\\s++$", ""))
                    .collect(Collectors.joining("\n"));
        }

}
