package array.q6.q299.solution3;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testRotate() {

        Solution solution = new Solution();
        String res = solution.getHint("1807", "7810");
        String res1 = solution.getHint("1123", "0111");
        Assert.assertEquals(res, "1A3B");
        Assert.assertEquals(res1, "1A1B");

    }

}
