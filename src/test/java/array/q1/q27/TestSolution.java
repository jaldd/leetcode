package array.q1.q27;

import array.q1.q27.low.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestSolution {

    @Test
    public void testRemoveElement() {

        int[] nums = new int[]{3, 2, 2, 3};
        int[] nums1 = new int[]{3, 2, 2, 3};
        int[] res = new int[]{2, 2};
        int val = 3;
        Solution solution = new Solution();
        int size = solution.removeElement(nums, val);
        for (int i = 0; i < size; i++) {
            Assert.assertEquals(nums[i], res[i]);
        }
        array.q1.q27.optimal.Solution solution1 = new array.q1.q27.optimal.Solution();
        int size1 = solution1.removeElement(nums1, val);
        Assert.assertEquals(size, size1);
        for (int i = 0; i < size; i++) {
            Assert.assertEquals(nums1[i], res[i]);
        }
//        Assert.assertArrayEquals(nums, );

    }

}
