package str.q1.q14.solution4;

public class Solution {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }
        int low = 0, high = minLength;
        while (low < high) {
            int mid = (high - low + 1) / 2 + low;
            if (isCommonPrefix(strs, mid)) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        return strs[0].substring(0, low);
    }

    public boolean isCommonPrefix(String[] strs, int length) {

        String str0 = strs[0].substring(0, length);
        int count = strs.length;
        for (int i = 1; i < count; i++) {
            String str = strs[i];
            for (int j = 0; j < length; j++) {
                if (str0.charAt(j) != str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }


    public String longestCommonPrefix(String str1, String str2) {
        int left = 0;
        int right = Math.min(str1.length(), str2.length());
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (str1.substring(0, mid).equals(str2.substring(0, mid))) {
                if (mid == right || !str1.substring(0, mid + 1).equals(str2.substring(0, mid + 1))) {
                    return str1.substring(0, mid);
                }

                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return str1.substring(0, mid);
    }
}