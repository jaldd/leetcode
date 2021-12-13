package str.q7.isomorphism.middle.q291.solution1;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testStr() {

        Solution solution = new Solution();
        Assert.assertTrue(solution.wordPattern("abab", "redblueredblue"));
        Assert.assertTrue(solution.wordPattern("aaaa", "asdasdasdasd"));
        Assert.assertFalse(solution.wordPattern("aabb", "xyzabcxzyabc"));
    }
}