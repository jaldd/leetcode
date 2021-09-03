package array.q14.qshares.middle.q309.solution1;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testMaxProfit() {

        Solution solution = new Solution();
        Assert.assertEquals(3, solution.maxProfit(new int[]{1,2,3,0,2}));
    }
}
