package array.q4.q189.solution2;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testRotate() {

        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        int k = 2;
        int[] res = new int[]{5, 6, 1, 2, 3, 4};

        int[] nums1 = new int[]{-1, -100, 3, 99};
        int k1 = 2;
        int[] res1 = new int[]{3, 99, -1, -100};

        Solution solution = new Solution();
        solution.rotate(nums, k);
        solution.rotate(nums1, k1);
        Assert.assertArrayEquals(nums, res);
        Assert.assertArrayEquals(nums1, res1);

    }

}
