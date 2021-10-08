package sort;

public class SelectSort extends AbstractSort {

    public void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    index = j;
                }
            }
            if (index != i) {
                swap(arr, i, index);
            }
        }
    }
}
