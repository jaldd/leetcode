package str.q1.q14.solution1;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testLongestCommonPrefix() {
        String[] strs1 = new String[]{"flower", "flow", "flight"};
        String[] strs2 = new String[]{"dog", "racecar", "car"};
        Solution solution = new Solution();
        Assert.assertEquals("fl", solution.longestCommonPrefix(strs1));
        Assert.assertEquals("", solution.longestCommonPrefix(strs2));
    }
}
