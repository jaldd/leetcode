package array.q15.waterhold.middle.q11.solution1;


import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testMaxArea() {

        Solution solution = new Solution();
        Assert.assertEquals(49, solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        Assert.assertEquals(1, solution.maxArea(new int[]{1, 1}));
        Assert.assertEquals(16, solution.maxArea(new int[]{4, 3, 2, 1, 4}));
        Assert.assertEquals(2, solution.maxArea(new int[]{1, 2, 1}));
    }
}
