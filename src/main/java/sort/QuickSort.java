package sort;

public class QuickSort extends AbstractSort {

    public void sort(int[] arr) {

        quickSort(arr, 0, arr.length - 1);
    }

    //4, 2, 11, 6, -3
    public void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pos = low, current = low;
            for (int i = low + 1; i <= high; i++) {
                if (arr[i] < arr[pos]) {
                    swap(arr, i, pos);
                    pos++;
                    current = i;
                }
            }

            swap(arr, current, pos);

            quickSort(arr, low, pos - 1);
            quickSort(arr, pos + 1, high);
        }

    }

}
