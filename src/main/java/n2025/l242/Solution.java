package n2025.l242;

import java.util.*;

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

    public List<List<String>> groupAnagramsSort(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> orDefault = map.getOrDefault(key, new ArrayList<>());
            orDefault.add(str);
            map.put(key, orDefault);
        }
        return new ArrayList<>(map.values());
    }

    public List<List<String>> groupAnagramsCount(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] counts = new int[26];
            char[] chars = str.toCharArray();
            for (char c : chars) {
                counts[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            int iMax = counts.length - 1;
            for (int i = 0; i < counts.length; i++) {
                if (i == iMax) {
                    sb.append(counts[i]);
                    continue;
                }
                sb.append(counts[i]).append(",");
            }
            String key = sb.toString();
            List<String> orDefault = map.getOrDefault(key, new ArrayList<>());
            orDefault.add(str);
            map.put(key, orDefault);
        }
        return new ArrayList<>(map.values());
    }

}