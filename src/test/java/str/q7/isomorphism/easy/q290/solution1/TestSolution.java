package str.q7.isomorphism.easy.q290.solution1;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testStr() {

        Solution solution = new Solution();
        Assert.assertTrue(solution.wordPattern("abba", "dog cat cat dog"));
        Assert.assertFalse(solution.wordPattern("abba", "dog cat cat fish"));
        Assert.assertFalse(solution.wordPattern("abba", "dog dog dog dog"));
        Assert.assertFalse(solution.wordPattern("aaaa", "dog cat cat dog"));
    }
}