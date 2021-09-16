package str.q2.q28.solution1;

public class Solution {

    public int strStr(String haystack, String needle) {

        int h = haystack.length();
        int n = needle.length();
        for (int i = 0; i + n <= h; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) return i;
        }
        return -1;
    }
}