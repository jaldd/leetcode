package array.q13.qjump.hard.q45.solution2;


import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testJump() {

        Solution solution = new Solution();
        Assert.assertEquals(2, solution.jump(new int[]{2, 3, 1, 1, 4}));
        Assert.assertEquals(2, solution.jump(new int[]{2, 3, 0, 1, 4}));
    }
}
