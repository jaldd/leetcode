package array.q2.q_array_duplicate.middle.q80.optimal;

import org.junit.Assert;
import org.junit.Test;

public class TestSolution {

    @Test
    public void testRemoveDuplicates() {

        remove1();
        remove2();

    }

    private void remove2() {
        Solution solution = new Solution();
        int[] arr = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        int res = solution.removeDuplicates(arr);
        int[] newArr = new int[]{0, 0, 1, 1, 2, 3, 3};
        Assert.assertEquals(res, 7);
        for (int i = 0; i < res; i++) {
            Assert.assertEquals(arr[i], newArr[i]);
        }
    }

    private void remove1() {
        Solution solution = new Solution();
        int[] arr = new int[]{1, 1, 1, 2, 2, 3};
        int[] newArr = new int[]{1, 1, 2, 2, 3};
        int res = solution.removeDuplicates(arr);
        Assert.assertEquals(res, 5);
        for (int i = 0; i < res; i++) {
            Assert.assertEquals(arr[i], newArr[i]);
        }
    }
}
