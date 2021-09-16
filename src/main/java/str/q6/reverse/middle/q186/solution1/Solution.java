package str.q6.reverse.middle.q186.solution1;

class Solution {
public void reverseWords(char[] str) {
        int i = 0;
        for (int j = 0; j < str.length; j++) { // aTbTc
            if (str[j] == ' ') {
                reverse(str, i, j);
                i = j + 1;
            }
        }
        reverse(str, i, str.length); // 最后一个单词末尾没有空格
        System.out.println(String.valueOf(str));
        reverse(str, 0, str.length); // 整体再翻转一次
    }

    /**
     * 将 str 的 [i, j] 进行翻转，如 "the" 转换后变成 “eht”
     * 注意，[i,j] 是左闭右开
     *
     * @param str
     * @param i
     * @param j
     */
    private void reverse(char[] str, int i, int j) {
        for (int k = i; k < (i + j) / 2; k++) {
            char tmp = str[k];  // 位置 k 的元素
            int g = j - 1 - k + i;  // 位置 k 的对称位置
            str[k] = str[g];
            str[g] = tmp;
        }
    }
}