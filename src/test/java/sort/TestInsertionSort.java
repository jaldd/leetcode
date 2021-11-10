package sort;

import org.junit.Assert;
import org.junit.Test;

public class TestInsertionSort {

    @Test
    public void testSort() {

        InsertionSort sort = new InsertionSort();
        int[] arr = new int[]{4, 2, 11, 6, -3};
        sort.sort(arr);
        Assert.assertArrayEquals(arr, new int[]{-3, 2, 4, 6, 11});
        int[] arr1 = new int[]{4, -3 ,11, 6, 2};
        sort.sort(arr1);
        Assert.assertArrayEquals(arr1, new int[]{-3, 2, 4, 6, 11});
    }
}
