方法二：贪心算法

![img.png](img.png)


class Solution {
public int maxProfit(int[] prices, int fee) {
int n = prices.length;
int buy = prices[0] + fee;
int profit = 0;
for (int i = 1; i < n; ++i) {
if (prices[i] + fee < buy) {
buy = prices[i] + fee;
} else if (prices[i] > buy) {
profit += prices[i] - buy;
buy = prices[i];
}
}
return profit;
}
}
复杂度分析

时间复杂度：O(n)O(n)，其中 nn 为数组的长度。

空间复杂度：O(1)O(1)。
