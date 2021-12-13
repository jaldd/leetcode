package str.q8.qanagram.easy.q242.solution2;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
//            current--;
            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }


//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//        Map<Character, Integer> table = new HashMap<Character, Integer>();
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            table.put(ch, table.getOrDefault(ch, 0) + 1);
//        }
//        for (int i = 0; i < t.length(); i++) {
//            char ch = t.charAt(i);
//            table.put(ch, table.getOrDefault(ch, 0) - 1);
//            if (table.get(ch) < 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}