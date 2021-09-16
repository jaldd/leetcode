package str.q4.q383.solution1;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testStr() {
        Solution solution = new Solution();
        Assert.assertFalse(solution.canConstruct("a", "b"));
        Assert.assertFalse(solution.canConstruct("aa", "ab"));
        Assert.assertTrue(solution.canConstruct("a", "aab"));
    }
}