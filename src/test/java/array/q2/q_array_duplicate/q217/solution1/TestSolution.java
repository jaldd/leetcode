package array.q2.q_array_duplicate.q217.solution1;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testSingleNumber() {

        Solution solution = new Solution();

        boolean one = solution.containsDuplicate(new int[]{1, 2, 3, 1});
        boolean two = solution.containsDuplicate(new int[]{1, 2, 3, 4});
        boolean three = solution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});

        Assert.assertTrue(one);
        Assert.assertTrue(three);
        Assert.assertFalse(two);
    }

}
