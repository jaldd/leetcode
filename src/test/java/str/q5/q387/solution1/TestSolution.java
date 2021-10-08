package str.q5.q387.solution1;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testStr() {

        Solution solution = new Solution();
        Assert.assertEquals(solution.firstUniqChar("leetcode"), 0);
        Assert.assertEquals(solution.firstUniqChar("loveleetcode"), 2);
    }
}