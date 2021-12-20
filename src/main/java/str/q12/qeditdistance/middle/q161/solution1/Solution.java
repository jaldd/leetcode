package str.q12.qeditdistance.middle.q161.solution1;

public class Solution {

    public boolean isOneEditDistance(String s, String t) {

        if (s.length() < t.length()) {
            String tmp = s;
            s = t;
            t = tmp;
        }
        int m = s.length(), n = t.length(), diff = m - n;
        if (diff >= 2) {
            return false;
        } else if (diff == 1) {
            for (int i = 0; i < n; ++i) {
                if (s.charAt(i) != t.charAt(i)) {
                    return s.substring(i + 1).equals(t.substring(i));
                }
            }
            return true;
        } else {
            int cnt = 0;
            for (int i = 0; i < m; ++i) {
                if (s.charAt(i) != t.charAt(i)) {
                    if (cnt == 1) return false;
                    ++cnt;
                }
            }
            return cnt == 1;
        }
    }
}