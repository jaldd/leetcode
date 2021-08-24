package array.q12.q202.solution3;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testIsHappy() {

        one();

        two();

    }

    private void one() {
        Solution solution = new Solution();
        boolean res = solution.isHappy(19);
        Assert.assertTrue(res);
    }

    private void two() {
        Solution solution = new Solution();
        boolean res = solution.isHappy(2);
        Assert.assertFalse(res);
    }

}
