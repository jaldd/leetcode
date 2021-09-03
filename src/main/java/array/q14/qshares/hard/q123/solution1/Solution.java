package array.q14.qshares.hard.q123.solution1;

public class Solution {

    public int maxProfit(int[] prices) {
        int length = prices.length;
        int profit1 = 0, cost1 = -prices[0], profit2 = 0, cost2 = -prices[0];
        for (int i = 1; i < length; i++) {

            profit1 = Math.max(profit1, cost1 + prices[i]);
            cost1 = Math.max(cost1, -prices[i]);
            cost2 = Math.max(cost2, profit1 - prices[i]);
            profit2 = Math.max(profit2, cost2 + prices[i]);
        }
        return profit2;
    }


    //
//
//    public int maxProfitDP(int[] prices) {
//        if (prices == null || prices.length <= 1) return 0;
//        int[][][] dp = new int[prices.length][2][3];
//        int MIN_VALUE = Integer.MIN_VALUE / 2;//因为最小值再减去1就是最大值Integer.MIN_VALUE-1=Integer.MAX_VALUE
////初始化
//        dp[0][0][0] = 0;//第一天休息
//        dp[0][0][1] = dp[0][1][1] = MIN_VALUE;//不可能
//        dp[0][0][2] = dp[0][1][2] = MIN_VALUE;//不可能
//        dp[0][1][0] = -prices[0];//买股票
//        for (int i = 1; i < prices.length; i++) {
//            dp[i][0][0] = 0;
//            dp[i][0][1] = Math.max(dp[i - 1][1][0] + prices[i], dp[i - 1][0][1]);
//            dp[i][0][2] = Math.max(dp[i - 1][1][1] + prices[i], dp[i - 1][0][2]);
//            dp[i][1][0] = Math.max(dp[i - 1][0][0] - prices[i], dp[i - 1][1][0]);
//            dp[i][1][1] = Math.max(dp[i - 1][0][1] - prices[i], dp[i - 1][1][1]);
//            dp[i][1][2] = MIN_VALUE;
//        }
//        return Math.max(0, Math.max(dp[prices.length - 1][0][1], dp[prices.length - 1][0][2]));
//    }
//    int n = prices.length;
//    int buy1 = -prices[0], sell1 = 0;
//    int buy2 = -prices[0], sell2 = 0;
//
//        for(
//    int i = 1;
//    i<n; ++i)
//
//    {
//
//        buy1 = Math.max(buy1, -prices[i]);
//        sell1 = Math.max(sell1, buy1 + prices[i]);
//        buy2 = Math.max(buy2, sell1 - prices[i]);
//        sell2 = Math.max(sell2, buy2 + prices[i]);
//    }
//
//        return sell2;
}