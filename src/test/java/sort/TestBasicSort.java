package sort;

import org.junit.Assert;
import org.junit.Test;

public class TestBasicSort {

    @Test
    public void testSort() {
        BasicSort sort = new BasicSort();
        int[] arr = new int[]{4, 2, 11, 6, 1};
        sort.sort(arr);
        Assert.assertArrayEquals(arr, new int[]{1, 2, 4, 6, 11});
    }
}
