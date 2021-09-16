package str.q2.q28.solution4;

public class Solution {
    // BM算法

    public int strStr(String haystack, String needle) {

        int m = haystack.length(), n = needle.length();
        if (m == 0) {
            return 0;
        }
        if (m < n) {
            return -1;
        }
        int[] lastOccurrence = new int[256];
        // build last occurrence index
        for (int i = 0; i < 256; i++) {
            lastOccurrence[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            lastOccurrence[needle.charAt(i)] = i;
        }
        // search from left to right
        while (n <= m) {

            int position = n - 1;
            for (int j = needle.length() - 1; j >= 0; j--) {
                // if not match a character
                if (needle.charAt(j) != haystack.charAt(position)) {
                    // check the last occurrence index
                    if (lastOccurrence[haystack.charAt(position)] != -1) {
                        int k = j - lastOccurrence[haystack.charAt(position)];
                        if (k > 0) {
                            n += k;
                        } else {
                            n += 1;
                        }
                    } else {
                        n += j + 1;
                    }
                    break;
                }
                if (j == 0) {
                    return position;
                }
                position--;
            }
        }
        return -1;
    }
}