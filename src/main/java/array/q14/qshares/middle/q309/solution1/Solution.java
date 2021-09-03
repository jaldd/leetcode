package array.q14.qshares.middle.q309.solution1;

public class Solution {

    public int maxProfit(int[] prices) {

        int length = prices.length;
        if (length == 0) {
            return 0;
        }

        int money = -prices[0], res1 = 0, res2 = 0;
        for (int price : prices) {

            int newMoney = Math.max(money, res2 - price);
            int newRes1 = money + price;
            int newRes2 = Math.max(res1, res2);

            money = newMoney;
            res1 = newRes1;
            res2 = newRes2;
        }
        return Math.max(res1,res2);
    }
}