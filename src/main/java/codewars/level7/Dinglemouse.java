package codewars.level7;

public class Dinglemouse {
    public static int kookaCounter(final String laughing) {
        return laughing
                .replaceAll("a", "")
                .replaceAll("h+", "h")
                .replaceAll("H+", "H")
                .length();
    }

}
