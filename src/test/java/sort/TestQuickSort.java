package sort;

import org.junit.Assert;
import org.junit.Test;
import sort.quick.QuickSort;

public class TestQuickSort {

    @Test
    public void testSort() {

        QuickSort sort = new QuickSort();
        int[] arr = new int[]{4, 2, 11, 6, -3};
        sort.sort(arr);
        Assert.assertArrayEquals(arr, new int[]{-3, 2, 4, 6, 11});

        int[] arr1 = new int[]{4, -3 ,11, 6, 2};
        sort.sort(arr1);
        Assert.assertArrayEquals(arr1, new int[]{-3, 2, 4, 6, 11});
    }
}
