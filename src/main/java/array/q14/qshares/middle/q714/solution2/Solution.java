package array.q14.qshares.middle.q714.solution2;

public class Solution {

    public int maxProfit(int[] prices, int fee) {

        int length = prices.length;
        int res = 0;
        int cost = prices[0] + fee;

        for (int i = 1; i < length; i++) {
            if (prices[i] +fee< cost) {
                cost = prices[i] + fee;
            } else if (prices[i] > cost) {
                res += prices[i] - cost;
                cost = prices[i];
            }
        }

        return res;
    }
}