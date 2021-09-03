package array.q14.qshares.middle.q714.solution1;

public class Solution {

    public int maxProfit(int[] prices, int fee) {


        int length = prices.length;
        int res = 0, money = -prices[0];

        for (int i = 0; i < length; i++) {
            res = Math.max(res, money + prices[i] - fee);
            money = Math.max(money, res - prices[i]);

        }
        return res;
    }
}