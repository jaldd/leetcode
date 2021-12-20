package str.q13.q38.solution1;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testStr() {

        Solution solution = new Solution();
        Assert.assertEquals(solution.countAndSay(1), "1");
        Assert.assertEquals(solution.countAndSay(4), "1211");
    }
}