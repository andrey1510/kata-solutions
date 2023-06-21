package leetcode.easy;

//https://leetcode.com/problems/ransom-note


public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder sb = new StringBuilder(magazine);
        for (char c : ransomNote.toCharArray()) {
            int i = sb.indexOf(String.valueOf(c));
            if (i != -1) {
                sb.deleteCharAt(i);
            } else return false;
        }
        return true;
    }
}

