package array.q14.qshares.hard.q123.solution2;

import array.q14.qshares.easy.q121.solution2.Solution;
import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testMaxProfit() {

        Solution solution = new Solution();
        Assert.assertEquals(5, solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        Assert.assertEquals(0, solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
