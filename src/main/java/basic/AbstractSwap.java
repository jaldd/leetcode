package basic;

public class AbstractSwap {

    protected void swap(int[] arr, int h, int k) {
        int temp = arr[h];
        arr[h] = arr[k];
        arr[k] = temp;
    }

    protected void swap(char[] arr, int l, int r) {
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
