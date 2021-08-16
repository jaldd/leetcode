package array.q5.q41.solution1;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testRotate() {

        int[] nums = new int[]{1, 2, 0, -4, 4, 6, 7};

        int[] nums1 = new int[]{-1, -100, 1, 3};

        Solution solution = new Solution();
        int res = solution.firstMissingPositive(nums);
        int res1 = solution.firstMissingPositive(nums1);
        Assert.assertEquals(res, 3);
        Assert.assertEquals(res1, 2);

    }

}
