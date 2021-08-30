思路与算法

由于我们最多可以完成两笔交易，因此在任意一天结束之后，我们会处于以下五个状态中的一种：

未进行过任何操作；

只进行过一次买操作；

进行了一次买操作和一次卖操作，即完成了一笔交易；

在完成了一笔交易的前提下，进行了第二次买操作；

完成了全部两笔交易。

![img.png](img.png)
![img_1.png](img_1.png)

代码

C++JavaPython3GolangCJavaScript

class Solution {
public int maxProfit(int[] prices) {
int n = prices.length;
int buy1 = -prices[0], sell1 = 0;
int buy2 = -prices[0], sell2 = 0;
for (int i = 1; i < n; ++i) {
buy1 = Math.max(buy1, -prices[i]);
sell1 = Math.max(sell1, buy1 + prices[i]);
buy2 = Math.max(buy2, sell1 - prices[i]);
sell2 = Math.max(sell2, buy2 + prices[i]);
}
return sell2;
}
}


public int maxProfitDP(int[] prices) {
if (prices == null || prices.length <= 1) return 0;
int[][][] dp = new int[prices.length][2][3];
int MIN_VALUE = Integer.MIN_VALUE / 2;//因为最小值再减去1就是最大值Integer.MIN_VALUE-1=Integer.MAX_VALUE
//初始化
dp[0][0][0] = 0;//第一天休息
dp[0][0][1] = dp[0][1][1] = MIN_VALUE;//不可能
dp[0][0][2] = dp[0][1][2] = MIN_VALUE;//不可能
dp[0][1][0] = -prices[0];//买股票
for (int i = 1; i < prices.length; i++) {
dp[i][0][0] = 0;
dp[i][0][1] = Math.max(dp[i - 1][1][0] + prices[i], dp[i - 1][0][1]);
dp[i][0][2] = Math.max(dp[i - 1][1][1] + prices[i], dp[i - 1][0][2]);
dp[i][1][0] = Math.max(dp[i - 1][0][0] - prices[i], dp[i - 1][1][0]);
dp[i][1][1] = Math.max(dp[i - 1][0][1] - prices[i], dp[i - 1][1][1]);
dp[i][1][2] = MIN_VALUE;
}
return Math.max(0, Math.max(dp[prices.length - 1][0][1], dp[prices.length - 1][0][2]));
}
复杂度分析

时间复杂度：O(n)O(n)，其中 nn 是数组 \textit{prices}prices 的长度。

空间复杂度：O(1)O(1)。
