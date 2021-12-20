package str.q9.qpalindrome.middle.q5.solution2;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testStr() {

        Solution solution = new Solution();
        Assert.assertEquals(solution.longestPalindrome("babad"), "aba");
        Assert.assertEquals(solution.longestPalindrome("cbbd"), "bb");
        Assert.assertEquals(solution.longestPalindrome("a"), "a");
        Assert.assertEquals(solution.longestPalindrome("ac"), "c");
    }
}