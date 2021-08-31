package array.q14.qshares.easy.q121.solution1;

public class Solution {

    public int maxProfit(int[] prices) {

        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                max = Math.max(max, prices[j] - prices[i]);
            }
        }
        return max;
    }
}
