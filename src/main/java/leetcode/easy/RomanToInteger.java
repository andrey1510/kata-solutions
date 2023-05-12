package leetcode.easy;

// https://leetcode.com/problems/roman-to-integer/

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class RomanToInteger {

    HashMap<Character, Integer> dictionary = new HashMap<>();
    {
        dictionary.put('I', 1);
        dictionary.put('V', 5);
        dictionary.put('X', 10);
        dictionary.put('L', 50);
        dictionary.put('C', 100);
        dictionary.put('D', 500);
        dictionary.put('M', 1000);
    }

    public int romanToInt(String s) {

        int result = 0;
        List<Character> charsList = s.chars()
                .mapToObj(e->(char)e)
                .collect(Collectors.toList());

        for (int i = 0; i < charsList.size(); i++){
            if ( (i < charsList.size()-1) && (dictionary.get(charsList.get(i)) < dictionary.get(charsList.get(i+1)))) {
                result -= dictionary.get(charsList.get(i));
            }
            else {
                result += dictionary.get(charsList.get(i));
            }
        }
        return result;

    }

    //////// Community variant ///////////

    public int romanToInt2(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int res = map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                res -= map.get(s.charAt(i));
            }else{
                res += map.get(s.charAt(i));
            }
        }
        return res;
    }

}
