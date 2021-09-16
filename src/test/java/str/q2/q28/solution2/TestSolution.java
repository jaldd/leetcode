package str.q2.q28.solution2;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testStr() {

        Solution solution = new Solution();
        Assert.assertEquals(2, solution.strStr("hello", "llo"));
        Assert.assertEquals(-1, solution.strStr("aaaaa", "bba"));
        Assert.assertEquals(0, solution.strStr("", ""));
    }
}
