package leetcode.easy;

// https://leetcode.com/problems/count-items-matching-a-rule/description/

import java.util.List;

public class CountMatches {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        return (int) items.stream()
                .filter(item -> {
                    String type = item.get(0);
                    String color = item.get(1);
                    String name = item.get(2);

                    return (ruleKey.equals("type") && ruleValue.equals(type))
                            || (ruleKey.equals("color") && ruleValue.equals(color))
                            || (ruleKey.equals("name") && ruleValue.equals(name));
                })
                .count();
    }

}
