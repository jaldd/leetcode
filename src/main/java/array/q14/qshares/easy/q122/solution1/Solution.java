package array.q14.qshares.easy.q122.solution1;

public class Solution {

    public int maxProfit(int[] prices) {

        int length = prices.length, money = -prices[0], res = 0;

        for (int i = 1; i < length; i++) {

            int moneyTemp = Math.max(money, res - prices[i]);
            int resTemp = Math.max(res, money + prices[i]);
            money = moneyTemp;
            res = resTemp;
        }

        return res;
    }
}