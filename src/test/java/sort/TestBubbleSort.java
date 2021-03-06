package sort;

import org.junit.Assert;
import org.junit.Test;

public class TestBubbleSort {

    @Test
    public void testSort() {
        BubbleSort sort = new BubbleSort();
        int[] arr = new int[]{4, 2, 11, 6, -3};
        sort.sort(arr);
        Assert.assertArrayEquals(arr, new int[]{-3, 2, 4, 6, 11});
    }
}
