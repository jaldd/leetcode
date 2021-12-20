package str.q11.q6.solution1;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testStr() {

        Solution solution = new Solution();
        Assert.assertEquals(solution.convert("PAYPALISHIRING", 3), "PAHNAPLSIIGYIR");
        Assert.assertEquals(solution.convert("PAYPALISHIRING", 4), "PINALSIGYAHRPI");
        Assert.assertEquals(solution.convert("A", 1), "A");
    }
}