package str.q2.q28.solution3;


public class Solution {

    // Sunday 算法
    public int strStr(String haystack, String needle) {

        int m = haystack.length();
        int n = needle.length();
        if (m < n) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }

        int idx = 0;
        while (idx + n <= m) {

//           待匹配字符串
            String str_cut = haystack.substring(idx, idx + n);
//           判断是否匹配
            if (str_cut.equals(needle)) {
                return idx;
            } else {
//                #边界处理
                if (idx + n >= m) {
                    return -1;
                }
//                #不匹配情况下，根据下一个字符的偏移，移动idx
                char cur_c = haystack.charAt(idx + n);
                idx += (n - lastIndex(needle, cur_c));
            }
        }

        return idx + n >= m ? -1 : idx;
    }

    public int lastIndex(String str, char ch) {

        // 从后往前检索
        for (int j = str.length() - 1; j >= 0; j--) {
            if (str.charAt(j) == ch) {
                return j;
            }
        }
        return -1;
    }
}