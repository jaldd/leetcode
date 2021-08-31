package array.q14.qshares.easy.q122.solution2;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testMaxProfit() {

        Solution solution = new Solution();
        Assert.assertEquals(7, solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        Assert.assertEquals(4, solution.maxProfit(new int[]{1, 2, 3, 4, 5}));
        Assert.assertEquals(0, solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
