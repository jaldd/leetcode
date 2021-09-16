package array.q15.waterhold.hard.q42.solution1;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testMaxTrap() {

        Solution solution = new Solution();
        Assert.assertEquals(6, solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        Assert.assertEquals(9, solution.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }
}