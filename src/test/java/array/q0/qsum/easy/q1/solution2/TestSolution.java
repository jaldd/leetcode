package array.q0.qsum.easy.q1.solution2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestSolution {

    @Test
    public void testRemoveElement() {
        int[] arr = new int[]{1, 7, 5, 2, 11, 13};
        Solution solution = new Solution();
        int[] res = solution.twoSum(arr, 9);
        Arrays.sort(res);
        Assert.assertArrayEquals(res, new int[]{2, 7});

    }

}
