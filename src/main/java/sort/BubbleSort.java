package sort;

public class BubbleSort extends AbstractSort {

    public void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] < arr[j+1]) {
                    swap(arr, i, j);
                }
            }
        }
    }
}
