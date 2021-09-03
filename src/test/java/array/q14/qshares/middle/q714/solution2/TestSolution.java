package array.q14.qshares.middle.q714.solution2;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testMaxProfit() {

        Solution solution = new Solution();
        Assert.assertEquals(8, solution.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2));
        Assert.assertEquals(6, solution.maxProfit(new int[]{1, 3, 7, 5, 10, 3}, 3));
    }
}
