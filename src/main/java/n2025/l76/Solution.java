package n2025.l76;

import java.util.Arrays;

public class Solution {
    public String minWindow(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if (sLength < tLength) {
            return "";
        }
        int[] tCount = new int[128];
        int[] sCount = new int[128];
        int distinctT = 0;
        for (int i = 0; i < tLength; i++) {
            int tIndex = t.charAt(i);
            if (tCount[tIndex] == 0) {
                distinctT++;
            }
            tCount[tIndex]++;
        }
        int minLen = Integer.MAX_VALUE;
        int l = 0;
        int start = 0;
        int match = 0;
        for (int r = 0; r < sLength; r++) {
            int rIndex = s.charAt(r);
            if (tCount[rIndex] > 0) {
                sCount[rIndex]++;
                if (sCount[rIndex] == tCount[rIndex]) {
                    match++;
                }
            }
            while (match == distinctT) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }
                int lIndex = s.charAt(l);
                if (tCount[lIndex] > 0) {
                    if (sCount[lIndex] == tCount[lIndex]) {
                        match--;
                    }
                    sCount[lIndex]--;
                }
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }


    public static void main(String[] args) {

        String s = "AAABBBCCC";
        String t = "AAB";
        String expected = "AAB";
        String actual = new Solution().minWindow(s, t);
        System.out.println(actual);
    }
}