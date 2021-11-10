package sort;

public class BubbleSort extends AbstractSort {

    public void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j+1, j);
                }
            }
        }
    }
}
