方法二：回溯 + 记忆化搜索
思路与算法

方法一中的动态规划预处理计算出了任意的 s[i..j] 是否为回文串，我们也可以将这一步改为记忆化搜索。

代码

class Solution {
int[][] f;
List<List<String>> ret = new ArrayList<List<String>>();
List<String> ans = new ArrayList<String>();
int n;

    public List<List<String>> partition(String s) {
        n = s.length();
        f = new int[n][n];

        dfs(s, 0);
        return ret;
    }

    public void dfs(String s, int i) {
        if (i == n) {
            ret.add(new ArrayList<String>(ans));
            return;
        }
        for (int j = i; j < n; ++j) {
            if (isPalindrome(s, i, j) == 1) {
                ans.add(s.substring(i, j + 1));
                dfs(s, j + 1);
                ans.remove(ans.size() - 1);
            }
        }
    }

    // 记忆化搜索中，f[i][j] = 0 表示未搜索，1 表示是回文串，-1 表示不是回文串
    public int isPalindrome(String s, int i, int j) {
        if (f[i][j] != 0) {
            return f[i][j];
        }
        if (i >= j) {
            f[i][j] = 1;
        } else if (s.charAt(i) == s.charAt(j)) {
            f[i][j] = isPalindrome(s, i + 1, j - 1);
        } else {
            f[i][j] = -1;
        }
        return f[i][j];
    }
}
复杂度分析

时间复杂度：O(n ⋅ 2^n)，其中 n 是字符串 s 的长度，与方法一相同。

空间复杂度：O(n^2)，与方法一相同。
