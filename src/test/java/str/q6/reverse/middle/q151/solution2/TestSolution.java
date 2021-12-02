package str.q6.reverse.middle.q151.solution2;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testStr() {

        Solution solution = new Solution();
        Assert.assertEquals("blue is sky the", solution.reverseWords("the sky is blue"));
        Assert.assertEquals("world hello", solution.reverseWords(" hello world "));
        Assert.assertEquals("example good a", solution.reverseWords("a good  example"));
        Assert.assertEquals("Alice Loves Bob", solution.reverseWords("  Bob    Loves  Alice   "));
        Assert.assertEquals("bob like even not does Alice", solution.reverseWords("Alice does not even like bob"));
    }
}