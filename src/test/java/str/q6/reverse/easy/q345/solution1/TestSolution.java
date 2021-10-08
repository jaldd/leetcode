package str.q6.reverse.easy.q345.solution1;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testStr() {

        Solution solution = new Solution();
        Assert.assertEquals(solution.reverseVowels("hello"), "holle");
        Assert.assertEquals(solution.reverseVowels("leetcode"), "leotcede");
    }
}