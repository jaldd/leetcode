package str.q1.q14.solution3;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        } else {
            return longestCommonPrefix(strs, 0, strs.length - 1);
        }
    }

    public String longestCommonPrefix(String[] strs, int start, int end) {

        if (start == end) {
            return strs[start];
        }
        int mid = start + (end - start) / 2;
        String left = longestCommonPrefix(strs, start, mid);
        String right = longestCommonPrefix(strs, mid + 1, end);
        return commonPrefix(left, right);
    }

    private String commonPrefix(String left, String right) {
        int length = Math.min(left.length(), right.length());
        for (int i = 0; i < length; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                return left.substring(0, i);
            }
        }
        return left.substring(0, length);
    }
}