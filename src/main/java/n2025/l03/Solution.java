package n2025.l03;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int left = 0;
        int[] window = new int[128];
        int maxLen = 0;
        for (int right = 0; right < length; right++) {
            char c = s.charAt(right);
            left = Math.max(left, window[c]);
            window[c] = right + 1;

            maxLen = Math.max(maxLen,right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("abcabcbb"));
    }
}