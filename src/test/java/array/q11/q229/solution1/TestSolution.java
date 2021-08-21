package array.q11.q229.solution1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSolution {

    @Test
    public void testMajorityElement() {

        one();

        two();

        three();
    }

    private void one() {
        int[] arr = new int[]{3, 2, 3};
        Solution solution = new Solution();
        List<Integer> res = solution.majorityElement(arr);
        Assert.assertEquals(res, Collections.singletonList(3));
    }

    private void two() {
        int[] arr = new int[]{1, 1, 1, 3, 3, 2, 2, 2};
        Solution solution = new Solution();
        List<Integer> res = solution.majorityElement(arr);
        Assert.assertEquals(res, Arrays.asList(1, 2));
    }

    private void three() {
        int[] arr = new int[]{1};
        Solution solution = new Solution();
        List<Integer> res = solution.majorityElement(arr);
        Assert.assertEquals(res, Collections.singletonList(1));
    }

}
