package array.q2.q26;

import array.q2.q26.optimal.Solution;
import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testRemoveElement() {

        int[] nums = new int[]{1, 1, 2};
        int[] nums1 = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] res = new int[]{1, 2};
        int[] res1 = new int[]{0,1,2,3,4};
        Solution solution = new Solution();
        int size = solution.removeDuplicates(nums);
        for (int i = 0; i < size; i++) {
            Assert.assertEquals(nums[i], res[i]);
        }
        array.q2.q26.optimal.Solution solution1 = new array.q2.q26.optimal.Solution();
        int size1 = solution1.removeDuplicates(nums1);
//        Assert.assertEquals(size, size1);
        for (int i = 0; i < size; i++) {
            Assert.assertEquals(nums1[i], res1[i]);
        }
//        Assert.assertArrayEquals(nums, );

    }

}
