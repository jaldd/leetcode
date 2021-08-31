package array.q14.qshares.easy.q122.solution2;

public class Solution {

    public int maxProfit(int[] prices) {

        int length = prices.length;
        if (length < 2) {
            return 0;
        }

        int res = 0;
        for (int i = 1; i < length; i++) {
            res += Math.max(0, prices[i] - prices[i - 1]);
        }

        return res;
    }
}