package str.q10.q179.solution2;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testStr() {

        Solution solution = new Solution();
        Assert.assertEquals(solution.largestNumber(3, 30, 34, 5, 9), "9534330");
        Assert.assertEquals(solution.largestNumber(1, 0, 0), "100");
        Assert.assertEquals(solution.largestNumber(10), "10");
        Assert.assertEquals(solution.largestNumber(10, 2), "210");
        Assert.assertEquals(solution.largestNumber(1), "1");
    }
}