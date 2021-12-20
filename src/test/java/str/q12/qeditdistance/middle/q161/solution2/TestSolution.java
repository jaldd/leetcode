package str.q12.qeditdistance.middle.q161.solution2;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testStr() {

        Solution solution = new Solution();
        Assert.assertTrue(solution.isOneEditDistance("ab","acb"));
        Assert.assertFalse(solution.isOneEditDistance("cab","ad"));
        Assert.assertTrue(solution.isOneEditDistance("1203","1213"));
    }
}