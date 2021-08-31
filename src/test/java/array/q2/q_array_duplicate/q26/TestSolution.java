package array.q2.q_array_duplicate.q26;

import array.q2.q_array_duplicate.q26.optimal.Solution;
import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testRemoveElement() {

        int[] nums = new int[]{1, 1, 2};
        int[] nums1 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums2 = new int[]{1, 2, 3};
        int[] res = new int[]{1, 2};
        int[] res1 = new int[]{0, 1, 2, 3, 4};
        int[] res2 = new int[]{1, 2, 3};
        Solution solution = new Solution();
        int size = solution.removeDuplicates(nums);
        for (int i = 0; i < size; i++) {
            Assert.assertEquals(nums[i], res[i]);
        }

        Solution solution1 = new Solution();
        int size1 = solution1.removeDuplicates(nums1);
        for (int i = 0; i < size1; i++) {
            Assert.assertEquals(nums1[i], res1[i]);
        }

        Solution solution2 = new Solution();
        int size2 = solution2.removeDuplicates(nums2);
        for (int i = 0; i < size2; i++) {
            Assert.assertEquals(nums2[i], res2[i]);
        }

    }

}
