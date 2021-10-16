package str.q7.isomorphism.easy.q205.solution1;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testStr() {

        Solution solution = new Solution();
        Assert.assertTrue(solution.isIsomorphic("egg", "add"));
        Assert.assertFalse(solution.isIsomorphic("foo", "bar"));
        Assert.assertTrue(solution.isIsomorphic("paper", "title"));
    }
}