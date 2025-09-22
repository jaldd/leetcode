package l2025.l09.l07;

public class Solution {

    /**
     * 最长公共子序列问题
     * 给定两个字符串 text1 和 text2，返回这两个字符串的最长公共子序列的长度。
     *
     * @param text1 字符串1
     * @param text2 字符串2
     * @return 最长公共子序列的长度
     */
    public int longestCommonSubsequence(String text1, String text2) {

        int m = text1.length();
        int n = text2.length();
        int[][] res = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    res[i][j] = res[i - 1][j - 1] + 1;
                } else {
                    res[i][j] = Math.max(res[i - 1][j], res[i][j - 1]);
                }
            }
        }

        return res[m][n];
    }

    /**
     * 返回最长公共子序列的具体内容（不仅仅是长度）
     */
    public String getLCS(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        // dp[i][j] 表示 text1 前 i 个字符和 text2 前 j 个字符的最长公共子序列长度
        int[][] dp = new int[m + 1][n + 1];

        // 填充 dp 表格
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int i = m, j = n;
        while (i > 0 & j > 0) {
            if (text1.charAt(i - 1) == text2.charAt(j - 1)) {

                sb.append(text1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }

        }

        // 因为是从后往前构造的，需要反转
        return sb.reverse().toString();
    }

    /**
     * 空间优化版本 - 使用一维数组
     */
    public int longestCommonSubsequenceOptimized(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[] pre = new int[m + 1];
        int[] cur = new int[n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    cur[j] = pre[j - 1] + 1;
                } else {
                    cur[j] = Math.max(pre[j], cur[j - 1]);
                }
            }

            int[] tmp = pre;
            pre = cur;
            cur = tmp;
        }
        return pre[n];
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        // 测试用例1: 基本情况
        System.out.println("测试用例1:");
        String text1 = "abcde";
        String text2 = "ace";
        int result1 = solution.longestCommonSubsequence(text1, text2);
        String lcs1 = solution.getLCS(text1, text2);
        System.out.println("输入: text1 = \"" + text1 + "\", text2 = \"" + text2 + "\"");
        System.out.println("输出: " + result1);
        System.out.println("LCS: \"" + lcs1 + "\"");
        System.out.println("期望: 3, \"ace\"");
        System.out.println("结果: " + (result1 == 3 && lcs1.equals("ace") ? "通过" : "失败"));
        System.out.println();

        // 测试用例2: 相同字符串
        System.out.println("测试用例2:");
        String text3 = "abc";
        String text4 = "abc";
        int result2 = solution.longestCommonSubsequence(text3, text4);
        String lcs2 = solution.getLCS(text3, text4);
        System.out.println("输入: text1 = \"" + text3 + "\", text2 = \"" + text4 + "\"");
        System.out.println("输出: " + result2);
        System.out.println("LCS: \"" + lcs2 + "\"");
        System.out.println("期望: 3, \"abc\"");
        System.out.println("结果: " + (result2 == 3 && lcs2.equals("abc") ? "通过" : "失败"));
        System.out.println();

        // 测试用例3: 没有公共子序列
        System.out.println("测试用例3:");
        String text5 = "abc";
        String text6 = "def";
        int result3 = solution.longestCommonSubsequence(text5, text6);
        String lcs3 = solution.getLCS(text5, text6);
        System.out.println("输入: text1 = \"" + text5 + "\", text2 = \"" + text6 + "\"");
        System.out.println("输出: " + result3);
        System.out.println("LCS: \"" + lcs3 + "\"");
        System.out.println("期望: 0, \"\"");
        System.out.println("结果: " + (result3 == 0 && lcs3.equals("") ? "通过" : "失败"));
        System.out.println();

        // 测试用例4: 空字符串
        System.out.println("测试用例4:");
        String text7 = "";
        String text8 = "abc";
        int result4 = solution.longestCommonSubsequence(text7, text8);
        String lcs4 = solution.getLCS(text7, text8);
        System.out.println("输入: text1 = \"" + text7 + "\", text2 = \"" + text8 + "\"");
        System.out.println("输出: " + result4);
        System.out.println("LCS: \"" + lcs4 + "\"");
        System.out.println("期望: 0, \"\"");
        System.out.println("结果: " + (result4 == 0 && lcs4.equals("") ? "通过" : "失败"));
        System.out.println();

        // 测试用例5: 复杂情况
        System.out.println("测试用例5:");
        String text9 = "ABCDGH";
        String text10 = "AEDFHR";
        int result5 = solution.longestCommonSubsequence(text9, text10);
        String lcs5 = solution.getLCS(text9, text10);
        System.out.println("输入: text1 = \"" + text9 + "\", text2 = \"" + text10 + "\"");
        System.out.println("输出: " + result5);
        System.out.println("LCS: \"" + lcs5 + "\"");
        System.out.println("期望: 3, \"ADH\"");
        System.out.println("结果: " + (result5 == 3 && lcs5.equals("ADH") ? "通过" : "失败"));
        System.out.println();

        // 测试用例6: 重复字符
        System.out.println("测试用例6:");
        String text11 = "aabbcc";
        String text12 = "abcabc";
        int result6 = solution.longestCommonSubsequence(text11, text12);
        String lcs6 = solution.getLCS(text11, text12);
        System.out.println("输入: text1 = \"" + text11 + "\", text2 = \"" + text12 + "\"");
        System.out.println("输出: " + result6);
        System.out.println("LCS: \"" + lcs6 + "\"");
        System.out.println("期望: 4, \"abcc\"");
        System.out.println("结果: " + (result6 == 4 ? "通过" : "失败"));
        System.out.println();

        // 测试空间优化版本
        System.out.println("测试空间优化版本:");
        int result7 = solution.longestCommonSubsequenceOptimized(text1, text2);
        System.out.println("输入: text1 = \"" + text1 + "\", text2 = \"" + text2 + "\"");
        System.out.println("输出: " + result7);
        System.out.println("期望: 3");
        System.out.println("结果: " + (result7 == 3 ? "通过" : "失败"));
    }
}
