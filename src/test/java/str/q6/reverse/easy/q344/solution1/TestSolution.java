package str.q6.reverse.easy.q344.solution1;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testStr() {

        Solution solution = new Solution();
        char[] hello = new char[]{'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(hello);
        char[] hannah = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        solution.reverseString(hello);
        Assert.assertArrayEquals(hello, new char[]{'o', 'l', 'l', 'e', 'h'});
        solution.reverseString(hannah);
        Assert.assertArrayEquals(hannah, new char[]{'h', 'a', 'n', 'n', 'a', 'H'});
    }
}