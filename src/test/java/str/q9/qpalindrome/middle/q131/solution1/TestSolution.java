package str.q9.qpalindrome.middle.q131.solution1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class TestSolution {

    @Test
    public void testStr() {

        Solution solution = new Solution();

        Assert.assertEquals(solution.partition("aab"), Arrays.asList(Arrays.asList("a", "a", "b"), Arrays.asList("aa", "b")));
        solution = new Solution();
        Assert.assertEquals(solution.partition("a"), Collections.singletonList(Collections.singletonList("a")));
    }
}