package array.q12.q202.solution1;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestSolution {

    @Test
    public void testIsHappy() {

        one();

        two();

    }

    private void one() {
        Solution solution = new Solution();
        boolean res = solution.isHappy(19);
        Assert.assertEquals(res, true);
    }

    private void two() {
        Solution solution = new Solution();
        boolean res = solution.isHappy(2);
        Assert.assertEquals(res, false);
    }

}
