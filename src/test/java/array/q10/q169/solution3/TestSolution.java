package array.q10.q169.solution3;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testMajorityElement() {

        one();

        two();
    }

    private void one() {
        int[] arr = new int[]{3, 2, 3};
        Solution solution = new Solution();
        int res = solution.majorityElement(arr);
        Assert.assertEquals(res, 3);
    }

    private void two() {
        int[] arr = new int[]{2, 2, 1, 1, 1, 2, 2};
        Solution solution = new Solution();
        int res = solution.majorityElement(arr);
        Assert.assertEquals(res, 2);
    }

}
