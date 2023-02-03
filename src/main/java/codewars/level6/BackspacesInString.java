package codewars.level6;

public class BackspacesInString {
    public String cleanString(String s) {
        while (s.matches(".*#.*")) {
            s = s.replaceFirst(".?#", "");
        }
        return s;
    }
}
