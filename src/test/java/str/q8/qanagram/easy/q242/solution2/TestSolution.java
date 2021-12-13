package str.q8.qanagram.easy.q242.solution2;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testStr() {

        Solution solution = new Solution();
        Assert.assertTrue(solution.isAnagram("anagram","nagaram"));
        Assert.assertFalse(solution.isAnagram("rat","car"));
    }
}