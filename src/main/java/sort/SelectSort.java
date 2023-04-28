package sort;

public class SelectSort extends AbstractSort {

    public void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            if (i != index) {
                swap(arr, i, index);
            }
        }
    }
}
