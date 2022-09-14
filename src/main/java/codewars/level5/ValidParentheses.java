
//https://www.codewars.com/kata/52774a314c2333f0a7000688

package codewars.level5;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ValidParentheses {

    public static boolean validParentheses(String parens) {
        boolean result = true;

        List<String> list = Arrays.stream(parens.split(""))
                .filter(e -> e.equals("(") || e.equals(")"))
                .collect(Collectors.toList());

        if (list.isEmpty()) {
            return result;
        } else if (list.get(0).equals(")") || ((int) list.stream().filter(e -> e.equals("(")).count())*2 - list.size() != 0) {
            result = false;
        } else {
            while (list.size() > 2) {
                int parOp = IntStream.range(0, list.size())
                        .filter(e -> list.get(e).equals("("))
                        .findFirst()
                        .orElse(-1);
                int parCl = IntStream.range(0, list.size())
                        .filter(e -> list.get(e).equals(")"))
                        .findFirst()
                        .orElse(-1);
                if (parCl < parOp) {
                    result = false;
                    break;
                }
                list.remove(parCl);
                list.remove(parOp);
            }
            if (!Objects.equals(list.get(0),"(") && !Objects.equals(list.get(1),")")) {
                result = false;
            }

        }
        return result;
    }


    //////////// Community variant //////////
    public static boolean validParentheses2(String parens) {
        int counter = 0;
        for (int i = 0; i < parens.length(); i++) {
            if (parens.charAt(i) == '(') counter++;
            if (parens.charAt(i) == ')') counter--;
            if (counter<0) return false;
        }
        return counter == 0;
    }



}
