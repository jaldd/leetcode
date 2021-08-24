package array.q2.q_array_duplicate.q137.solution1;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testSingleNumber() {

        Solution solution = new Solution();

        int one = solution.singleNumber(new int[]{2, 2, 3, 2});
        Assert.assertEquals(one, 3);

        int two = solution.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99});
        Assert.assertEquals(two, 99);
    }

}
