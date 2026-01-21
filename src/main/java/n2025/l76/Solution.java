package n2025.l76;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String minWindow(String s, String t) {

        int sLength = s.length();
        int tLength = t.length();
        if (sLength < tLength) {
            return null;
        }

        int[] sCount = new int[128];
        int[] tCount = new int[128];
        int tDistinct = 0;
        int sDistinct = 0;
        for (int i = 0; i < t.length(); i++) {
            int tIndex = t.charAt(i);
            if (tCount[tIndex] == 0) {
                tDistinct++;
            }
            tCount[tIndex]++;
        }

        int l = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;

        for (int r = 0; r < s.length(); r++) {
            int sIndex = s.charAt(r);
            if (tCount[sIndex] > 0) {
                sCount[sIndex]++;
                if (sCount[sIndex] == tCount[sIndex]) {
                    sDistinct++;
                }
            }

            while (tDistinct == sDistinct) {

                if (minLen > r - l + 1) {
                    start = l;
                    minLen = r - l + 1;
                }
                int lIndex = s.charAt(l);
                if (tCount[lIndex] > 0) {

                    if (sCount[lIndex] == tCount[lIndex]) {
                        sDistinct--;
                    }
                    sCount[lIndex]--;
                }
                l++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);

    }


    public String minWindow1(String s, String t) {
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


    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (map.containsKey(c) && map.get(c) >= l) {
                l = map.get(c) + 1;
            }
            map.put(c, r);
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }
            if (sum > target) {
                right--;
            }
            if (sum < target) {
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}