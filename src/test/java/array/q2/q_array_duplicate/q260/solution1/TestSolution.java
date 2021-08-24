package array.q2.q_array_duplicate.q260.solution1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestSolution {

    @Test
    public void testSingleNumber() {

        Solution solution = new Solution();

        int[] one = solution.singleNumber(new int[]{1, 2, 1, 3, 2, 5});
        int[] two = solution.singleNumber(new int[]{-1, 0});
        int[] three = solution.singleNumber(new int[]{0, 1});
        Arrays.sort(one);
        Arrays.sort(two);
        Arrays.sort(three);

        Assert.assertArrayEquals(one, new int[]{3, 5});
        Assert.assertArrayEquals(two, new int[]{-1, 0});
        Assert.assertArrayEquals(three, new int[]{0, 1});
    }

}
