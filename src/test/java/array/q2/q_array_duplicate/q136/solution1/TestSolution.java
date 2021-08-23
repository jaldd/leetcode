package array.q2.q_array_duplicate.q136.solution1;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testSingleNumber() {

        Solution solution = new Solution();

        int one = solution.singleNumber(new int[]{2, 2, 1});
        Assert.assertEquals(one, 1);

        int two = solution.singleNumber(new int[]{4, 1, 2, 1, 2});
        Assert.assertEquals(two, 4);
    }

}
