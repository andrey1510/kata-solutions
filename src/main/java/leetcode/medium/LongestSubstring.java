package leetcode.medium;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() <= 1) return s.length();

   //     List<String> str = Arrays.stream(s.split("")).collect(Collectors.toList());
    //    Map<Integer, String> count =


        return 0;

    }

    public static void main(String[] args) {
        LongestSubstring t = new LongestSubstring();

        System.out.println(t.lengthOfLongestSubstring("abcabcbb"));

    }


}

