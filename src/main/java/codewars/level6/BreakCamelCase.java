package codewars.level6;


public class BreakCamelCase {
    public static String camelCase(String input) {
        return String.join(" ", input.split("(?=[A-Z])"));
    }
}

