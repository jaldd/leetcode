package sort;

public class AbstractSort {

    protected void swap(int[] arr, int h, int k) {
        int temp = arr[h];
        arr[h] = arr[k];
        arr[k] = temp;
    }

}
