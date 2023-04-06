package codewars.level6;

public class RemoveTheParentheses {

    public static String removeParentheses(final String str) {
        String result = str.replaceAll("\\([^()]*\\)", "");
        if (result.contains("(")) result = removeParentheses(result);
        return result;
    }

}
