package array.q0.qsum.middle.q15.solution1;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {


    /**
     * 示例 1：
     * <p>
     * 输入：nums = [-1,0,1,2,-1,-4]
     * 输出：[[-1,-1,2],[-1,0,1]]
     * 示例 2：
     * <p>
     * 输入：nums = []
     * 输出：[]
     * 示例 3：
     * <p>
     * 输入：nums = [0]
     * 输出：[]
     */
    @Test
    public void testRemoveElement() {

        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        int[] nums1 = new int[]{3, 2, 2, 3};
        int[] res = new int[]{2, 2};
        Solution solution = new Solution();
        solution.threeSum(nums);


    }

}
