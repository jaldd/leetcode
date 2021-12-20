package str.q9.qpalindrome.hard.q1246.solution1;

public class Solution {

    public int minimumMoves(int[] arr) {
        /**
         int n = arr.length, i, j, k, len;
         vector<vector> dp (n, vector(n, INT_MAX));
         for (i = 0; i < n; ++i) {
         dp[i][i] = 1;//初始化
         if (i < n - 1 && arr[i] == arr[i + 1]) dp[i][i + 1] = 1;
         else if (i < n - 1 && arr[i] != arr[i + 1]) dp[i][i + 1] = 2;
         }
         for (len = 0; len < n; ++len) { //按长度遍历
         for (i = 0; i < n; ++i) {
         j = i + len;//右端点
         if (j >= n || dp[i][j] == INT_MAX) continue;
         if (i - 1 >= 0 && j + 1 < n) {
         for (k = i - 1; k <= j; ++k)
         dp[i - 1][j + 1] = min(dp[i - 1][j + 1], dp[i - 1][k] + dp[k + 1][j + 1]);
         if (arr[i - 1] == arr[j + 1]) dp[i - 1][j + 1] = min(dp[i - 1][j + 1], dp[i][j]);
         }
         }
         }
         return dp[0][n - 1];
         */
        return 0;
    }
};