package str.q3.q58.solution1;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testStr() {
        Solution solution = new Solution();

        Assert.assertEquals(5, solution.lengthOfLastWord("Hello World"));
        Assert.assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));
        Assert.assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"));
        Assert.assertEquals(1, solution.lengthOfLastWord("l"));
    }
}
