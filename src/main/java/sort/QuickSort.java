package sort;

public class QuickSort extends AbstractSort {

    public void sort(int[] arr) {

        quickSort(arr, 0, arr.length - 1);
    }

    //4, 2, 11, 6, -3
    public void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int position = low;
            for (int i = low + 1; i <= high; i++) {
                if (arr[i] < arr[position]) {
                    position++;
                    swap(arr, i, position);
                }
            }

            swap(arr, position, low);

            quickSort(arr, low, position - 1);
            quickSort(arr, position + 1, high);
        }
    }
}
