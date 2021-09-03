package array.q14.qshares.hard.q123.solution1;


import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testMaxProfit() {

        Solution solution = new Solution();
        Assert.assertEquals(6, solution.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
        Assert.assertEquals(4, solution.maxProfit(new int[]{1, 2, 3, 4, 5}));
        Assert.assertEquals(0, solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
        Assert.assertEquals(0, solution.maxProfit(new int[]{1}));
    }
}
