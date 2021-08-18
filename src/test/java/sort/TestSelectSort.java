package sort;

import org.junit.Assert;
import org.junit.Test;

public class TestSelectSort {

    @Test
    public void testSort() {
        SelectSort sort = new SelectSort();
        int[] arr = new int[]{4, 2, 11, 6, -3};
        sort.sort(arr);
        Assert.assertArrayEquals(arr, new int[]{-3, 2, 4, 6, 11});
    }
}
