package sort;

public class ShellSort extends AbstractSort {

    public void sort(int[] arr) {

        for (int step = arr.length / 2; step > 0; step /= 2) {
            for (int i = step; i < arr.length; i++) {

                insertSort(arr, step, i);
            }
        }
    }

    //    step=2    3 1 0 9 7
    //               5 6 8 4 2
    private void insertSortBack(int[] arr, int step, int i) {

        int value = arr[i];
        int j;
        for (j = i - step; j >= 0 && arr[j] > value; j -= step) {

            arr[j + step] = arr[j];
        }
        arr[j + step] = value;
    }

    private void insertSort(int[] arr, int step, int i) {

        for (int j = i; j >= step; j -= step) {
            if (arr[j] < arr[j - step]) {
                swap(arr, j, j - step);
            }
        }
    }

//
//    for (int i = 0; i < arr.length; i++) {
//        for (int j = i; j > 0; j--) {
//            if (arr[j] < arr[j - 1]) {
//                swap(arr, j, j - 1);
//            }
//        }
//    }
}
