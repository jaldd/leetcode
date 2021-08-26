package array.q2.q_array_duplicate.q287.solution3;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testSingleNumber() {

        Solution solution = new Solution();

        int one = solution.findDuplicate(new int[]{1, 3, 4, 2, 2});
        int two = solution.findDuplicate(new int[]{3, 1, 3, 5, 4, 2});
        int three = solution.findDuplicate(new int[]{1, 1});
        int four = solution.findDuplicate(new int[]{1, 1, 2});

        Assert.assertEquals(one, 2);
        Assert.assertEquals(two, 3);
        Assert.assertEquals(three, 1);
        Assert.assertEquals(four, 1);
    }

}
