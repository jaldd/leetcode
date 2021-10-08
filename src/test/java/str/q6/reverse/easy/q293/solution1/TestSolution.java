package str.q6.reverse.easy.q293.solution1;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testStr() {

        Solution solution = new Solution();
        System.out.println();
        Assert.assertArrayEquals(solution.generatePossibleNextMoves("++++").toArray(), new String[]{"--++", "+--+", "++--"});
//        Assert.assertEquals();
//        Assert.assertEquals(solution.firstUniqChar("loveleetcode"), 2);
    }
}