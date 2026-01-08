package n2025.l242;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            a[t.charAt(i) - 'a']--;
        }
        for (int j : a) {
            if (j != 0) return false;
        }
        return true;
    }

    public boolean isAnagramMap(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Integer cur = map.getOrDefault(s.charAt(i), 0);
            map.put(s.charAt(i), cur + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            Integer cur = map.get(t.charAt(i));
            if (cur == null || cur <= 0) {
                return false;
            }
            cur--;
            if (cur == 0) {
                map.remove(t.charAt(i));
            } else {
                map.put(t.charAt(i), cur);
            }
        }
        return map.isEmpty();
    }
}