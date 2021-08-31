package array.q13.qjump.middle.q55.solution1;


import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testJump() {

        Solution solution = new Solution();
        Assert.assertTrue(solution.canJump(new int[]{2, 3, 1, 1, 4}));
        Assert.assertFalse(solution.canJump(new int[]{3, 2, 1, 0, 4}));
    }
}
