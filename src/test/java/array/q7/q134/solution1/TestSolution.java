package array.q7.q134.solution1;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testCanCompleteCircuit() {

        one();

        two();

    }

    private void one() {
        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5, 1, 2};
        Solution solution = new Solution();
        Assert.assertEquals(solution.canCompleteCircuit(gas, cost), 3);
    }

    private void two() {
        int[] gas = new int[]{2, 3, 4};
        int[] cost = new int[]{3, 4, 3};
        Solution solution = new Solution();
        Assert.assertEquals(solution.canCompleteCircuit(gas, cost), -1);
    }

}
