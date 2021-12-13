package str.q7.isomorphism.middle.q291.solution1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Character, String> m;
    Map<String, Character> str_char;
    boolean match;

    public boolean wordPattern(String pattern, String str) {
        m = new HashMap<>();
        str_char = new HashMap<>();
        match = false;
        dfs(pattern, str, 0, 0);
        return match;
    }

    public void dfs(String pattern, String str, int i, int j) {

        if ((i < pattern.length() && j >= str.length())
                || (i >= pattern.length() && j < str.length()) || match) {
            return;
        }

        if (i == pattern.length() && j == str.length()) {
            match = true;
            return;
        }

        if (!m.containsKey(pattern.charAt(i))) {
            String val;
            for (int k = 1; k <= str.length() - j; ++k) {//该字符往后匹配多少个字符
                val = str.substring(j, Math.min(j + k, str.length()));
                if (str_char.containsKey(val) && str_char.get(val) != pattern.charAt(i)) {//"ab"，"aa"
                    continue;
                }
                m.put(pattern.charAt(i), val);
                str_char.put(val, pattern.charAt(i));
                dfs(pattern, str, i + 1, j + k);

                //todo ?
                m.remove(pattern.charAt(i));
                str_char.remove(val);
            }
        } else {
            String val = m.get(pattern.charAt(i));
            int n = val.length();

            if (!str.substring(j, Math.min(j + n, str.length())).equals(val))
                return;
            dfs(pattern, str, i + 1, j + n);
        }
    }
};