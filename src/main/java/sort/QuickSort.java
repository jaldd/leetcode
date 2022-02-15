package sort;

public class QuickSort extends AbstractSort {

    public void sort(int[] arr) {

        sort(arr, 0, arr.length - 1);
    }

    public void sort(int[] arr, int left, int right) {

        if (left < right) {
            int position = left, current = left;
            for (int i = left + 1; i <= right; i++) {
                if (arr[i] < arr[position]) {
                    swap(arr, i, position);
                    position++;
                    current = i;
                }
            }
            swap(arr, position, current);

            sort(arr, left, position);
            sort(arr, position + 1, right);
        }


//        if (left < right) {
//
//            int position = left, current = left;
//            for (int i = left + 1; i <= right; i++) {
//                if (arr[i] < arr[position]) {
//
//                    swap(arr, i, position);
//                    position++;
//                    current = i;
//                }
//            }
//
////            swap(arr, position, left);
//            swap(arr, position, current);
//
//            sort(arr, left, position - 1);
//            sort(arr, position + 1, right);
//        }
    }


}
